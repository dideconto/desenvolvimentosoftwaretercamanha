package controllers.contracts;

import java.util.ArrayList;

import models.Produto;

public interface IProdutoController {

    boolean cadastrar(Produto produto);

    Produto buscarPorNome(String nome);

    ArrayList<Produto> listar();
}
