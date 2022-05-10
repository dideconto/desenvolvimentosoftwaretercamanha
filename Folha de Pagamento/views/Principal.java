package views;

public class Principal{
    public static void main(String[] args) {
        int horas = 100; 
        int valor = 20;
        double bruto, irrf, inss, fgts, liquido;

        //Calcular o salário bruto
        bruto = horas * valor;
        System.out.println("Salário bruto: " + bruto);

        //Calcular o imposto de renda
        if(bruto <= 1903.98){
            irrf = 0;
        }else if(bruto <= 2826.65){
            irrf = (bruto * .075) - 142.8;
        }else if(bruto <= 3751.05){
            irrf = (bruto * .15) - 354.8;
        }else if(bruto <= 4664.68){
            irrf = (bruto * .225) - 636.13;
        }else{
            irrf = (bruto * .275) - 869.39;
        }
        System.out.println("IRRF: " + irrf);
        
        //Calcular o INSS
        if(bruto <= 1693.72){
            inss = .08;
        }else if(bruto <= 2822.9){
            inss = bruto * .09;
        }else if(bruto <= 5645.8){
            inss = bruto * .11;
        }else{
            inss = 621.03;
        }
        System.out.println("INSS: " + inss);
        
        //Calcular o FGTS
        fgts = bruto * .08;
        System.out.println("FGTS: " + fgts);
        
        //Calcular o FGTS
        liquido = bruto - inss - irrf;
        System.out.println("Salário líquido: " + liquido);
    }
}