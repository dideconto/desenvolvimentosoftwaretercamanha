import java.util.Random;

public class ComparacaoOjeto {

    public static void main(String[] args) {

        //Instanciar, criar ou construir
        Livro livro1 = new Livro();
        Livro livro2 = new Livro();

        livro1.setNome("Desenvolvimento Web I");
        livro1.setAutor("José da Silva");
        
        livro2.setNome("Desenvolvimento Web I");
        livro2.setAutor("José da Silva Teixeira");

        // System.out.println(livro1);
        // System.out.println(livro2);

        if(livro1.equals(livro2)){
            System.out.println("Igual");
        }else{
            System.out.println("Diferente");
        }
        
    }
    
}
