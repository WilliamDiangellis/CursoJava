//  Já sabemos incluir e alterar registros na tabela, agora vamos aprender como apagar. Para analisar os elementos 
//  da tabela, vamos selecionar somente o comando SELECT * FROM tbproduto;, será exibida a seguinte tabela:

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// 1040107	Light - 350 ml - Melancia	Lata	350 ml	Melancia	4.56
// 1037797	Clean - 2 Litros - Laranja	PET	2 Litros	Laranja	16.01
// 1000889	Sabor da Montanha - 700 ml - Uva	Garrafa	700 ml	Uva	6.31
// 1004327	Videira do Campo - 1,5 Litros - Melancia	PET	1,5 Litros	Melancia	19.51
// 544931	Frescor do Verão - 350 ml - Limão	Lata	350 ml	Limão	2.46
// 1078680	Frescor do Verão - 470 ml - Manga	Garrafa	470 ml	Manga	5.18
// Vamos escolher o produto 1078680 para excluir. Abrindo um novo arquivo de edição para escrever o comando, insira 
// USE sucos; e na próxima linha DELETE FROM tbproduto, mas, note que não há uma condição do que apagar, se rodarmos 
// assim o comando vai excluir todos os registros da tabela. Por isso, é necessário incluir uma condição, igual fizemos 
// no UPDATE utilizando a cláusula WHERE.

// Cuidado para não confundir DROP e DELETE. O DROP é utilizado para apagar objetos do MySQL, como, banco de dados, 
// tabelas, índices e chave primária. Já o DELETE é para excluir registros armazenados em uma tabela do banco de dados.

// DELETE FROM tbproduto WHERE PRODUTO = '1078680';COPIAR CÓDIGO
// Rodando esse comando, será exibida uma mensagem avisando que foi efetuado com sucesso em "Action Out". Para 
// visualizarmos a exclusão do registro, vamos utilizar o SELECT * FROM tbprodutos;, selecionando somente esse comando
//  e rodando.

// Resultado da tabela após o comando DELETE:

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// 1040107	Light - 350 ml - Melancia	Lata	350 ml	Melancia	4.56
// 1037797	Clean - 2 Litros - Laranja	PET	2 Litros	Laranja	16.01
// 1000889	Sabor da Montanha - 700 ml - Uva	Garrafa	700 ml	Uva	6.31
// 1004327	Videira do Campo - 1,5 Litros - Melancia	PET	1,5 Litros	Melancia	19.51
// 544931	Frescor do Verão - 350 ml - Limão	Lata	350 ml	Limão	2.46
// Código completo:

// USE sucos;

// DELETE FROM tbproduto WHERE PRODUTO = '1078680';

// SELECT * FROM tbproduto;COPIAR CÓDIGO
// O comando DELETE é considerado perigoso sem uma cláusula WHERE, visto que sem essa condição apaga todos os registros
//  da tabela. Por esse motivo, é importante sempre inserir uma condição para apagar os elementos desejados da tabela.

// No que se refere a garantia de apagar algum elemento que não quisesse fazer existem mecanismos dentro do banco de
//  dados. Mas veremos esse tipo de situação em outros treinamentos.

// Vamos analisar o que ocorre se rodarmos novamente o comando DELETE com o código 1078680, selecionando somente esse 
// comando. Em "Action Output" note que não será retornado um erro, mas a mensagem exibida informa que zero linhas 
// foram afetadas, isso significa que o programa procurou o registro para realizar a exclusão, mas não o encontrou.