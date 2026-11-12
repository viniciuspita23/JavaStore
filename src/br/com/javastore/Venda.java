package br.com.javastore;

public class Venda {
    int idProd;
    String nomeProd;
    double precoProd;
    int qtdProd;

    //Inicializando os atributos com construtor
    public Venda(int idProd, String nomeProd, double precoProd, int qtdProd){
        this.idProd = idProd;
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
        this.qtdProd = qtdProd;
    }

    //Metodo para exibir as vendas no histórico de vendas
       public void exibirVenda(){
        System.out.println("ID: " + idProd + " | Produto: " +  nomeProd + " | Preço: " + precoProd + " | QTD: " + qtdProd);
    }
}
