package projetovendasjavaswing;

import java.util.ArrayList;

public class Venda {
    private String data;
    private int numero;
    
    private ArrayList<ItemVenda> itensDaVenda;
    
    private Cliente cliente;
    
    public Venda(){
        this.itensDaVenda =  new ArrayList<ItemVenda>();
        this.cliente = new Cliente();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<ItemVenda> getItensDaVenda() {
        return itensDaVenda;
    }

    public void setItensDaVenda(ArrayList<ItemVenda> itensDaVenda) {
        this.itensDaVenda = itensDaVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public float getValorTotal(){
        float retorno = 0;
        
        for(int i = 0; i < this.itensDaVenda.size(); i++){
            float valor = (this.itensDaVenda.get(i).getQuantidade() * this.itensDaVenda.get(i).getPreco());
            retorno = retorno + valor;
        }
        
        return retorno;
    }
    
}
