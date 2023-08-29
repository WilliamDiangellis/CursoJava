// [00:00] Olá aluno, tudo bom? Hoje em dia, ao pensar em sistemas, a maioria deles são provedores de serviços. 
// Pensando aqui na Alura, que é uma provedora de cursos online, no momento em que você vai fazer a matrícula, é 
// necessário selecionar os campos de texto na página da Alura e inserir algumas informações para que você de fato 
// tenha acesso aos seus cursos online.

// [00:30] Então, preenchendo aqui o formulário que eles solicitam, eu vou agora selecionar, vou inserir qual é a 
// minha informação de pagamento, então meu cartão de crédito, o nome que está no meu cartão de crédito, o código 
// de segurança. Uma vez que eu termine de preencher as minhas informações corretamente, eu concluo o pagamento e 
// vou ter acesso aos cursos.

// [01:05] Uma coisa a se atentar aqui é sobre as informações que nós estamos fornecendo para a Alura e uma atenção,
// porque são informações bem críticas, ou seja, eu estou informando o número do meu cartão de crédito, estou 
// informando o meu CPF. Essas informações, na mão de uma pessoa que não seja confiável, pode te trazer um prejuízo 
// financeiro muito grande.

// [01:32] Então onde salvar essas informações? Onde eu persisto essas informações de forma segura? Hoje em dia, o 
// mais comum que tem no mercado são as bases de dados relacionais. Falando em banco de dados relacionais, nós temos
// muitos, nós temos o PostgreSQL, nós temos o SQL Server, que é da Microsoft, e nós temos o MySQL, que hoje eu me 
// arrisco a dizer que é o mais famoso entre os bancos de dados.

// [02:00] E vai ser ele que nós vamos utilizar para as próximas aulas, vamos utilizar ele como o nosso banco de 
// dados do nosso ambiente. Em "mysql.com/downloads/" - lembrando que o site é "mysql.com", nós vamos rolar a página 
// para baixo e vamos ter um link "MySQL Community (GLP) Downloads". É nele que nós vamos clicar. Eu vou baixar o 
// "MySQL Installer for Windows".

// [02:40] Para nós não termos problemas de compatibilidade, nós vamos utilizar a versão 8.0.18. Você, que está 
// chegando para fazer o curso, se tiver novas versões, mesmo assim, eu te peço encarecidamente para você manter na
// versão 8.0.18. Isso evita que, mais na frente, que nós vamos utilizar Querys mais avançadas, enfim, que não tenha
// nenhum problema, que todo mundo consiga fazer todos os comandos que nós vamos trabalhar nas aulas.

// [03:23] Então tem duas opções de download e nós vamos fazer o download da segunda opção, que é a 
// "mysql-installer-community-8.0.18.msi". Vocês podem instalar no seu diretório de preferência. Eu vou botar a 
// minha na pasta "Downloads". Na verdade, eu já fiz o download do instalador. E agora eu vou na pasta "Downloads" 
// e nós vamos de fato instalar o MySQL na nossa máquina.

// [03:57] O MySQL, ele está aqui. Clico duas vezes no arquivo e vamos instalar. Agora que todas as configurações 
// foram aplicadas, nós vamos finalizar a instalação do nosso MySQL. Muito bom, "configuração completa". Dou um 
// "Next" e "Finish". Agora, a intenção é testar o nosso banco de dados, é nós criarmos Database, criarmos tabelas. 
// E nós vamos fazer isso agora.

// [05:23] No momento da instalação, o MySQL nos provê um MySQL 8.0 Command Line Client no menu "Iniciar" do Windows. 
// É ele que nós vamos utilizar. Para ficar melhor a visualização para você, aluno, eu vou, clico com o botão direito 
// sobre a barra de título do prompt de comando, vou em "Propriedades", vou mudar a fonte para "Lucida Console", 
// vou botar o tamanho da fonte em "16".

// [05:45] Em "Layout", eu vou aumentar um pouco essa janela, vou botar 150x80, vamos ver se vai ficar bom. Ficou bom. 
// Agora a nossa senha padrão root. Estamos já interagindo com o MySQL. Ele bota as versões como eu informei para 
// vocês, 8.0.18 é a que nós vamos utilizar no curso. Mesmo que tenha mais nova, vamos manter essa versão.

// [06:23] A primeira coisa que nós vamos fazer é criar uma Database para nós. Então vou botar CREATE DATABASE e 
// o nosso curso vai ter uma loja virtual, então CREATE DATABASE loja_virtual;. Criei a nossa Database, ele retornou 
// um "Query ok", então Database criada com sucesso.

// [06:51] Eu vou colocar um USE loja_virtual; e agora nós mudamos para a nossa Database que acabamos de criar. A 
// nossa Database está criada. Agora eu quero que tenha uma tabela chamada produto, que vai ter um produto nessa 
// nossa loja virtual, e esse produto, eu quero que ele tenha um Id, um nome e uma descrição.

// [07:16] Então nós vamos fazer um CREATE TABLE PRODUTO, ele vai ter um Id, que vai ser o inteiro AUTO_INCREMENT, 
// ficando CREATE TABLE PRODUTO (id INT AUTO_INCREMENT,. Isso quer dizer que a cada nova inserção de um produto, 
// o Id, ele vai ser inserido dinamicamente, então o primeiro produto o Id vai ser 1, o segundo Id vai ser 2, e 
// assim sucessivamente.

// [07:44] O nome, ele é uma string, ele é alguns caracteres, então no nosso banco de dados, isso é um VARCHAR, e eu 
// quero um VARCHAR de 50 caracteres, e o nome também não vai poder ser nulo, ou seja, sempre vou ter que informar o 
// meu nome. Então a linha fica AUTO_INCREMENT, ficando CREATE TABLE PRODUTO (id INT AUTO_INCREMENT, nome VARCHAR(50)
// NOT NULL,.

// [08:04] descricao, descrição também vai ser um VARCHAR 255 - espera que ficou faltando o VARCHAR. E a nossa chave 
// primária, a nossa PRIMARY KEY vai ser o Id. Então AUTO_INCREMENT, ficando 
// CREATE TABLE PRODUTO (id INT AUTO_INCREMENT, nome VARCHAR(50) NOT NULL, descricao VARCHAR(255), PRIMARY KEY (id)).

// [08:34] E vou botar um Engine = InnoDB;, que significa que eu quero que seja aceita a transação, ficando 
// AUTO_INCREMENT, ficando CREATE TABLE PRODUTO (id INT AUTO_INCREMENT, nome VARCHAR(50) NOT NULL, descricao 
// VARCHAR(255), PRIMARY KEY (id)) Engine = InnoDB;. Ele deu um erro, deixa eu ver o que foi. Isso, não tinha 
// vírgula após PRIMARY KEY (id)).

// [08:53] Criamos a nossa tabela. Se eu fizer agora um SELECT * FROM PRODUTO;, nós vamos ver que ele vai retornar 
// para nós um Empty set, que significa que está vazio, que não tem nada, nós acabamos de criar essa tabela, de fato
// não teria produto.

// [09:18] Então vamos inserir um produto nessa tabela, que vai ter o nome, a descrição e os valores serão: quero um 
// notebook, um notebook Samsung. INSERT INTO PRODUTO (nome, descricao) VALUES ('NOTEBOOK', 'NOTEBOOK SAMSUNG');. Está
// errado aqui, descricao. O que eu? Na verdade, eu acho que eu errei - é verdade, eu escrevi errado na hora de criar 
// a tabela e agora ele está errado.

// [10:02] Mas isso aqui nós corrigimos, é só um só um nome mesmo, isso depois fazemos um ALTER TABLE, que nas 
// próximas aulas vamos conseguir ver isso melhor. Mas agora, se vocês forem reparar aqui, se eu fizer o mesmo 
// comando de antes, SELECT * FROM PRODUTO, nós temos já o nosso primeiro produto.

// [10:23] É importante, só mostrar para vocês aqui, com Id já inserido, ou seja, o nosso Id foi inserido sem 
// precisarmos controlar ele, sem precisar nós mesmos, manualmente, colocar o Id. Nós vimos agora que o nosso 
// banco de dados está funcionando, nós inserimos um produto na nossa tabela de produtos, na nossa Database que 
// foi criada.

// [10:51] Então, agora, o próximo passo é fazer com que uma aplicação em Java converse com o nosso banco de dados.
// Então, para a próxima aula, eu espero o ambiente de vocês configurado. E aqui também é importante mostrar para 
// vocês que eu vou utilizar o Eclipse Jee 2019-6, mas você pode utilizar qualquer outra versão, tem a June, tem 
// versões mais antigas no Eclipse, que não vai ter diferença no nosso curso se você estiver com ela.

// [11:42] O importante é você ter uma IDE - e pode ser outra também, não só Eclipse, para que nós possamos ter uma 
// facilidade na hora de escrever os nossos códigos. Uma outra coisa também, que é bom vocês verificarem, é a versão 
// do Java. No meu caso, eu estou na 11, mas nada impede de vocês utilizarem outras versões.

// [12:11] Acredito que da versão 6 para frente não vai ter nenhum problema de compatibilidade. Claro que quanto mais
// nova a versão, às vezes pode ter certas facilidades na hora de trabalhar com o código, mas acredito que nós não 
// vamos entrar nesse nível de código. Então da versão 6 em diante está tudo certo. Então é isso aluno, espero que 
// você tenha gostado e até o próximo vídeo.