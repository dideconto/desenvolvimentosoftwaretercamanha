package models;

public class Venda {

    // private int id;
    // private Calendar data;    
    private Cliente cliente;
    private Funcionario funcionario;
    private Produto produto;

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
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    
    @Override
    public String toString() {
        return 
            "Cliente: " + cliente.getNome() +
            " | Funcionario: " + funcionario.getNome() + 
            " | Produto: " + produto.getNome();
    }
}
