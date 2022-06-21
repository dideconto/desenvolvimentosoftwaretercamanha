package controllers.contracts;

import java.util.ArrayList;

import models.Cliente;

public interface IClienteController {

    boolean cadastrar(Cliente cliente);

    Cliente buscarPorCpf(String cpf);

    ArrayList<Cliente> listar();
}
