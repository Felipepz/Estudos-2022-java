package aplicacao;

import java.util.Scanner;
import utilitarios.calculadora;

public class App {


    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
       

        System.out.print("Enter com valor do raio: ");
        double raio = sc.nextDouble();

        double  c = calculadora.circunferencia(raio);

        double v = calculadora.volume(raio);

        System.out.printf("Circunferencia: %.2f%n",c);
        System.out.printf("Volume: %.2f%n",v);
        System.out.printf("PI valor: %.2f%n",calculadora.PI);

        sc.close();
    }
}
