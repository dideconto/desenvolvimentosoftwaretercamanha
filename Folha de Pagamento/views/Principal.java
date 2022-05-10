package views;

import utils.Console;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println("\n -- PROJETO DE FOLHA DE PAGAMENTOS -- \n");
            System.out.println("1 - Cadastrar Funcionário");
            System.out.println("2 - Cadastrar Folha de Pagamento");
            System.out.println("3 - Consultar Folha de Pagamento");
            System.out.println("4 - Listar Folhas de Pagamento");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarFuncionario cadastrarFuncionario = new CadastrarFuncionario();
                    cadastrarFuncionario.renderizar();
                    break;
                case 2:
                    CadastrarFolha cadastrarFolha = new CadastrarFolha();
                    cadastrarFolha.renderizar();
                    break;
                case 3:
                    ConsultarFolha consultarFolha = new ConsultarFolha();
                    consultarFolha.renderizar();
                    break;
                case 4:
                    ListarFolhas listarFolhas = new ListarFolhas();
                    listarFolhas.renderizar();
                    break;
                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }

        } while (opcao != 0);
    }
    
}