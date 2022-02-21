package projetovendasjavaswing;

import java.util.ArrayList;

public class RepositorioProduto {
    private ArrayList<Produto> lista;
    private static RepositorioProduto instanciaRep;
    
    public RepositorioProduto(){
        this.lista = new ArrayList<Produto>();
    }
    
    public static RepositorioProduto obterInstancia(){
        if(instanciaRep == null){
            instanciaRep = new RepositorioProduto();
        }
        
        return instanciaRep;
    }
    
    public ArrayList<Produto> listarTodos(){
        return this.lista;
    }
    
    public void inserir(Produto produto) throws Exception{
        if(produto == null){
            throw new Exception("O produto não foi instanciado");
        }
        if(produto.getCodigoBarras() == null){
            throw new Exception("Informar o código de barras do produto");
        }
        if(produto.getCodigoBarras().trim().equals("")){
            throw new Exception("Informar o código de barras do produto");
        }
        if(produto.getDescricao() == null){
            throw new Exception("Informar a descrição do produto");
        }
        if(produto.getDescricao().trim().equals("")){
            throw new Exception("Informar a descrição do produto");
        }
        if(produto.getPreco() <= 0){
            throw new Exception("O preço do produto deverá ser superior a zero");
        }
        if(this.verificaExistencia(produto) >= 0){
            throw new Exception("O referido produto já se encontra cadastrado");
        }
        
        this.lista.add(produto);
    }
    
    public void remover(Produto produto) throws Exception{
        if(produto == null){
            throw new Exception("O produto não foi instanciado");
        }
        if(produto.getCodigoBarras() == null){
            throw new Exception("Informar o código de barras do produto");
        }
        if(produto.getCodigoBarras().trim().equals("")){
            throw new Exception("Informar o código de barras do produto");
        }
        if(this.verificaExistencia(produto) == -1){
            throw new Exception("O referido produto não se encontra cadastrado");
        }
        
        this.lista.remove(this.verificaExistencia(produto));
    }
    
    public void atualizar(Produto produto) throws Exception{
        if(produto == null){
            throw new Exception("O produto não foi instanciado");
        }
        if(produto.getCodigoBarras() == null){
            throw new Exception("Informar o código de barras do produto");
        }
        if(produto.getCodigoBarras().trim().equals("")){
            throw new Exception("Informar o código de barras do produto");
        }
        if(produto.getDescricao() == null){
            throw new Exception("Informar a descrição do produto");
        }
        if(produto.getDescricao().trim().equals("")){
            throw new Exception("Informar a descrição do produto");
        }
        if(produto.getPreco() <= 0){
            throw new Exception("O preço do produto deverá ser superior a zero");
        }
        if(this.verificaExistencia(produto) < 0){
            throw new Exception("O referido produto não se encontra cadastrado");
        }
        
        this.lista.set(this.verificaExistencia(produto), produto);
    }
    
    public int verificaExistencia(Produto produto){
        int retorno = -1;
        
        for(int i = 0; i < this.lista.size(); i++){
            if(produto.getCodigoBarras().trim().equals(this.lista.get(i).getCodigoBarras().trim())){
                retorno = 1;
                break;
            }
        }
        
        return retorno;
    }
    
}
