package models;

public class Funcionario extends Pessoa {

    @Override
    public String toString() {
        return 
            "Nome: " + getNome() + 
            " | CPF: " + getCpf();
    }
    
}
