// [00:00] Olá, aluno. Tudo bom? Anteriormente eu deixei um desafio para vocês, para que vocês refatorassem
// o código com a melhor prática de tratamento de exceção, tratando na DAO, onde realmente a exceção, ela
// pode ocorrer. Também deixei o desafio para vocês implementarem a ProdutoController.

// [00:27] Agora nós vamos passar pelo meu código para vocês verem como eu fiz, para vocês verem se está de
// acordo com o de vocês e executar o projeto, agora com todas as funcionalidades ocorrendo com sucesso.
// Então primeiro vamos passar pela CategoriaDAO, eu fiz no listarComProduto() também com o try catch,
// relançando uma RuntimeExcepiton, que é uma exceção unchecked.

// [00:58] Se você está tendo alguma dúvida referente ao que eu estou falando aqui de checked e unchecked
// exception, eu recomendo fortemente fazer o nosso curso de Exceções, que ele é bem completo e vai te dar
// uma base muito boa para você saber como tratar da melhor maneira essas exceções.

// [01:17] Então, na listarComProduto() fizemos a mesma coisa que nós tínhamos feito no método listar().
// Na ProdutoDAO fizemos também um tratamento semelhante, com try e catch em cada um dos métodos, então
// salvar, salvarComCategoria, todos eles agora são tratados caso ocorra uma SQL Exception no momento de
// executar a operação, nós já fazemos o tratamento no local, onde é para ser feito.

// [01:46] No ProdutoController, nós fizemos basicamente aquele mesmo trabalho que nós tínhamos feito com
// CategoriaController, só que usando o ProdutoDAO. Então nós instanciamos o ProdutoDAO, passando uma
// Connection que nós tínhamos recuperado com recuperarConexao() e chamamos o método da DAO, o método
// correspondente de cada DAO na nossa Controller.

// [02:15] Então deletar() chama o .deletar(), salvar() chama o .salvar(), bem parecido com o que nós
// tínhamos feito no CategoriaController. Feito isso, é para o nosso projeto estar 100% funcional,
// agora nós vamos poder ver isso no TestaOperacaoComView, mandando executar o projeto e vamos dar uma
// navegada na nossa tela para ver se está tudo funcionando corretamente.

// [02:40] Subimos a nossa aplicação. Então agora nós já vemos que nós estamos listando os produtos da
// nossa base de dados. Vamos ver os comandos, se estão todos funcionais, então se eu mandar limpar aqui,
// ele tem que zerar as caixas de texto. Aparentemente ok. Vamos inserir um novo produto, vamos colocar o
// "Microfone", "Microfone para computador", a categoria dele vai ser um eletrônico.

// [03:08] Se eu mandar salvar, salvo com sucesso. O microfone está inserido na grid e, consequentemente,
// no nosso banco de dados. Agora o nosso "Celular com câmera" acabou no estoque, vamos editar para mostrar
// um "Celular sem câmera", para mostrar que é o que nós temos disponível. Mando alterar, fez a alteração,
// certo.

// [03:30] E o "Sofá" não é um item que eu vou vender mais na minha loja, eu quero excluir esse item para
// não mostrar mais para os clientes. Mando excluir e está aí: item excluído com sucesso. Apenas três
// produtos agora no nosso estoque. Bom, pessoal, então com isso nós terminamos o desenvolvimento da
// nossa tela, nós conseguimos entender como que funcionam essas camadas, tudo certo.

// [03:53] O porquê temos uma Controller, que é exatamente para tirar a responsabilidade que não é da view
// da view, nós passamos para essa Controller, então ela que vai abrir conexão, ela que vai comunicar com a
// DAO e ela só retorna para a view as informações necessárias para que a view mostre para a tela, que é
// o objetivo dela.

// [04:16] As nossas classes, elas tem que ter responsabilidade única, então a view só mostra informação,
// a Controller faz esse controle ali no meio, então pega a requisição, manda para a DAO correta. A DAO sim
// vai no nosso banco de dados, que ela é responsável por isso. Então nós vimos que o nosso projeto fica
// muito bem desenvolvido.

// [04:36] Então espero que vocês tenham gostado desse incremento, dessa nossa tela. Qualquer dúvida que
// vocês tiverem sobre alguma coisa que nós fizemos aqui na aula, mande no nosso fórum que nós estaremos
// à disposição para retirá-las. E, no mais, é isso. Vejo vocês no próximo vídeo. Valeu.
