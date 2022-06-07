package utils;

public class Validacao {

    public static boolean verificarCPF(String cpf) {
        cpf = removerCaracteres(cpf);

        if (!verificarTamanho(cpf)) {
            return false;
        }
        if (verificarNumerosIguais(cpf)) {
            return false;
        }

        int digito1 = gerarPrimeiroDigito(cpf);
        int digito2 = gerarSegundoDigito(cpf);

        return validarDigitos(cpf, digito1, digito2);
    }

    public static boolean validarDigitos(String cpf, int digito1, int digito2) {
        return Integer.parseInt(String.valueOf(cpf.charAt(9))) == digito1 &&
                Integer.parseInt(String.valueOf(cpf.charAt(10))) == digito2;
    }

    public static int gerarPrimeiroDigito(String cpf) {
        int soma = 0;
        int peso = 10;
        char[] vetor = cpf.toCharArray();
        for (int i = 0; i < vetor.length - 2; i++) {
            soma += Integer.parseInt(String.valueOf(vetor[i])) * peso;           
            peso--;
        }
        if (soma % 11 > 2) {
            return 11 - (soma % 11);
        } else {
            return 0;
        }

    }

    public static int gerarSegundoDigito(String cpf) {
        int soma = 0;
        int peso = 11;
        char[] vetor = cpf.toCharArray();
        for (int i = 0; i < vetor.length - 1; i++) {
            soma += Integer.parseInt(String.valueOf(vetor[i])) * peso;
            peso--;
        }
        if (soma % 11 > 2) {
            return 11 - (soma % 11);
        } else {
            return 0;
        }

    }

    public static String removerCaracteres(String cpf) {
        return cpf.replace(".", "").replace("-", "");
    }

    public static boolean verificarTamanho(String cpf) {
        return cpf.length() == 11;
    }

    public static boolean verificarNumerosIguais(String cpf) {
        return cpf.equals("00000000000") ||
                cpf.equals("11111111111") ||
                cpf.equals("22222222222") ||
                cpf.equals("33333333333") ||
                cpf.equals("44444444444") ||
                cpf.equals("55555555555") ||
                cpf.equals("66666666666") ||
                cpf.equals("77777777777") ||
                cpf.equals("88888888888") ||
                cpf.equals("99999999999");
    }
    
}
