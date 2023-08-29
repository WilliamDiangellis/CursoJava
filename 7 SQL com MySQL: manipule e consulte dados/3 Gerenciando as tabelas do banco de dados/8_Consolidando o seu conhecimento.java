// Chegou a hora de você seguir todos os passos realizados por mim durante esta aula. Caso já tenha feito, excelente. 
// Se ainda não, é importante que você execute o que foi visto nos vídeos para poder continuar com a próxima aula.

// 1) Acesse MySQL Workbench.

// 2) Crie a tabela de cliente digitando o comando abaixo:

// CREATE TABLE tbcliente
// ( CPF VARCHAR (11) ,
// NOME VARCHAR (100) ,
// ENDERECO1 VARCHAR (150) ,
// ENDERECO2 VARCHAR (150) ,
// BAIRRO VARCHAR (50) ,
// CIDADE VARCHAR (50) ,
// ESTADO VARCHAR (2) ,
// CEP VARCHAR (8) ,
// IDADE SMALLINT,
// SEXO VARCHAR (1) ,
// LIMITE_CREDITO FLOAT ,
// VOLUME_COMPRA FLOAT ,
// PRIMEIRA_COMPRA BIT )COPIAR CÓDIGO
// 3) Execute o comando e depois atualize a árvore do Workbench para observar a nova tabela criada.

// 4) Podemos criar tabela pelo assistente. Botão da direita do mouse sobre Tables, abaixo do banco de dados Sucos,
// e escolha Create Table.

// 1.png

// 5) Digite o nome da tabela como tbProduto.

// 6) Inclua os campos conforme mostrado abaixo:

// PRODUTO VARCHAR(20)
// NOME VARCHAR(150)
// EMBALAGEM VARCHAR(50)
// TAMANHO VARCHAR(50)
// SABOR VARCHAR(50)
// PRECO_LISTA FLOATCOPIAR CÓDIGO
// 7) Clique no botão Apply.

// 8) Verifique o comando a ser executado. Clique em Apply novamente e a tabela é criada.

// 9) A tabela pode ser apagada. Para isso digite o comando para criar novas tabelas:

// CREATE TABLE tbcliente2
// ( CPF VARCHAR (11) ,
// NOME VARCHAR (100) ,
// ENDERECO1 VARCHAR (150) ,
// ENDERECO2 VARCHAR (150) ,
// BAIRRO VARCHAR (50) ,
// CIDADE VARCHAR (50) ,
// ESTADO VARCHAR (2) ,
// CEP VARCHAR (8) ,
// IDADE SMALLINT,
// SEXO VARCHAR (1) ,
// LIMITE_CREDITO FLOAT ,
// VOLUME_COMPRA FLOAT ,
// PRIMEIRA_COMPRA BIT );COPIAR CÓDIGO
// CREATE TABLE tbcliente3
// ( CPF VARCHAR (11) ,
// NOME VARCHAR (100) ,
// ENDERECO1 VARCHAR (150) ,
// ENDERECO2 VARCHAR (150) ,
// BAIRRO VARCHAR (50) ,
// CIDADE VARCHAR (50) ,
// ESTADO VARCHAR (2) ,
// CEP VARCHAR (8) ,
// IDADE SMALLINT,
// SEXO VARCHAR (1) ,
// LIMITE_CREDITO FLOAT ,
// VOLUME_COMPRA FLOAT ,
// PRIMEIRA_COMPRA BIT );COPIAR CÓDIGO
// 10) Foram criadas duas tabelas. Agora vamos apaga-las. A primeira por comando:

// DROP TABLE TB_CLIENTES3;COPIAR CÓDIGO
// 11) Pelo assistente basta com o botão da direita do mouse sobre o nome da tabela TB_CLIENTES2:

// 2.png