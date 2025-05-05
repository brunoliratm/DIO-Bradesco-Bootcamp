public class ContaCorrente extends Conta {
    private double limiteChequeEspecial;

    public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
        super(cliente);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && (saldo + limiteChequeEspecial) >= valor) {
            saldo -= valor;
            System.out.printf("Saque de %.2f realizado na conta corrente %d.%n", valor, numero);
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else {
            System.out.println("Saldo insuficiente e limite de cheque especial excedido.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da Conta: " + this.numero);
        System.out.printf("Saldo Atual: %.2f%n", this.saldo);
        System.out.printf("Limite Cheque Especial: %.2f%n", this.limiteChequeEspecial);
        System.out.println("==============================");
    }
}