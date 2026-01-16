package Questao5;

public class Pagamento {
    String formaPag;
    Integer parcelas;
    Double valorParcelas;

    Pagamento(String formaPag, Integer parcelas){
        this.formaPag = formaPag;
        this.parcelas = parcelas;
    }

    @Override
    public String toString() {
        return "Pagamento: " + formaPag;
    }

    double parcelado(Produto produto){
        valorParcelas = (produto.preco * 0.05 + (produto.preco/parcelas));
        
        return valorParcelas;
    }

    double aVista(Produto produto){
        return produto.preco;
    }



}
