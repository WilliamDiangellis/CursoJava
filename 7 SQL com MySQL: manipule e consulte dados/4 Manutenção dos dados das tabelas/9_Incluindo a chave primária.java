// ERRATA

// O instrutor usa USE tbproduto; para especificar o banco de dados. Porém, o correto é USE sucos;.

// Quando tentamos executar o comando UPDATE, o MySQL retornou um erro informando ser preciso incluir na condição de 
// filtro um campo que fosse chave primária. Tivemos que ir em "Preferences > SQL Editor" e desmarcar a opção 
// "Safe Updates".

// Porém, é importante que tenha chave primária na tabela, se não, arriscamos inserir registros iguais na mesma tabela.
// No caso da "tbproduto" é o código interno do produto, visto que esse não se repete. É possível que os produtos 
// possuam as mesmas descrições, mas o código interno não.

// Vamos, então, alterar a tabela e incluir a chave primária associada a tabela de produtos ("tbproduto"). Criando 
// mais uma área de código, insira USE sucos; e, na próxima linha, o comando que indica que podemos alterar uma 
// propriedade de uma tabela existente, o ALTER TABLE tbproduto ADD PRIMARY KEY (PRODUTO);.

// Quando criamos a tabela de produtos já poderíamos ter especificado a chave primária, porém, vamos aprender como 
// incluir em tabelas já existentes no banco de dados.

// Código:

// USE sucos;

// ALTER TABLE tbproduto ADD PRIMARY KEY (PRODUTO);

// Será exibida a mensagem que o comando foi executado com sucesso. Para compreender a consequencia dessa ação, vamos 
// inserir um novo produto. Lembrando que em aulas anteriores, excluímos o produto 1078680, então, vamos copiar o 
// INSERT INTO dele e incluir novamente o produto no nosso script atual e também, o comando UPDATE, visto que a
//  embalagem estava incorreta.

// Comandos para inserir no código para incluir novamente o produto 1078680 com as alterações:

// INSERT INTO tbproduto (
// PRODUTO,  NOME, EMBALAGEM, TAMANHO, SABOR,
// PRECO_LISTA) VALUES
// ('1078680', 'Frescor do Verão - 470 ml - Manga', 'Lata', '470 ml','Manga',5.18);

// UPDATE tbproduto SET EMBALAGEM = 'Garrafa'
// WHERE PRODUTO = '1078680';

// Rodando ambos os comandos e, em seguida, o SELECT FROM tbproduto; note que na tabela em "Result Grid" estará inserido
//  o produto '1078680'.

// Tabela:

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// 1040107	Light - 350 ml - Melancia	Lata	350 ml	Melancia	4.56
// 1037797	Clean - 2 Litros - Laranja	PET	2 Litros	Laranja	16.01
// 1000889	Sabor da Montanha - 700 ml - Uva	Garrafa	700 ml	Uva	6.31
// 1004327	Videira do Campo - 1,5 Litros - Melancia	PET	1,5 Litros	Melancia	19.51
// 544931	Frescor do Verão - 350 ml - Limão	Lata	350 ml	Limão	2.46
// 1078680	Frescor do Verão - 470 ml - Manga	Garrafa	470 ml	Manga	5.18
// Código completo:

// USE sucos;

// ALTER TABLE tbproduto ADD PRIMARY KEY (PRODUTO);

// SELECT * FROM tbproduto;

// INSERT INTO tbproduto (
// PRODUTO,  NOME, EMBALAGEM, TAMANHO, SABOR,
// PRECO_LISTA) VALUES
// ('1078680', 'Frescor do Verão - 470 ml - Manga', 'Lata', '470 ml','Manga',5.18);

// UPDATE tbproduto SET EMBALAGEM = 'Garrafa'
// WHERE PRODUTO = '1078680';

// Agora que temos o produto incluído e o campo produto sendo a chave primária, vamos rodar o INSERT INTO novamente 
// para verificar o que acontece se tentarmos incluir um produto com o mesmo código na tabela. O MySQL retorna a 
// mensagem de erro "Error Code: 1062. Duplicate entry '1078680' for key 'PRIMARY'", isto é, já existe um código 
// com esse número na tabela e não é possível inserir esse registro duplicado.

// A chave primária nos permite um maior controle sobre a tabela, não permitindo que seja incluído dois produtos com
// o mesmo código. Nas boas práticas de MySQL, o ideal é sempre especificar a chave primária de uma tabela, podendo 
// usar o comando CREATE TABLE e, depois, o ALTER TABLE para criar a chave primária.