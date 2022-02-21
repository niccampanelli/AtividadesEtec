package projetovendasjavaswing;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class RepositorioClienteOdbc extends ConexaoOdbc{
    private ArrayList<Cliente> lista;
    private static RepositorioClienteOdbc instanciaRep;
    
    private RepositorioClienteOdbc(){
        this.lista = new ArrayList<Cliente>();
    }
    
    public static RepositorioClienteOdbc obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new RepositorioClienteOdbc();
        }
        
        return instanciaRep;
    }
    
    public void inserir(Cliente cliente) throws Exception{
        if(cliente == null){
            throw new Exception("O cliente não foi instanciado");
        }
        if(cliente.getCpf() == null){
            throw new Exception("Informar o CPF do Cliente");
        }
        if(cliente.getCpf().trim().equals("")){
            throw new Exception("Informar o CPF do Cliente");
        }
        if(cliente.getNome() == null){
            throw new Exception("Informar o Nome do Cliente");
        }
        if(cliente.getNome().trim().equals("")){
            throw new Exception("Informar o Nome do Cliente");
        }
        if(this.verificaExistencia(cliente) >= 0){
            throw new Exception("O referido cliente já se encontra cadastrado");
        }
        
        Statement conex = conectar();
        String sql = "insert into cliente (nome, cpf)"
                    + "values ('" + cliente.getNome() + "', '"
                    + cliente.getCpf() + "')";
        
        try {
            conex.execute(sql);
        } catch(SQLException e) {
            throw new Exception("Erro ao executar inserção: " + e.getMessage());
        }
        
        desconectar();
    }
    
    public void remover(Cliente cliente) throws Exception{
        if(cliente == null){
            throw new Exception("O cliente não foi instanciado");
        }
        if(cliente.getCpf() == null){
            throw new Exception("Informar o CPF do Cliente");
        }
        if(cliente.getCpf().trim().equals("")){
            throw new Exception("Informar o CPF do Cliente");
        }
        if(this.verificaExistencia(cliente) == -1){
            throw new Exception("O referido cliente não se encontra cadastrado");
        }
        
        Statement conex = conectar();
        String sql = "delete from cliente where cpf = '"
                    + cliente.getCpf() + "'";
        
        try {
            conex.execute(sql);
        } catch(SQLException e) {
            throw new Exception("Erro ao executar remoção: " + e.getMessage());
        }
        
        desconectar();
    }
    
    public void atualizar(Cliente cliente) throws Exception{
        if(cliente == null){
            throw new Exception("O cliente não foi instanciado");
        }
        if(cliente.getCpf() == null){
            throw new Exception("Informar o CPF do Cliente");
        }
        if(cliente.getCpf().trim().equals("")){
            throw new Exception("Informar o CPF do Cliente");
        }
        if(cliente.getNome() == null){
            throw new Exception("Informar o Nome do Cliente");
        }
        if(cliente.getNome().trim().equals("")){
            throw new Exception("Informar o Nome do Cliente");
        }
        
        Statement conex = conectar();
        String sql = "update cliente set " + "nome = '" + cliente.getNome()
                        + "', " + "cpf = '" + cliente.getCpf() + "'" 
                        + " where cpf = '" + cliente.getCpf() + "'";
        
        try {
            conex.execute(sql);
        } catch(SQLException e) {
            throw new Exception("Erro ao executar atualização: " + e.getMessage());
        }
        
        desconectar();
    }
    
    public ArrayList<Cliente> listarTodos() throws Exception {
                
        Statement connex = conectar();
        ArrayList<Cliente> retorno = new ArrayList<Cliente>();
        
        String sql = "SELECT cpf, nome FROM cliente order by nome";
        
        try{
            ResultSet rs = connex.executeQuery(sql);
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setNome(rs.getString("nome"));
                cliente.setCpf(rs.getString("cpf"));
                retorno.add(cliente);
            }
        } catch(SQLException e){
            throw new Exception("Erro ao executar consulta: " + e.getMessage());
        }
        
        desconectar();
        return retorno;
    }
    
    
    public int verificaExistencia(Cliente cliente){
        int retorno = -1;
        
        for(int i = 0; i < this.lista.size(); i++){
            if(cliente.getCpf().trim().equals(this.lista.get(i).getCpf().trim())){
                retorno = 1;
                break;
            }
        }
        
        return retorno;
    }
}
