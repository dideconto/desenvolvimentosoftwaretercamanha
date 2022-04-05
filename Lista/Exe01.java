public class Exe01{

    public static void main(String[] args) {
        int largura, altura, area;
        String larguraS;
        
        System.out.println(" -- EXERCÍCIO 01 -- \n");
        // largura = Console.readInt("Digite a largura: ");
        // altura = Console.readInt("Digite a altura: ");

        larguraS = Console.readString("Digite a largura: ");
        largura = Integer.parseInt(larguraS);

        altura = Console.readInt("Digite a altura: ");
        area = largura * altura;
        System.out.println("Área: " + area);
    }

}