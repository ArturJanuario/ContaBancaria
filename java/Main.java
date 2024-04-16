import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaDebito contaDebito = new ContaDebito();
        ContaCredito contaCredito = new ContaCredito();

        Transacao transacao = new Transacao(contaDebito, contaCredito);

        System.out.println("Bem-vindo ao sistema de transações bancárias!");

        System.out.print("Digite o valor a ser depositado na conta de débito: ");
        double valorDepositoDebito = scanner.nextDouble();
        transacao.realizarDepositoDebito(valorDepositoDebito);

        System.out.print("Digite o valor a ser depositado na conta de crédito: ");
        double valorDepositoCredito = scanner.nextDouble();
        transacao.realizarDepositoCredito(valorDepositoCredito);

        System.out.print("Digite o valor a ser pago com a conta de débito: ");
        double valorPagamentoDebito = scanner.nextDouble();
        transacao.realizarPagamentoDebito(valorPagamentoDebito);

        System.out.print("Digite o valor a ser pago com a conta de crédito: ");
        double valorPagamentoCredito = scanner.nextDouble();
        transacao.realizarPagamentoCredito(valorPagamentoCredito);

        System.out.println("Saldo da conta de débito: R$" + contaDebito.getSaldo());
        System.out.println("Saldo da conta de crédito: R$" + contaCredito.getSaldo());

        scanner.close();
    }
}
