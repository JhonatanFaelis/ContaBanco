import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem vindo! para iniciar digite o numero da sua conta");
        int numero = scanner.nextInt();
        System.out.println("Obrigado, agora digite sua agencia");
        String agencia = scanner.next();
        System.out.println("Confirme seu nome por gentileza");
        String nomeCliente = scanner.next();
        System.out.println("Qual o valor que deseja adicionar em sua conta?");
        double saldo = scanner.nextDouble();
        System.out.println("Ola " + nomeCliente + " muito obrigado por fazer parte de nosso banco, sua agencia é " + agencia + " conta " + numero + " e seu saldo inicial ja disponivel é de " + saldo);
    }

}
