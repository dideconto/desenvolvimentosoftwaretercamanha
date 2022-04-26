package views;

import controllers.ClienteController;
import controllers.FuncionarioController;
import controllers.ProdutoController;
import controllers.VendaController;
import models.Cliente;
import models.Funcionario;
import models.Produto;
import models.Venda;
import utils.Console;

public class CadastrarVenda {

    public void renderizar() {
        Venda venda = new Venda();
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

                // Produto
                String nomeProduto = Console.readString("Digite o nome do projeto: ");
                Produto produto = produtoController.buscarPorNome(nomeProduto);
                if (produto != null) {
                    venda.setProduto(produto);
                    vendaController.cadastrar(venda);
                    System.out.println("Venda cadastrada com sucesso!");
                } else {
                    System.out.println("Produto não encontrado!");
                }
            } else {
                System.out.println("Funcionário não encontrado!");
            }
        } else {
            System.out.println("Cliente não encontrado!");
        }

    }

}
