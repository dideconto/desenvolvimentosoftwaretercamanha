public class Principal {
    public static void main(String[] args) {
        int opcao = 0;
        do {
            System.out.println("\n -- PROJETO DE VENDAS -- \n");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Listar Clientes");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                case 1:
                    System.out.println("\n -- CADASTRO DE CLIENTES -- \n");
                    break;
                case 2:
                    System.out.println("\n -- LISTAGEM DE CLIENTES -- \n");
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