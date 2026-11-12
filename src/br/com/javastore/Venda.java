package br.com.javastore;

public class Venda {
    String nomeProd;
    int idProd;
    int qtdProd;

    //Inicializando os atributos com construtor
    public Venda(String nomeProd, int idProd, int qtdProd){
        this.nomeProd = nomeProd;
        this.idProd = idProd;
        this.qtdProd = qtdProd;
    }

    //Metodo para exibir as vendas no histórico de vendas
       public void exibirVenda(){
        System.out.println("Produto: " +  nomeProd + " | ID: " + idProd + " | QTD: " + qtdProd);
    }
}
