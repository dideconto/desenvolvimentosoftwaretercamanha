package controllers;

import java.util.ArrayList;

import controllers.contracts.IFuncionarioController;
import models.Funcionario;

public class FuncionarioController implements IFuncionarioController {

    private static ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

    @Override
    public boolean cadastrar(Funcionario funcionario) {
        if (buscarPorCpf(funcionario.getCpf()) == null) {
            funcionarios.add(funcionario);
            return true;
        }
        return false;
    }

    @Override
    public ArrayList<Funcionario> listar() {
        return funcionarios;
    }

    @Override
    public Funcionario buscarPorCpf(String cpf) {
        for (Funcionario funcionarioCadastrado : funcionarios) {
            if (funcionarioCadastrado.getCpf().equals(cpf)) {
                return funcionarioCadastrado;
            }
        }
        return null;
    }

}
