package br.com.javastore;

import java.util.Scanner;

public class SistemaLoja {
    //Scanner
    Scanner scanner = new Scanner(System.in);

    //Criação do array/vetor de armazenamento dos produtos, utilizado pelo case 2
    //Se chama produto por conta da minha classe Produto. Estou utilizando essa classe como array
    int numero_max = 1000;
    Produto[] produtos = new Produto[numero_max];

    //Array de armazenamento de funcionarios, utilizado pelo case 3
    int max_funcionarios = 100;
    Funcionario[] funcionarios = new Funcionario[max_funcionarios];

    //Array de armazenamento do histórico de vendas
    int max_historico = 1000;
    Venda[] vendas = new Venda[max_historico];

    //Contador do ID de produto utilizando pelo Case 1
    int proximoId = 1;

    //Metodo inicialização menu na Main
    public  void iniciarMenu(){
    //Criação menu
        int opcaoMenu = -1;
        while(opcaoMenu != 0){
            System.out.println("Menu Java Sotre");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Cadastrar funcionário");
            System.out.println("4 - Relaizar venda");
            System.out.println("5 - Relatórios");
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
                    System.out.println("Produtos cadastrados");
                    listarProdutos();
                    break;
                case 3:
                    System.out.println("Cadastro de funcionário");
                    cadastrarFuncionario();
                    break;
                case 4:
                    System.out.println("Realizar venda");
                    realizarVenda();
                    break;
                case 5:
                    System.out.println("Escolha um relatório");
                    subMenu();
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
        scanner.nextLine();
        //Iniciaizando o objeto produto
        Produto produto = new Produto(proximoId, nome, preco, quantidade);
        boolean produtoArmazenado = false; // produtoArmazenado começa como falso, se ele for == null, é true e é possível cadastrar, se não for == null ele é falso e alerta que não é mais possível cadastrar produtos.
        //Armazenar os produtos . Utilizei produtos pois é a variável do array onde é armazenado
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] == null){
                produtoArmazenado = true;
                produtos[i] = produto; //O for fará percorrer pelo array até encontrar um cmapo null para armazenar o objeto produto
                System.out.println("Produto cadastrado com sucesso!");
                proximoId++;
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
        int totalProdutos = 0; //Contador de produtos
        for (int i = 0; i < produtos.length; i++){
            if (produtos[i] != null){ //if faz verificação para não resultar em produtos null
                produtoEncontrado = true;
                produtos[i].exibirProduto();
                System.out.println("------------------------");
                totalProdutos++; //Contador de produtos
            } // Não precisamos de um else aqui, pois queremos percorrer  o array inteiro e exibir todos os produtos cadastrados.
        }
        if (totalProdutos >0){ //Para caso não haja produtos cadastrados, não imprimir esse if, somente o de "Nenhum produto cadastrado"
            System.out.println("Total de produtos cadastrados: " + totalProdutos); //Exibição da quantidade de produtos
        }
        if (produtoEncontrado == false) {
            System.out.println("Nenhum produto cadastrado.");
        }
    }

    //Criação do metedo de cadastrar funcionários utilizado pelo case 3
    public void cadastrarFuncionario(){
        System.out.println("Nome funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Cargo: ");
        scanner.nextLine();
        String cargo = scanner.nextLine();

        System.out.println("Salário: ");
        double salario = scanner.nextDouble();

        System.out.println("Departamento: ");
        scanner.nextLine();
        String departamento = scanner.nextLine();

        //Inicializando o objeto funcionario
        Funcionario funcionario = new Funcionario(nome, idade, cargo, salario, departamento );
        boolean funcionarioCadastrado = false;
        for (int i = 0; i < funcionarios.length;i++){
            if (funcionarios[i] == null){
                funcionarioCadastrado = true;
                funcionarios[i] = funcionario;
                System.out.println("Funcionário cadastrado!");
                break;
            }
        }
        if (funcionarioCadastrado == false){
            System.out.println("Não é possível cadastrar mais funcionários, entre em contato com o suporte.");
        }
    }

    //Criando o metodo de Venda utilizado no case 4
    public void realizarVenda(){
        System.out.println("Selecione o produto para realizar a venda: ");
        int idProd = scanner.nextInt();
        System.out.println("Digite a quantidade: ");
        int qtdProd = scanner.nextInt();
        boolean produtoEncontrado = false;
        Venda venda = null;
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].id == idProd ){
                produtoEncontrado = true;
                produtos[i].exibirProduto();
                if (qtdProd <= produtos[i].quantidade){
                    System.out.println("Venda realiza!");
                    produtos[i].quantidade -=qtdProd;
                    venda = new Venda(idProd, produtos[i].nome, produtos[i].preco, qtdProd);
                } else {
                    System.out.println("Quantidade indisponível!");
                }
                break;
            }

        }
        if (produtoEncontrado == false){
            System.out.println("Produto não encontrado!");
        }
            if (venda != null){
                boolean vendaHistorico = false;
                for (int i = 0; i < vendas.length; i++) {
                    if (vendas[i] == null) {
                        vendaHistorico = true;
                        vendas[i] = venda;
                        break;
                    }
                }
            }

    }

    //Metodo do submenu de relatórios utilizado no case 5
    public void subMenu(){
        System.out.println("1 - Histórico de vendas");
        System.out.println("2 - Calcular faturamento");
        System.out.println("3 - Identificar produto mais vendido");
        System.out.println("4 - Exibir quantidade de produtos em estoque");
        System.out.println("5 - Voltar");
        int opcaoRelatorio = scanner.nextInt();
        scanner.nextLine();
        switch (opcaoRelatorio){
            case 1:
                listarHistoricoVendas();
                break;
            case 2:
                calcularFaturamento();
                break;
            case 3:
                //
                break;
            case 4:
                //
                break;
            case 5:
                //
                break;
            default:
                System.out.println("Opção inválida. Digite uma opção válida do menu!");
        }
    }

    //Metodo utilizado para o sub case 1 do case 5
    public void listarHistoricoVendas(){
        boolean listarHisVendas = false;
        int totalVendas = 0;
        for (int i = 0; i < vendas.length ; i++) {
            if (vendas[i] != null){
                listarHisVendas = true;
                vendas[i].exibirVenda();
                totalVendas++;
            }
        }
        if (totalVendas > 0){
            System.out.println("Total de vendas: " + totalVendas);
        }
        if (listarHisVendas == false){
            System.out.println("Não existem vendas registradas.");
        }
    }

    //Metodo do subcase 2 do case 5
    public void calcularFaturamento(){
        double faturamento = 0;
        for (int i = 0; i < vendas.length;i++){
            if (vendas[i] != null){
                faturamento += vendas[i].qtdProd * vendas[i].precoProd;
            }
        }
        System.out.println("Faturamento total: " + faturamento);
    }

    //Metodo do subcase 3 do case 5
    public void prodMaisVendido(){
        boolean comparacao = false;
        int maiorQtdVendida = 0;
        String prodMaisVendido = "";
        for (int i = 0; i < produtos.length ; i++) {
            if (produtos[i] != null){
                int qtdVendidaProd = 0;
                for (int j = 0; j < vendas.length; j++) {
                    if (vendas[j] != null){
                        comparacao = vendas[j].idProd == produtos[i].id;
                        if (comparacao){
                            qtdVendidaProd += vendas[j].qtdProd;

                        }
                    }
                }
                if (qtdVendidaProd > maiorQtdVendida){
                    maiorQtdVendida = qtdVendidaProd;
                    prodMaisVendido = produtos[i].nome;
                }
            }
        }
        if (maiorQtdVendida > 0){
            System.out.println("Produto mais vendido: " + prodMaisVendido + " | Quantidade: " + maiorQtdVendida);
        } else {
            System.out.println("Ainda não existem vendas registradas.");
        }
    }


}
