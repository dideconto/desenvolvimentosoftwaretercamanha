public class Exe05 {
    public static void main(String[] args) {
        int idade;

        System.out.println(" -- EXERCÍCIO 05 -- \n");
        idade = Console.readInt("Digite a sua idade: ");
        
        if(idade <= 13){
            System.out.println("\nCriança");
        }else if(idade <= 18){
            System.out.println("\nAdolescente");
        }else if(idade <= 60){
            System.out.println("\nAdulto");
        }else{
            System.out.println("\nIdoso");
        }
        
    }
}
