package entidades;
public class Produtos {
    
    private String nome;
    private double preco;
    private int quantidade;

    public Produtos(){

    }

    public Produtos(int quantidade, double preco, String nome){
        this.nome = nome; 
        this.preco = preco; 
        this.quantidade = quantidade; 
    }

    public Produtos(double preco, String nome){
        this.nome = nome; 
        this.preco = preco; 
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco; 
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public double totalEmEstoque(){
        return preco * quantidade;
    }

    public void adicionarProduto(int quantidade){
        this.quantidade += quantidade;
    }

    public void removerProdutos(int quantidade){
        this.quantidade -= quantidade;
    }

   
    public String toString(){
        return nome
            + ", $ "
            + String.format("%.2f", preco)
            + ", "
            + quantidade
            + "unidades, total: $"
            +totalEmEstoque();
    }
}
