# 02 — Requisitos Funcionais

**Projeto:** JavaStore  
**Versão:** 1.0

## 1. Objetivo

Este documento apresenta os requisitos funcionais do JavaStore, descrevendo as funcionalidades disponíveis no sistema e as melhorias planejadas para versões futuras.

## 2. Requisitos Funcionais Implementados

### RF01 — Cadastrar produtos
O sistema deve permitir o cadastro de produtos, solicitando:
- Nome;
- Preço;
- Quantidade em estoque.

O sistema deve gerar automaticamente um ID para cada produto cadastrado.

### RF02 — Listar produtos
O sistema deve permitir visualizar os produtos cadastrados, apresentando:
- ID;
- Nome;
- Preço;
- Quantidade em estoque.

Também deve apresentar o total de produtos cadastrados.

Caso não existam produtos, o sistema deve informar que nenhum produto foi cadastrado.

### RF03 — Cadastrar funcionários
O sistema deve permitir o cadastro de funcionários, solicitando:
- Nome;
- Idade;
- Cargo;
- Salário;
- Departamento.

### RF04 — Realizar vendas
O sistema deve permitir realizar vendas de produtos cadastrados.

Para realizar uma venda, o usuário deve informar o ID do produto e a quantidade desejada.

O sistema deve verificar se o produto existe e se há quantidade suficiente em estoque. Após uma venda válida, a quantidade disponível em estoque deve ser atualizada e a venda registrada no histórico.

Cada venda realizada permite registrar apenas um produto.

### RF05 — Consultar histórico de vendas
O sistema deve permitir consultar as vendas realizadas, apresentando:
- ID do produto;
- Nome do produto;
- Preço unitário;
- Quantidade vendida.

O sistema também deve apresentar o total de vendas registradas.

### RF06 — Calcular faturamento
O sistema deve calcular o faturamento total com base nas vendas registradas.

O cálculo considera o preço unitário multiplicado pela quantidade vendida de cada produto, somando os valores de todas as vendas.

### RF07 — Identificar produto mais vendido
O sistema deve identificar o produto com maior quantidade de unidades vendidas, considerando o histórico de vendas registrado.

Caso não existam vendas, deve informar que não há dados para realizar a identificação.

### RF08 — Consultar estoque
O sistema deve permitir consultar a quantidade disponível de cada produto cadastrado, apresentando:
- ID;
- Nome;
- Quantidade em estoque.

## 3. Melhorias Planejadas

As funcionalidades abaixo foram identificadas como melhorias para versões futuras e ainda não estão implementadas.

### RF09 — Listar funcionários
Permitir consultar os funcionários cadastrados, apresentando seus dados e o total de funcionários.

### RF10 — Pesquisar produtos pelo nome
Permitir pesquisar produtos utilizando o nome completo ou apenas parte do nome, sem diferenciar letras maiúsculas e minúsculas.

O sistema deverá apresentar os produtos encontrados para que o usuário possa identificar o produto desejado.

A pesquisa atual por ID deverá continuar disponível.

## 4. Limitações da Versão Atual

- O sistema funciona exclusivamente pelo terminal, utilizando menus e opções numéricas.
- Os dados são armazenados em arrays durante a execução do programa.
- Os dados cadastrados são perdidos quando o programa é encerrado.
- Não existe integração com banco de dados.
- Cada venda permite registrar apenas um produto.
- Não existe funcionalidade para editar ou excluir produtos e funcionários.
- Não existe funcionalidade para listar funcionários.

## 5. Considerações Finais

Este documento descreve as funcionalidades existentes e as melhorias planejadas para o JavaStore, servindo como referência para a evolução do projeto.