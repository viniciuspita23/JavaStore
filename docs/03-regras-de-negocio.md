# 03 — Regras de Negócio

**Projeto:** JavaStore  
**Versão:** 1.0

## 1. Objetivo

Este documento apresenta as regras de negócio do JavaStore, estabelecendo as condições e validações que orientam o funcionamento do sistema.

As regras estão divididas entre funcionalidades já implementadas e melhorias planejadas para versões futuras.

## 2. Regras Implementadas

### RN01 — Identificação única de produtos

Cada produto cadastrado deve possuir um identificador único, gerado automaticamente pelo sistema de forma sequencial.

### RN02 — Limite de cadastro de produtos

O sistema permite cadastrar até 1.000 produtos. Ao atingir esse limite, deverá informar que não há espaço disponível para novos cadastros.

### RN03 — Limite de cadastro de funcionários

O sistema permite cadastrar até 100 funcionários. Ao atingir esse limite, deverá informar que não é possível realizar novos cadastros.

### RN04 — Validação da existência do produto

Antes de realizar uma venda, o sistema deve verificar se o produto informado existe no cadastro. Caso não seja encontrado, deverá informar o usuário e impedir a venda.

### RN05 — Validação da quantidade vendida

A quantidade solicitada em uma venda deve ser maior que zero e não pode ultrapassar a quantidade disponível em estoque.

### RN06 — Atualização do estoque

Após uma venda válida, o sistema deve descontar automaticamente do estoque a quantidade de produtos vendida.

### RN07 — Bloqueio de venda sem estoque

O sistema não deve permitir a venda de quantidades superiores ao estoque disponível, incluindo situações em que o estoque esteja zerado.

### RN08 — Histórico de vendas sem registros

Quando não existirem vendas registradas, o sistema deverá informar ao usuário que não há vendas registradas.

## 3. Regras Planejadas

As regras abaixo representam melhorias aprovadas para versões futuras e ainda não estão implementadas.

### RN09 — Validação do preço do produto

O sistema deverá impedir o cadastro e a realização de vendas de produtos cujo preço seja igual ou inferior a zero.

### RN10 — Unicidade do nome do produto

O sistema deverá impedir o cadastro de produtos com nomes duplicados.

Produtos com nomes diferentes poderão ser cadastrados, mesmo que representem produtos semelhantes. A identificação de possíveis duplicidades ficará sob responsabilidade do usuário.

### RN11 — Validação da quantidade inicial

O sistema deverá impedir o cadastro de produtos com quantidade inicial igual ou inferior a zero.

### RN12 — Validação do nome do produto

O sistema deverá impedir o cadastro de produtos com nome vazio ou contendo apenas espaços em branco.

### RN13 — Unicidade do nome do funcionário

O sistema deverá impedir o cadastro de funcionários com nomes exatamente duplicados.

Nomes diferentes poderão ser cadastrados, mesmo que sejam semelhantes.

### RN14 — Validação da idade do funcionário

O sistema deverá impedir o cadastro de funcionários com idade igual ou inferior a zero.

### RN15 — Validação do salário do funcionário

O sistema deverá impedir o cadastro de funcionários com salário igual ou inferior a zero.

### RN16 — Validação de cargo e departamento

O sistema deverá impedir o cadastro de funcionários caso os campos cargo ou departamento estejam vazios ou contenham apenas espaços em branco.

### RN17 — Validação do nome do funcionário

O sistema deverá impedir o cadastro de funcionários com nome vazio ou contendo apenas espaços em branco.

### RN18 — Disponibilidade de espaço no histórico de vendas

Antes de concluir uma venda, o sistema deverá verificar se existe espaço disponível no array de vendas.

Caso o limite de 1.000 registros seja atingido, deverá informar o usuário e impedir a operação, sem descontar produtos do estoque.

### RN19 — Tratamento de estoque vazio

Quando não houver produtos cadastrados, o sistema deverá informar ao usuário que o estoque está vazio.

### RN20 — Tratamento de faturamento sem vendas

Quando não houver vendas registradas, o sistema deverá informar que não existem vendas para calcular o faturamento.

Também deverá apresentar os valores monetários em formato adequado.

### RN21 — Registro de data e horário da venda

O sistema deverá registrar automaticamente a data e o horário em que cada venda for realizada.

### RN22 — Identificação do funcionário responsável pela venda

O sistema deverá registrar o funcionário responsável por cada venda, vinculando a operação a um funcionário cadastrado.

O funcionário deverá ser identificado pelo seu ID, e o sistema deverá verificar se ele está cadastrado antes de permitir a venda.

### RN23 — Venda com múltiplos produtos

O sistema deverá permitir que uma única venda contenha vários produtos diferentes, funcionando como um carrinho de compras.

Deverá registrar a quantidade de cada produto, calcular o valor total da venda e atualizar os respectivos estoques após a conclusão da operação.

### RN24 — Cancelamento de vendas

O sistema deverá permitir o cancelamento de vendas já realizadas, mantendo o registro no histórico com o status de cancelada.

Ao cancelar uma venda, deverá:

- Alterar o status da venda para cancelada.
- Devolver ao estoque as quantidades dos produtos daquela venda.
- Desconsiderar a venda cancelada no cálculo do faturamento.
- Disponibilizar um relatório específico de vendas canceladas.

## 4. Considerações Finais

Este documento reúne as regras de negócio identificadas durante a análise do JavaStore.

As regras implementadas representam o comportamento atual do sistema. As regras planejadas deverão servir como referência para futuras melhorias, respeitando a evolução gradual do projeto.