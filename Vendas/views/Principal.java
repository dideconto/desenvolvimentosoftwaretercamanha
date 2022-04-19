package views;

import java.util.ArrayList;

import models.Cliente;
import models.Funcionario;
import models.Produto;
import utils.Console;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
        Funcionario funcionario;
        Produto produto;
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        ArrayList<Produto> produtos = new ArrayList<Produto>();

        do {
            System.out.println("\n -- PROJETO DE VENDAS -- \n");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Funcionário");
            System.out.println("4 - Listar Funcionários");
            System.out.println("5 - Cadastrar Produto");
            System.out.println("6 - Listar Produtos");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarCliente cadastrarCliente = new CadastrarCliente();
                    cadastrarCliente.renderizar();
                    break;
                case 2:
                    ListarClientes listarClientes = new ListarClientes();
                    listarClientes.renderizar();
                    break;
                case 3:
                    funcionario = new Funcionario();
                    System.out.println("\n -- CADASTRO DE FUNCIONÁRIOS -- \n");
                    funcionario.setNome(Console.readString("Digite o nome do funcionário: "));
                    funcionario.setCpf(Console.readString("Digite o CPF do funcionário: "));
                    funcionarios.add(funcionario);
                    System.out.println("\fFuncionário cadastrado !!!");
                    break;
                case 4:
                    System.out.println("\n -- LISTAGEM DE FUNCIONÁRIOS -- \n");
                    for (Funcionario funcionarioCadastrado : funcionarios) {
                        System.out.println(funcionarioCadastrado);
                    }
                    break;

                case 5:
                    produto = new Produto();
                    System.out.println("\n -- CADASTRO DE PRODUTOS -- \n");
                    produto.setNome(Console.readString("Digite o nome do produto: "));
                    produto.setPreco(Console.readDouble("Digite o preço do produto: "));
                    produto.setQuantidade(Console.readInt("Digite a quantidade do produto: "));
                    produtos.add(produto);
                    System.out.println("\nProduto cadastrado !!!");
                    break;
                case 6:
                    System.out.println("\n -- LISTAGEM DE PRODUTOS -- \n");
                    for (Produto produtoCadastrado : produtos) {
                        System.out.println(produtoCadastrado);
                    }
                    break;
                case 0:
                    System.out.println("\n -- SAINDO -- \n");
                    break;
                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }

        } while (opcao != 0);
    }
}