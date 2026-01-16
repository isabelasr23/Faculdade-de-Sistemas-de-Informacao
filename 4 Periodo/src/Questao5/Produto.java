package Questao5;

public class Produto {
    String nome;
    double preco;

    Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: \n" +
                "   Nome: " + nome + "\n" +
                "   Preco: R$ " + preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

}
