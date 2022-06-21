package models;

public class Moto extends Automovel{

    public Moto(String placa){
        super(placa);
        // System.out.println("Criamos um moto!");
    }

    private String potencia;

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    // @Override
    // public String paraTexto() {
    //     return "É uma moto - PARA TEXTO";
    // }
    
}
