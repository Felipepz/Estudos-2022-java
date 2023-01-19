import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        List<String> lista = new ArrayList<>();   

        lista.add("Maria");
        lista.add("Felipe");
        lista.add("Rafael");
        lista.add("Joao");
        lista.add(4,"Marcos");

        System.out.println(lista.size());

        lista.remove(1);

        for(String x : lista){
            System.out.println(x);
        }

        System.out.println("--------------");
        lista.removeIf(x -> x.charAt(0) == 'M');
        for(String x : lista){
            System.out.println(x);
        }

        System.out.println("--------------"); 
        System.out.println("Index of Rafael:" + lista.indexOf("Rafael"));
        System.out.println("Index of Marcos (-1 = nao esta na lista):" + lista.indexOf("Marcos"));
        System.out.println("---------------");

        List<String> resultado = lista.stream().filter(x -> x.charAt(0) == 'R').collect(Collectors.toList());
        for(String x : resultado){
            System.out.println(x);
        }

        System.out.println("---------------");
        String nome = lista.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
        System.out.println(nome);
    }
}
