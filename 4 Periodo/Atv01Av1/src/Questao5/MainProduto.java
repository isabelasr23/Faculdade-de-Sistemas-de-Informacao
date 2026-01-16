package Questao5;

import java.util.Scanner;

public class MainProduto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Venda venda = new Venda(null, null, null);

        Pagamento pag1 = new Pagamento("A vista",null);
        Pagamento pag2 = new Pagamento("Parcelado", null);

        Produto produto1 = new Produto("Iphone 16", 2000.00);
        Produto produto2 = new Produto("MacBook", 4000.0);


        System.out.println("1| " + produto1.toString() + "\n2| " + produto2.toString());

        System.out.print("\nDigite o numero do produto que deseja comprar: ");
        int numProduto = scanner.nextInt();
        if (numProduto == 1){
            venda.produto = produto1;
        }else {
            venda.produto = produto2;
        }

        System.out.println("1| " + pag1.toString() + "\n2| " + pag2.toString());
        System.out.print("Qual a forma de pagamento? ");
        int numPag = scanner.nextInt();

        if (numPag == 2){
            venda.formaPag = pag2;

            System.out.print("Quantas parcelas? ");
            int parcelas = scanner.nextInt();
            venda.formaPag.parcelas = parcelas;

            System.out.println("Preço total: R$ " + Math.round(venda.comprar()) +
                    "\nPreço das parcelas: " + parcelas + "x de R$ " + Math.round(venda.formaPag.valorParcelas));
        }else {
            venda.formaPag = pag1;
            System.out.println("Preço total: R$ " + Math.round(venda.comprar()));
        }









    }
}
