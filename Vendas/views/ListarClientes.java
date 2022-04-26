package views;

import java.util.ArrayList;

import controllers.ClienteController;
import models.Cliente;

public class ListarClientes {

    public void renderizar(){
        ClienteController clienteController = new ClienteController();      
        System.out.println("\n -- LISTAGEM DE CLIENTES -- \n");
        for (Cliente clienteCadastrado : clienteController.listar()) {
            System.out.println(clienteCadastrado);
        }
    }
    
}
