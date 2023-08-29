// Como o foco desse treinamento é conhecer um pouco como funciona o SQL, instalamos com o MySQL uma interface 
// gráfica chamada MySQL Workbench, que vamos usar para aprender SQL.

// Vamos compreender um pouco sobre o funcionamento do Workbench. Para abrir clicaremos em "Windows" e no campo de 
// busca escreveremos "Workbench", irá aparecer MySQL Workbench 8.0 CE, versão mais atual durante a gravação do curso.

// Selecionando essa opção, será mostrado a tela principal Welcome to MySQL Workbench, que na parte inferior temos 
// várias conexões disponíveis. Clicando no + ao lado de "MySQL Connection" mostrará uma tela "Setup New Connection" 
// em que é possível configurar uma nova conexão. Isto é, o Workbench faz o papel do cliente e, posso acessar com o 
// mesmo Workbench diferentes servidores MySQL. Neste caso, já estamos conectados no servidor MySQL da própria máquina.

// Não vamos criar uma conexão, então clicaremos em "Cancel" na tela "Setup New Connection". Vamos usar apenas a 
// conexão criada durante a instalação para nos conectar com o MySQL que está no nosso ambiente.

// Iremos selecionar a conexão "Local instance MySQL80" e será aberta uma janela inicial do MySQL Workbench. 
// Clicaremos em "Schemas", nessa aba temos outros bancos de dados, tais como sakila, world e sys. Os dois primeiros 
// são bancos de dados exemplos que o MySQL instala, já o sys é um banco de dados utilizado pelo sistema, como o 
// nome já diz.

// Veremos mais para frente, talvez em outros treinamentos, que as configurações internas do MySQL também são 
// tabelas em bancos de dados internos - diferente dos que vamos trabalhar.

// Do lado esquerdo no banco de dados MySQL em world clique em "Tables" (tabelas), note ser possível observar o 
// cadastro das colunas, dos índices, das chaves estrangeiras e triggers. Se selecionarmos os campos, por exemplo,
// conseguimos visualizar o nome de cada coluna que compõe a tabela city.

// Na área central da tela, que no momento está vazia, é o local que vamos digitar nossos comandos SQL - consulta,
// inclusão, alteração de informação ou exclusão de campos e/ou tabelas. Vamos analisar melhor mais para frente o
// que isso significa, mas apenas exemplificando para facilitar a compreensão: insira no espaço em branco o comando
// select * from city e em seguida dê um duplo clique no banco de dados world para rodar, note que ficou em negrito 
// (bold), isso quer dizer que os comandos inseridos na área de código estão relacionados ao banco de dados selecionado.

// select * from city. Neste comando estamos selecionando (select) todos os campos (*) (asterisco) da tabela city.

// É por esse motivo que o SQL surgiu do termo "linguagem estruturada em inglês", visto que seus comandos são
// escritos nesse idioma.

// Select (selecionar)
// From (de)
// Em negrito são os componentes do banco de dados
// Em azul-claro são os comandos da linguagem SQL
// Neste caso, select e from são comandos SQL, já (*) e city não. Isso está relacionado com a seleção que estou fazendo.

// Para executar a consulta, clique no ícone de raio na parte superior da área que escrevemos o código, como 
// resultado obtemos todas as informações da tabela, como as colunas ("ID", "Name" (nome),"CountryCode" 
// (código do país),"District" (Distrito),"Population" (população)) e as linhas.

// Tabela gerada:

// Para melhorar visualização, alguns elementos da tabela foram omitidos.

// Id	Name	CountryCode	District	Population
// 1	Kabul	AFG	Kabol	1780000
// 2	Qandahar	AFG	Qandahar	2375500
// 3	Herat	AFG	Herat	186800
// 4	Mazar-e-Sharif	AFG	Balkh	127800
// 5	Amsterdam	NLD	Noord-Holland	731200
// Acrescentando o comando select * from country na interface, é preciso inserir um ponto e vírgula (;) ao final dos
// comandos para que o programa identifique o encerramento de um e execute o próximo.

// SELECT * FROM CITY;
// SELECT * FROM COUNTRY;COPIAR CÓDIGO
// Clicando para executar os comandos novamente, temos como resultado duas abas. A primeira aba é a City 2, da tabela
// gerada anteriormente e a outra Country 3 é o retorno do segundo comando da tabela country, com todos os seus elementos.

// Se tirarmos o ponto e vírgula do final do primeiro comando, a própria IDE nos retorna um erro, com um X (xis) em 
// vermelho, informando haver um erro na segunda linha. Passando o mouse por cima desse aviso, será mostrado o 
// motivo, no caso aparece a mensagem ""SELECT" is not valid at this position, expecting : EOF, ';'", isto é, 
// a seleção é inválida nesta posição e é esperado um ponto e vírgula ou um EOF (End-of-file), em português, fim 
// de arquivo.

// Se tentarmos rodar esse comando com o aviso, será mostrado o erro no lugar do retorno da tabela esperada, no caso
// aparecerá a seguinte mensagem select * from city select * from country. Porém, há uma forma de executar apenas 
// um dos comandos, selecionando com o mouse somente a linha que quero executar e, novamente, clicar no ícone de 
// raio para rodar. Isso ocorre pelo fato do Workbench entender que deve executar apenas o comando selecionado e 
// ignorar os outros. Por isso, não é necessário colocar o ponto e vírgula ao usar essa forma de execução.

// Com a finalidade de explorar um pouco mais com vocês essa área, vamos inserir o nome errado da coluna com o 
// comando select * from countryxxx;, perceba que quando erramos nomes que não estão relacionadas com as palavras 
// chaves do SQL, como o nome da tabela, a IDE não consegue identificar que esse nome não existe. Retornando o erro 
// Erro code: 1146. Table 'world.countryxxx'doesn't exist apenas após a execução do código, mas note que o primeiro
// comando segue funcionando normalmente.

// Tudo isso que foi mostrado para vocês é apenas uma introdução de como trabalhamos o Workbench.