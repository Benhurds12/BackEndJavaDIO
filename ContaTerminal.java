import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha

        System.out.print("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.nextLine();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite o saldo da conta: ");
        double saldoConta = scanner.nextDouble();

        String mensagem = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                          numeroAgencia + ", conta " + numeroConta + " e seu saldo R$ " + saldoConta + " já está disponível para saque.";

        System.out.println(mensagem);

        scanner.close();
    }
}