package views;

import controllers.FolhaPagamentoController;
import models.FolhaPagamento;
import utils.Calculos;

public class ListarFolhas {

    public void renderizar() {
        
        FolhaPagamentoController folhaController = new FolhaPagamentoController();
        Calculos calculos = new Calculos();

        System.out.println("\n -- CADASTRO DE FOLHA DE PAGAMENTO -- \n");

        for (FolhaPagamento folhaCadastrada : folhaController.listar()) {
            System.out.println("Funcionário: " + folhaCadastrada.getFuncionario().getNome());
            
            double bruto, irrf, inss, fgts, liquido;

            // Calcular o salário bruto
            bruto = calculos.calcularSalarioBruto
                (folhaCadastrada.getHoras(), folhaCadastrada.getValor());
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

            System.out.println();
        }
    }

}
