public class CriacaoObjeto{

    public static void main(String[] args) {
        //Objeto
        Livro livroVazio = new Livro();
        Livro livroCheio = new Livro("A", "A", "A", 1);

        //O método SET sempre armazena uma informação no 
        //atributo do objeto
        livroVazio.setNome("Orientação a Objetos");
        livroVazio.setPaginas(450);
        livroVazio.setAutor("Diogo Deconto");
        livroVazio.setGenero("Programação");

        //O método GET sempre retorna uma informação guardada 
        //no atributo do objeto
        System.out.println(livroVazio.getNome());
        System.out.println("Páginas: " + livroVazio.getPaginas());
        System.out.println("Gênero: " + livroVazio.getGenero());
        System.out.println("Autor: " + livroVazio.getAutor());
        
        System.out.println(livroVazio);
        System.out.println(livroCheio);
    }
}


// livro.somarDoisNumeros(2, 1);
// livro.nome = "Orientação a Objetos";
// System.out.println(livro.nome);