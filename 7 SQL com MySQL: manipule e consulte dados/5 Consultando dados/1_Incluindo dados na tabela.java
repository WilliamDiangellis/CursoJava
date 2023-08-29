// Nessa aula vamos aprender a realizar consultas nas bases. Já vimos como incluir, alterar e apagar registros e agora,
// como consultá-los. Para isso, iremos inserir um volume maior de dados na tabela e esses dados estão no link 
// associado a esse vídeo.

// Baixe o arquivo SQL_10.sql e no Workbench vá em "File > Open SQL script", escolha o arquivo dessa aula, 
// irá carregar o script completo na área do código.

// Analisando os comandos, o USE sucos; nos conecta a base sucos; DROP TABLE tbcliente;, apaga a tabela de clientes
// e o mesmo caso para a de protudo; CREATE TABLE tbcliente () para criar a tabela de cliente; ALTER TABLE tbcliente
// ADD PRIMARY KEY (CPF);, que adiciona uma chave primária, em seguida, com o CREATE TABLE tbproduto; cria a tabela 
// de produto e adiciona uma chave primária com ALTER TABLE tbproduto ADD PRIMARY KEY (PRODUTO);. Logo após, há
// vários INSERT INTO seguidos para incluir uma quantidade grande de registros na tabela de cliente e de produto.

// Rodando o código e, logo após, clicando com o botão direito do mouse selecionando a opção "Refresh All", as 
// tabelas de cliente e produto estarão em "SUCOS > TABLES". Vamos criar um script novamente para fazermos alguns 
// testes referentes a visualização da tabela de cliente, poderia ser a de produto também. Rodando a tabela de 
// cliente com SELECT * FROM tbcliente;, temos:

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 1471156710	Érica Carvalho	R. Iriquitia		Jardins	São Paulo	SP	80012212	1990-09-01	27	F	170000	245000	0
// 19290992743	Fernando Cavalcante	R. Dois de Fevereiro		Água Santa	Rio de Janeiro	RJ	22000000	2000-02-12	18	M	100000	200000	1
// Podemos usar, ao invés do asterisco (*), o nome dos campos, como em SELECT CPF, ENDERECO1, ENDERECO2, BAIRRO, CIDADE, ESTADO, CEP, DATA_NASCIMENTO, IDADE, SEXO, LIMITE_CREDITO, VOLUME_COMPRA, PRIMEIRA_COMPRA FROM tbcliente;. Rodando ambos dos comandos select, será aberta duas abas com o mesmo resultado em "Result Grid". A primeira é a "tbcliente2" que é o primeiro select e a "tbcliente3" que é esse segundo que inserimos os campos ao invés do asterisco.

// SELECT * FROM tbcliente;

// SELECT CPF, ENDERECO1, ENDERECO2, BAIRRO, CIDADE, ESTADO, CEP, DATA_NASCIMENTO, IDADE, SEXO, LIMITE_CREDITO, VOLUME_COMPRA, PRIMEIRA_COMPRA FROM tbcliente;COPIAR CÓDIGO
// Usamos o asterisco para facilitar e agilizar nosso comando se quisermos buscar todos os campos. Agora, caso a intenção seja filtrar a visualização, como, SELECT CPF, NOME FROM tbcliente;, nesse caso estamos selecionando somente o campo "CPF" e "NOME", temos como resultado no Workbench:

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME
// 1471156710	Érica Carvalho
// 19290992743	Fernando Cavalcante
// 2600586709	César Teixeira
// 3623344710	Marcos Nogueira
// 492472718	Eduardo Jorge
// 50534475787	Abel Silva
// 5576228758	Petra Oliveira
// Nos comandos anteriores os resultados exibem todos os registros da tabela, agora, se quisermos visualizar apenas os
// 5 primeiros registros, precisamos especificar no final do comando SELECT CPF, NOME FROM tbcliente LIMIT 5;. 
// Como consequência, temos:

// CPF	NOME
// 1471156710	Érica Carvalho
// 19290992743	Fernando Cavalcante
// 2600586709	César Teixeira
// 3623344710	Marcos Nogueira
// 492472718	Eduardo Jorge
// Conseguimos também nomear os campos no momento da consulta aplicando o ALIASES , por exemplo, 
// SELECT CPF AS CPF_CLIENTE, NOME AS NOME_CLIENTE FROM tbcliente;, rodando esse comando, temos a tabela com 
// os seguintes nomes na coluna:

// CPF_CLIENTE	NOME_CLIENTE
// 1471156710	Érica Carvalho
// 19290992743	Fernando Cavalcante
// 2600586709	César Teixeira
// 3623344710	Marcos Nogueira
// 492472718	Eduardo Jorge
// 50534475787	Abel Silva
// 5576228758	Petra Oliveira
// Um alias (ALIASES) só existe durante a consulta e serve para substituir nomes de colunas ou tabelas temporariamente.

// Essa consulta pode ser realizada não necessariamente na ordem dos campos que estão na tabela, como, 
// SELECT NOME, CPF, SEXO, IDADE, DATA_NASCIMENTO FROM tbcliente;, note que as colunas estão em disposições 
// diferentes no comando e na tabela no Workbench. Porém, isso não interfere no resultado, visto que o retorno 
// das colunas será na ordem que especifiquei no SELECT.

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// NOME	CPF	SEXO	IDADE	DATA_NASCIMENTO
// Érica Carvalho	1471156710	F	27	1990-09-01
// Fernando Cavalcante	19290992743	M	18	2000-02-12
// Nessa aula tivemos o primeiro contato com o comando de seleção de dados na tabela. Aprendemos a selecionar as
// colunas, informar quais campos queremos visualizar, limitar sua saída e alterar temporariamente o seu nome usando
// o comando alias.

