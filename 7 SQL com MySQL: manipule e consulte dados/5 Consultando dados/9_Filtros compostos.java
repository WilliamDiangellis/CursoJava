// Até o momento vimos sobre filtros simples, quando queremos analisar os registros iguais, maior ou menor a algum dado
// indicado. Nessa aula vamos aprender a realizar filtros compostos, quando queremos juntar duas condições em uma só.

// Criando um script e selecionando a tabela de produtos com o comando SELECT * FROM tbproduto;, observe a coluna 
// "PRECO_LISTA", que aplicamos a condição BETWEEN em aulas passadas.

// Quando usamos o comando BETWEEN (entre) já estávamos aprendendo mais ou menos sobre como funciona o filtro composto,
// visto que quando inserimos essa cláusula estamos impondo a seguinte condição: me retorne todos os registros que 
// são maiores ou iguais ao valor indicado primeiro e menores ou iguais a outro valor especificado.

// No caso anterior, usamos SELECT * FROM tbproduto WHERE PRECO_LISTA BETWEEN 16.007 AND 16.009;, esse comando 
// significa que será executado primeiro a condição SELECT * FROM tbproduto WHERE PRECO_LISTA >= 16.007; e sobre o
// resultado desse comando, aplicar a segunda condição SELECT * FROM tbproduto WHERE PRECO_LISTA <= 16.009;. Esta 
// última, quando a executamos é aplicada sobre tudo, de forma separada.

// Código:

// SELECT * FROM tbproduto;

// SELECT * FROM tbproduto WHERE PRECO_LISTA BETWEEN 16.007 AND 16.009;
// SELECT * FROM tbproduto WHERE PRECO_LISTA >= 16.007;
// SELECT * FROM tbproduto WHERE PRECO_LISTA <= 16.009;

// Para juntar as condições vamos usar o filtro AND ("E"): 
// SELECT * FROM tbproduto WHERE PRECO_LISTA >= 16.007 AND PRECO_LISTA <= 16.009;, com esse comando ambas condições 
// serão realizadas simultaneamente, no mesmo WHERE. Rodando essa linha de código teremos o mesmo resultado de quando
// aplicamos o BETWEEN:

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// 1037797	Clean - 2 Litros - Laranja	PET	2 Litros	Laranja	16.008
// Podemos usar essa condição em diversas situações, como, por exemplo, se quisermos buscar somente clientes que 
// tenham entre 18 e 22 anos. Vamos selecionar a tabela de cliente e inserir a condição: 
// SELECT * FROM tbcliente WHERE IDADE >= 18 AND IDADE <= 22;:

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 19290992743	Fernando Cavalcante	R. Dois de Fevereiro		Água Santa	Rio de Janeiro	RJ	22000000	2000-02-12	18	M	100000	200000	1
// 2600586709	César Teixeira	Rua Conde de Bonfim		Tijuca	Rio de JaneirO	RJ	22020001	2000-03-12	18	M	120000	220000	0
// 50534475787	Abel Silva	Rua Humaitá		Humaitá	Rio de Janeiro	RJ	22000212	1995-09-11	22	M	170000	260000	0
// 5576228758	Petra Oliveira	R. Benício de Abreu		Lapa	São Paulo	SP	88192029	1995-11-14	22	F	70000	160000	1
// 8502682733	Valdecir da Silva	R. Srg. Édison de Oliveira		Jardins	São Paulo	SP	82122020	1995-10-07	22	M	110000	190000	0
// 9283760794	Edson Meilelles	R. Pinto de Azevedo		Cidade Nova	Rio de Janeiro	RJ	22002002	1995-10-07	22	M	150000	250000	1
// O resultado dessa consulta são 6 registros com cliente entre 18 e 22 anos.

// É possível também incluir mais condições no comando, vamos selecionar quem tem entre 18 e 22 anos e são do sexo
// masculino: SELECT * FROM tbcliente WHERE IDADE >= 18 AND IDADE <= 22 AND SEXO = 'M';, perceba que no AND é viável
// aplicarmos condições sobre campos diferentes conjuntamente.

// Outra condição é o OR ("OU"), que pode ser usado em situações em que quero buscar clientes que moram no Rio de 
// Janeiro ou no bairro Jardins em São Paulo simultaneamente, por exemplo: 
// SELECT * FROM tbcliente WHERE cidade = 'Rio de Janeiro' OR BAIRRO = 'Jardins';.

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 1471156710	Érica Carvalho	R. Iriquitia		Jardins	São Paulo	SP	80012212	1990-09-01	27	F	170000	245000	0
// 19290992743	Fernando Cavalcante	R. Dois de Fevereiro		Água Santa	Rio de Janeiro	RJ	22000000	2000-02-12	18	M	100000	200000	1
// 2600586709	César Teixeira	Rua Conde de Bonfim		Tijuca	Rio de JaneirO	RJ	22020001	2000-03-12	18	M	120000	220000	0
// 3623344710	Marcos Nogueira	Av. Pastor Martin Luther King Junior		Inhauma	Rio de Janeiro	RJ	22002012	1995-01-13	23	M	110000	220000	1
// 492472718	Eduardo Jorge	R. Volta Grande		Tijuca	Rio de Janeiro	RJ	22012002	1994-07-19	23	M	75000	95000	1
// 50534475787	Abel Silva	Rua Humaitá		Humaitá	Rio de Janeiro	RJ	22000212	1995-09-11	22	M	170000	260000	0
// Conseguimos também juntar às duas condições em um só comando, vamos supor que queremos buscar os clientes entre 
// 18 e 22 anos que são do sexo masculino ou da cidade do Rio de Janeiro, ou do bairro Jardins em São Paulo.

// Uma boa prática ao escrever o código é usar os parênteses para isolar as condições.

// SELECT * FROM tbcliente WHERE (IDADE >= 18 AND IDADE <= 22 AND SEXO = 'M')
//  OR (cidade = 'Rio de Janeiro' OR BAIRRO = 'Jardins');
 
// Quando juntamos várias condições em um único comando, chamamos lógica, não vamos entrar muito a fundo nesse 
// treinamento sobre isso. Mas caso já trabalhe com TI ou com programação, já possui um contato com lógica de programação.

// Então, o programa vai realizar a seleção do comando WHERE concatenando (encadeando em uma sequência lógica) várias 
// condições usando AND e OR.

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 1471156710	Érica Carvalho	R. Iriquitia		Jardins	São Paulo	SP	80012212	1990-09-01	27	F	170000	245000	0
// 19290992743	Fernando Cavalcante	R. Dois de Fevereiro		Água Santa	Rio de Janeiro	RJ	22000000	2000-02-12	18	M	100000	200000	1
// 2600586709	César Teixeira	Rua Conde de Bonfim		Tijuca	Rio de JaneirO	RJ	22020001	2000-03-12	18	M	120000	220000	0
// 3623344710	Marcos Nogueira	Av. Pastor Martin Luther King Junior		Inhauma	Rio de Janeiro	RJ	22002012	1995-01-13	23	M	110000	220000	1
// 492472718	Eduardo Jorge	R. Volta Grande		Tijuca	Rio de Janeiro	RJ	22012002	1994-07-19	23	M	75000	95000	1
// 50534475787	Abel Silva	Rua Humaitá		Humaitá	Rio de Janeiro	RJ	22000212	1995-09-11	22	M	170000	260000	0
// 95939180787	Fábio Carvalho	R. dos Jacarandás da Península		Barra da Tijuca	Rio de Janeiro	RJ	22002020	1992-01-05	16	M	90000	180000	1
// Note que o resultado dessa consulta serão clientes entre 18 e 22 anos, do sexo masculino (primeira condição) e os que têm menos ou mais satisfazem a segunda condição, são do Rio de Janeiro ou do Bairro Jardins em São Paulo.

// Um ponto relevante para comentar é que todas as condições que estamos aplicando na cláusula WHERE podemos usar 
// também nos comandos DELETE e UPDATE, isto é, os filtros compostos podem ser usados em outros comandos que já
// vimos também.

