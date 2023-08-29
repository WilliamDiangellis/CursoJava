// Olá! Nesta aula daremos continuidade ao nosso aprendizado sobre herança.

// Lembrando, temos a seguinte hierarquia: A classe mãe é Funcionario e as
// filhas são Gerente, EditorVideo e Designer.

// A classe mãe é abstrata, enquanto as filhas são todas concretas. Lembrando
// também que a classe Gerente tem um método autentica(), que é do tipo boolean.

// Fecharemos o projeto bytebank-herdado-conta no Eclipse, e retornaremos ao
// bytebank-herdado, onde temos as classes mencionadas acima.

// Criaremos uma nova classe, chamada SistemaInterno. Justamente, surgiu esta
// necessidade, de representarmos um sistema interno da empresa, que não é
// acessível para todos:

// public class SistemaInterno {

// }

// Este sistema será visualizado apenas por alguns funcionários, por isso,
// conterá um método autentica() próprio, que recebe como parâmetro um Gerente
// g, como base nisso o método será chamado:

// public class SistemaInterno {

// public void autentica(Gerente g) {
// g.autentica(senha);
// }
// }

// A senha será definida em um atributo, acima do método. Consequentemente, esta
// senha será passada para o método autentica():

// public class SistemaInterno {

// private int senha = 2222;

// public void autentica(Gerente g) {
// g.autentica(this.senha);
// }
// }

// Lembrando, este método devolve true ou false, por isso, ele será do tipo
// boolean. Se autenticou, imprimiremos uma mensagem "Pode entrar no sistema!",
// caso contrário, a mensagem "Não pode entrar no sistema!" será exibida:

// public class SistemaInterno {

// private int senha = 2222;

// public void autentica(Gerente g) {
// boolean autenticou = g.autentica(this.senha);
// if(autenticou) {
// System.out.println("Pode entrar no sistema!");
// } else {
// System.out.println("Não pode entrar no sistema!");
// }
// }
// }

// Criaremos um teste para esta classe, chamado TesteSistema:

// public class TesteSistema {

// public static void main(String[] args) {

// }

// }

// Criaremos um novo gerente, e o daremos uma senha. Além disso, instituiremos
// um sistema interno, passando o gerente g:

// public class TesteSistema {

// public static void main(String[] args) {
// Gerente g = new Gerente();
// g.setSenha(2222);

// SistemaInterno si = new SistemaInterno();
// si.autentica(g);

// }

// }

// O executaremos e temos o seguinte resultado no console:

// Pode entrar no sistema!

// Se colocarmos outro número na senha, e tentarmos executar a classe,
// receberemos a mensagem: "Não pode entrar no sistema!".

// Criaremos um novo tipo de funcionário, para isso, teremos uma nova classe,
// que se chamará Administrador, e cuja super classe será Funcionario. O Eclipse
// detecta o método abstrato e já cria a implementação:

// public class Administrador extends Funcionario {

// @Override
// public double getBonificacao() {
// //TODO Auto-generated method stub
// return 0;
// }
// }

// Definiremos uma regra de bonificação de 50 reais:

// public class Administrador extends Funcionario {

// @Override
// public double getBonificacao() {
// return 50;
// }
// }

// O administrador terá uma senha e, consequentemente, deverá ter também um
// método autentica:

// public class Administrador extends Funcionario {

// private int senha;

// public void setSenha(int senha) {
// this.senha = senha;
// }

// public boolean autentica(int senha) {
// if(this.senha == senha) {
// return true;
// } else {
// return false;
// }
// }

// @Override
// public double getBonificacao() {
// return 50;
// }
// }

// Mas este código já nos causa certa estranheza, pela repetição de linhas.

// Ademais, isso não resolve nosso problema. Na classe TesteSistema, tentaremos
// criar um administrador, com uma senha, e autenticá-la:

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

// Ao passarmos o si.autentica(adm) temos um erro de compilação. Isso acontece
// porque na classe SistemaInterno só é aceito o Gerente. Ou seja, teríamos que
// duplicar o método autentica() na classe SistemaInterno:

// public class SistemaInterno {

// private int senha = 2222;

// public void autentica(Gerente g) {
// boolean autenticou = g.autentica(this.senha);
// if(autenticou) {
// System.out.println("Pode entrar no sistema!");
// } else {
// System.out.println("Não pode entrar no sistema!");
// }

// public void autentica(Administrador adm) {
// boolean autenticou = adm.autentica(this.senha);
// if(autenticou) {
// System.out.println("Pode entrar no sistema!");
// } else {
// System.out.println("Não pode entrar no sistema!");
// }
// }
// }

// Somente desta forma, o TesteSistema funcionaria. Entretanto, como vimos, esta
// constante repetição de código não é uma boa prática de programação.
// Retornaremos o código para a forma como estava, sem o método
// autentica(Administrador adm):

// public class SistemaInterno {

// private int senha = 2222;

// public void autentica(Gerente g) {
// boolean autenticou = g.autentica(this.senha);
// if(autenticou) {
// System.out.println("Pode entrar no sistema!");
// } else {
// System.out.println("Não pode entrar no sistema!");
// }
// }
// }

// Retornaremos para a classe TesteSistema:

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

// Em vez de duplicar o método autentica(), poderíamos inseri-lo na classe mãe,
// Funcionario. Desta forma, tanto a classe Administrador quanto Gerente
// herdariam este código. Assim, em SistemaInterno, o método receberia
// simplesmente Funcionario como parâmetro:

// public class SistemaInterno {

// private int senha = 2222;

// public void autentica(Funcionario g) {
// boolean autenticou = g.autentica(this.senha);
// if(autenticou) {
// System.out.println("Pode entrar no sistema!");
// } else {
// System.out.println("Não pode entrar no sistema!");
// }
// }
// }

// Excluindo o método autentica() da classe Administrador e a transferindo, a
// classe Funcionario ficaria da seguinte forma:

// public abstract class Funcionario {

// private int senha;

// public void setSenha(int senha) {
// this.senha = senha;
// }

// public boolean autentica(int senha) {
// if(this.senha == senha) {
// return true;
// } else {
// return false;
// }
// }

// //Código omitido

// Apagaremos este trecho de código da classe Gerente, já que agora ele herdará
// este método da classe mãe. A classe Gerente conterá agora apenas seu método
// específico de bonificação.

// O SistemaInterno recebe Funcionario e, como este possui o método autentica(),
// o código compila normalmente, o mesmo vale para a classe TesteSistema.

// O problema desta abordagem é que agora, tanto o EditorVideo quanto o Designer
// podem entrar no SistemaInterno, algo que não pode acontecer. Para ilustrar
// isso, criaremos um novo objeto do tipo Designer() com uma senha, na classe
// TesteSistema:

// public class TesteSistema {

// public static void main(String[] args) {
// Gerente g = new Gerente();
// g.setSenha(2222);

// Administrador adm = new Administrador();
// adm.setSenha(3333);

// Designer d = new Designer();
// d.setSenha(5555);

// SistemaInterno si = new SistemaInterno();
// si.autentica(g);
// si.autentica(adm);
// }
// }

// Só que em nenhuma hipótese o designer deveria ter uma senha. Esta
// configuração nos permite chamar o método autentica() para o Designer d:

// public class TesteSistema {

// public static void main(String[] args) {
// Gerente g = new Gerente();
// g.setSenha(2222);

// Administrador adm = new Administrador();
// adm.setSenha(3333);

// Designer d = new Designer();
// d.setSenha(5555);

// SistemaInterno si = new SistemaInterno();
// si.autentica(g);
// si.autentica(adm);
// si.autentica(d);
// }
// }

// Isso não deveria funcionar para um designer!

// A ideia é tirar o método autentica() da classe Funcionario, porque ele não se
// aplica a todos os funcionários.

// Como resolveremos isso? Teremos uma nova classe, intermediária entre a classe
// mãe, Funcionário, e as filhas autenticáveis, Administrador e Gerente.

// Esta nova classe intermediária se chamará FuncionarioAutenticavel, e as
// classes Administrador e Gerente estenderão esta classe. A classe
// FuncionarioAutenticavel, por sua vez, estenderá a classe Funcionario:

// organograma demonstrando visualmente a hirarquia das classes. Temos a classe
// mãe funcionario, abaixo temos as classes filhas, funcionario autenticavel,
// editor video e designer, todas estendem funcionario, a classe fucionario
// autenticavel possui duas classes filhas, administrador e gerente

// A classe FuncionarioAutenticavel será abstrata. O método autentica() será
// armazenado, portanto, nesta classe.

// O próximo passo é implementarmos isso no código.

// Primeiro, criaremos a nova classe FuncionarioAutenticavel. Podemos perceber
// que o próprio menu de criação da classe já nos fornece a opção de criá-la
// como uma classe abstrata:

// public abstract class FuncionarioAutenticavel extends Funcionario {

// @Override
// public double getBonificacao() {
// // TODO Auto-generated method stub
// return 0;
// }
// }

// Temos o código padrão que o Eclipse nos fornece ao criar uma classe.

// Removeremos o método getBonificacao(), lembrando que as classes abstratas não
// têm obrigação de implementar os métodos abstratos.

// Inseriremos na classe o método autentica():

// public abstract class FuncionarioAutenticavel extends Funcionario {

// private int senha;

// public void setSenha(int senha) {
// this.senha = senha;
// }

// public boolean autentica(int senha) {
// if(this.senha == senha) {
// return true;
// } else {
// return false;
// }
// }
// }

// Em segundo lugar, adequaremos a classe Gerente:

// //Gerente eh um FuncionarioAutenticavel, Gerente herda da classe
// FuncionarioAutenticavel

// public class Gerente extends FuncionarioAutenticavel {

// public double getBonificacao() {
// System.out.println("Chamando o método de bonificacao do GERENTE");
// return super.getSalario();
// }
// }

// Faremos o mesmo com a classe Administrador:

// public class Administrador extends FuncionarioAutenticavel {

// @Override
// public double getBonificacao() {
// return 50;
// }

// }

// Agora as classes atendem à nossa hierarquia.

// Precisamos ainda atualizar nosso SistemaInterno. O parâmetro do método
// autentica() deverá ser do tipo FuncionarioAutenticavel, para que possa
// funcionar corretamente:

// public class SistemaInterno {

// private int senha = 2222;

// public void autentica(FuncionarioAutenticavel fa) {
// boolean autenticou = fa.autentica(this.senha);
// if(autenticou) {
// System.out.println("Pode entrar no sistema!");
// } else {
// System.out.println("Não pode entrar no sistema!");
// }
// }
// }

// Por fim, precisamos corrigir a classe TesteSistema. O objeto Designer() não
// faz mais sentido:

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

// O código funciona normalmente, sem necessidade de duplicarmos código, como
// havíamos feito anteriormente.

// Conseguimos resolver nosso problema, utilizando a solução da classe
// intermediária. Aumentamos a nossa hierarquia. Adiante, introduziremos mais
// uma classe, e surgirá mais um problema, que não conseguiremos resolver
// utilizando a herança, veremos mais pra frente como solucionar-lo!