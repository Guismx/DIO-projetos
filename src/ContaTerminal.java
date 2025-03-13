import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = scanner.nextDouble();

       ContaBanco conta = new ContaBanco();
        conta.numero = numero;
        conta.agencia = agencia;
        conta.nomeCliente = nomeCliente;
        conta.saldo = saldo;

        String mensagem = "Olá " + conta.nomeCliente + ", obrigado por criar uma conta em nosso banco, "
                + "sua agência é " + conta.agencia + ", conta " + conta.numero
                + " e seu saldo " + conta.saldo + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}