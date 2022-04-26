package views;

import java.util.ArrayList;

import controllers.VendaController;
import models.Venda;

public class ListarVendas {

    public void renderizar(){
        VendaController vendaController = new VendaController();      
        System.out.println("\n -- LISTAGEM DE VENDAS -- \n");
        for (Venda vendaCadastrada : vendaController.listar()) {
            System.out.println(vendaCadastrada);
        }
    }
    
}
