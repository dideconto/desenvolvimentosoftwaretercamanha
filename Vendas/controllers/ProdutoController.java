package controllers;

import java.util.ArrayList;

import controllers.contracts.IProdutoController;
import models.Produto;

public class ProdutoController implements IProdutoController {

    private static ArrayList<Produto> produtos = new ArrayList<Produto>();

    @Override
    public boolean cadastrar(Produto produto) {
        if (buscarPorNome(produto.getNome()) == null) {
            produtos.add(produto);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Produto> listar() {
        return produtos;
    }

    @Override
    public Produto buscarPorNome(String nome) {
        for (Produto produtoCadastrado : produtos) {
            if (produtoCadastrado.getNome().equals(nome)) {
                return produtoCadastrado;
            }
        }
        return null;
    }

}
