// Chegou a hora de você seguir todos os passos realizados por mim durante esta aula. Caso já tenha feito, excelente.
// Se ainda não, é importante que você execute o que foi visto nos vídeos para poder continuar com os próximos cursos 
// que tenham este como pré-requisito.

// 1) Acesse o Workbench e crie um novo script SQL.

// 2) Abra o arquivo SQL_10.sql e execute o script. As tabelas serão apagadas, recriadas e novos registros serão 
// incluídos. O conteúdo do script é reproduzido abaixo.

// USE sucos;

// DROP TABLE tbcliente;

// DROP TABLE tbproduto;

// CREATE TABLE tbcliente
// ( CPF VARCHAR (11) ,
// NOME VARCHAR (100) ,
// ENDERECO1 VARCHAR (150) ,
// ENDERECO2 VARCHAR (150) ,
// BAIRRO VARCHAR (50) ,
// CIDADE VARCHAR (50) ,
// ESTADO VARCHAR (2) ,
// CEP VARCHAR (8) ,
// DATA_NASCIMENTO DATE,
// IDADE SMALLINT,
// SEXO VARCHAR (1) ,
// LIMITE_CREDITO FLOAT ,
// VOLUME_COMPRA FLOAT ,
// PRIMEIRA_COMPRA BIT );

// ALTER TABLE tbcliente ADD PRIMARY KEY (CPF);

// CREATE TABLE tbproduto
// (PRODUTO VARCHAR (20) ,
// NOME VARCHAR (150) ,
// EMBALAGEM VARCHAR (50) ,
// TAMANHO VARCHAR (50) ,
// SABOR VARCHAR (50) ,
// PRECO_LISTA FLOAT);

// ALTER TABLE tbproduto ADD PRIMARY KEY (PRODUTO);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('19290992743','Fernando Cavalcante','R. Dois de Fevereiro','','Água Santa','Rio de Janeiro','RJ','22000000','2000-02-12',18,'M',100000,200000,1);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('2600586709','César Teixeira','Rua Conde de Bonfim','','Tijuca','Rio de Janeiro','RJ','22020001','2000-03-12',18,'M',120000,220000,0);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('95939180787','Fábio Carvalho','R. dos Jacarandás da Península','','Barra da Tijuca','Rio de Janeiro','RJ','22002020','1992-01-05',16,'M',90000,180000,1);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('9283760794','Edson Meilelles','R. Pinto de Azevedo','','Cidade Nova','Rio de Janeiro','RJ','22002002','1995-10-07',22,'M',150000,250000,1);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('7771579779','Marcelo Mattos','R. Eduardo Luís Lopes','','Brás','São Paulo','SP','88202912','1992-03-25',25,'M',120000,200000,1);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('5576228758','Petra Oliveira','R. Benício de Abreu','','Lapa','São Paulo','SP','88192029','1995-11-14',22,'F',70000,160000,1);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('8502682733','Valdeci da Silva','R. Srg. Édison de Oliveira','','Jardins','São Paulo','SP','82122020','1995-10-07',22,'M',110000,190000,0);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('1471156710','Érica Carvalho','R. Iriquitia','','Jardins','São Paulo','SP','80012212','1990-09-01',27,'F',170000,245000,0);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('3623344710','Marcos Nougeuira','Av. Pastor Martin Luther King Junior','','Inhauma','Rio de Janeiro','RJ','22002012','1995-01-13',23,'M',110000,220000,1);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('50534475787','Abel Silva ','Rua Humaitá','','Humaitá','Rio de Janeiro','RJ','22000212','1995-09-11',22,'M',170000,260000,0);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('5840119709','Gabriel Araujo','R. Manuel de Oliveira','','Santo Amaro','São Paulo','SP','80010221','1985-03-16',32,'M',140000,210000,1);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('94387575700','Walber Lontra','R. Cel. Almeida','','Piedade','Rio de Janeiro','RJ','22000201','1989-06-20',28,'M',60000,120000,1);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('8719655770','Carlos Eduardo','Av. Gen. Guedes da Fontoura','','Jardins','São Paulo','SP','81192002','1983-12-20',34,'M',200000,240000,0);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('5648641702','Paulo César Mattos','Rua Hélio Beltrão','','Tijuca','Rio de Janeiro','RJ','21002020','1991-08-30',26,'M',120000,220000,0);

// INSERT INTO tbcliente (CPF,NOME,ENDERECO1,ENDERECO2,BAIRRO,CIDADE,ESTADO,CEP,DATA_NASCIMENTO,IDADE,SEXO,LIMITE_CREDITO,VOLUME_COMPRA,PRIMEIRA_COMPRA) VALUES ('492472718','Eduardo Jorge','R. Volta Grande','','Tijuca','Rio de Janeiro','RJ','22012002','1994-07-19',23,'M',75000,95000,1);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1040107','Light - 350 ml - Melância','Lata','350 ml','Melância',4.555);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1037797','Clean - 2 Litros - Laranja','PET','2 Litros','Laranja',16.008);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1000889','Sabor da Montanha - 700 ml - Uva','Garrafa','700 ml','Uva',6.309);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1004327','Videira do Campo - 1,5 Litros - Melância','PET','1,5 Litros','Melância',19.51);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1088126','Linha Citros - 1 Litro - Limão','PET','1 Litro','Limão',7.004);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('544931','Frescor do Verão - 350 ml - Limão','Lata','350 ml','Limão',2.4595);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1078680','Frescor do Verão - 470 ml - Manga','Garrafa','470 ml','Manga',5.1795);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1042712','Linha Citros - 700 ml - Limão','Garrafa','700 ml','Limão',4.904);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('788975','Pedaços de Frutas - 1,5 Litros - Maça','PET','1,5 Litros','Maça',18.011);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1002767','Videira do Campo - 700 ml - Cereja/Maça','Garrafa','700 ml','Cereja/Maça',8.41);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('231776','Festival de Sabores - 700 ml - Açai','Garrafa','700 ml','Açai',13.312);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('479745','Clean - 470 ml - Laranja','Garrafa','470 ml','Laranja',3.768);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1051518','Frescor do Verão - 470 ml - Limão','Garrafa','470 ml','Limão',3.2995);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1101035','Linha Refrescante - 1 Litro - Morango/Limão','PET','1 Litro','Morango/Limão',9.0105);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('229900','Pedaços de Frutas - 350 ml - Maça','Lata','350 ml','Maça',4.211);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1086543','Linha Refrescante - 1 Litro - Manga','PET','1 Litro','Manga',11.0105);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('695594','Festival de Sabores - 1,5 Litros - Açai','PET','1,5 Litros','Açai',28.512);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('838819','Clean - 1,5 Litros - Laranja','PET','1,5 Litros','Laranja',12.008);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('326779','Linha Refrescante - 1,5 Litros - Manga','PET','1,5 Litros','Manga',16.5105);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('520380','Pedaços de Frutas - 1 Litro - Maça','PET','1 Litro','Maça',12.011);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1041119','Linha Citros - 700 ml - Lima/Limão','Garrafa','700 ml','Lima/Limão',4.904);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('243083','Festival de Sabores - 1,5 Litros - Maracujá','PET','1,5 Litros','Maracujá',10.512);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('394479','Sabor da Montanha - 700 ml - Cereja','Garrafa','700 ml','Cereja',8.409);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('746596','Light - 1,5 Litros - Melância','PET','1,5 Litros','Melância',19.505);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('773912','Clean - 1 Litro - Laranja','PET','1 Litro','Laranja',8.008);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('826490','Linha Refrescante - 700 ml - Morango/Limão','Garrafa','700 ml','Morango/Limão',6.3105);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('723457','Festival de Sabores - 700 ml - Maracujá','Garrafa','700 ml','Maracujá',4.912);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('812829','Clean - 350 ml - Laranja','Lata','350 ml','Laranja',2.808);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('290478','Videira do Campo - 350 ml - Melância','Lata','350 ml','Melância',4.56);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('783663','Sabor da Montanha - 700 ml - Morango','Garrafa','700 ml','Morango',7.709);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('235653','Frescor do Verão - 350 ml - Manga','Lata','350 ml','Manga',3.8595);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1002334','Linha Citros - 1 Litro - Lima/Limão','PET','1 Litro','Lima/Limão',7.004);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1013793','Videira do Campo - 2 Litros - Cereja/Maça','PET','2 Litros','Cereja/Maça',24.01);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1096818','Linha Refrescante - 700 ml - Manga','Garrafa','700 ml','Manga',7.7105);

// INSERT INTO tbproduto (PRODUTO, NOME, EMBALAGEM, TAMANHO, SABOR, PRECO_LISTA) VALUES ('1022450','Festival de Sabores - 2 Litros - Açai','PET','2 Litros','Açai',38.012);

// 3) Verifique o conteúdo das tabelas de produtos e clientes digitando:

// SELECT * FROM tbproduto;

// SELECT * FROM tbcliente;

// 4) Crie um novo script. Vamos fazer algumas consultas a base.

// 5) Digite:

// SELECT * FROM tbcliente;

// SELECT CPF, NOME, ENDERECO1, ENDERECO2, BAIRRO, CIDADE, ESTADO, CEP,
// DATA_NASCIMENTO, IDADE, SEXO, LIMITE_CREDITO, VOLUME_COMPRA, PRIMEIRA_COMPRA
// FROM tbcliente;

// Note que os dois comandos retornam a mesma coisa. Podemos usar o * para selecionar todos os campos ou discriminar 
// um por um.

// 6) Podemos selecionar alguns campos apenas:

// SELECT CPF, NOME FROM tbcliente;

// 7) Também é possível limitar a saída de registros:

// SELECT CPF, NOME FROM tbcliente LIMIT 5;

// 8) Ou também criar um Label (Chamamos de Alias) para cada campo:

// SELECT CPF AS CPF_CLIENTE, NOME AS NOME_CLIENTE FROM tbcliente;

// 9) Os registros podem ser filtrados usando o mesmo tipo de cláusula WHERE usada no UPDATE e DELETE.

// SELECT * FROM tbproduto WHERE PRODUTO = '544931';

// 10) Mas não é somente pela chave primária que podemos filtrar as consultas.

// SELECT * FROM tbcliente WHERE CIDADE = 'Rio de Janeiro';

// SELECT * FROM tbproduto WHERE SABOR = 'Cítricos';

// 11) Inclusive este tipo de filtro WHERE pode ser usado no UPDATE e DELETE. Digite o comando abaixo de UPDATE para 
// fazer uma alteração em diversos registros ao mesmo tempo.

// UPDATE tbproduto SET SABOR = 'Cítricos' WHERE SABOR = 'Limão';

// 12) Podemos fazer consultas usando condições baseadas em números (Decimais ou inteiros). Crie um novo script e 
// vamos a alguns exemplos:

// SELECT * FROM tbcliente WHERE IDADE = 22;

// Aqui vemos uma igualdade.

// 13) Mas podemos usar sinal de maior, menor, maior ou igual, menor ou igual. Olhe alguns exemplos:

// SELECT * FROM tbcliente WHERE IDADE > 22;

// SELECT * FROM tbcliente WHERE IDADE < 22;

// SELECT * FROM tbcliente WHERE IDADE <= 22;

// 14) Temos o sinal de diferente que é expresso como <>. Veja abaixo:

// SELECT * FROM tbcliente WHERE IDADE <> 22;

// 15) As condições de maior, menor, maior ou igual, menor ou igual, diferente podem ser aplicado a textos. O critério 
// será a ordem alfabética.

// SELECT * FROM tbcliente WHERE NOME >= 'Fernando Cavalcante';

// SELECT * FROM tbcliente WHERE NOME <> 'Fernando Cavalcante';

// 16) As condições de maior, menor, maior ou igual, menor ou igual, igual e diferente não se aplica muito bem a 
// campos FLOAT.

// SELECT * FROM tbproduto WHERE PRECO_LISTA > 16.008;

// SELECT * FROM tbproduto WHERE PRECO_LISTA < 16.008;

// SELECT * FROM tbproduto WHERE PRECO_LISTA <> 16.008;

// 17) O comando BETWEEN pode ser aplicado.

// SELECT * FROM tbproduto WHERE PRECO_LISTA BETWEEN 16.007 AND 16.009;

// 18) Podemos usar como filtro datas. veja alguns exemplos:

// SELECT * FROM tbcliente WHERE DATA_NASCIMENTO = '1995-01-13';

// SELECT * FROM tbcliente WHERE DATA_NASCIMENTO > '1995-01-13';

// SELECT * FROM tbcliente WHERE DATA_NASCIMENTO <= '1995-01-13';

// 19) Existem algumas funções de data que podem ser usadas como filtros.

// SELECT * FROM tbcliente WHERE YEAR(DATA_NASCIMENTO) = 1995;

// SELECT * FROM tbcliente WHERE MONTH(DATA_NASCIMENTO) = 10;

// 20) Podemos usar filtros compostos usando, entre cada teste, os comandos AND ou OR. Veja abaixo alguns exemplos 
// que podem ser testados no Workbench.

// SELECT * FROM tbproduto WHERE PRECO_LISTA BETWEEN 16.007 AND 16.009;

// SELECT * FROM tbproduto WHERE PRECO_LISTA >= 16.007;

// SELECT * FROM tbproduto WHERE PRECO_LISTA <= 16.009;

// SELECT * FROM tbproduto WHERE PRECO_LISTA >= 16.007 AND PRECO_LISTA <= 16.009;

// SELECT * FROM tbcliente WHERE IDADE >= 18 AND IDADE <= 22;

// SELECT * FROM tbcliente WHERE IDADE >= 18 AND IDADE <= 22 AND SEXO = 'M';

// SELECT * FROM tbcliente WHERE CIDADE = 'Rio de Janeiro' OR BAIRRO = 'Jardins';

// SELECT * FROM tbcliente WHERE (IDADE >= 18 AND IDADE <= 22 AND SEXO = 'M') OR (cidade = 'Rio de Janeiro' OR BAIRRO = 'Jardins');