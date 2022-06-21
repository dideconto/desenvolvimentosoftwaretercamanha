package controllers;

import java.util.ArrayList;

import controllers.contracts.IVendaController;
import models.Venda;

public class VendaController implements IVendaController {

    private static ArrayList<Venda> vendas = new ArrayList<Venda>();

    @Override
    public void cadastrar(Venda venda) {
        vendas.add(venda);
    }

    @Override
    public ArrayList<Venda> listar() {
        return vendas;
    }

}
