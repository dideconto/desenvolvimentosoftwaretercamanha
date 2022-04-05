public class Exe02 {
    public static void main(String[] args) {        
        int real;
        double dolar, euro, pesoArgentino;
        
        System.out.println(" -- EXERCÍCIO 02 -- \n");

        real = Console.readInt("Digite o valor em R$: ");
        dolar = real / 5.11;
        euro = real / 5.55;
        pesoArgentino = real / .04;

        System.out.println("Dólar: " +  dolar);
        System.out.println("Euro: " +  euro);
        System.out.println("Peso Argentino: " +  pesoArgentino);
    }
}
