package views;

import controllers.ProdutoController;
import models.Produto;

public class ListarProdutos {

    public void renderizar(){
        ProdutoController produtoController = new ProdutoController(); 
        System.out.println("\n -- LISTAGEM DE PRODUTOS -- \n");
        for (Produto produtoCadastrado : produtoController.listar()) {
            System.out.println(produtoCadastrado);
        }
    }
    
}
