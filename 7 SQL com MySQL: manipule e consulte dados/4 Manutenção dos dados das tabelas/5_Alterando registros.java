// Nessa aula vamos aprender a como alterar uma informação que já está incluída na tabela. No link associado a 
// este vídeo, baixe o arquivo SQL_05.sql e clique com o botão direito do mouse para abrir como editor de texto.

// Será exibido os seguintes comandos:

// USE sucos;

// INSERT INTO tbproduto (
// PRODUTO,  NOME, EMBALAGEM, TAMANHO, SABOR,
// PRECO_LISTA) VALUES
// ('544931', 'Frescor do Verão - 350 ml - Limão', 'PET', '350 ml','Limão',3.20);

// INSERT INTO tbproduto (
// PRODUTO,  NOME, EMBALAGEM, TAMANHO, SABOR,
// PRECO_LISTA) VALUES
// ('1078680', 'Frescor do Verão - 470 ml - Manga', 'Lata', '470 ml','Manga',5.18);COPIAR CÓDIGO
// Copiando o script do arquivo, crie no ambiente do Workbench um novo espaço para os comandos, cole e rode o programa
// para ser incluído mais dois produtos na tabela.

// Vamos verificar na planilha o produto com o seguinte código 544931, se encontra na linha 7 da planilha, perceba
// que o campo "EMBALAGEM" consta como lata e no comando está PET, o preço também está diferente sendo na planilha 
// 2,46 e no script 3.20. Analisando o próximo código 1078680, a embalagem também está divergente, era para ser
// garrafa e incluímos lata, os outros campos estão com as informações corretas.

// Gerando novamente um ambiente para um novo script, digite o comando USE sucos;, para entrar na base de sucos e, 
// em seguida, o comando para realizar a alteração das informações que estão diferentes com UPDATE tbproduto SET, 
// em set especificamos um conjunto de alterações que queremos realizar, utilizando a sintaxe SET column1 = value1,
// column2 = value2,....

// Mas, precisamos especificar em qual produto queremos fazer essa mudança. Para isso, incluímos uma condição WHERE 
// com o código do produto e realizamos o mesmo comando para alterar as informações o produto seguinte.

// Código:

// USE sucos;

// UPDATE tbproduto SET EMBALAGEM = 'Lata', PRECO_LISTA = 2.46
// WHERE PRODUTO = '544931';

// UPDATE tbproduto SET EMBALAGEM = 'Garrafa'
// WHERE PRODUTO = '1078680';COPIAR CÓDIGO
// Rodando o programa é retornado um erro na parte de "Output" informando que está sendo usado um UPDATE sem uma 
// condição que utilize o campo com chave primária. Esse erro aparece porque o MySQL está me obrigando a usar na
// condição um campo que seja chave primária, isto é, que não se repete nos registros.

// Mas não incluímos uma chave primária nessa tabela, não aprendemos isso ainda. Colocando o mouse por cima do erro,
// ele me dá uma dica de ir em preferences -< SQL editor. Vamos, então, na parte superior em "Edit > Preferences > SQL
// Editor" para desmarcar o campo Safe Updates (rejects UPDATES and DELETEs with no restrictions) e selecione "OK".

// Para funcionar, será necessário reconectar o Workbench, para sair vá em "File > Exit" e para abrir novamente clique 
// no Windows, digite "MySQL" e selecione essa opção. Perceba que os comandos estão salvos no ambiente para escrevermos 
// o código, vamos rodar novamente o script, será exibida uma mensagem comunicando que foi efetuado com sucesso.

// Para verificar se a alteração foi executada, vamos incluir SELECT * FROM tbproduto; e selecionar apenas essa
// linha para rodar.

// PRODUTO	NOME	EMBALAGEM	TAMANHO	SABOR	PRECO_LISTA
// 1040107	Light - 350 ml - Melancia	Lata	350 ml	Melancia	4.56
// 1037797	Clean - 2 Litros - Laranja	PET	2 Litros	Laranja	16.01
// 1000889	Sabor da Montanha - 700 ml - Uva	Garrafa	700 ml	Uva	6.31
// 1004327	Videira do Campo - 1,5 Litros - Melancia	PET	1,5 Litros	Melancia	19.51
// 544931	Frescor do Verão - 350 ml - Limão	Lata	350 ml	Limão	2.46
// 1078680	Frescor do Verão - 470 ml - Manga	Garrafa	470 ml	Manga	5.18
// Note que os campos solicitados foram alterados para os produtos com os códigos 544931 e 1078680. Nessa aula alteramos
// os registros na tabela utilizando o comando UPDATE, filtrando com WHERE quais linhas gostaríamos de modificar e,
// nesse caso, tiramos a condição de chave primária para executar esse filtro.