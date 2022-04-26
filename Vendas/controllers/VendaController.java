package controllers;

import java.util.ArrayList;

import models.Venda;

public class VendaController {

    private static ArrayList<Venda> vendas = new ArrayList<Venda>();

    public void cadastrar(Venda venda) {
        vendas.add(venda);
    }

    public ArrayList<Venda> listar() {
        return vendas;
    }
    
}
