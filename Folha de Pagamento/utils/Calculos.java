package utils;

public class Calculos {
    public double calcularSalarioBruto(int horas, double valor) {
        return horas * valor;
    }

    public double calcularIRRF(double bruto) {
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

    public double calcularINSS(double bruto) {
        if (bruto <= 1693.72) {
            return bruto * .08;
        } else if (bruto <= 2822.9) {
            return bruto * .09;
        } else if (bruto <= 5645.8) {
            return bruto * .11;
        }
        return 621.03;
    }

    public double calcularFGTS(double bruto) {
        return bruto * .08;
    }

    public double calcularSalarioLiquido(double bruto,
            double irrf, double inss) {
        return bruto - irrf - inss;
    }
}
