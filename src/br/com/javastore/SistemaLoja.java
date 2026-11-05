package br.com.javastore;

import java.util.Scanner;

public class SistemaLoja {
    Scanner scanner = new Scanner(System.in);
    //Metodo inicialização menu na Main

    //Criação do array/vetor de armazenamento dos produtos, utilizado pelo case2
    //Se chama produto por conta da minha classe Produto. Estou utilizando essa classe como array
    int numero_max = 1000;
    Produto[] produtos = new Produto[numero_max];

    public  void iniciarMenu(){
    //Criação menu
        int opcaoMenu = -1;
        while(opcaoMenu != 0){
            System.out.println("Menu Java Sotre");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Cadastrar funcionário");
            System.out.println("4 - Relaizar venda");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            opcaoMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Cadastro de produto");
                    //Não precisei colocar produto.cadastrarProduto pois o metodo foi criado dentro da própria classe SistemaLoja
                    cadastrarProduto();
                    break;
                case 2:
                    System.out.println("Lista de produtos");
                    listarProdutos();
                    break;
                case 3:
                    //Cadastrar funcionário
                    break;
                case 4:
                    //Realizar venda
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Digite uma opção válida do menu!");
            }
        }
    }

    //Metodo de cadastro de produto referente ao case 1
    public void cadastrarProduto (){
        System.out.println("Nome produto: ");
        String nome = scanner.nextLine();
        System.out.println("Preço produto: ");
        double preco = scanner.nextDouble();
        System.out.println("Quantidade: ");
        int quantidade = scanner.nextInt();
        //Chamando o construtor para guardar os dados do produto a ser cadastrado
        Produto produto = new Produto(nome, preco, quantidade);
        boolean produtoArmazenado = false; // produtoArmazenado começa como falso, se ele for == null, é true e é possível cadastrar, se não for == null ele é falso e alerta que não é mais possível cadastrar produtos.
        //Armazenar os produtos . Utilizei produtos pois é a variável do array onde é armazenado
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null){
                produtoArmazenado = true;
                produtos[i] = produto; //O for fará percorrer pelo array até encontrar um cmapo null para armazenar o objeto produto
                System.out.println("Produto cadastrado com sucesso!");
                break;
            }
        }
        if (produtoArmazenado == false){
            System.out.println("Não há espaço para cadastrar mais produtos.");
        }
    }

    //Criação do metodo de listar produtos utilizado pelo case 2
    public void listarProdutos (){
        boolean produtoEncontrado = false;  // Identifica se existe pelo menos um produto cadastrado.
        for (int i = 0; i < produtos.length; i++){
            if (produtos[i] != null){ //if faz verificação para não resultar em produtos null
                produtoEncontrado = true;
                System.out.println("Nome: " + produtos[i].nome);
                System.out.println("Preço: " + produtos[i].preco);
                System.out.println("Quantidade: " + produtos[i].quantidade);
                System.out.println("------------------------");
            } // Não precisamos de um else aqui, pois queremos percorrer  o array inteiro e exibir todos os produtos cadastrados.
        }
        if (produtoEncontrado == false){
            System.out.println("Nenum produto cadastrado.");
        }
    }
}
