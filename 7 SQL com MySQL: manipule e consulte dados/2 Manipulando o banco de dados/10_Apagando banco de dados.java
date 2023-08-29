// Agora que já criamos, vamos aprender a apagar o banco de dados. Para tal, vamos usar o comando DROP DATABASE, 
// basta digitar esse comando e o nome específico do banco a ser apagado. Na parte [IF EXISTS] db_name serve para 
// evitar um erro de execução caso a database não exista.

// Sintaxe completa:

// DROP {DATABASE | SCHEMA} [IF EXISTS] db_name

// Voltando para o MySQL Workbench, na área de consulta vamos digitar o comando DROP DATABASE SUCOS; para apagar 
// o banco de dados sucos e rodamos. No espaço de "Output", temos a mensagem 0 rows(s) affected e em "Action Output" 
// nos informa através de uma seta em verde que o comando foi executado com sucesso. Note que o banco de dados não 
// consta mais na lista no lado esquerdo, onde é localizado os demais bancos. Agora, se formos nos arquivos do 
// sistema operacional, no diretório Data do MySQL, perceba que também não há mais nenhum diretório com o nome sucos.

// DROP DATABASE SUCOS;

// Por ser um comando que excluí banco de dados e, consequentemente todos os dados contidos nele, é preciso tomar 
// bastante cuidado para quem damos permissão de acesso para executar tal comando. Há até desenvolvedores e
// desenvolvedoras que não possuem essa permissão, conseguem apenas criar tabelas e inserir dados. O único que
// possui o privilégio de criar e apagar bancos de dados é o administrador, conhecido como DBA (sigla em inglês 
// de Database administrator, Administrador de banco de dados).

// É possível também excluir a database sem digitar o comando, apenas indo no lado esquerdo no Workbench, selecionar
// com o botão direito do mouse no nome que deseja apagar e escolher a opção "Drop Schema". Será exibido uma tela 
// perguntando se realmente queremos excluir o banco de dados com duas opções "Review SQL", que irá nos mostrar o 
// comando SQL que será executado e "Drop Now", que é a confirmação para a exclusão. Clicando em "Review SQL" perceba 
// que será apresentado o comando DROP DATABASE `sucos2`;, selecionando "Execute" a database sucos2 foi excluído do 
// Workbench e fisicamente no disco.

// Até a próxima aula!