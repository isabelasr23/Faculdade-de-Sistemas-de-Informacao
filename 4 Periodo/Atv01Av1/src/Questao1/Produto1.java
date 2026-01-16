package Questao1;

public class Produto1 {

    Categoria categoria;

    String nome;
    Double preco;
    Integer estoque;

    @Override
    public String toString() {
        return "Questao5.Produto{" +
                "categoria =" + categoria.getNome() +
                ", nome ='" + nome + '\'' +
                ", preco =" + preco +
                ", estoque =" + estoque +
                '}';
    }

    Produto1(Categoria categoria, String nome, Double preco, Integer estoque){
        this.categoria = categoria;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
}
