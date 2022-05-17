package models;

import java.util.ArrayList;

public class Venda {

    public Venda(){
        cliente = new Cliente();
        funcionario = new Funcionario();
        produtos = new ArrayList<ItemVenda>();
    }

    // private int id;
    // private Calendar data;    
    private Cliente cliente;
    private Funcionario funcionario;
    private ArrayList<ItemVenda> produtos;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public ArrayList<ItemVenda> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<ItemVenda> produtos) {
        this.produtos = produtos;
    }    
    
    @Override
    public String toString() {

        return 
            "Cliente: " + cliente.getNome() +
            " | Funcionario: " + funcionario.getNome();
    }
}
