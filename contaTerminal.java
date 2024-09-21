import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Por favor, informe os dados conforme solicitado.");
        System.out.print("Numero da conta: ");
        int numero = in.nextInt();

        System.out.println("Agencia da conta: ");
        String agencia = in.next();

        System.out.println("Nome do Cliente: ");
        String nomeCliente = in.next();

        System.out.println("Saldo da conta: ");
        float saldo = in.nextFloat();
        
        in.close();

        System.out.println(
            String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque", nomeCliente, agencia, numero, saldo)
        );
    }
}
