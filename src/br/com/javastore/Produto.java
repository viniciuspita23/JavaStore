package br.com.javastore;

public class Produto {
    //Atributos dos produtos
    int id;
    String nome;
    double preco;
    int quantidade;

    //Construtores para inicializarem os atributos
    public Produto(int id, String nome, double preco, int quantidade){
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //Metodo de exibição de produto
    public void exibirProduto (){
        System.out.println("ID: " + id);
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    //Metodo para exibir estoque
    public void exibirEstoque(){
        System.out.println("ID : " + id + " | Produto: " + nome + " | QTD: " + quantidade);
    }

}
