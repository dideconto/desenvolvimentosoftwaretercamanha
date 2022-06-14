package views;

import models.Carro;
import models.Moto;

public class Principal{
    public static void main(String[] args) throws InterruptedException {

        Carro carro = new Carro("Gasolina", "AAA-1111");
        // carro.setCombustivel("Gasolina");
        // carro.setCor("Preto");
        // carro.setMarca("GM");
        // carro.setModelo("Onix");
        // carro.setPlaca("AAA-1111");
        // carro.setVelocidadeMaxima(180);
        System.out.println("Criado em: " + carro.getCriadoEm());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Combustível: " + carro.getCombustivel());

        Thread.sleep(2000);
        
        Moto moto = new Moto("BBB-2222");
        // moto.setPotencia("150cc");
        // moto.setCor("Preto");
        // moto.setMarca("Honda");
        // moto.setModelo("Onix");
        // moto.setPlaca("AAA-1111");
        // moto.setVelocidadeMaxima(180);
        System.out.println("Criado em: " + moto.getCriadoEm());
        System.out.println("Placa: " + moto.getPlaca());
        // System.out.println("Potência: " + moto.getPotencia());
        
    }
}