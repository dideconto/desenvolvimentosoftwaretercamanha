package views;

import controllers.FolhaPagamentoController;
import controllers.FuncionarioController;
import models.FolhaPagamento;
import models.Funcionario;
import utils.Console;

public class CadastrarFolha {

    public void renderizar() {
        
        FolhaPagamento folha = new FolhaPagamento();
        Funcionario funcionario = new Funcionario();

        FuncionarioController funcionarioController = new FuncionarioController();
        FolhaPagamentoController folhaController = new FolhaPagamentoController();

        System.out.println("\n -- CADASTRO DE FOLHA DE PAGAMENTO -- \n");

        String cpf = Console.readString("Digite o CPF do funcionário:");
        funcionario = funcionarioController.buscarPorCpf(cpf);
        if(funcionario != null){
            folha.setFuncionario(funcionario);
            folha.setAno(Console.readInt("Digite o ano da folha: "));
            folha.setMes(Console.readInt("Digite o mês da folha: "));
            folha.setValor(Console.readDouble("Digite o valor da hora da folha: "));
            folha.setHoras(Console.readInt("Digite a quantidade de horas da folha: "));

            folhaController.cadastrar(folha);
            System.out.println("Folha cadastradas com sucesso!");
        }else{
            System.out.println("Funcionário não encontrado!");
        }
    }

}
