// [00:00] Olá, aluno. Tudo bom? Agora que nós vimos o funcionamento da nossa tela interagindo com o nosso
// back-end e vimos que para o desenvolvimento da nossa aplicação ficar com as boas práticas necessárias,
// nós vimos que precisamos dividir o nosso projeto em camadas.

// [00:21] Agora chegou a hora de darmos o próximo passo, que é de fato ver como vai funcionar esse projeto
// e botar a mão na massa para conseguirmos desenvolver esse código da melhor maneira. O projeto que nós
// utilizamos até agora, que é o "loja-virtual-repository", nós não vamos utilizar nessas aulas, então vocês
// podem dar um close na IDE de vocês, porque nós vamos importar um novo projeto, que está disponível para
// download na plataforma.

// [00:50] No meu caso, ele já está importado, mas para você importarem quando vocês salvarem no diretório
// de preferência de vocês, vocês vão no menu "File > Import", selecione que você quer adicionar um novo
// projeto existente ao seu workspace, ele fica em "General > Existing Projects into Workspace".
// Clique em "Next".

// [01:10] Clique em "Browse..." para selecionar o diretório onde vocês salvaram o projeto de vocês. O meu
// está aqui, em "eclipse-workspace". Tenho o projeto "jdbc-aula-8-projeto-completo", seleciono agora a
// pasta "loja-virtual-view-repository" e seleciono essa pasta. No meu caso, eu não posso selecionar o
// projeto, porque ele já está importado.

// [01:36] O projeto de vocês estará selecionável, é só selecionar e clicar no botão "Finish" e vocês vão
// ver essa estrutura de projeto. Então aqui nós começamos a ver alguma diferença em relação ao nosso outro
// projeto. Primeiro que já não temos mais aquele tanto de main, que usamos ao longo do curso para ir
// testando as operações com o banco de dados, nós temos só o TestaOperacaoComView, que é exatamente o main
// que vai chamar a nossa tela.

// [02:00] E aqui nós já vamos ver. Nós temos a nossa Controller, que é o controlador, que recebe a
// requisição da tela, encaminha para a DAO correta. Quando a DAO processa a informação, ela devolve para
// a Controller, que devolve para a view. Então é esse desenvolvimento em camadas, essa chamada em camadas
// que nós vimos no desenho e que fica bem representado pelos pacotes.

// [02:25] As DAOs, nós já tínhamos, então não é nada novo, nós só vamos passar por elas rápido aqui, porque
// nós vamos ver que agora, por exemplo, em ProdutoDAO, eu coloquei no nosso projeto novos métodos para a
// nossa tela ficar com todas as operações, pelo menos as operações básicas, que são o select, o insert,
// o update e o delete.

// [02:52] Então eu tenho agora um método salvar, eu tenho o salvarComCategoria, porque quando nós
// salvávamos, ele não estava salvando o ID da categoria na tabela de produto. Como agora, quando formos
// inserir através da nossa tela, vai ter aquela ComboBox de categorias, então agora eu tenho um novo método
// aqui, que é o que vamos chamar da tela, que vai inserir também o *ID da categoria.

// [03:20] Então vai ficar mais conciso, vai ficar mais real o nosso exemplo. E temos o método de listar, de
// buscar, que nós já tínhamos também, o de deletar, alterar, tudo isso nós já tínhamos feito, só que agora
// eu coloquei tudo na nossa DAO. A CategoriaDAO não teve mudança, nós não vamos usar os métodos de
// categoria, vamos utilizar só o listar, que retorna todas as categorias para montarmos a nossa lista de
// categorias.

// [03:49] Então a DAO, a única coisa que ela teve de diferente foi isso. A nossa ConnectionFactory continua
// aqui, porque nós vamos precisar ainda pegar uma conexão para interagir com o banco de dados. Nossas
// classes de modelo também continuam aqui, nós vimos que elas são essenciais nessa estrutura de view,
// Controller e DAO, porque são os objetos que são trafegados entre as camadas, são essas nossas classes de
// modelo.

// [04:16] Chegamos enfim à nossa view. Eu vou passar com vocês, para vocês entenderem mais ou menos o que
// foi feito aqui na tela. Só que eu quero chamar a atenção para um detalhe aqui: nós utilizamos o Swing
// para criar essa nossa tela. O Swing, ele é um recurso do próprio Java, mas ele é para desenvolvimento em
// desktop, ou seja, para aquelas telas que nós vamos subir na nossa própria máquina.

// [04:44] Hoje em dia não é mais tão utilizado, dificilmente vocês vão ver projetos que estão iniciando
// agora começando como um projeto desktop. Mas vamos ver projetos web, nós vamos ver projetos mobile, só
// que essas outras tecnologias, elas exigem recursos a mais. Então, por exemplo, se fossemos pensar no
// desenvolvimento web, nós vamos pensar em HTML, CSS, JavaScript.

// [05:14] Nós podemos pensar, hoje, em aplicações front-end desacopladas do back-end. Então nós temos
// outro conhecimento que nós precisamos ter para desenvolver na web. Dessa forma, com o Swing, é
// interessante porque tudo o que aprendermos aqui, sobre a requisição para uma view, passando pelas
// camadas, nós vamos utilizar no desenvolvimento web e no desenvolvimento mobile.

// [05:42] Inclusive nós temos outras formações que vocês podem fazer, quem quer ser especialista em
// desenvolvimento mobile, nós vamos ter as próximas formações, que vamos aproveitar esse conhecimento aqui
// e vamos aprofundar ainda mais o conhecimento para desenvolver na web.

// [06:00] Então foi basicamente essa a nossa ideia aqui, trazer um pouco já desse conhecimento para vocês,
// mas indico para a próxima formação para ter um conhecimento 100% de como funciona todo esse mundo da web.
// Voltando para o nosso exemplo, então eu tenho o ProdutoCategoriaFrame, que vai ser aquela nossa tela.

// [06:19] O Swing, ele vai usar objetos Java para representar os objetos da nossa tela, então pode ver que
// eu tenho um JLabel, JTextField. Então Label é o nome que fica em cima da caixa de texto, que no nosso
// caso é o nome do produto, a descrição do produto. O JTextField é exatamente onde escrevemos qual é o nome
// do produto, qual é a descrição do produto.

// [06:41] Nisso nós vamos ter uma classe, um recurso do Java para cada recurso da tela: JComboBox, o
// JButton, o JTable. E como funciona? Dentro do construtor da nossa ProdutoCategoriaFrame que nós vamos
// configurar toda a tela. Então, por exemplo, esse super("Produtos"); é o que vai ficar na barra superior
// quando subirmos a nossa aplicação.

// [07:04] Então nós vamos ver que vai ter Produtos na parte de cima da tela, isso é só um detalhe. E todas
// as configurações, eu instancio as minhas Controllers, eu tenho até um atributo private ProdutoController
// produtoController;, que nós vamos utilizar lá embaixo, vocês já vão ver os nossos métodos.

// [07:22] Temos labelNome, então o nome do produto. Aqui eu estou configurando as minhas Labels, a posição
// das minhas Labels, qual vai ser a cor da minha Label. E aqui eu adiciono na minha tela, que é o meu
// container. Então a partir desse ponto eu tenho isso inserido na minha tela. Isso vai servir para todos os
// recursos, então eu tenho textoNome, textoDescricao.

// [07:45] A única coisa que eu tenho, no comboCategoria, como ele é um ComboBox e ele lista as minhas
// categorias, eu tenho que fazer um forEach nesse método listarCategoria, que está chamando a nossa
// Controller e que vai nos retornar todas as categorias e vai adicionar na ComboCategoria.

// [08:05] Quando eu selecionar a categoria, ele, de alguma forma, que nós vamos ver ainda, vai pegar o ID
// desse item e vai salvar o produto na minha tela com o ID da categoria que eu selecionei. De resto aqui, a
// mesma coisa, só configuração da Label, do botão, o tamanho do botão, a posição, enfim. Então no nosso
// construtor nós fazemos isso, além de configurar os ActionListener dos botões.

// [08:32] Então, quando eu clico no botaoSalvar, ele vai chamar um método salvar();, vai limparTabela(); e
// vai preencherTabela();, porque agora eu consigo mostrar esse novo recurso salvo no nosso banco de dados.
// A mesma coisa ele vai fazer, por exemplo, no deletar();, ele deleta, ele limparTabela(); e ele
// preencherTabela();. Nós já vamos ver esse comportamento com detalhes.

// [08:52] E o botaoEditar, o botaoLimpar, que apenas limpa os nosso Text fields. Aqui nós temos as nossas
// regras de front-end, de view. Ou seja, as regras da nossa tela. Como são essas regras? Por exemplo, eu
// faço validações na hora de salvar, por exemplo. Primeiro eu preciso verificar, na hora de salvar, se o
// meu nome e descrição, os meus Text fields, eles estão diferentes de vazio.

// [09:23] Se estiverem, eu pego o produto, pego a categoria, pego todas as informações, chamo a minha
// controller e salvo. E faço um alerta, falando que que o produto foi salvo com sucesso. Se isso não for
// verdade, se os campos estiverem vazios, eu dou um JOptionPane, que é o recurso para fazer um alerta na
// nossa tela, falando que o nome e a descrição devem ser informados.

// [09:48] Então aqui são as nossas regras de view, por isso que eu não quis misturar e chamar as nossas DAO
// diretamente daqui, porque senão teríamos que passar conexão a partir da nossa view para a nossa DAO, e
// não faz muito sentido. Por isso o desenvolvimento em camadas, eu passo essa responsabilidade para a minha
// Controller, aqui são só as regras de view.

// [10:09] Por enquanto, como nós fazemos na TestaOperaçãoComView? Eu tenho um main, que vai chamar a nossa
// classe para mostrar a tela. Por enquanto, se eu mandar executar esse código, nós vamos ver que está
// diferente daquele da nossa primeira aula, que eu mostrei o funcionamento já interagindo com o banco de dados.

// [10:31] Nós vamos ver que, por enquanto, ele está mostrando que o produto é null, produto de teste,
// porque realmente eu ainda não estou conversando com o banco de dados. Então aqui eu só estou simulando.
// Se eu botar aqui um "aa" em nome do produto e em descrição do produto, e mando salvar, ele me dá uma
// mensagem de salvo com sucesso, mas nós vamos ver que ele só mostra no console, não vai para o banco de dados.

// [10:59] O nosso objetivo agora é qual? É exatamente isso: chegar no CategoraController e no
// ProdutoController e desenvolver as regras que vão fazer com que consigamos fazer essa interação com o
// banco de dados. Mas nessa aula já falamos muito, nós já fizemos um Overview de todo o projeto, de como
// ele está por enquanto. Esse desenvolvimento vai ficar para o próximo vídeo. Eu vou ficando por aqui. Até
// lá. Valeu.
