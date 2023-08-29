// Anteriormente, criamos a interface Autenticavel. O Cliente já a implementou,
// preciamos que as classes Administrador e Gerente também o façam.

// No Eclipse, abriremos a classe Gerente:

// public class Gerente extends Funcionario implements Autenticavel {

// public double getBonificacao() {
// System.out.println("Chamando o método de bonificacao do GERENTE");
// return super.getSalario();
// }
// }

// Ao implementar Autenticavel, automaticamente, a classe Gerente se obriga a
// implementar os métodos da interface, ou seja setSenha e autentica.

// Na classe Gerente, ao clicarmos com o botão direito, e clicarmos na opção
// "Add unimplemented methods" o Eclipse gera os métodos automaticamente:

// public class Gerente extends Funcionario implements Autenticavel {

// public double getBonificacao() {
// System.out.println("Chamando o método de bonificacao do GERENTE");
// return super.getSalario();
// }

// @Override
// public void setSenha(int senha) {
// // TODO Auto-generated method stub
// }

// @Override
// public boolean autentica(int senha) {
// // TODO Auto-generated method stub
// }
// }

// Vamos finalizar a implementação, é a mesma da classe Cliente:

// public class Gerente extends Funcionario implements Autenticavel {

// private int senha;

// public double getBonificacao() {
// System.out.println("Chamando o método de bonificacao do GERENTE");
// return super.getSalario();
// }

// @Override
// public void setSenha(int senha) {
// this.senha = senha;
// }

// @Override
// public boolean autentica(int senha) {
// if(this.senha == senha) {
// return true;
// } else {
// return false;
// }
// }
// }

// Podemos interpretar este código como "a classe Gerente é um Funcionario,
// herda da classe Funcionario, assina o contrato Auntenticavel, e é um
// Autenticavel".

// Se tivéssemos uma segunda interface, por exemplo, Bonificavel, e quiséssemos
// escrever:

// public class Gerente extends Funcionario implements Autenticavel, Bonificavel
// {

// Isso seria possível, pois como vimos, é possível implementarmos mais de uma
// interface simultaneamente. Isso porque, como nesta modalidade não há nada
// concreto, não corremos o risco de incorrermos em uma duplicidade de métodos,
// a implementação acontecerá na própria classe, evitando assim qualquer
// confusão.

// A seguir, faremos o mesmo processo com a classe Administrador:

// public class Administrador extends Funcionario implements Autenticavel {

// private int senha;

// @Override
// public double getBonificacao() {
// return 50;
// }

// @Override
// public void setSenha(int senha) {
// this.senha = senha;
// }

// @Override
// public boolean autentica(int senha) {
// if(this.senha == senha) {
// return true;
// } else {
// return false;
// }
// }
// }

// Feito isso, todo o nosso código deve estar compilando.

// Recapitulando:

// Gerente é Funcionario e assina Autenticavel;
// Administrador é Funcionario e assina Autenticavel; e
// Cliente é Autenticavel.
// Na classe SistemaInterno:

// public class SistemaInterno {

// private int senha = 2222;

// public void autentica(Autenticavel fa) {

// //Código omitido

// Percebemos que a conexão entre esta classe e a Autenticavel continua
// existindo. Esta é a vantagem de termos uma interface, podemos utilizá-la para
// definir um tipo.

// Na classe TesteGerente, criaremos um novo objeto do tipo Gerente():

// public class TesteGerente {

// public static void main(String[] args) {

// Gerente gerente = new Gerente();

// //Código omitido

// Falamos anteriormente que, ao criarmos um objeto, ele nasce e morre com o
// mesmo tipo, mas que no lado esquerdo podemos ter uma referência de outros
// tipos, graças ao polimorfismo. Isso significa que podemos colocar, também, as
// interfaces que ele implementa:

// public class TesteGerente {

// public static void main(String[] args) {

// Autenticavel gerente = new Gerente();

// //Código omitido

// O Gerente também é um Autenticavel. Podemos tornar ainda mais genérico,
// trocando o nome para referencia:

// public class TesteGerente {

// public static void main(String[] args) {

// Autenticavel referencia = new Gerente();

// //Código omitido

// O objeto pode ser do tipo Administrador, já que ele também implementa a
// interface Autenticavel, assim como o Cliente.

// Até poderíamos criar mais uma classe, chamada Fiscal, que não faria parte da
// mesma hierarquia que as outras, mas também implementaria a interface
// Autenticavel.

// Retornaremos para o Eclipse e abriremos a classe TesteGerente:

// public class TesteGerente {
// public static void main(String[] args) {

// Autenticavel referencia = new Cliente();

// Gerente g1 = new Gerente();
// g1.setNome("Marco");
// g1.setCpf("235568413");
// g1.setSalario(5000.0);

// System.out.println(g1.getNome());
// System.out.println(g1.getCpf());
// System.out.println(g1.getSalario());

// // g1.setSenha(2222);
// // boolean autenticou = g1.autentica(2222);

// // System.out.println(autenticou);

// System.out.println(g1.getBonificacao());

// //Código omitido

// E descomentaremos o trecho com o método getSenha():

// public class TesteGerente {
// public static void main(String[] args) {

// Autenticavel referencia = new Cliente();

// Gerente g1 = new Gerente();
// g1.setNome("Marco");
// g1.setCpf("235568413");
// g1.setSalario(5000.0);

// System.out.println(g1.getNome());
// System.out.println(g1.getCpf());
// System.out.println(g1.getSalario());

// g1.setSenha(2222);
// boolean autenticou = g1.autentica(2222);

// System.out.println(autenticou);

// System.out.println(g1.getBonificacao());

// //Código omitido

// O trecho voltou a funcionar, porque agora o Gerente sabe setar a senha, e
// sabe como se autenticar.

// Na classe TesteSistema, havíamos comentado todo o código, podemos agora
// desfazer esta ação:

// public class TesteSistema {

// public static void main(String[] args) {
// Gerente g = new Gerente();
// g.setSenha(2222);

// Administrador adm = new Administrador();
// adm.setSenha(3333);

// SistemaInterno si = new SistemaInterno();
// si.autentica(g);
// si.autentica(adm);

// }
// }

// Criaremos um objeto do Cliente(), para testar se ele também consegue acessar
// o SistemaInterno, para isso, ele receberá a senha válida, 2222:

// public class TesteSistema {

// public static void main(String[] args) {
// Gerente g = new Gerente();
// g.setSenha(2222);

// Administrador adm = new Administrador();
// adm.setSenha(3333);

// Cliente cliente = new Cliente();
// cliente.setSenha(2222);

// SistemaInterno si = new SistemaInterno();
// si.autentica(g);
// si.autentica(adm);
// si.autentica(cliente);

// }
// }

// Dessa forma, o Gerente continua sendo um Funcionario, o Cliente não é, mas os
// dois são capazes de acessar o mesmo SistemaInterno. Isso acontece porque a
// interface é absolutamente genérica.

// Anteriormente, eliminamos a conexão entre a interface Autenticavel e a classe
// Funcionario. Ela não estende Funcionario, e dada sua natureza, nem poderia.
// Já os tipos de funcionários, Administrador, Gerente, EditorVideo e Designer,
// todos estendem a classe Funcionario.

// A interface Autenticavel, por sua vez, é a abstração entre SistemaInterno e
// todas as pessoas que desejam acessá-lo. Ainda que estas pessoas não tenham
// relação entre si.

// Podemos inclusive criar mais tipos, se todos eles implementarem a classe
// Autenticavel, todos poderão acessar o SistemaInterno.

// Isso é algo muito utilizado no design das bibliotecas. Adiante, veremos mais
// exemplos concretos de bibliotecas, onde aparecem as interfaces.

// Veremos também a questão da repetição excessiva do código envolvendo os
// métodos setSenha e autentica().