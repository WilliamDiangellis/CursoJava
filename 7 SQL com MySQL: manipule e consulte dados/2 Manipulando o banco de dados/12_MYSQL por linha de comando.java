// Vamos usar o Workbench ao longo do nosso treinamento por ser mais fácil de inserir comandos, criar e apagar tabelas 
// e até visualizar o resultado na própria interface. Mas, tem os que não gostam e preferem usar o SQL como linha de 
// comando. Com a finalidade de exemplificar, vamos acessar o MySQL sem precisar usar a IDE, isto é, por linha de comando.

// A IDE do MySQL Workbench é apenas uma interface gráfica para nos auxiliar na manipulação do banco de dados.

// Quando instalamos as ferramentas do MySQL, o cliente e o servido, não necessariamente precisamos de uma IDE para 
// trabalhar, basta ir direto em linha de comando. Para isso, vamos em "Windows" e no campo de busca digitamos "cmd" para
// encontrar o prompt de comando, selecionando essa opção será exibido uma tela preta.

// Para conseguirmos usar a linha de comando, é preciso ir até o diretório onde está localizado o MySQL ou, como 
// qualquer programa do Windows, ir ao painel de controle usando o atalho "Ctrl + P" na variável path e inserir o 
// caminho da localização do executável do MySQL para poder acessar por linha de comando.

// No cmd, vamos digitar o comando cd\, para voltarmos para a pasta C: e, em seguida, cd "Program Files", para entrar 
// na pasta e depois “cd MySQL”. Para visualizar os diretórios na pasta MySQL digite dir, será exibido diversos 
// diretórios, vamos optar pelo cd "MySQL Server 8.0" e, novamente, escrevemos o comando dir e, logo após, cd bin. 
// Temos nesse diretório bin o programa dir mysql.exe, é com ele que vamos entrar no MySQL como linha de comando.

// Caminho:

// C: \program files>cd “mysql server 8.0>cd bin>dir mysql.exe

// Prosseguindo, vamos inserir mysql -h localhost, sendo o "-h" servidor (host) e o "localhost" o meu próprio 
// servidor. Antes de continuarmos, voltando para o Workbench e selecionando o ícone com a imagem de casa na parte 
// superior esquerda da tela, vamos para a área de conexão. Na conexão local, perceba que ela é localhost, isto é, 
// podemos acessar a nossa própria máquina apenas indo na máquina chamada localhost.

// Localhost é o nome da nossa própria máquina.

// Voltando para o prompt de comando, acrescentamos -u ao nosso comando,root que é o nosso usuário e root -p, sendo -p 
// a senha, mas não vamos digitar ainda. Esse comando informa que vamos nos conectar no servidor localhost, que vou usar
// o usuário root e que a senha será digitada a seguir.

// mysql -h localhost -u root -p

// Selecionando "Enter" aparece uma mensagem escrita "Enter password" para inserir a senha do usuário root, vamos 
// digitar a senha e clicar em "Enter". Repare que estamos agora no MySQL, visto que o nosso caminho é substituído por 
// mysql>.

// Vamos realizar o comando create database sucos; e apertar o "Enter", será exibido a mensagem Query OK, 1 row affected 
// (0.00 sec). Sem fechar o cmd, voltando para o Workbench e clicando na pasta no canto superior esquerdo ao lado 
// do ícone da casa, "Local instance MySQL80" saímos da conexão local e retornamos para o ambiente do MySQL. Selecione 
// com o botão direito na aba da árvore que constam os bancos de dados, escolhendo a opção "Refresh All", o banco de 
// dados sucos aparece, visto que o criamos pela linha de comando.

// No prompt, podemos digitar o comando select * from city;, nossa tabela de cidades. Mas, ao clicarmos no "Enter", 
// teremos um erro como retorno,ERRO 1046 (3D000) No database selected, informando que nenhuma database foi selecionado. 
// Isso acontece porque não selecionamos o banco de dados world, e para executar o comando é preciso escolher o 
// banco de dados que quero usar. Para isso, vamos usar o comando use world, que corresponde ao duplo clique do Workbench.

// Os comando CREATE e DROP são comandos de sistema e, em razão disso, não preciso estar associado a um banco de dados.

// Apertamos novamente "Enter" para rodar o nosso comando, será exibido uma mensagem dizendo que a database foi
// alterado (Database Changed) e, agora sim, podemos digitar o select * from city;. O programa vai listar todos
// o conteúdo da tabela city, que são 4.079 linhas em zero segundos, este tempo são os segundos que o banco de dados
// levou para efetuar a consulta. Para exibir as informações na tela é necessário um determinado tempo, mas por já
// estar em memória o resultado da consulta é mais rápido.

// No Workbench, o nosso banco de dados** world** está selecionado e podemos digitar o comando select * from city;
// e executar, o resultado fica, visualmente, mais agradável que no MySQL por linha de comando.

// Novamente no cmd, para sair da database basta digitar "EXIT" para fechar o programa, que voltamos para o prompt do 
// Windowns. Veja que podemos escrever o comando com letras maiúsculas ou minúsculas, isto é, o MySQL não é case 
// sensitive, ao contrário de alguns programas ligados, por exemplo, o Java.

// Mas, à medida que formos aprendendo a construir comandos SQL, é uma boa prática indentar de forma correta os 
// comandos, colocando-os em letras maiúsculas para dar destaque.