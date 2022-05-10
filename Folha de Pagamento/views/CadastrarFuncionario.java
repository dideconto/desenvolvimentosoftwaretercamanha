package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;

public class CadastrarFuncionario {

    public void renderizar() {
        Funcionario funcionario = new Funcionario();        
        FuncionarioController funcionarioController = new FuncionarioController();
        System.out.println("\n -- CADASTRO DE FUNCIONÁRIOS -- \n");
        funcionario.setNome(Console.readString("Digite o nome do funcionário: "));
        funcionario.setCpf(Console.readString("Digite o CPF do funcionário: "));        
        funcionarioController.cadastrar(funcionario);
        System.out.println("\fFuncionário cadastrado !!!");
    }

}
