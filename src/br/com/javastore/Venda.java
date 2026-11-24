package br.com.javastore;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {
    int idProd;
    String nomeProd;
    double precoProd;
    int qtdProd;
    LocalDateTime dataHora;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    //Inicializando os atributos com construtor
    public Venda(int idProd, String nomeProd, double precoProd, int qtdProd){
        this.idProd = idProd;
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
        this.qtdProd = qtdProd;
        this.dataHora = LocalDateTime.now();
    }

    //Metodo para exibir as vendas no histórico de vendas
       public void exibirVenda(){
        System.out.println("ID: " + idProd + " | Produto: " +  nomeProd + " | Preço: " + precoProd + " | QTD: " + qtdProd + " | Data/Hora: " + dataHora.format(formato));
    }
}
