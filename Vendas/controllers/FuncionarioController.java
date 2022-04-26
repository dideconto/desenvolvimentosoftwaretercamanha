package controllers;

import java.util.ArrayList;

import models.Funcionario;

public class FuncionarioController {

    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public void cadastrar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> listar() {
        return funcionarios;
    }
    
}
