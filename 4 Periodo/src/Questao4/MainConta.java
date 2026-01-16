package Questao4;

public class MainConta {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(
                "1234",
                "Isabela",
                100.00
        );

        ContaBancaria conta2 = new ContaBancaria(
                "4321",
                "Alessandra",
                200.00
        );


        System.out.println("\nSaldo Conta1: " +conta1.getSaldo());

        conta1.depositar(400.00);
        System.out.println("Saldo Conta1: " +conta1.getSaldo());

        System.out.println("\nSaldo Conta2: " +conta2.getSaldo());

        conta2.sacar(50.00);
        System.out.println("Saldo Conta2: " +conta2.getSaldo());

        System.out.println("\nSaldo Conta1: " +conta1.getSaldo());
        System.out.println("Saldo Conta2: " +conta2.getSaldo());

        conta1.transferir(conta2, 100.00);

        System.out.println("\nSaldo Conta1: " +conta1.getSaldo());
        System.out.println("Saldo Conta2: " +conta2.getSaldo());


    }
}
