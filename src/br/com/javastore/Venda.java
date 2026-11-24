package br.com.javastore;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Venda {
    int idProd;
    String nomeProd;
    double precoProd;
    int qtdProd;
    LocalDateTime dataHora;
    int idFuncionario;
    DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    //Inicializando os atributos com construtor
    public Venda(int idProd, String nomeProd, double precoProd, int qtdProd, int idFuncionario){
        this.idProd = idProd;
        this.nomeProd = nomeProd;
        this.precoProd = precoProd;
        this.qtdProd = qtdProd;
        this.idFuncionario = idFuncionario;
        this.dataHora = LocalDateTime.now();
    }

    //Metodo para exibir as vendas no histórico de vendas
       public void exibirVenda(){
        System.out.println("ID: " + idProd + " | Produto: " +  nomeProd + " | Preço: " + precoProd + " | QTD: " + qtdProd + " | Data/Hora: " + dataHora.format(formato) + " | ID funcionário: " + idFuncionario);
    }
}
