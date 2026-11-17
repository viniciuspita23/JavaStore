# 04 — Casos de Uso

**Projeto:** JavaStore  
**Versão:** 1.0

## 1. Objetivo

Este documento apresenta os casos de uso do JavaStore, descrevendo como os usuários interagem com o sistema para executar suas principais operações.

Os fluxos apresentados representam as funcionalidades implementadas na versão atual do projeto.

## 2. Atores

**Funcionário ou responsável pela loja:** usuário que interage com o sistema para cadastrar produtos e funcionários, realizar vendas e consultar relatórios.

## 3. Casos de Uso

### UC01 — Cadastrar produto

**Ator:** Funcionário ou responsável pela loja.

**Objetivo:** Registrar um novo produto no sistema.

**Fluxo principal:**
1. O usuário seleciona a opção de cadastrar produto.
2. O sistema solicita o nome do produto.
3. O usuário informa o nome.
4. O sistema solicita o preço.
5. O usuário informa o preço.
6. O sistema solicita a quantidade inicial.
7. O usuário informa a quantidade.
8. O sistema gera automaticamente um ID para o produto.
9. O produto é armazenado no sistema.
10. O sistema confirma o cadastro.

**Fluxo alternativo:**
- Caso o limite de 1.000 produtos seja atingido, o sistema informa que não há espaço disponível para novos cadastros.

### UC02 — Listar produtos

**Ator:** Funcionário ou responsável pela loja.

**Objetivo:** Consultar os produtos cadastrados.

**Fluxo principal:**
1. O usuário seleciona a opção de listar produtos.
2. O sistema percorre os produtos cadastrados.
3. O sistema apresenta o ID, nome, preço e quantidade de cada produto.
4. O sistema apresenta o total de produtos cadastrados.

**Fluxo alternativo:**
- Caso não existam produtos cadastrados, o sistema informa que nenhum produto foi cadastrado.

### UC03 — Cadastrar funcionário

**Ator:** Funcionário ou responsável pela loja.

**Objetivo:** Registrar um novo funcionário no sistema.

**Fluxo principal:**
1. O usuário seleciona a opção de cadastrar funcionário.
2. O sistema solicita o nome.
3. O usuário informa o nome.
4. O sistema solicita a idade.
5. O usuário informa a idade.
6. O sistema solicita o cargo.
7. O usuário informa o cargo.
8. O sistema solicita o salário.
9. O usuário informa o salário.
10. O sistema solicita o departamento.
11. O usuário informa o departamento.
12. O funcionário é armazenado no sistema.
13. O sistema confirma o cadastro.

**Fluxo alternativo:**
- Caso o limite de 100 funcionários seja atingido, o sistema informa que não é possível cadastrar mais funcionários.

### UC04 — Realizar venda

**Ator:** Funcionário ou responsável pela loja.

**Objetivo:** Registrar a venda de um produto e atualizar o estoque.

**Fluxo principal:**
1. O usuário seleciona a opção de realizar venda.
2. O sistema solicita o ID do produto.
3. O usuário informa o ID.
4. O sistema localiza e apresenta os dados do produto.
5. O sistema solicita a quantidade desejada.
6. O usuário informa a quantidade.
7. O sistema verifica se a quantidade é maior que zero e não ultrapassa o estoque disponível.
8. O sistema registra a venda.
9. O sistema atualiza a quantidade disponível em estoque.
10. O sistema informa que a venda foi realizada.

**Fluxos alternativos:**
- Caso o produto não seja encontrado, o sistema informa que o produto não existe.
- Caso a quantidade informada seja igual ou inferior a zero, ou ultrapasse o estoque disponível, o sistema informa que a quantidade está indisponível.
- Caso não exista espaço disponível no histórico de vendas, atualmente o sistema não possui tratamento adequado para essa situação. Essa correção está planejada.

### UC05 — Consultar histórico de vendas

**Ator:** Funcionário ou responsável pela loja.

**Objetivo:** Consultar as vendas realizadas.

**Fluxo principal:**
1. O usuário acessa o menu de relatórios.
2. Seleciona a opção de histórico de vendas.
3. O sistema percorre os registros de vendas.
4. O sistema apresenta o ID do produto, nome, preço unitário e quantidade vendida.
5. O sistema apresenta o total de vendas registradas.

**Fluxo alternativo:**
- Caso não existam vendas registradas, o sistema informa que não existem vendas.

### UC06 — Calcular faturamento

**Ator:** Funcionário ou responsável pela loja.

**Objetivo:** Consultar o faturamento total das vendas realizadas.

**Fluxo principal:**
1. O usuário acessa o menu de relatórios.
2. Seleciona a opção de calcular faturamento.
3. O sistema percorre os registros de vendas.
4. O sistema multiplica o preço unitário pela quantidade vendida em cada registro.
5. O sistema soma os valores calculados.
6. O sistema apresenta o faturamento total.

**Fluxo alternativo:**
- Caso não existam vendas, o sistema apresenta o faturamento igual a zero.

### UC07 — Identificar produto mais vendido

**Ator:** Funcionário ou responsável pela loja.

**Objetivo:** Identificar o produto com maior quantidade de unidades vendidas.

**Fluxo principal:**
1. O usuário acessa o menu de relatórios.
2. Seleciona a opção de identificar produto mais vendido.
3. O sistema percorre os produtos cadastrados.
4. O sistema consulta o histórico de vendas para somar as quantidades vendidas de cada produto.
5. O sistema identifica o produto com maior quantidade vendida.
6. O sistema apresenta o nome do produto e a quantidade comercializada.

**Fluxo alternativo:**
- Caso não existam vendas registradas, o sistema informa que ainda não existem vendas.

### UC08 — Consultar estoque

**Ator:** Funcionário ou responsável pela loja.

**Objetivo:** Consultar a quantidade disponível dos produtos cadastrados.

**Fluxo principal:**
1. O usuário acessa o menu de relatórios.
2. Seleciona a opção de exibir estoque.
3. O sistema percorre os produtos cadastrados.
4. O sistema apresenta o ID, nome e quantidade disponível de cada produto.

**Fluxo alternativo:**
- Caso não existam produtos cadastrados, atualmente o sistema não apresenta uma mensagem informativa. Essa melhoria está planejada.

## 4. Considerações Finais

Este documento descreve os principais fluxos de utilização do JavaStore na versão atual.

Os casos de uso servem como referência para compreender o funcionamento do sistema e apoiar futuras melhorias.