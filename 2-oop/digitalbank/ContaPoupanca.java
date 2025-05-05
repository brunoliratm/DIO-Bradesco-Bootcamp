public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.printf("Saque de %.2f realizado na conta poupança %d.%n", valor, numero);
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido.");
        } else {
            System.out.println("Saldo insuficiente na conta poupança.");
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("==== Extrato Conta Poupança ====");
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número da Conta: " + this.numero);
        System.out.printf("Saldo Atual: %.2f%n", this.saldo);
        System.out.println("===============================");
    }
}