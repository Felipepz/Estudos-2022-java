package aplicacao;
import java.util.Locale;
import java.util.Scanner;
import entidades.funcionario;
public class App {
public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    funcionario emp = new funcionario();

    System.out.print("Name: ");
    emp.name = sc.nextLine(); 

    System.out.print("Gross salary: ");
    emp.grossSalary = sc.nextDouble(); 

    System.out.print("Tax: ");
    emp.tax = sc.nextDouble();
    
    System.out.println();
    System.out.println("Employee: " + emp);
    System.out.println();
    System.out.print("Which percentage to increase salary? ");
    double percentage = sc.nextDouble();
    emp.increaseSalary(percentage);
    System.out.println();
    System.out.println("Updated data: " + emp);
    sc.close();
}
}