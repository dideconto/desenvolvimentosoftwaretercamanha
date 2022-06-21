package views;

import controllers.ClienteController;
import models.Cliente;
import utils.Console;
import utils.Validacao;
import views.contracts.IViews;

public class CadastrarCliente implements IViews {

    @Override
    public void renderizar() {
        Cliente cliente = new Cliente();
        ClienteController clienteController = new ClienteController();

        System.out.println("\n -- CADASTRO DE CLIENTES -- \n");
        cliente.setNome(Console.readString("Digite o nome do cliente: "));
        cliente.setCpf(Console.readString("Digite o CPF do cliente: "));

        if (Validacao.verificarCPF(cliente.getCpf())) {
            if (clienteController.cadastrar(cliente)) {
                System.out.println("\nCliente cadastrado!!!");
            } else {
                System.out.println("\nCliente já cadastrado!!!");
            }
        }else{
            System.out.println("CPF é inválido!!!");
        }
    }

}
