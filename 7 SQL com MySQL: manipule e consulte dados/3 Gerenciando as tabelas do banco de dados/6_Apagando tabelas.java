// Podemos apagar as tabelas, mas antes, é necessário verificar alguns requisitos antes de excluir. No caso, temos 
// duas tabelas que não se relacionam no banco de dados, mas se tivessem alguma relação entre elas, pode ter 
// situações em que não é possível apagar.

// Vamos apagar a tabela de duas formas, através do comando e de um assistente. Como iremos utilizar a tabela 
// de clientes e produtos nas próximas aulas, não vamos excluir ela, iremos no script que criamos a tabela de 
// clientes e inserir um sufixo "2" no final do nome da tabela e rodar o comando, realize o mesmo procedimento 
// para o sufixo "3".

// Código:

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
// PRIMEIRA_COMPRA BIT (1));

// Clique com o botão direito do mouse em "TABLES" e escolha a opção "Refresh All" para aparecer as tabelas 2 e 3
// de clientes.

// Na primeira forma que temos para excluir uma tabela, no Workbench, selecione a "tbcliente2" com o botão direito 
// do mouse e escolha a opção "Drop Table", será exibida uma mensagem perguntando se queremos revisar o comando
// "Review SQL" ou executar "Drop Now", selecione essa última opção e pronto, a tabela foi apagada.

// A outra forma é por comando, selecione do lado superior esquerdo o ícone SQL com o + abaixo para criarmos uma 
// pasta de comando e certifique-se que está no banco de dados sucos observando se está em negrito o nome ou usando 
// o comando use Sucos;. Agora podemos apagar a tabela "tbcliente3" usando DROP TABLE tbCliente3; e rode o comando.

// DROP TABLE tbcliente3;

// Note que a tabela "tbcliente3" não consta mais em "TABLES" no banco de dados sucos. Recapitulando, é possível 
// apagar uma tabela pelo Workbench usando o botão direito do mouse ou por comando "Drop Table" e o nome da tabela.