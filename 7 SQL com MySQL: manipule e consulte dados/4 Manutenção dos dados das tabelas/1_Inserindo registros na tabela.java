// A partir do momento [00:25] o instrutor passa a apresentar a planilha de PRODUTOS. Nesta planilha uma das palavras é apresentada com um erro ortográfico, a palavra está escrita como Melância, mas na verdade a escrita correta é Melancia.

// Você pode fazer o download completo dos códigos realizados neste vídeo e continuar seus estudos.

// Já temos a tabela de cliente e produto criadas, agora precisamos inserir informações nelas. Neste momento, faremos da seguinte forma: baixe o link disponibilizado para este vídeo, terá uma planilha de Excel chamada "PRODUTOS.xlsx", selecione ela e observe que temos os campos "SKU" que é o código do produto, "DESCRITOR" é o nome do produto que dentro também temos as informações de tamanho e sabor, "EMBALAGEM" e "PREÇO", são as informações específicas do produto.

// Vamos usar essa planilha PRODUTOS como base para inserir dados dentro da tabela. Voltando para o Workbench, selecione o ícone para criar um script, vamos pegar a primeira linha que é o "SKU 1040107".

// Certifique-se que está no banco de dados sucos, utilizando o comando USE sucos;

// O comando utilizado para inserir as informações em uma tabela é o INSERT INTO tbproduto(, abrindo parêntese 
// para incluir os campos da tabela. Observe que em "tbproduto" em "columns" há o nome das colunas 
// ("PRODUTO", "NOME", "EMBALAGEM", "TAMANHO", "SABOR" e "PRECO_LISTA") sendo a que vamos incluir no comando INSERT.

// Código completo até o momento:

// USE sucos;

// INSERT INTO tbproduto (
// PRODUTO,
// NOME, 
// EMBALAGEM, 
// TAMANHO,
// SABOR,
// PRECO_LISTA)

// Após a inclusão dos campos, digite a cláusula VALUES que significa que vamos especificar os valores da instrução
// INSERT INTO. No caso, a primeira coluna é "PRODUTO", que olhando na planilha do Excel é o "SKU", sabemos que o 
// código do produto foi criado como VARCHAR. Então, voltando para o comando abra um parêntese após VALUES e insira 
// '1040107' e uma vígula, que indica que vamos acrescentar a informação sobre o próximo campo "Nome". Repita o
// procedimento para os demais campos, com exceção do "PRECO_LISTA" que por ser FLOAT não é necessário utilizar
// aspas simples.

// Para inserir uma informação que é considerada STRING, é preciso utilizar aspas simples ('') para que o programa 
// identifique.

// Código:

// INSERT INTO tbproduto (
// PRODUTO, 
// NOME, 
// EMBALAGEM, 
// TAMANHO, 
// SABOR, 
// PRECO_LISTA) VALUES (
// '1040107', 'Light - 350 ml - Melancia', 'Lata', '350 ml', 'Melancia', 4.56);

// Executando o comando, será exibido uma mensagem informando que o programa rodou com sucesso. Mas, para visualizar
// as informações nessa tabela, para verificar se foram incluídas, usaremos o comando SELECT * FROM tbproduto;, 
// selecione somente essa linha para rodar. Será exibida a tabela produto com as informações inseridas.

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// 1040107	Light - 350 ml - Melancia	Lata	350 ml	Melancia	4.56
// Aprendemos, então, a incluir o primeiro registo na tabela. Até a próxima aula!