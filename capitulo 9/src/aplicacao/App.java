package aplicacao;
import entidade.Conta;

import java.util.Scanner;
import java.util.Locale;


public class App {
    public static void main(String[] args) throws Exception {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Conta conta;

        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        System.out.println("Digite um nome: ");
        sc.nextLine();
        String nome = sc.nextLine();

        System.out.println("Tem deposito inicial? (s/n): ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's') {
            System.out.println("Digite o deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(numero, nome,depositoInicial);
        } else {
            conta = new Conta(numero, nome);
        }

        System.out.println();
        System.out.println("Conta de: ");
        System.out.println(conta); 

        System.out.println();
        System.out.println("Entre com valor do deposito");
        double valorDeposito = sc.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Saldo de conta atualizado: ");
        System.out.println(conta);

        System.out.println();
        System.out.println("Entre com valor para saque");
        double valorSaque = sc.nextDouble();
        conta.saque(valorSaque);
        System.out.println("Saldo de conta atualizado: ");
        System.out.println(conta);


        sc.close();
    }
}
