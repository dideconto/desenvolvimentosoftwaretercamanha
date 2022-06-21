package views;

import controllers.ProdutoController;
import models.Produto;
import views.contracts.IViews;

public class ListarProdutos implements IViews {

    @Override
    public void renderizar(){
        ProdutoController produtoController = new ProdutoController(); 
        System.out.println("\n -- LISTAGEM DE PRODUTOS -- \n");
        for (Produto produtoCadastrado : produtoController.listar()) {
            System.out.println(produtoCadastrado);
        }
    }
    
}
