package controllers.contracts;

import java.util.ArrayList;

import models.Funcionario;

public interface IFuncionarioController {

    boolean cadastrar(Funcionario funcionario);

    Funcionario buscarPorCpf(String cpf);

    ArrayList<Funcionario> listar();
}
