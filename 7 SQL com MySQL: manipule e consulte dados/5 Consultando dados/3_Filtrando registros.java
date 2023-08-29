// Nessa aula vamos aprender a filtrar registros para casos em que não queremos visualizar todas as informações, visto
// que referente a filtros o máximo que sabemos usar até o momento é o comando LIMIT, que limita o número de linhas exibidas.

// Vamos inserir SELECT * FROM tbproduto; e SELECT * FROM tbcliente; para verificar as informações das tabelas de 
// produto e cliente. Assim como usamos a cláusula WHERE para filtrar um produto específico no comando UPDATE, 
// podemos usar no SELECT: SELECT * FROM tbcliente WHERE PRODUTO = ‘544931’;

// Tabela:

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// 544931	Frescor do Verão - 350 ml - Limão	Lata	350 ml	Limão	2.4595
// O retorno dessa consulta terá apenas um registro, o produto com o código 544931.

// Nessa condição não é preciso selecionar somente um campo que seja chave primária, pode usar, por exemplo: 
// SELECT * FROM tbcliente WHERE CIDADE = ‘Rio de Janeiro’;. Estamos colocando a coluna "CIDADE" na condição, 
// que não é chave primária.

// Para melhor visualização, alguns registros dessa tabela foram omitidos.

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	DATA_NASCIMENTO	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA
// 19290992743	Fernando Cavalcante	R. Dois de fevereiro		Água Santa	Rio de Janeiro	RJ	22000000	2000-02-12	18	M	10000	200000	1
// 2600586709	César Teixeira	Rua Conde de Bonfim		Tijuca	Rio de Janeiro	RJ	22020001	2000-03-12	18	M	120000	220000	0
// 3623344710	Marcos Nogueira	Av. Pastor Martin Luther King Junior		Inhauma	Rio de Janeiro	RJ	22002012	1995-01-13	23	M	110000	220000	1
// O retorno dessa consulta será somente clientes em que a cidade é Rio de Janeiro.

// A cláusula WHERE pode ter uma condição que retorne mais de um registro, que também vale para outros comandos,
// como, SELECT, UPDATE e DELETE. Exemplificando, usando o comando SELECT * FROM tbproduto WHERE SABOR = ‘Limão’; 
// o resultado são todos os produtos com o sabor limão, com 4 registros:

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// 1042712	Linha Citros - 700 ml - Limão	Garrafa	700 ml	Limão	4.904
// 1051518	Frescor do Verão - 470 ml - Limão	Garrafa	470 ml	Limão	3.2995
// 1088126	Linha Citros - 1 Litro - Limão	PET	1 Litro	Limão	7.004
// 544931	Frescor do Verão - 350 ml - Limão	Lata	350 ml	Limão	2.4595
// Contudo, vamos supor que esse sabor limão será, a partir de agora, chamado "cítricos", para essa alteração podemos
// usar o comando UPDATE: UPDATE tbproduto SET SABOR = ‘Cítricos’ WHERE SABOR = ‘Limão’, selecionando apenas esse 
// comando e rodando, é retornado a mensagem comunicando que 4 linhas foram afetadas e 4 linhas alteradas.

// Se caso rodarmos novamente o comando SELECT * FROM tbproduto WHERE SABOR = ‘Limão’; não teremos nenhum registro 
// como resultado, visto que alteramos o sabor limão para cítricos. Por esse motivo, ao invés de 'limão' vamos 
// inserir o sabor 'cítricos' nesse comando SELECT.

// Comando SELECT:

// SELECT * FROM tbproduto WHERE SABOR = ‘Cítricos’;

// Executando esse comando, temos como resultado a coluna "SABOR" alterada de 'limão' para 'cítricos':

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// 1042712	Linha Citros - 700 ml - Limão	Garrafa	700 ml	Cítricos	4.904
// 1051518	Frescor do Verão - 470 ml - Limão	Garrafa	470 ml	Cítricos	3.2995
// 1088126	Linha Citros - 1 Litro - Limão	PET	1 Litro	Cítricos	7.004
// 544931	Frescor do Verão - 350 ml - Limão	Lata	350 ml	Cítricos	2.4595
// Código completo dessa aula:

// SELECT * FROM tbproduto WHERE PRODUTO = '544931';

// SELECT * FROM tbcliente WHERE CIDADE = 'Rio de Janeiro';

// SELECT * FROM tbproduto WHERE SABOR = 'Cítricos';

// UPDATE tbproduto SET SABOR = 'Cítricos' WHERE SABOR = 'Limão';

// Resumindo, podemos ter na cláusula WHERE uma condição que vai me retornar mais de um registro e, não 
// necessariamente, precisa ser chave primária, é permitido todos os campos que constam na tabela.

// É possível também executar filtros compostos, mas não veremos isso nesse vídeo, o objetivo dessa aula foi 
// realizar filtros simples para selecionar elementos na tabela que tragam somente alguns registros.