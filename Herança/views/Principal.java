package views;

import models.Carro;
import models.Moto;

public class Principal{
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setCombustivel("Gasolina");
        carro.setCor("Preto");
        carro.setMarca("GM");
        carro.setModelo("Onix");
        carro.setPlaca("AAA-1111");
        carro.setVelocidadeMaxima(180);
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Combustível: " + carro.getCombustivel());
        
        Moto moto = new Moto();
        moto.setPotencia("150cc");
        moto.setCor("Preto");
        moto.setMarca("Honda");
        moto.setModelo("Onix");
        moto.setPlaca("AAA-1111");
        moto.setVelocidadeMaxima(180);
        System.out.println("Marca: " + moto.getMarca());
        System.out.println("Potência: " + moto.getPotencia());
        
    }
}