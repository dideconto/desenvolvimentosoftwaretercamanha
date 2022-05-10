package views;

import controllers.FolhaPagamentoController;
import models.FolhaPagamento;
import utils.Calculos;
import utils.Console;

public class ConsultarFolha {

    public void renderizar() {        

            
        double bruto, irrf, inss, fgts, liquido;
        FolhaPagamentoController folhaController = new FolhaPagamentoController();
        FolhaPagamento folha = new FolhaPagamento();
        Calculos calculos = new Calculos();

        System.out.println("\n -- LISTAR FOLHAS DE PAGAMENTO -- \n");
        String cpf = Console.readString("Digite o CPF do funcionário: ");
        int mes = Console.readInt("Digite o mês da folha de pagamento: ");
        int ano = Console.readInt("Digite o ano da folha de pagamento: ");
        
        folha = folhaController.buscarPorCpfMesAno(cpf, mes, ano);

        if(folha != null){
            System.out.println("Funcionário: " + folha.getFuncionario().getNome());

            // Calcular o salário bruto
            bruto = calculos.calcularSalarioBruto(folha.getHoras(), folha.getValor());
            System.out.println("Salário bruto: " + bruto);

            // Calcular o imposto de renda
            irrf = calculos.calcularIRRF(bruto);
            System.out.println("IRRF: " + irrf);

            // Calcular o INSS
            inss = calculos.calcularINSS(bruto);
            System.out.println("INSS: " + inss);

            // Calcular o FGTS
            fgts = calculos.calcularFGTS(bruto);
            System.out.println("FGTS: " + fgts);

            // Calcular o salário líquido
            liquido = calculos.calcularSalarioLiquido(bruto, irrf, inss);
            System.out.println("Salário líquido: " + liquido);
        }else{
            System.out.println("Folha não encontrada!");
        }
    }

}
