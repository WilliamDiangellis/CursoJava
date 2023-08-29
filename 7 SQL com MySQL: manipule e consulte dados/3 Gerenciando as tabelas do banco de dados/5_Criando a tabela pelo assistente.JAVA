// Se a empresa suco de frutas possui uma tabela de clientes, consequentemente, precisa de uma tabela de produtos,
// afinal, os clientes devem comprar itens da empresa.

// Nessa tabela teremos as informações dos sucos de frutas, tais como: "código do produto", é um código interno
// para identificar o produto; "nome do produto", descritor do produto; "embalagem", pode ser lata, litro ou em 
// caixa; "tamanho" é o volume do suco, "sabor", visto que há várias marcas com o mesmo sabor e "preço de lista",
// é o preço tabelado do produto. Todos esses cinco campos serão VARCHAR, visto que o código pode ter letras e o 
// preço de lista, será do tipo FLOAT.

// Vamos criar essa tabela de produtos usando uma maneira mais visual, uma caixa de diálogo que o MySQL Workbench
// possui. Então, voltando para o Workbench, do lado esquerdo em sucos, clique em "Tables" com o botão direito do 
// mouse e escolha a opção "create table". Será exibida uma nova aba "new_table - Table" com uma série de propriedades
// que é possível usar na criação da tabela.

// Preenchendo essas propriedades, vamos em "Table name" e inserir o nome "tbProduto", não vamos incluir os 
// parâmetros mais detalhados, como charset/collation ou onde tem as letras "PK", "NN", entre outras, isso vamos
// ver mais adiante, talvez em um curso mais avançado.

// Para criar as colunas da tabela, selecione sob "Column name" e digite o nome e ao lado o "Datatype" (tipo do dado) 
// do campo. Começando por código do produto, que vamos chamar somente de "PRODUTO" e o tipo VARCHAR(20), observe que
// "PK" e "NN" foram selecionados automaticamente, vamos desmarcar no momento por ser propriedades que não são 
// necessarias ainda para configurar na tabela.

// Passando para o próximo campo, selecione a seta para baixo do lado direito na caixa de diálogo e digite "NOME" 
// que também será VARCHAR(150), para o campo seguinte, "EMBALAGEM" do tipo VARCHAR(150), "TAMANHO" que será
// VARCHAR(50), "SABOR" que é VARCHAR (50) e, por último, "PRECO_LISTA" que será FLOAT.

// Inserido todos os campos, clicamos agora em "Apply" do lado inferior direito e será exibida uma mensagem 
// informando sobre uma configuração padrão que o programa vai usar, selecione o botão "OK" para continuar.

// Será mostrada uma nova tela com o comando com algumas alterações como o nome do banco, ponto e nome da tabela
// CREATE TABLE `sucos`.`tbproduto, o que não tem problema visto que quando rodamos o script para criar a tabela 
// de clientes já haviamos selecionado a base sucos, por isso, ao inserir um campo ele estará se referindo a base 
// sucos. Mas, podemos criar esse script sem a necessidade de entrar no banco de dados que é inserindo o nome do 
// banco, ponto final e nome da tabela. Já as crases no nome da tabela e banco de dados é que, por ser um nome 
// genérico o programa acaba inserindo para garantir caso haja espaço entre os nomes.

// Percebe que ao final de cada campo está escrito "NULL", isso significa que esse campo aceita valores nulos ou 
// vazios, como não especificamos na caixa de diálogo o programa acaba inserindo automaticamente.

// Mas no momento vamos nos atentar somente aos comandos já vistos nesse curso. Então, criamos uma tabela 
// (CREATE TABLE), inserimos o nome da tabela (sucos.tbproduto), os campos e suas respectivas categorias separados
// por vírgula. Clique no botão "Apply" do lado inferior direito e, logo após, "Finish".

// Observando, no Workbench, do lado esquerdo a tabela "tbproduto" já foi incluída em sucos. Agora, temos no banco 
// de dados duas tabelas, a de clientes e produtos.