import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void listarContas() {
        System.out.println("=== Contas do Banco " + nome + " ===");
        for (Conta conta : contas) {
            System.out.println("Agência: " + conta.getAgencia() + ", Conta: " + conta.getNumero() + ", Cliente: " + conta.getCliente().getNome());
        }
        System.out.println("===============================");
    }

    public Conta buscarConta(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumero() == numeroConta) {
                return conta;
            }
        }
        return null;
    }
}

