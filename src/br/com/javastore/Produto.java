package br.com.javastore;

public class Produto {
    //Atributos dos produtos
    String nome;
    double preco;
    int quantidade;

    //Construtores para inicializarem os atributos
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Metodo de exibição de produto
    public  void exibirProduto (){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

}
