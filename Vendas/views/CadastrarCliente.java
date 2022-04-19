package views;

import controllers.ClienteController;
import models.Cliente;
import utils.Console;

public class CadastrarCliente {

    public void renderizar(){
        Cliente cliente = new Cliente();        
        ClienteController clienteController = new ClienteController();
        System.out.println("\n -- CADASTRO DE CLIENTES -- \n");
        cliente.setNome(Console.readString("Digite o nome do cliente: "));
        cliente.setCpf(Console.readString("Digite o CPF do cliente: "));        
        clienteController.cadastrar(cliente);
        System.out.println("\nCliente cadastrado !!!");
    }
    
}
