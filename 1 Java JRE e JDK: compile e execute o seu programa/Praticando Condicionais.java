// 01
// Testes com IF

// Transcrição
// Passaremos pelo nosso primeiro controle de fluxo, e testaremos a condicional
// if! Para isso, criaremos uma
// classe denominada "TestaCondicional", com uma variável inteira idade,
// inicializada na mesma linha:

// public class TestaCondicional {

// public static void main(String[] args) {
// System.out.println("testando condicionais");
// int idade = 20;
// if (idade >= 18) {
// System.out.println("você tem mais de 18 anos");
// System.out.println("seja bem vindo");
// }
// }
// }

// Dica: pode-se usar "Ctrl + barra de espaço" após digitarmos "sysout" e
// apertarmos "Enter" para
// autocompletar o System.out.println(); também!

// Feito isso, salvaremos, e com o lado direito do mouse acessaremos "Run As >
// Java Application".
// Obteremos o seguinte:

// testando condicionais
// você tem mais de 18 anos
// seja bem vindo
// Entre if e os parênteses que vêm a seguir, não é obrigatório ter espaço,
// mesmo que geralmente se use.
// No Java, o espaço, as teclas "TAB" e "Enter" não possuem papel fundamental.
// No Eclipse, ao acessarmos
// "Source > Format", o código é formatado de maneira correta.

// Até aqui, nenhuma grande novidade. Neste caso, há duas instruções no bloco do
// if... Existe algo
// proveniente do C no Java, em que as chaves não são necessárias, quando se
// quer apenas uma instrução
// na condicional. Isto é, se a linha referente ao texto "seja bem vindo" não
// existisse, poderíamos
// remover as chaves, deixando assim:

// public class TestaCondicional {

// public static void main(String[] args) {
// System.out.println("testando condicionais");
// int idade = 20;
// if (idade >= 18)
// System.out.println("você tem mais de 18 anos");
// // System.out.println("seja bem vindo");

// }
// }

// O System.out.println(); que não está comentado (não está com as duas barras
// antes) faz parte do caso
// em que o if é true, verdadeiro. Quando temos um if ou um else sem o uso das
// chaves, não é possível ter
// duas instruções, e sim apenas uma. Por isso, a boa prática implica em usarmos
// as chaves independentemente
// da quantidade de instruções existentes.

// Isso facilita enxergarmos quem faz parte do quê, deixando menos margem para
// dúvidas e erros, mas isso
// vai da preferência de quem programa.

// Para o else, alteraremos idade para que se receba 16, e digitaremos:

// public class TestaCondicional {

// public static void main(String[] args) {
// System.out.println("testando condicionais");
// int idade = 16;
// if (idade >= 18) {
// System.out.println("você tem mais de 18 anos");
// System.out.println("seja bem vindo");
// } else {
// System.out.println("infelizmente você não pode entrar");
// }
// }
// }

// Com isso, veremos a impressão de infelizmente você não pode entrar no
// Console. Para o caso da pessoa
// estar acompanhada, ela poder entrar, então acrescentaremos int
// quantidadePessoas = 3;, e um if após else.
// Em seguida, incluiremos outro else para o caso da pessoa ter menos de 18 e
// estar desacompanhada:

// public static void main(String[] args) {
// System.out.println("testando condicionais");
// int idade = 16;
// int quantidadePessoas = 3;

// if (idade >= 18) {
// System.out.println("você tem mais de 18 anos");
// System.out.println("seja bem vindo");
// } else {
// if(quantidadePessoas >= 2) {
// System.out.println("você não tem 18, mas " + "pode entrar, pois está
// acompanhado");
// } else {
// System.out.println("infelizmente você não pode entrar");
// }
// }
// }

// Quando o código começa a se estender demais pela tela, dificultando a
// visualização integral, pode-se
// apertar "Enter", o que, no Eclipse, faz com que as strings sejam separadas
// por aspas e + automaticamente.

// Salvando e rodando o código, obteremos:

// você não tem 18, mas pode entrar, pois está acompanhado

// Outra dica: com duplo clique em qualquer uma das views, ela é maximizada.
// Fazemos o mesmo para minimizá-la.
// Isto pode facilitar nosso trabalho!

// ---------------------------------------------------------------------------------------------
// 02
// Trabalhando com if

// João está criando uma aplicação para calcular o IR a partir do salário. Ele
// olhou na tabela de IRPF e
// implementou as regras para 15% e 22.5%:

// public class TesteIR {

// public static void main(String[] args) {

// double salario = 3300.0;

// if(salario < 2600.0)
// System.out.println("A sua aliquota é de 15%");
// System.out.println("Você pode deduzir até R$ 350");

// if(salario < 3750.0)
// System.out.println("A sua aliquota é de 22,5%");
// System.out.println("Você pode deduzir até R$ 636");
// }
// }

// Porém o programa tem um comportamento estranho. Ao compilar e rodar, é
// impresso:

// Você pode deduzir até R$ 350
// A sua aliquota é de 22,5%
// Você pode deduzir até R$ 636COPIAR CÓDIGO
// Repare que o programa indica que podemos deduzir R$350 E R$636! Como corrigir
// o problema?

// A)
// Devemos usar <= em cada if, por exemplo:

// if(salario <= 3750.0)

// Errado, isso não mudaria a saída do programa.

// B)
// O problema é que faltam as chaves na condicional. Sem as chaves, o if apenas
// executará a primeira
// instrução depois dele.

// Correto, devemos usar as chaves (sempre boa prática):

// if(salario < 2600.0) {
// System.out.println("A sua aliquota é de 15%");
// System.out.println("Você pode deduzir R$ 350");
// }

// if(salario < 3750.0) {
// System.out.println("A sua aliquota é de 22,5%");
// System.out.println("Você pode deduzir R$ 636");
// }

// C)
// Não podemos usar uma variável do tipo double na condicional, sempre deve ser
// um int.

// Errado, double pode ser usado sem problema.

// ---------------------------------------------------------------------------------------------

// 03
// Mão na massa: A condicional if

// Chegou a hora de praticarmos nossa condicional if:

// 1) Crie uma classe e monte seu método main (utilize o atalho Ctrl + Espaço).
// Nessa aula escolhemos o nome "TestaCondicional".

// 2) Escreva "Sysout" e utilize o atalho "Ctrl + Espaço", veja que o Eclipse
// escreverá
// o System.out.println(x); automaticamente. No momento, nosso código é:

// public class TestaCondicional{

// public static void main(String[] args){
// System.out.println("testando condicionais");

// }

// }

// 3) Crie a variável idade, do tipo inteiro e inicialize com o valor 20:

// public class TestaCondicional{

// public static void main(String[] args){
// System.out.println("testando condicionais");

// int idade = 20;
// }
// }

// 4) Escreva um código que teste se a variável idade é maior ou igual a 18,
// caso verdadeiro,
// exibiremos uma mensagem, caso falso (else), exibiremos uma outra mensagem.
// Nosso código deve ficar
// com essa cara:

// public class TestaCondicional {

// public static void main(String[] args) {
// System.out.println("testando condicionais");

// int idade = 20;

// if (idade >= 18) {
// System.out.println("Você tem mais que 18 anos");
// System.out.println("Seja bem vindo");
// } else {
// System.out.println("Infelizmente voce nao pode entrar");
// }
// }
// }

// 5) Crie uma variável quantidadePessoas com o valor 3.

// 6) Adicione mais um if após o else no nosso código para testar se essa pessoa
// está acompanhada ou não,
// ficando assim:

// public class TestaCondicional {

// public static void main(String[] args) {
// System.out.println("testando condicionais");

// int idade = 20;
// int quantidadePessoas = 3;

// if (idade >= 18) {

// System.out.println("Você tem mais que 18 anos");
// System.out.println("Seja bem vindo");
// } else {
// if (quantidadePessoas >= 2) {
// System.out.println("voce nao tem 18, mas pode entrar, pois está
// acompanhado");
// } else {

// System.out.println("infelizmente voce nao pode entrar");
// }
// }
// }
// }

// Caso queira, quebre a linha do System.out.println() por questão de
// legibilidade, deixando-a dessa forma:

// System.out.println("voce nao tem 18, mas pode entrar, "
// + "pois está acompanhado");

// Tudo bem até agora? Sim? Então vamos lá!

// ---------------------------------------------------------------------------------------------
// 04
// Boolean condicionais

// Vamos explorar um pouco mais o funcionamento do if, para o qual criaremos
// mais uma classe. É
// recomendado criá-las para termos um histórico do que está sendo montado,
// passo a passo. Em
// TestaCondicional2, teremos o código mais ou menos parecido com o que
// estávamos vendo até então:

// public class TestaCondicional2 {
// public static void main(String[] args) {
// System.out.println("testando condicionais");
// int idade = 16;
// int quantidadePessoas = 3;

// if (idade >= 18) {
// System.out.println("você tem mais de 18 anos");
// System.out.println("seja bem vindo");
// } else {
// if(quantidadePessoas >= 2) {
// System.out.println("você não tem 18, mas " + "pode entrar, pois está
// acompanhado");
// } else {
// System.out.println("infelizmente você não pode entrar");
// }
// }
// }
// }

// Porém, não é muito legal quando o código tem muitos ifs e elses encadeados,
// algo academicamente
// denominado complexidade ciclomática ou complexidade condicional. Neste nosso
// exemplo, poderíamos
// juntar os casos em que a pessoa tem mais de 18 anos e está acompanhada em uma
// condicional única.

// Para isso, utilizaremos o operador ou, || - no Java, não existe or ou and
// como palavras chave.

// public class TestaCondicional2 {
// public static void main(String[] args) {
// System.out.println("testando condicionais");
// int idade = 16;
// int quantidadePessoas = 3;

// if (idade >= 18 || quantidadePessoas >= 2) {
// System.out.println("seja bem vindo");
// } else {
// System.out.println("infelizmente você não pode entrar");
// }
// }
// }

// Vamos salvar e rodar o código para ver o que acontece? Será impresso no
// Console:

// testando condicionais
// seja bem vindo

// Para este operador, basta apenas uma das condições ser true. Há também o e*,
// ou *&&, para quando
// houver necessidade de se ter mais de 18 anos e estar acompanhado, por
// exemplo. Isto é, se mantivermos
// idade como 16 e quantidadePessoas = 1;, obteremos infelizmente você não pode
// entrar.

// Aprendemos sobre tipos de variáveis como o int e o double, para inteiros e
// pontos flutuantes,
// respectivamente, o char para quando se usa apenas um caractere, entre outros.
// Além deles, existe o
// boolean, palavra chave do Java que é um tipo de variável que só aceita true
// (verdadeiro) ou false (falso),
// e fazem parte das palavras reservadas do Java.

// public class TestaCondicional2 {
// public static void main(String[] args) {
// System.out.println("testando condicionais");
// int idade = 16;
// boolean acompanhado = true;

// if (idade >= 18 && acompanhado) {
// System.out.println("seja bem vindo");
// } else {
// System.out.println("infelizmente você não pode entrar");
// }
// }
// }

// No Java, = atribui, enquanto == compara. Em boolean, no caso de acompanhado
// == true, o próprio
// acompanhado já é um valor booleano, portanto, == true não é necessário.

// O que também aparece com certa frequência é, à direita do boolean, colocarmos
// uma expressão booleana
// como idade >= 18 && acompanhado. Sendo assim, poderíamos usar simplesmente
// boolean
// acompanhado = quantidadePessoas >= 2;, o que fará com que se conclua se a
// pessoa está acompanhada ou não.
// Com a idade sendo 20, se rodarmos o código, obteremos seja bem vindo.

// Também é possível imprimirmos "valor de acompanhado" e concatená-lo com
// acompanhado, deixando o
// código final assim:

// public class TestaCondicional2 {
// public static void main(String[] args) {
// System.out.println("testando condicionais");
// int idade = 20;
// int quantidadePessoas = 3;
// boolean acompanhado = quantidadePessoas >= 2;

// System.out.println("valor de acompanhado = " + acompanhado);

// if (idade >= 18 && acompanhado) {
// System.out.println("seja bem vindo");
// } else {
// System.out.println("infelizmente você não pode entrar");
// }
// }
// }

// Salvaremos e rodaremos mais uma vez, e imprimiremos o seguinte:

// testando condicionais
// valor de acompanhado = true
// seja bem vindo

// ---------------------------------------------------------------------------------------------
// 05
// Tipo boolean

// Veja o código abaixo:

// int idade = 68;
// boolean ehIdoso = idade >= 65;

// Executando esse código corretamente dentro de um método main, qual será o
// valor da variável ehIdoso?

// *Obs: Se tiver com dúvida, faça o teste e imprima a variável:
// System.out.println(ehIdoso); *

// A)
// True
// Errado, não existe esse valor.

// B)
// true
// Correto, o valor será true.

// C)
// False
// Errado, não existe esse valor.

// D)
// false
// Errado, o valor da variável será true.

// ---------------------------------------------------------------------------------------------
// 06

// Abaixo há afirmações referentes às operações lógicas na linguagem Java. Quais
// delas são verdadeiras?

// A)
// O operador lógico AND é representado pela palavra chave and e o OR pela
// palavra chave or.
// Errado, AND é representado pelo && e OR pelo ||.

// B)
// O operador lógico AND é representado pelos caracteres && e o OR pelo ||.
// Correto! AND é representado pelo && e OR pelo ||.

// C)
// Os operadores lógicos devem ter no lado esquerdo e direito uma expressão
// booleana.
// Correto, por exemplo:

// if (idade > 18 && idade < 65) {

// }

// Repare que temos duas expressões booleanas, na esquerda e na direita do
// operador lógico &&.

// ---------------------------------------------------------------------------------------------
// 07
// Mão na massa: Um pouco mais de if

// Vamos continuar nossa prática com condicionais, para isso siga os passos
// abaixo:

// 1) Crie uma nova classe, pegue código que está montado na classe anterior e
// cole. Escolhemos o nome
// "TestaCondicional2"

// 2) Modifique seu código utilizando || e delete o segundo if, deixando assim:

// public class TestaCondicional2 {

// public static void main(String[] args){
// System.out.println("testando condicionais");

// int idade = 16;
// int quantidadePessoas = 3;

// if (idade >=18 || quantidadePessoas >=2){
// System.out.println("Seja bem vindo");
// } else {
// System.out.println("infelizmente voce nao pode entrar");
// }

// }
// }

// 3) Modifique seu código trocando o || por &&. Dessa forma, o comando dentro
// do if só ocorrerá caso a
// idade seja maior ou igual a 18 e quantidadePessoas maior ou igual a 2.

// 4) Crie a variável acompanhado do tipo boolean atribuindo valor true

// boolean acompanhado = true;COPIAR CÓDIGO
// 5) Utilize essa variável no if, lembre-se que no Java, quando usamos =,
// estamos atribuindo, quando
// usamos == estamos comparando.

// 6) Quando usamos um booleano, não precisamos comparar seu valor no if, basta
// deixar nosso código assim:

// public class TestaCondicional2 {

// public static void main(String[] args){
// System.out.println("testando condicionais");

// int idade = 16;
// boolean acompanhado = true;

// if (idade >=18 && acompanhado){

// System.out.println("Seja bem vindo");
// } else {
// System.out.println("infelizmente voce nao pode entrar");
// }

// }
// }

// 7) Condicione o valor da variável booleana acompanhado, para isso faremos:

// public class TestaCondicional2 {

// public static void main(String[] args){
// System.out.println("testando condicionais");

// int idade = 16;
// int quantidadePessoas = 3;
// boolean acompanhado = quantidadePessoas >= 2;

// if (idade >=18 && acompanhado){

// System.out.println("Seja bem vindo");
// } else {
// System.out.println("infelizmente voce nao pode entrar");
// }

// }
// }

// ---------------------------------------------------------------------------------------------
// 08
// Escopo e inicialização de variáveis

// Seguindo com as condicionais, veremos os escopos de variáveis. Já sabemos que
// o boolean acompanhado passa
// a valer ao declararmos as variáveis. Se tentássemos usá-la antes, logo após
// idade, ocorreria erro de
// compilação, pois a declaração ainda não foi feita.

// Vamos criar a classe TestaEscopo, em que colaremos o código de
// TestaCondicional2 pois trabalharemos em
// cima dele. Comentaremos a linha com o boolean para entendermos melhor o if,
// não esquecendo da declaração
// da variável acompanhado antes.

// Uma variável, a partir de sua declaração, passa a valer entre as chaves
// correspondentes, o que se denomina
// escopo. Sendo assim, tanto acompanhado = true quanto acompanhado = false são
// necessários, pois fazem parte
// de escopos diferentes, com a inicialização sendo feita antes, em boolean
// acompanhado;, como se vê abaixo:

// public class TestaEscopo {
// public static void main(String[] args) {
// System.out.println("testando condicionais");

// int idade = 20;
// int quantidadePessoas = 3;

// // boolean acompanhado = quantidadePessoas >= 2;

// boolean acompanhado;

// if (quantidadePessoas >= 2) {
// acompanhado = true;
// } else {
// acompanhado = false;
// }

// System.out.println("valor de acompanhado = " + acompanhado);

// if (idade >= 18 && acompanhado) {
// System.out.println("seja bem vindo");
// } else {
// System.out.println("infelizmente você não pode entrar");
// }
// }
// }

// Qual o valor default de um boolean?

// No Java, essas variáveis do tipo local, como as que estamos vendo aqui,
// dentro de main, são temporárias
// e não possuem valor padrão, sendo necessária sua inicialização antes de sua
// impressão, acesso, em uma
// operação, e assim por diante.

// O Eclipse "percorre" o caminho de seus ifs e da árvore de possibilidades, e
// identifica a existência
// de uma situação em que determinada variável pode ou não ter sido
// inicializada.

// ---------------------------------------------------------------------------------------------
// 09
// Declaração da variável

// Dessa vez, João fez uma implementação para calcular o salário de um
// funcionário em caso de promoção.
// Ele fez a seguinte implementação:

// public class TesteSalario {

// public static void main(String[] args) {

// boolean foiPromovido = true;

// if(foiPromovido) {
// double salario = 4200.0;
// } else {
// double salario = 3800.0;
// }

// System.out.println(salario);
// }
// }

// Qual será o resultado da compilação/execução? .

// A)
// O código nem compila, pois fora do bloco if/else a variável salario não
// existe mais.
// Correto, a variável salario só é visível dentro do bloco if/else.

// B)
// O código nem compila pois declaramos a variável salario duas vezes.
// Errado, a declaração das variáveis não é o problema pois cada uma foi
// declarada em seu bloco (seu escopo).

// C)
// O código compila mas apresenta um erro de execução, pois a variável salario
// não foi inicializada.
// Errado, o código nem compila.

// ---------------------------------------------------------------------------------------------
// 10
// Mão na massa: Escopo de variáveis

// Prosseguindo, vamos agora dar uma olhada nos escopos.

// 1) Crie uma classe e estruture seu método main, no curso demos o nome de
// "TestaEscopo"

// 2) Quebre a sua declaração da variável booleana, usando um if, deixando o
// código assim:

// public class TestaEscopo {

// public static void main(String[] args){
// System.out.println("testando condicionais");

// int idade = 20;
// int quantidadePessoas = 3;
// //boolean acompanhado = true;

// if (quantidadePessoas >= 2) {
// boolean acompanhado = true;
// }else {
// boolean acompanhado = false;
// }

// if (idade >=18 || acompanhado){

// System.out.println("Seja bem vindo");
// } else {
// System.out.println("infelizmente voce nao pode entrar");
// }

// }
// }

// Repare que nosso código deixa de compilar, já que nossa variável é criada
// dentro do if, quando
// chegamos ao final do if, ela deixa de existir.

// 3) Modifique seu código para que ele compile, nosso código deve ficar assim:

// public class TestaEscopo {

// public static void main(String[] args){
// System.out.println("testando condicionais");

// int idade = 20;
// int quantidadePessoas = 3;
// boolean acompanhado;

// if (quantidadePessoas >= 2) {
// acompanhado = true;
// }else {
// acompanhado = false;
// }

// if (idade >=18 || acompanhado){

// System.out.println("Seja bem vindo");
// } else {
// System.out.println("infelizmente voce nao pode entrar");
// }

// }
// }

// ---------------------------------------------------------------------------------------------
// 11
// Opcional: Alíquota com ifs

// O João gostaria de criar um programa sobre Imposto de Renda (IR) e verificou
// as regras de alíquota.
// Ele descobriu no site da receita:

// De 1900.0 até 2800.0, o IR é de 7.5% e pode deduzir na declaração o valor de
// R$ 142
// De 2800.01 até 3751.0, o IR é de 15% e pode deduzir R$ 350
// De 3751.01 até 4664.00, o IR é de 22.5% e pode deduzir R$ 636
// Para começar, o João escreveu o seguinte esboço de classe:

// package sintaxe_variaveis_e_fluxo;

// public class TestaIR {
// public static void main(String[] args) {

// double salario = 1900.0;

// if (salario >= 1900.0 && salario <= 2800.0) {
// System.out.println("o IR é de 7.5% e pode deduzir na declaração o valor de R$
// 142");
// } else {
// if (salario > 2800.0 && salario <= 3751) {
// System.out.println("o IR é de 15% e pode deduzir R$ 350");
// } else {
// if (salario > 3751 && salario <= 4664.00 ) {
// System.out.println("o IR é de 22.5% e pode deduzir R$ 636");
// }
// }
// }
// }
// }

// Agora ajude o João na implementação todas as regras usando condicionais!

// Obs: Os valores de alíquota exatos foram simplificados. Os valores exatos se
// encontram neste link.

// ---------------------------------------------------------------------------------------------
// 12
// Para saber mais: o comando switch

// Vimos como fazer testes com o if, mas se precisarmos fazer vários testes? Um
// exemplo, temos uma variável
// mes, precisamos testar o seu número e imprimir o seu mês correspondente.
// Então, vamos fazer 12 ifs?

// Para esses casos, existe o comando switch, onde podemos colocar todas as
// opções ou rumos que o nosso
// programa pode tomar. Ele funciona da seguinte maneira:

// switch (variavelASerTestada) {
// case opcao1:
// // comando(s) caso a opção 1 tenha sido escolhida
// break;
// case opcao2:
// // comando(s) caso a opção 2 tenha sido escolhida
// break;
// case opcao3:
// // comando(s) caso a opção 3 tenha sido escolhida
// break;
// default:
// // comando(s) caso nenhuma das opções anteriores tenha sido escolhida
// }

// O código que será executado, que no nosso caso será a impressão do nome do
// mês, será o código em que a
// condição for verdadeira:

// public class TestaMes {

// public static void main(String[] args) {

// int mes = 10;

// switch (mes) {
// case 1:
// System.out.println("O mês é Janeiro");
// break;
// case 2:
// System.out.println("O mês é Fevereiro");
// break;
// case 3:
// System.out.println("O mês é Março");
// break;
// case 4:
// System.out.println("O mês é Abril");
// break;
// case 5:
// System.out.println("O mês é Maio");
// break;
// case 6:
// System.out.println("O mês é Junho");
// break;
// case 7:
// System.out.println("O mês é Julho");
// break;
// case 8:
// System.out.println("O mês é Agosto");
// break;
// case 9:
// System.out.println("O mês é Setembro");
// break;
// case 10:
// System.out.println("O mês é Outubro");
// break;
// case 11:
// System.out.println("O mês é Novembro");
// break;
// case 12:
// System.out.println("O mês é Dezembro");
// break;
// default:
// System.out.println("Mês inválido");
// break;
// }
// }
// }

// O break irá interromper a execução do caso que o contém, para as outras
// condições não serem analisadas e
// executadas.

// Se nenhuma condição for aceita, o código do default é que será executado. Por
// exemplo, se o mes for 13,
// a impressão será Mês inválido.

// Portanto, o switch é uma solução para os ifs encadeados.

// ---------------------------------------------------------------------------------------------
// 13
// O que aprendemos?

// Nessa aula, aprendemos:

// como usar o if
// como usar as operações lógicas AND (&&) e OR (||)
// trabalhar com o escopo de variáveis
// Também já vimos alguns atalhos no Eclipse:

// main + ctrl + espaço
// para gerar o método main
// ctrl + shift + f
// para formatar o código fonte
// sysout + ctrl + espaço
// para gerar a instrução System.out.println()

// ---------------------------------------------------------------------------------------------
// 14
// Arquivos do projeto atual

// No link abaixo, você encontra o projeto até o momento atual do curso.

// https://github.com/alura-cursos/Curso-Java-parte-1-Primeiros-passos/archive/capitulo6.zip
