package Questao2;

public class MainCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Creta", "Prata", 2025,0);

        System.out.println(carro1.getVelocidade());

        carro1.acelerar();
        System.out.println(carro1.getVelocidade());

        carro1.acelerar();
        System.out.println(carro1.getVelocidade());

        carro1.acelerar();
        System.out.println(carro1.getVelocidade());

        carro1.freiar();
        System.out.println(carro1.getVelocidade());

    }
}
