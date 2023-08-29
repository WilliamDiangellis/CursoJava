// Vamos incluir novos campos na tabela de vendedores. Eles serão a data de admissão

// (Nome do campo DATA_ADMISSÃO)

// e se o vendedor está ou não de férias

// (Nome do campo DE_FERIAS). 

// Não esqueça de recriar a chave primária e depois inclua as informações abaixo:

// Matrícula - 00235
// Nome: Márcio Almeida Silva
// Comissão: 8%
// Data de admissão: 15/08/2014
// Está de férias? Não

// Matrícula - 00236
// Nome: Cláudia Morais 
// Comissão: 8%
// Data de admissão: 17/09/2013
// Está de férias? Sim

// Matrícula - 00237
// Nome: Roberta Martins
// Comissão: 11%
// Data de admissão: 18/03/2017
// Está de férias? Sim

// Matrícula - 00238
// Nome: Péricles Alves
// Comissão: 11%
// Data de admissão: 21/08/2016
// Está de férias? Não

// Dicas:

// Apague a tabela
// Crie-a novamente com os novos campos
// Crie a chave primária
// Inclua os comandos de INSERT
// VER OPINIÃO DO INSTRUTOR
// Opinião do instrutor

// DROP TABLE TABELA_DE_VENDEDORES;

// CREATE TABLE TABELA_DE_VENDEDORES
// ( MATRICULA varchar(5),
// NOME varchar(100),
// PERCENTUAL_COMISSAO float,
// DATA_ADMISSAO date,
// DE_FERIAS bit);

// ALTER TABLE TABELA_DE_VENDEDORES ADD PRIMARY KEY (MATRICULA);

// INSERT INTO TABELA_DE_VENDEDORES
// (MATRICULA, NOME, DATA_ADMISSAO, PERCENTUAL_COMISSAO, DE_FERIAS)
// VALUES
// ('00235','Márcio Almeida Silva','2014-08-15',0.08,0);

// INSERT INTO TABELA_DE_VENDEDORES
// (MATRICULA, NOME, DATA_ADMISSAO, PERCENTUAL_COMISSAO, DE_FERIAS)
// VALUES
// ('00236','Cláudia Morais','2013-09-17',0.08,1);

// INSERT INTO TABELA_DE_VENDEDORES
// (MATRICULA, NOME, DATA_ADMISSAO, PERCENTUAL_COMISSAO, DE_FERIAS)
// VALUES
// ('00237','Roberta Martins','2017-03-18',0.11,1);

// INSERT INTO TABELA_DE_VENDEDORES
// (MATRICULA, NOME, DATA_ADMISSAO, PERCENTUAL_COMISSAO, DE_FERIAS)
// VALUES
// ('00238','Pericles Alves','2016-08-21',0.11,0);