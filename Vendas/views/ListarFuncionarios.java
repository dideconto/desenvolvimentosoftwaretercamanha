package views;

import controllers.FuncionarioController;
import models.Funcionario;
import views.contracts.IViews;

public class ListarFuncionarios implements IViews {

    @Override
    public void renderizar(){
        FuncionarioController funcionarioController = new FuncionarioController(); 
        System.out.println("\n -- LISTAGEM DE FUNCIONÁRIOS -- \n");
        for (Funcionario funcionarioCadastrado : funcionarioController.listar()) {
            System.out.println(funcionarioCadastrado);
        }
    }
    
}
