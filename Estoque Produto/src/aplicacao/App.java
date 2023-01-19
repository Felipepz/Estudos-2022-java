package aplicacao;
import entidades.Produtos;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

      

        System.out.println("Digite o nome do produto");
        System.out.print("Nome:");
        String nome = sc.nextLine();

        System.out.println("Digite o preço do produto");
        System.out.print("preço:");
        double preco = sc.nextDouble();

        Produtos produto = new Produtos( preco, nome);

        produto.setNome ("Computador");
        System.out.println("Nome do produto atualizado: " + produto.getNome());

        produto.setPreco(10000);
        System.out.println("Preco Atualizado: "+ produto.getPreco());



        System.out.println();
        System.out.println("Produto" + produto);

        System.out.println();
        System.out.println("Entre com o numero de produtos para ser adicionado em estoque");
        int quantidade = sc.nextInt();
        produto.adicionarProduto(quantidade);

        System.out.println();
        System.out.println("Dados atualizados" + produto);

        System.out.println();
        System.out.println("Entre com o numero de produtos para ser removido em estoque");
        quantidade = sc.nextInt();
        produto.removerProdutos(quantidade);

        System.out.println();
        System.out.println("Dados atualizados" + produto);

       sc.close();
    }
}
