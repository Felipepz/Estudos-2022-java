package entidade;

public class Conta {
    
    private int numero; 
    private String nome;
    private double saldo;


    public Conta(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }

    public Conta(int numero, String nome, double depositoInicial){
        this.numero = numero;
        this.nome = nome;
        deposito(depositoInicial);
    }


    public int getNumero(){
        return numero;
    }

    
    public String getNome(){
        return nome;
    }

    public void setNumero(String nome){
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposito(double dinheiro){
        saldo += dinheiro;
    }

    public void saque(double dinheiro){
        saldo -= dinheiro + 5.0;
    }

    public String toString(){
        return "Conta:"
                + numero 
                + ", Nome: "
                + nome 
                + ", Saldo: $"
                + String.format("%.2f",saldo);
    }





}
