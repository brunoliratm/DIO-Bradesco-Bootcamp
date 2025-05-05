public class Main {public static void main(String[] args) {
    Banco meuBanco = new Banco("Meu Banco Digital");

    Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
    Conta cc1 = new ContaCorrente(cliente1, 200.0);
    meuBanco.adicionarConta(cc1);

    Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-11");
    Conta cp1 = new ContaPoupanca(cliente2);
    meuBanco.adicionarConta(cp1);

    meuBanco.listarContas();

    Conta contaJoao = meuBanco.buscarConta(1);
    if (contaJoao != null) {
        contaJoao.depositar(100.0);
        contaJoao.sacar(50.0);
        contaJoao.imprimirExtrato();
    }

    Conta contaMaria = meuBanco.buscarConta(2);
    if (contaMaria != null) {
        contaMaria.depositar(50.0);
        contaMaria.sacar(60.0);
        contaMaria.imprimirExtrato();
    }

    if (contaJoao instanceof ContaCorrente && contaMaria != null) {
        contaJoao.transferir(20.0, contaMaria);
        contaJoao.imprimirExtrato();
        contaMaria.imprimirExtrato();
    }
}
}
