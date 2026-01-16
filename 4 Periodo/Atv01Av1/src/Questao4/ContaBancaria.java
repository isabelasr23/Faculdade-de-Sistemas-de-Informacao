package Questao4;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private Double saldo;

    public ContaBancaria (String numeroConta, String titular, Double saldo){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Questao4.ContaBancaria{" +
                "numeroConta=" + numeroConta +
                ", titular='" + titular + '\'' +
                ", saldo=" + saldo +
                '}';
    }


    public String depositar(Double valorAdd){
        saldo += valorAdd;
        return "Valor depoistado na conta";
    }

    public String sacar(Double valorSac){
        if (valorSac > saldo){
            return "Não é possivel sacar esse valor";
        }

        saldo -= valorSac;
        return "Valor sacado da conta";
    }

    public String transferir(ContaBancaria numeroContaRecebe, double valorTransferido){
        if (valorTransferido > saldo){
           return "Não foi possivel transferir esse valor, sem saldo o suficiente.";
        }
        saldo -= valorTransferido;
        numeroContaRecebe.saldo += valorTransferido;
         
        return "Valor transferido";
    }

    public Double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }
}
