public class ContaCredito {
    private double saldo;

    public ContaCredito() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na conta de crédito.");
    }

    public boolean pagar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso! Metade do valor permanece na conta.");
            return true;
        } else {
            System.out.println("Saldo insuficiente para pagamento!");
            return false;
        }
    }
}
