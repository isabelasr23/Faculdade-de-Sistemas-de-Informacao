package Questao5;

public class Venda {
    Produto produto;
    Double total;
    Pagamento formaPag;

    Venda(Produto produto, Double total, Pagamento formaPag){
        this.produto = produto;
        this.total = total;
        this.formaPag = formaPag;
    }


    double comprar () {
        if (formaPag.formaPag.equals("Parcelado")){
            total = formaPag.parcelado(produto) * formaPag.parcelas;

            return total;
        }

        total = formaPag.aVista(produto);
        return total;

    }
}
