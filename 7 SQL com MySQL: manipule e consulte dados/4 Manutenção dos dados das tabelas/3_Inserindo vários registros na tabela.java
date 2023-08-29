// Continuando com as inclusões das informações na tabela, é possível inserir mais dados em um mesmo script. 
// Olhando agora para a segunda linha da planilha do Excel, vamos inserir esses elementos.

// INSERT INTO tbproduto (
// PRODUTO, 
// NOME, 
// EMBALAGEM, 
// TAMANHO, 
// SABOR, 
// PRECO_LISTA) VALUES (
// '1037797', 'Clean - 2 Litros - Laranja', 'PET', '2 Litros', 'Laranja', 16.01);

// Repita o código para os outros registros da tabela produto.

// INSERT INTO tbproduto (
// PRODUTO, 
// NOME, 
// EMBALAGEM, 
// TAMANHO, 
// SABOR, 
// PRECO_LISTA) VALUES (
// '1000889', 'Sabor da Montanha - 700 ml - Uva', 'Garrafa', '700 ml', 'Uva', 6.31);

// INSERT INTO tbproduto (
// PRODUTO, 
// NOME, 
// EMBALAGEM, 
// TAMANHO, 
// SABOR, 
// PRECO_LISTA) VALUES (
// '1004327', 'Videira do Campo - 1,5 Litros - Melancia', 'PET', '1,5 Litros', 'Melancia', 19.51);

// SELECT * FROM tbproduto;

// Vamos inserir apenas esses registros no momento, temos três comandos INSERT INTO e um SELECT, este para 
// visualizar os elementos incluídos na tabela. Rodando o script, uma mensagem comunicando que os comandos 
// foram executados com sucesso será exibida em "Action Output" e a tabela com as informações será mostrada 
// em "Result grid".

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// 1040107	Light - 350 ml - Melancia	Lata	350 ml	Melancia	4.56
// 1037797	Clean - 2 Litros - Laranja	PET	2 Litros	Laranja	16.01
// 1000889	Sabor da Montanha - 700 ml - Uva	Garrafa	700 ml	Uva	6.31
// 1004327	Videira do Campo - 1,5 Litros - Melancia	PET	1,5 Litros	Melancia	19.51
// Essa é a tabela de produtos com os elementos incluídos nos comandos INSERT INTO. Nessa aula, então, aprendemos 
// como inserir mais de um registro no mesmo script.