package models;

public class Cliente extends Pessoa {

    @Override
    public String toString() {
        return 
            "Nome: " + getNome() + 
            " | CPF: " + getCpf();
    }
    
}
