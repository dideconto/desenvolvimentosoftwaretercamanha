package models;

public class Carro extends Automovel {

    public Carro(String combustivel, String placa){
        super(placa);
        this.combustivel = combustivel;
        // System.out.println("Criamos um carro!");
    }

    private String combustivel;

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    @Override
    public String paraTexto() {
        return "É um carro - PARA TEXTO";
    }
}
