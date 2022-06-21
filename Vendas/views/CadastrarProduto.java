package views;

import controllers.ProdutoController;
import models.Produto;
import utils.Console;
import views.contracts.IViews;

public class CadastrarProduto implements IViews {

    @Override
    public void renderizar() {
        Produto produto = new Produto();
        ProdutoController produtoController = new ProdutoController();
        System.out.println("\n -- CADASTRO DE PRODUTOS -- \n");
        produto.setNome(Console.readString("Digite o nome do produto: "));
        produto.setPreco(Console.readDouble("Digite o preço do produto: "));
        produto.setQuantidade(Console.readInt("Digite a quantidade do produto: "));
        if (produtoController.cadastrar(produto)) {            
            System.out.println("\nProduto cadastrado!!!");
        }else{
            System.out.println("\nProduto já cadastrado!!!");
        }
    }

}
