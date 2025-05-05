public abstract class Conta {
  private static final int AGENCIA_PADRAO = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  public Conta(Cliente cliente) {
    this.agencia = AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
    this.saldo = 0.0;
    this.cliente = cliente;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public Cliente getCliente() {
    return cliente;
  }

  public void sacar(double valor) {
    if (valor > 0) {
      saldo -= valor;
      System.out.printf("Saque de %.2f realizado na conta %d.%n", valor, numero);
    } else {
      System.out.println("Valor de saque inválido.");
    }
  }

  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.printf("Depósito de %.2f realizado na conta %d.%n", valor, numero);
    } else {
      System.out.println("Valor de depósito inválido.");
    }
  }

  public void transferir(double valor, Conta contaDestino) {
    if (valor > 0 && this.saldo >= valor) {
      this.sacar(valor);
      contaDestino.depositar(valor);
      System.out.printf("Transferência de %.2f da conta %d para a conta %d realizada.%n", valor, this.numero,
          contaDestino.numero);
    } else if (valor <= 0) {
      System.out.println("Valor de transferência inválido.");
    } else {
      System.out.println("Saldo insuficiente para transferência.");
    }
  }

  public abstract void imprimirExtrato();
}
