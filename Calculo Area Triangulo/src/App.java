import java.util.Locale;
import java.util.Scanner;
import entidades.Triangulo; 



public class App {
   

    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite um numero de X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();


        System.out.println("Digite um numero de y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        
        double areaX = x.area();
        
        double areaY = y.area();

        System.out.printf("Triangulo X area: %.4f%n",areaX);
        System.out.printf("Triangulo Y area: %.4f%n",areaY);

        if (areaX > areaY){
            System.out.println("Maior Area é de X ");
        } else {
            System.out.println("Maior area é de Y");
        }
        
        sc.close();
    }


}
