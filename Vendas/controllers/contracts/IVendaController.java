package controllers.contracts;

import java.util.ArrayList;

import models.Cliente;
import models.Venda;

public interface IVendaController {

    void cadastrar(Venda venda);

    ArrayList<Venda> listar();
}
