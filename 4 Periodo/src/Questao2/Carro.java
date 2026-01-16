package Questao2;

public class Carro {
    String modelo;
    String cor;
    Integer ano;
    Integer velocidade;

    Carro(String modelo, String cor, Integer ano, Integer velocidade){
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    void acelerar(){
        alterarVelo(10);
    }

    void freiar(){
        alterarVelo(-10);
    }

    void alterarVelo(Integer updateVelo){
        if (velocidade <= 10 && updateVelo == - 10){
            velocidade = 0;
            return;
        }

        velocidade += updateVelo;
    }

    @Override
    public String toString() {
        return "Carro.Carro{" +
                "modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", ano=" + ano +
                ", velocidade=" + velocidade +
                '}';
    }

    public Integer getVelocidade() {
        return velocidade;
    }
}
