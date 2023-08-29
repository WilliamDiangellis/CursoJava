// Nessa aula vamos aprender a elaborar melhor os filtros, para buscar registros maiores ou menores sobre algum dado.

// Vamos criar mais um script e inserir o comando SELECT * FROM tbcliente WHERE IDADE = 22;, que teremos como resultado
// dessa consulta 4 registros somente de clientes com 22 anos:

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 50534475787	Abel Silva	Rua Humaitá		Humaitá	Rio de Janeiro	RJ	22000212	1995-09-11	22	M	170000	260000	0
// 5576228758	Petra Oliveira	R. Benício de Abreu		Lapa	São Paulo	SP	88192029	1995-11-14	22	F	70000	160000	1
// 8502682733	Valdecir da Silva	R. Srg. Édison de Oliveira		Jardins	São Paulo	SP	82122020	1995-10-07	22	M	110000	190000	0
// 9283760794	Edson Meilelles	R. Pinto de Azevedo		Cidade Nova	Rio de Janeiro	RJ	22002002	1995-10-07	22	M	150000	250000	1
// Podemos também selecionar clientes que tem mais de 22 anos, substituindo o igual (=)" por maior (>) no comando: 
// SELECT * FROM tbcliente WHERE IDADE > 22;:

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 1471156710	Érica Carvalho	R. Iriquitia		Jardins	São Paulo	SP	80012212	1990-09-01	27	F	170000	245000	0
// 3623344710	Marcos Nogueira	Av. Pastor Martin Luther King Junior		Inhauma	Rio de Janeiro	RJ	22002012	1995-01-13	23	M	110000	220000	1
// 492472718	Eduardo Jorge	R. Volta Grande		Tijuca	Rio de Janeiro	RJ	22012002	1994-07-19	23	M	75000	95000	1
// 5648641702	Paulo César Mattos	Rua Hélio Beltrão		Tijuca	Rio de Janeiro	RJ	21002020	1991-08-30	26	M	120000	220000	0
// Para selecionar clientes com menos de 22 anos, basta substituir o maior (>) por menor (<) no comando: 
// SELECT * FROM tbCliente WHERE IDADE < 22;:

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 19290992743	Fernando Cavalcante	R. Dois de Fevereiro		Água Santa	Rio de Janeiro	RJ	22000000	2000-02-12	18	M	100000	200000	1
// 2600586709	César Teixeira	Rua Conde de Bonfim		Tijuca	Rio de Janeiro	RJ	22020001	2000-03-12	18	M	120000	220000	0
// 95939180787	Fábio Carvalho	R. dos Jacarandás da Península		Barra da Tijuca	Rio de Janeiro	RJ	22002020	1992-01-05	16	M	90000	180000	1
// O retorno dessa consulta será 3 registros com os clientes com menos de 22 anos.

// Vamos consultar agora clientes que têm menos de 22 anos, incluindo os que têm. Basta substituir o menor (<) por 
// menor ou igual (<=) no comando: SELECT * FROM tbcliente WHERE IDADE <= 22;, o igual inclui os que têm 22 anos no 
// critério do filtro.

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 19290992743	Fernando Cavalcante	R. Dois de Fevereiro		Água Santa	Rio de Janeiro	RJ	22000000	2000-02-12	18	M	100000	200000	1
// 2600586709	César Teixeira	Rua Conde de Bonfim		Tijuca	Rio de Janeiro	RJ	22020001	2000-03-12	18	M	120000	220000	0
// 95939180787	Fábio Carvalho	R. dos Jacarandás da Península		Barra da Tijuca	Rio de Janeiro	RJ	22002020	1992-01-05	16	M	90000	180000	1
// 50534475787	Abel Silva	Rua Humaitá		Humaitá	Rio de Janeiro	RJ	22000212	1995-09-11	22	M	170000	260000	0
// Supondo que agora precisamos consultar todos os clientes, exceto os que têm 22 anos. Basta substituir pelo símbolo 
// de diferença no comando (<>): SELECT * FROM tbcliente WHERE IDADE <> 22;.

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 1471156710	Érica Carvalho	R. Iriquitia		Jardins	São Paulo	SP	80012212	1990-09-01	27	F	170000	245000	0
// 19290992743	Fernando Cavalcante	R. Dois de Fevereiro		Água Santa	Rio de Janeiro	RJ	22000000	2000-02-12	18	M	100000	200000	1
// 2600586709	César Teixeira	Rua Conde de Bonfim		Tijuca	Rio de Janeiro	RJ	22020001	2000-03-12	18	M	120000	220000	0
// Podemos aplicar esses símbolos de menor, maior, menor ou igual, ou maior ou igual em textos também. No MySQL existe
// uma ordem alfabética para as letras, então, o "B" é maior que o "A" (B > A), o "C" é maior que o "B" (C > B), 
// o "X" é maior que "R" e assim sucessivamente.

// Por isso, quando realizamos a consulta SELECT * FROM tbcliente WHERE NOME > ‘Fernando Cavalcante’;, o MySQL analisa
// a primeira letra, no caso "F", a partir desse critério e se tiver outro nome que inicie com "F", como "Fátima" 
// seria um candidato, já ao comparar a segunda letra de cada nome, perceberia que "E" é maior que "A", descartando 
// "Fátima" da condição.

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 3623344710	Marcos Nogueira	Av. Pastor Martin Luther King Junior		Inhauma	Rio de Janeiro	RJ	22002012	1995-01-13	23	M	110000	220000	1
// 5576228758	Petra Oliveira	R. Benício de Abreu		Lapa	São Paulo	SP	88192029	1995-11-14	22	F	70000	160000	1
// 5648641702	Paulo César Mattos	Rua Hélio Beltrão		Tijuca	Rio de Janeiro	RJ	21002020	1991-08-30	26	M	120000	220000	0
// O resultado dessa consulta são clientes com nomes "acima" da letra "F", como M*arcos, *Petra e Paulo.

// Se quisermos incluir o Fernando na consulta, teríamos que colocar o símbolo maior ou igual (>=) no comando: 
// SELECT * FROM tbcliente WHERE NOME >= ‘Fernando Cavalcante’;:

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 19290992743	Fernando Cavalcante	R. Dois de Fevereiro		Água Santa	Rio de Janeiro	RJ	22000000	2000-02-12	18	M	100000	200000	1
// 3623344710	Marcos Nogueira	Av. Pastor Martin Luther King Junior		Inhauma	Rio de Janeiro	RJ	22002012	1995-01-13	23	M	110000	220000	1
// 5576228758	Petra Oliveira	R. Benício de Abreu		Lapa	São Paulo	SP	88192029	1995-11-14	22	F	70000	160000	1
// 5648641702	Paulo César Mattos	Rua Hélio Beltrão		Tijuca	Rio de Janeiro	RJ	21002020	1991-08-30	26	M	120000	220000	0
// Para excluir o nome "Fernando" do filtro, usamos o símbolo de diferente (<>): 
// SELECT * FROM tbcliente WHERE NOME <> ‘Fernando Cavalcante’;:

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 1471156710	Érica Carvalho	R. Iriquitia		Jardins	São Paulo	SP	8001221	1990-09-01	27	F	170000	245000	0
// 2600586709	César Teixeira	Rua Conde de Bonfim		Tijuca	Rio de Janeiro	RJ	22020001	2000-03-12	18	M	120000	220000	0
// 3623344710	Marcos Nogueira	Av. Pastor Martin Luther King Junior		Inhauma	Rio de Janeiro	RJ	22002012	1995-01-13	23	M	110000	220000	1
// 5576228758	Petra Oliveira	R. Benício de Abreu		Lapa	São Paulo	SP	88192029	1995-11-14	22	F	70000	160000	1
// 5648641702	Paulo César Mattos	Rua Hélio Beltrão		Tijuca	Rio de Janeiro	RJ	21002020	1991-08-30	26	M	120000	220000	0
// Tem um detalhe que vamos ver agora que pode gerar algumas dúvidas. Ao executar o comando 
// SELECT * FROM tbproduto WHERE PRECO_LISTA = 16.008 o resultado é vazio, isso acontece pelo fato do campo 
// "PRECO_LISTA" ser do tipo FLOAT, um ponto flutuante e, em razão disso, não é possível encontrar exatamente o 
// resultado inserido na condição.

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// NULL	NULL	NULL	NULL	NULL	NULL
// O recomendado para trabalhar com condições de igual (=), menor ou igual (<=) ou, maior ou igual (>=) e diferente
// (<>) seria o tipo DECIMAL, visto que o MySQL consegue encontrar o número exato na busca.

// Para números do tipo FLOAT, é possível usar apenas os símbolos de maior e menor, podemos usar o diferente (<>), 
// porém o produto com o preço 16.008 também irá constar justamente pelo fato do MySQL não encontrar o valor exato.

// Temos o comando BETWEEN, que é mais elaborado que o WHERE. Com ele conseguimos buscar exatamente o valor 
// especificado na condição usando o comando: SELECT * FROM tbproduto WHERE PRECO_LISTA BETWEEN 16.007 AND 16.009;, 
// que lista todos os produtos em que o preço está entre 16.007 e 16.009.

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// 1037797	Clean - 2 Litros - Laranja	PET	2 Litros	Laranja	16.008
// Essa é uma característica do MySQL, por ser do tipo FLOAT não é possível buscar o valor exato. Porém, podemos 
// usar os limites inferiores e superiores próximos para conseguir encontrar o valor que queremos.

// Código com todos os comandos dessa aula:

// SELECT * FROM tbcliente;

// SELECT * FROM tbcliente WHERE IDADE = 22;

// SELECT * FROM tbcliente WHERE IDADE > 22;

// SELECT * FROM tbcliente WHERE IDADE < 22;

// SELECT * FROM tbcliente WHERE IDADE <= 22;

// SELECT * FROM tbcliente WHERE IDADE <> 22;

// SELECT * FROM tbcliente WHERE NOME >= 'Fernando Cavalcante';

// SELECT * FROM tbcliente WHERE NOME <> 'Fernando Cavalcante';

// SELECT * FROM tbproduto;

// SELECT * FROM tbproduto WHERE PRECO_LISTA > 16.008;

// SELECT * FROM tbproduto WHERE PRECO_LISTA < 16.008;

// SELECT * FROM tbproduto WHERE PRECO_LISTA <> 16.008;

// SELECT * FROM tbproduto WHERE PRECO_LISTA BETWEEN 16.007 AND 16.009;