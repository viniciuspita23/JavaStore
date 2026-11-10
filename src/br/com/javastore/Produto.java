package br.com.javastore;

public class Produto {
    //Atributos dos produtos
    String nome;
    double preco;
    int quantidade;

    //Construtor com parâmetro para receberem valores padrão
    //Exemplo: this.nome representa o atributo da classe. nome representa o parâmtro recebido pelo construtor
    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

}
