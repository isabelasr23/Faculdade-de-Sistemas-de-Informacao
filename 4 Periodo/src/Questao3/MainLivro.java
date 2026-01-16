package Questao3;

public class MainLivro {
    public static void main(String[] args) {

        Livro livro1 = new Livro(
                "O nome do vento",
                "Patrick Rothfuss",
                2007,
                true
        );
        Livro livro2 = new Livro(
                "O temor do sábio",
                "Patrick Rothfuss",
                2011,
                true
        );

        System.out.println(livro1.emprestar());
        System.out.println(livro1);

        System.out.println(livro2.devolver());
        System.out.println(livro2.emprestar());

        System.out.println(livro2);








    }
}