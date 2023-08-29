// [00:00] Olá, aluno. Tudo bom? Anteriormente nós vimos como resolver um problema que pode agravar bastante
// o nosso banco de dados, que é a questão das queries N+1. Query N+1 é quando temos uma query base e a
// partir dessa base, nós temos que ir N vezes no banco de dados para recuperar algo com essa query base.
// No nosso caso, é a Categoria.

// [00:28] Nós recuperamos as categorias do banco, e a cada categoria, nós tínhamos que ir no banco de novo
// para recuperar os produtos de determinada categoria. Nós vimos que isso, dependendo do fluxo que tivermos, de requisições e a quantidade de produtos que nós tivermos na base, pode ser bem prejudicial ao banco.

// [00:47] Então nós resolvemos essa questão criando uma CategoriaDAO, um método listarComProduto(), onde
// fazemos o Inner join e agora só precisamos ir no banco uma vez e ele já traz as categorias com os produtos.
// Chegando nesse ponto, já passamos por vários recursos do JDBC.

// [01:05] Então nós vimos com criar o nosso Datasource, nós vimos como podemos fazer as operações com o
// banco de dados a partir da nossa aplicação, então fazendo select, insert, update, então tivemos bastante
// conteúdo ao longo do curso. Só que, geralmente, a nossa aplicação, ela vai ser acessada, essas operações,
// elas vão ser feitas a partir de algum lugar, uma view.

// [01:31] O nosso usuário, ele vai entrar em algum lugar, vai ter uma tela onde ele vai poder cadastrar o
// produto, onde ele vai poder listar o produto. Dificilmente você vai ver usuários - dificilmente não, acho
// que nem existe o usuário entrando no código e mandando executar igual nós costumávamos fazer no nosso main.

// [01:53] Então, por exemplo, a TestaListagem, nós chegávamos, mandávamos executar e ele retornava os
// nossos produtos na base de dados. Não faz sentido isso quando estamos pensando para o usuário. Então a
// ideia agora é que tenhamos um local onde o usuário, ele pode fazer as requisições de inserção, de
// alteração, e no banco de dados, no nosso back-end, que é a nossa aplicação, recupera essas informações e
// conversa com o banco de dados.

// [02:21] Algo semelhante a "Run As > Java Application". Então vocês podem não estar entendendo agora, pois
// estamos em um método main, selecionando e mandando executar, e agora aparece uma tela? Mas a motivação
// dessa nossa aula vai ser exatamente chegarmos nesse objetivo, que é criar a nossa própria tela. Então,
// como seria?

// [02:45] Eu tenho a tela de Produtos, onde posso, se eu errar os produtos, eu posso mandar limpar. Se eu
// quiser inserir um produto, por exemplo, "Microfone", "Microfone para computador", eu seleciono a
// categoria, então já estão bem mais interativas as minhas categorias. Então categoria eletrônicos, mando
// salvar.

// [03:08] Está vendo? Tudo agora está interativo. O nosso usuário, agora, ele tem uma view aqui, ele tem
// uma tela para ele poder interagir, tudo auto explicativo, então onde ele bota o nome do produto, onde
// ele bota a descrição do produto. Se eu quiser editar um produto, esse celular, no estoque o celular sem
// câmera acabou, então eu só vou precisar trocar para colocar "Celular com câmera".

// [03:31] Clico no botão "Alterar" e tudo isso é alterado no banco de dados. Podemos ver o resultado
// fazendo um select. Se eu vier no MySQL 8.0 Command Line Client e fizer um SELECT * FROM PRODUTO, nós
// vamos ver o microfone que acabou de ser inserido, já está constando no nosso banco de dados.

// [03:49] Essa aplicação, o que ela está fazendo por trás é transparente para o usuário, ele não tem que
// ter ciência disso. Nós que temos que, se tiver algum problema, mexer no nosso back-end, mas o usuário só
// interage com essa tela, dando os comandos que ele quer fazer. A ideia não é começarmos o desenvolvimento
// dessa tela agora, é só entendermos onde queremos chegar.

// [04:10] Nas próximas aulas, vamos fazer o passo a passo de como chegar nessa tela, fazendo todas as
// iterações com o banco de dados. Faltou mostrar para vocês, nessa tela, eu também consigo excluir um
// produto com o botão "Excluir". O item foi excluído com sucesso. Se formos no MySQL 8.0 Command Line
// Client, na base de dados, agora só vamos ter três produtos.

// [04:31] Então você vê que realmente a nossa tela está fazendo requisição para o nosso back-end, que por
// sua vez conversa com o banco de dados. Demos a introdução de qual é o nosso objetivo, agora vamos para
// o próximo vídeo, que vamos entender como chegamos a essa tela. Não deixem de assistir o próximo vídeo.
// Valeu.
