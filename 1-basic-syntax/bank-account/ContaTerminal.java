import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int Numero;
      String Agencia;
      String NomeCliente;
      double Saldo;

      System.out.println("Bem vindo ao Banco do Brasil");
      System.out.println("By BrunoMagno\n");
      System.out.println("Vamos criar uma conta para você:");
      System.out.println("- Digite o número da conta:");
      Numero = scanner.nextInt();
      System.out.println("- Digite o número da agência:");
      Agencia = scanner.next();
      System.out.println("- Digite o nome do cliente:");
      NomeCliente = scanner.next();
      System.out.println("- Digite o saldo da conta:");
      Saldo = scanner.nextDouble();
      scanner.close();
      System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque ");
    }

}
