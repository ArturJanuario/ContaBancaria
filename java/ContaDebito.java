public class ContaDebito {
    private double saldo;

    public ContaDebito() {
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado na conta de débito.");
    }

    public boolean pagar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Pagamento de R$" + valor + " realizado com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente para pagamento!");
            return false;
        }
    }
}
