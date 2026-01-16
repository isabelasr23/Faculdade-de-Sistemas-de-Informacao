package Questao3;

public class Livro {

    private String titulo;
    private String autor;
    private int anoDePublicado;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int anoDePublicado, boolean disponibilidade) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoDePublicado = anoDePublicado;
        this.disponibilidade = disponibilidade;
    }

    public String emprestar() {
        if (!disponibilidade) {
            return "Não foi possível pegar o livro emprestado, ele está indisponível.\n";
        }
        disponibilidade = false;
        return "Você pegou o livro emprestado!\n";
    }

    public String devolver() {
        if (disponibilidade) {
            return "Não é possível devolver um livro que já está disponível.\n";
        }
        disponibilidade = true;
        return "Questao3.Livro devolvido com sucesso!\n";
    }

    @Override
    public String toString() {
        String status = disponibilidade ? "Disponível" : "Indisponível";

        return "Questao3.Livro {" +
                "\ntitulo ='" + titulo + '\'' +
                "\nautor ='" + autor + '\'' +
                "\nanoDePublicado =" + anoDePublicado +
                "\ndisponibilidade =" + status +
                "\n}";
    }

}
