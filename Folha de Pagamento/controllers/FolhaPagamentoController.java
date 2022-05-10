package controllers;

import java.util.ArrayList;

import models.FolhaPagamento;

public class FolhaPagamentoController {

    private static ArrayList<FolhaPagamento> folhas = 
        new ArrayList<FolhaPagamento>();
    
    public void cadastrar(FolhaPagamento folha) {
        folhas.add(folha);
    }

    public ArrayList<FolhaPagamento> listar() {
        return folhas;
    }

    public FolhaPagamento buscarPorCpfMesAno(String cpf, 
        int mes, int ano){
        for (FolhaPagamento folhaCadastrada : folhas) {
            if(folhaCadastrada.getFuncionario(). getCpf().equals(cpf) &&
                folhaCadastrada.getMes() == mes &&
                folhaCadastrada.getAno() == ano){
                return folhaCadastrada;
            }
        }
        return null;
    }
    
}
