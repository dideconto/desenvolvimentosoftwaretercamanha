import java.util.Random;

public class Exe08 {

    public static void main(String[] args) {
        int[] vetor = new int[10];
        Random random = new Random();
        int aux = 0;
        boolean troca = false;
    
        System.out.println(" -- EXERCÍCIO 08 -- \n");

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = random.nextInt(1000);
        }

        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        System.out.println("\n\n");

        do{
            troca = false;
            for(int i = 0; i < vetor.length - 1; i++){
                if(vetor[i] > vetor[i + 1]){
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }while(troca);

        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }
    }

}
