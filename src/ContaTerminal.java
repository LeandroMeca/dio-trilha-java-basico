
/**
 *
 * @author Leandro
 */

import java.util.Scanner;

public class ContaTerminal {

    static int numero;
    static double saldo;
    static String nomeCliente, agencia;

    public static void main(String[] args) {

        inserirCliente();
        printarCliente();

    }

    public static void inserirCliente() {
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Digite o numero da conta e aperte enter");
        numero = sc.nextInt();
        System.out.println("Digite o numero da  agencia e aperte enter");
        agencia = sc.next();
        System.out.println("Digite o nome do cliente e aperte enter");
        nomeCliente = sc.next();
        System.out.println("Digite o saldo da conta e aperte enter");
        saldo = sc.nextDouble();
    }

    public static void printarCliente() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ""
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");
    }
}

