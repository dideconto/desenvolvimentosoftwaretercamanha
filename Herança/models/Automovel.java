package models;

import java.util.Date;

public class Automovel {

    public Automovel(String placa){
        // criadoEm = new Date();
        setCriadoEm(new Date());
        setPlaca(placa);
        // System.out.println("Criamos um automóvel");
    }
    
    private String placa;
    private String cor;
    private int velocidadeMaxima;
    private String modelo;
    private String marca;
    private Date criadoEm;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public Date getCriadoEm() {
        return criadoEm;
    }
    public void setCriadoEm(Date criadoEm) {
        this.criadoEm = criadoEm;
    }

    public String paraTexto(){
        return "Isso é um automóvel!";
    }
}
