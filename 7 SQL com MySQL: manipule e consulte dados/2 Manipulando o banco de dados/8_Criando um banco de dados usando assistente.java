// Outra maneira de criar o banco de dados é usando um assistente, mas apenas se estiver utilizando o Workbench.
// Visto que, possui funcionalidades que nos auxiliam a realizar tarefas sem a necessidade de digitar o comando SQL.

// No MySQL Workbench, em qualquer área do lado esquerdo em Schemas, selecione o botão direito e clique na opção 
// "create schema". Será exibida uma caixa de diálogo com o campo "name", que vamos alterar para SUCOS2 e o 
// "Charset/Collation", que na primeira caixa clicável escolheremos a opção utf8 e na seguinte uft8_general_ci. 
// Essas informações estão relacionadas aos caracteres especiais, caso precise conter eles no seu banco de dados.
// Em seguida, selecione o botão "Aply" do lado inferior esquerdo do Workbench.

// Será mostrado uma tela com o título Apply Changes to Object, informando que será criado o objeto e na próxima 
// página é exibido o comando CREATE SCHEMAsucos2DEFAULT CHARACTER SET utf8;. Para fins de curiosidade, se pegarmos 
// esse comando e colar na área do MySQL, será executado normalmente. Então, o que a caixa de diálogo exibida pelo 
// Workbench faz é agilizar a escrita do comando SQL.

// Perceba que o nome do nosso banco de dados sucos está entre crases, essa nomenclatura é mais usada em situações 
// para limitar o nome que há espaços entre as palavras, por exemplo, sucos 2, no caso não vamos precisar já que não
// temos espaços no nome do nosso database, mas podemos manter.

// Selecionando Apply novamente, executaremos o comando. Clique em "Finish" para fechar a janela de execução e 
// visualizarmos apenas a área MySQL, observe que no MySQL do lado esquerdo em Schemas, já consta o banco de dados.

// CREATE SCHEMA `sucos2` DEFAULT CHARACTER SET utf8;

// Note também, que o comando exibido para criar o banco de dados em uma das telas anteriores não aparece mais,
// é apenas no momento de execução mesmo. Na parte superior da área de digitação do código, o programa vai abrindo
// abas conforme executamos os comandos, sendo a primeira aba a Query 1 que foi o comando manual e direto de criação
// e a segunda sucos2 - Schema é a caixa de diálogo para criar o banco de dados sucos2.

// À medida que formos executando alguns comandos SQL, irei mostrar uns comandos visuais que auxiliam na memorização 
// da sintaxe. Nessa parte mais visual é possível enxergar o comando que o Workbench está gerando, copiar, colar
// e adaptar, se necessário.