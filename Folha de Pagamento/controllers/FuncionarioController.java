package controllers;

import java.util.ArrayList;

import models.Funcionario;

public class FuncionarioController {

    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    
    public void cadastrar(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public Funcionario buscarPorCpf(String cpf){
        for (Funcionario funcionarioCadastrado : funcionarios) {
            if(funcionarioCadastrado.getCpf().equals(cpf)){
                return funcionarioCadastrado;
            }
        }
        return null;
    }

}
