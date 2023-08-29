// Agora que estamos com as instalações necessárias e sabemos usar o Workbench, vamos começar a manipular os bancos
// de dados. Para isso, primeiro, é preciso criar um banco de dados, além dos exemplos que já temos que vieram junto
// no momento da instalação do MySQL.

// A sintaxe para criar o banco de dados é o comando create database, note ser possível gerar um database ou um schema.

// Lembrando que no banco de dados relacional, o agrupamento de tabelas é chamado de schema, já no MySQL database e
// schema são sinônimos.

// Então, podemos utilizar CREATE {DATABASE | SCHEMA} para criar um banco de dados. Outra parte que pode ser 
// acrescentada no comando é o [IF NOT EXISTS] db_name, isto é, se não for encontrado o nome atribuído ao banco 
// de dados, será criado e, caso exista não será feita nenhuma execução.

// Código completo:

// CREATE {DATABASE | SCHEMA} [IF NOT EXISTS] db_name
//       [create_specification]

//    create_specification:
//             [DEFAULT] CHARACTER SET [=] charset_name
//             [DEFAULT] COLLATE [=] collation_name
//             DEFAULT ENCRYPTION [=] { 'Y' | 'N'}
            
// Analisando as informações em create_specification, perceba que se não for indicado o character set, como, do 
// tipo UTF-8 ou UTF-16, o código utiliza o padrão (default).

// UTF-8 - UCS Transformation Format 8 (formato de transformação UCS 8)
// UTF-16- 16-bit Unicode Transformation Format (formato de Transformação Unicode)
// No nosso computador possuímos uma tabela interna chamada ASCII (da sigla American Standard Code for Information 
// Interchange, "Código Padrão Americano para o Intercâmbio de Informação"), em que cada letra digitada no computador
// é convertida em um código que a representa.

// O código ASCII pode diferir conforme o idioma, como na língua inglesa que não existe acento e nem cê-cedilha. 
// Por isso, a tabela ASCII original não comporta esses tipos de caracteres especiais. Porém, há tabelas que integram 
// esses caracteres especiais, então, ao digitar uma letra com acento será buscado na tabela o código correspondente.

// Por esse motivo, em character set vamos informar para o banco de dados o conjunto de caracteres permitidos, a 
// depender do idioma. Por exemplo, se a construção do banco de dados são com informações em português, é 
// necessário, portanto, que seja incluído caracteres da língua portuguesa.

// Apenas por questão de conhecimento, o collate também específica o padrão desses conjuntos de caracteres a serem 
// usados e o encryption informa se o banco de dados será criptografado ou não.

// Como no momento estamos aprendendo SQL, essa informação não é tão relevante e, em razão disso, vamos somente 
// rodar o comando create.

// Voltando para o Workbench, digitando na área do código CREATE DATABASE SUCOS; estamos criando um database 
// chamado sucos. Quando selecionamos o botão para rodar, no resultado é exibido a mensagem 1 row(s) affected
// (uma linha disponibilizada) informando que foi executado com sucesso.

// Perceba que o banco de dados sucos ainda não consta em Schemas do lado esquerdo do MySQL, para que aparaceça, 
// basta apertar o botão direito do mouse na aba e clicar na última opção em refresh all (atualize tudo) que 
// aparece no espaço em que é armazenado os bancos de dados.

// Vamos agora visualizar o local que esse banco de dados está criado fisicamente no disco. Selecione a sua pasta
//  de arquivos do próprio computador e procure o repositório do MySQL. No caso, o caminho é o
// C:\ProgramData\MySQL\MySQLServer 8.0 do MySQL e note haver um arquivo nomeado my.ini, este é lido pelo MySQL 
// toda vez que ele é iniciado, ou seja, é o arquivo de inicialização.

// No arquivo my.ini. há uma série de variáveis de ambiente. Abrindo esse arquivo, clicando com o botão direito do
// mouse, em um editor de texto, no caso vou usar o Edit with Notepad++, conseguimos encontrar a variável
// datadir = C:/ProgramData/MySQL/MySQLServer 8.0/Data, que mostra o ambiente onde o banco de dados está localizado.

// Voltando para os diretórios no computador, na pasta "Data" note que temos um diretório chamado sucos agora, porém 
// dentro não temos nenhum arquivo ainda. Mas, caso selecionarmos o repositório world é possível visualizar uma
// série de arquivos separados, as tabelas com a extensão .ibd, isto é, cada tabela possui um registro separado.

// Criamos o banco de dados e a partir de agora podemos prosseguir com o nosso treinamento, criando outros componentes
// no banco de dados sucos.