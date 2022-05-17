package views;

import utils.Console;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println("\n -- PROJETO DE VENDAS -- \n");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("3 - Cadastrar Funcionário");
            System.out.println("4 - Listar Funcionários");
            System.out.println("5 - Cadastrar Produto");
            System.out.println("6 - Listar Produtos");
            System.out.println("7 - Cadastrar Venda");
            System.out.println("8 - Listar Vendas");
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
                    CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                    cadastrarFuncionario.renderizar();
                    break;
                case 4:
                    ListarFuncionarios listarFuncionarios = new ListarFuncionarios();
                    listarFuncionarios.renderizar();
                    break;
                case 5:
                    CadastrarProduto cadastrarProduto = new CadastrarProduto();
                    cadastrarProduto.renderizar();
                    break;
                case 6:
                    ListarProdutos listarProdutos = new ListarProdutos();
                    listarProdutos.renderizar();
                    break;
                case 7:
                    CadastrarVenda cadastrarVenda = new CadastrarVenda();
                    cadastrarVenda.renderizar();
                    break;
                case 8:
                    ListarVendas listarVendas = new ListarVendas();
                    listarVendas.renderizar();
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