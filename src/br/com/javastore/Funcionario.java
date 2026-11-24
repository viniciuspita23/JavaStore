package br.com.javastore;

public class Funcionario {
    int idFuncionario;
    String nome;
    int idade;
    String cargo;
    double salario;
    String departamento;

    //Construtores para inicializar os atrbutos
    public  Funcionario(int idFuncionario, String nome, int idade, String cargo, double salario, String departamento){
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    //Metodo de exibição de funcionário
    public void exibirFuncionario(){
        System.out.println("ID: " + idFuncionario);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
        System.out.println("Departamento: " + departamento);
    }
}
