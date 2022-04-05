//Classe de modelo
public class Livro {

    // Construtor
    // Deve ter o mesmo nome da classe
    public Livro(String nome, String autor, String genero,
            int paginas) {
        this.nome = nome;
        this.autor = autor;
        this.genero = genero;
        this.paginas = paginas;
    }

    public Livro() {
    }

    // Propriedade ou atributos
    private String nome;
    private String autor;
    private String genero;
    private int paginas;

    // Métodos de acesso ao atributo NOME
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return "Livro: " + this.nome;
    }

    // Métodos de acesso ao atributo PÁGINAS
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public int getPaginas() {
        return this.paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "\nNome: " + nome +
                "\nAutor: " + autor;
    }

    @Override
    public boolean equals(Object obj) {
        Livro outroLivro = (Livro) obj;
        if (getNome().equals(outroLivro.getNome()) &&
                getAutor().equals(outroLivro.getAutor())) {
            return true;
        }
        return false;
    }

}

// Atributos ou propriedades
/*
 * id -> int
 * páginas -> string
 * autor -> string
 * editora -> string
 * nome -> string
 * genero -> string
 * data lançamento -> string
 * edição -> string
 * material capa -> string
 * isbn -> string
 */

// private int somarDoisNumeros(int numero1, int numero2){
// return numero1 + numero2;
// }

// public String retornarTexto(String nome, int idade){
// return "Nome: " + nome;
// }

// public String retornarTexto(int idade, String nome){
// return "CPF: " + cpf;
// }
