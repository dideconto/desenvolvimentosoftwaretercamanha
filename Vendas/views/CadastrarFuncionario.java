package views;

import controllers.FuncionarioController;
import models.Funcionario;
import utils.Console;
import utils.Validacao;
import views.contracts.IViews;

public class CadastrarFuncionario implements IViews {

    @Override
    public void renderizar() {
        Funcionario funcionario = new Funcionario();
        FuncionarioController funcionarioController = new FuncionarioController();
        System.out.println("\n -- CADASTRO DE FUNCIONÁRIOS -- \n");
        funcionario.setNome(Console.readString("Digite o nome do funcionário: "));
        funcionario.setCpf(Console.readString("Digite o CPF do funcionário: "));

        if (Validacao.verificarCPF(funcionario.getCpf())) {
            if (funcionarioController.cadastrar(funcionario)) {
                System.out.println("\fFuncionário cadastrado!!!");
            } else {
                System.out.println("\fFuncionário já cadastrado!!!");
            }
        }else{
            System.out.println("CPF é inválido!!!");
        }
    }

}
