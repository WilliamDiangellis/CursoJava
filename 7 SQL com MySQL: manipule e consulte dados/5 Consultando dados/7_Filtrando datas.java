// Nessa aula vamos analisar o comportamento do MySQL quando queremos filtrar campos que são datas.

// Abrindo um script no Workbench e selecionando a tabela de clientes com SELECT * FROM tbcliente;, temos a coluna 
// "DATA_NASCIMENTO", sendo a que vamos usar para realizar os testes de filtro.

// Podemos especificar uma data, para saber quem nasceu nesse dia usando o comando SELECT e uma condição com o símbolo
// de igual (=):SELECT * FROM tbcliente WHERE DATA_NASCIMENTO = ‘1995-01-13’;.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 3623344710	Marcos Nogueira	Av. Pastor Martin Luther King Junior		Inhauma	Rio de Janeiro	RJ	22002012	1995-01-13	23	M	110000	220000	1
// O resultado dessa consulta é somente os clientes que nasceram no dia 13-01-1995, que no caso é o Marcos Nogueira.

// Com datas também é possível usar o símbolo maior (>) e o menor (<), sendo quem nasceu depois e antes do dia indicado, 
// respectivamente.

// Resultado do SELECT * FROM tbcliente WHERE DATA_NASCIMENTO > ‘1995-01-13’;:

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 19290992743	Fernando Cavalcante	R. Dois de Fevereiro		Água Santa	Rio de Janeiro	RJ	22000000	2000-02-12	18	M	100000	200000	1
// 2600586709	César Teixeira	Rua Conde de Bonfim		Tijuca	Rio de Janeiro	RJ	22020001	2000-03-12	18	M	120000	220000	0
// 50534475787	Abel Silva	Rua Humaitá		Humaitá	Rio de Janeiro	RJ	22000212	1995-09-11	22	M	170000	260000	0
// Resultado do SELECT * FROM tbcliente WHERE DATA_NASCIMENTO <= ‘1995-01-13’;, perceba que nesse comando há o sinal 
// de menor ou igual, isto é, a data indicada está incluída no filtro e será exibida no resultado da consulta.

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 1471156710	Érica Carvalho	R. Iriquitia		Jardins	São Paulo	SP	80012212	1990-09-01	27	F	170000	245000	0
// 3623344710	Marcos Nogueira	Av. Pastor Martin Luther King Junior		Inhauma	Rio de Janeiro	RJ	22002012	1995-01-13	23	M	110000	220000	1
// 492472718	Eduardo Jorge	R. Volta Grande		Tijuca	Rio de Janeiro	RJ	22012002	1994-07-19	23	M	75000	95000	1
// As datas se comportam de forma semelhante aos números na aplicação de filtros, contudo é utilizado o calendário 
// ocidental para ordenar as datas. Pode também manusear partes das datas, como apenas o ano ou o mês, visto que há 
// funções de data que nos auxiliam nisso. Por exemplo: SELECT * FROM tbcliente WHERE YEAR(DATA_NASCIMENTO) = 1995;, 
// sendo YEAR() uma função que filtra o ano de uma data especificada no parêntese, o resultado dessa função é um
// número inteiro e, em razão disso, o ano 1995 não está entre aspas simples ('').

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 3623344710	Marcos Nogueira	Av. Pastor Martin Luther King Junior		Inhauma	Rio de Janeiro	RJ	22002012	1995-01-13	23	M	110000	220000	1
// 50534475787	Abel Silva	Rua Humaitá		Humaitá	Rio de Janeiro	RJ	22000212	1995-09-11	22	M	170000	260000	0
// 5576228758	Petra Oliveira	R. Benício de Abreu		Lapa	São Paulo	SP	88192029	1995-11-14	22	F	70000	160000	1
// Em situações que queremos filtrar apenas o mês, como em alguma campanha de marketing em que será enviado um cartão de celebração para quem faz aniversário em um determinado mês de outubro (10), por exemplo: SELECT * FROM tbcliente WHERE MONTH(DATA_NASCIMENTO) = 10;:

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 8502682733	Valdecir da Silva	R. Srg. Édison de Oliveira		Jardins	São Paulo	SP	82122020	1995-10-07	22	M	110000	190000	0
// 9283760794	Edson Meilelles	R. Pinto de Azevedo		Cidade Nova	Rio de Janeiro	RJ	22002002	1995-10-07	22	M	150000	250000	1
// O resultado dessa consulta são 2 registros com os clientes que fazem aniversário no mês de outubro.

// Código com todos os comandos usados nessa aula:

// SELECT * FROM tbcliente;

// SELECT * FROM tbcliente WHERE DATA_NASCIMENTO = '1995-01-13';

// SELECT * FROM tbcliente WHERE DATA_NASCIMENTO > '1995-01-13';

// SELECT * FROM tbcliente WHERE DATA_NASCIMENTO <= '1995-01-13';

// SELECT * FROM tbcliente WHERE YEAR(DATA_NASCIMENTO) = 1995;

// SELECT * FROM tbcliente WHERE MONTH(DATA_NASCIMENTO) = 10;COPIAR CÓDIGO
// Resumindo, podemos usar a função YEAR e MONTH para inserir anos e meses no filtro e as datas se comportam como
// números para essas condições. O MySQL considera o calendário interno, sabendo, por exemplo, que o 1-01-1995 vem 
// antes de 31-12-1998, isto é, ele já possui esse controle interno das datas.

