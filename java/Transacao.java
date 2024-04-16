public class Transacao {
    private ContaDebito contaDebito;
    private ContaCredito contaCredito;

    public Transacao(ContaDebito contaDebito, ContaCredito contaCredito) {
        this.contaDebito = contaDebito;
        this.contaCredito = contaCredito;
    }

    public void realizarDepositoDebito(double valor) {
        contaDebito.depositar(valor);
    }

    public void realizarDepositoCredito(double valor) {
        contaCredito.depositar(valor);
    }

    public void realizarPagamentoDebito(double valor) {
        contaDebito.pagar(valor);
    }

    public void realizarPagamentoCredito(double valor) {
        contaCredito.pagar(valor);
    }
}
