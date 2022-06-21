package views;

import controllers.ClienteController;
import controllers.FuncionarioController;
import controllers.ProdutoController;
import controllers.VendaController;
import models.Cliente;
import models.Funcionario;
import models.ItemVenda;
import models.Produto;
import models.Venda;
import utils.Console;
import views.contracts.IViews;

public class CadastrarVenda implements IViews {

    @Override
    public void renderizar() {
        Venda venda = new Venda();

        ItemVenda item = new ItemVenda();

        ClienteController clienteController = new ClienteController();
        FuncionarioController funcionarioController = new FuncionarioController();
        ProdutoController produtoController = new ProdutoController();
        VendaController vendaController = new VendaController();

        System.out.println("\n -- CADASTRO DE VENDAS -- \n");

        // Cliente
        String cpfCliente = Console.readString("Digite o CPF do cliente: ");
        Cliente cliente = clienteController.buscarPorCpf(cpfCliente);
        if (cliente != null) {
            venda.setCliente(cliente);

            // Funcionário
            String cpfFuncionario = Console.readString("Digite o CPF do funcionário: ");
            Funcionario funcionario = funcionarioController.buscarPorCpf(cpfFuncionario);
            if (funcionario != null) {
                venda.setFuncionario(funcionario);

                // Produtos
                do {    
                    item = new ItemVenda();                
                    String nomeProduto = Console.readString("Digite o nome do produto: ");
                    Produto produto = produtoController.buscarPorNome(nomeProduto);
                    if (produto != null) {
                        item.setProduto(produto);
                        item.setPreco(produto.getPreco());
                        item.setQuantidade(Console.readInt("Digite a quantidade do produto: "));
                        venda.getProdutos().add(item);
                    } else {
                        System.out.println("Produto não encontrado!");
                    }
                } while (Console.readString("Deseja adicionar um novo produto? (S - Sim || N - Não)\n").toUpperCase().equals("S"));

                vendaController.cadastrar(venda);
                System.out.println("\nVenda cadastrada com sucesso!");
            } else {
                System.out.println("Funcionário não encontrado!");
            }
        } else {
            System.out.println("Cliente não encontrado!");
        }

    }

}
