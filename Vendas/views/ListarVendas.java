package views;

import controllers.VendaController;
import models.ItemVenda;
import models.Venda;
import views.contracts.IViews;

public class ListarVendas implements IViews {

    @Override
    public void renderizar(){
        VendaController vendaController = new VendaController();      
        System.out.println("\n -- LISTAGEM DE VENDAS -- \n");
        double total = 0;
        for (Venda vendaCadastrada : vendaController.listar()) {
            System.out.println(" -- VENDA -- \n");

            System.out.println("Cliente: " + vendaCadastrada.getCliente().getNome());
            System.out.println("Funcionário: " + vendaCadastrada.getFuncionario().getNome());
            System.out.println("\n -- ITENS -- \n");
            double totalVenda = 0;
            for(ItemVenda itemCadastrado : vendaCadastrada.getProdutos()){
                System.out.println("Produto: " + itemCadastrado.getProduto().getNome());
                double subtotal = itemCadastrado.getPreco() * itemCadastrado.getQuantidade();
                System.out.println(itemCadastrado.getPreco() + " x " + itemCadastrado.getQuantidade() + " = " + subtotal);
                totalVenda += subtotal;
            }
            System.out.println("\nTotal da venda: " + totalVenda);
            total += totalVenda;
        }
        System.out.println("\nTotal : " + total);
    }
    
}
