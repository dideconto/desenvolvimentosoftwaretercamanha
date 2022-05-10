package views;

public class Principal {
    public static void main(String[] args) {
        int horas = 100;
        int valor = 50;
        double bruto, irrf, inss, fgts, liquido;

        // Calcular o salário bruto
        bruto = calcularSalarioBruto(horas, valor);
        System.out.println("Salário bruto: " + bruto);

        // Calcular o imposto de renda
        irrf = calcularIRRF(bruto);
        System.out.println("IRRF: " + irrf);

        // Calcular o INSS
        inss = calcularINSS(bruto);
        System.out.println("INSS: " + inss);

        // Calcular o FGTS
        fgts = calcularFGTS(bruto);
        System.out.println("FGTS: " + fgts);

        // Calcular o salário líquido
        liquido = calcularSalarioLiquido(bruto, irrf, inss);
        System.out.println("Salário líquido: " + liquido);
    }

    public static double calcularSalarioBruto(int horas, int valor) {
        return horas * valor;
    }

    public static double calcularIRRF(double bruto) {
        if (bruto <= 1903.98) {
            return 0;
        } else if (bruto <= 2826.65) {
            return (bruto * .075) - 142.8;
        } else if (bruto <= 3751.05) {
            return (bruto * .15) - 354.8;
        } else if (bruto <= 4664.68) {
            return (bruto * .225) - 636.13;
        }
        return (bruto * .275) - 869.39;

    }

    public static double calcularINSS(double bruto) {
        if (bruto <= 1693.72) {
            return bruto * .08;
        } else if (bruto <= 2822.9) {
            return bruto * .09;
        } else if (bruto <= 5645.8) {
            return bruto * .11;
        }
        return 621.03;
    }

    public static double calcularFGTS(double bruto) {
        return bruto * .08;
    }

    public static double calcularSalarioLiquido(double bruto,
            double irrf, double inss) {
        return bruto - irrf - inss;
    }
}