package projetovendasjavaswing;

import java.util.ArrayList;

public class RepositorioVenda {
    private ArrayList<Venda> lista;
    private static RepositorioVenda instanciaRep;
    
    public RepositorioVenda(){
        this.lista = new ArrayList<Venda>();
    }
    
    public static RepositorioVenda obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new RepositorioVenda();
        }
        
        return instanciaRep;
    }
    
    public ArrayList<Venda> listarTodos(){
        return this.lista;
    }
    
    public void inserir(Venda venda) throws Exception{
        if(venda == null){
            throw new Exception("A venda não foi instanciada");
        }
        if(venda.getNumero() <= 0){
            throw new Exception("Informar o numero da venda");
        }
        if(venda.getData() == null){
            throw new Exception("Informar a data da venda");
        }
        if(venda.getData().trim().equals("")){
            throw new Exception("Informar a data da venda");
        }
        if(venda.getItensDaVenda().size() <= 0){
            throw new Exception("Informar pelo menos um item para a venda");
        }
        if(this.verificaExistencia(venda) >= 0){
            throw new Exception("A referida venda já se encontra cadastrada");
        }
        
        this.lista.add(venda);
    }
    
    public void remover(Venda venda) throws Exception{
        if(venda == null){
            throw new Exception("A venda não foi instanciada");
        }
        if(venda.getNumero() <= 0){
            throw new Exception("Informar o número da venda");
        }
        if(this.verificaExistencia(venda) < 0){
            throw new Exception("A referida venda não se encontra cadastrada");
        }
        
        this.lista.remove(this.verificaExistencia(venda));
    }
    
    public void atualizar(Venda venda) throws Exception{
        if(venda == null){
            throw new Exception("A venda não foi instanciada");
        }
        if(venda.getNumero() <= 0){
            throw new Exception("Informar o numero da venda");
        }
        if(venda.getData() == null){
            throw new Exception("Informar a data da venda");
        }
        if(venda.getData().trim().equals("")){
            throw new Exception("Informar a data da venda");
        }
        if(venda.getItensDaVenda().size() <= 0){
            throw new Exception("Informar pelo menos um item para a venda");
        }
        if(this.verificaExistencia(venda) < 0){
            throw new Exception("A referida venda não se encontra cadastrada");
        }
        
        this.lista.set(this.verificaExistencia(venda), venda);
    }
    
    public int verificaExistencia(Venda venda){
        int retorno = -1;
        
        for(int i = 0; i < this.lista.size(); i++){
            if(venda.getNumero() == this.lista.get(i).getNumero()){
                retorno = 1;
                break;
            }
        }
        
        return retorno;
    }
    
}
