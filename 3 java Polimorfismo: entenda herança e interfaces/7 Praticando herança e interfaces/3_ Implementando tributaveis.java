// Dando continuidade aos conceitos apresentados anteriormente, neste vídeo,
// faremos a implementação da interface Tributavel, com o CalculadorImposto e as
// classes SeguroDeVida e ContaCorrente.

// No Eclipse, abriremos o projeto bytebank-herdado-conta.

// A primeira coisa a fazer será criar a interface Tributavel, que definirá a
// assinatura deste método.

// Clicaremos com o botão direito do mouse sobre o pacote do projeto, e
// selecionaremos a opção "New > Interface". Chamaremos ela de Tributavel, e
// teremos o seguinte resultado:

// public interface Tributavel {

// }

// Não há necessidade de utilizarmos o abstract antes de interface, já que este
// último já presume que tudo que há nele é de fato abstrato. O segundo passo
// será inserirmos o método getValorImposto() na nossa interface:

// public interface Tributavel {

// public abstract double getValorImposto();

// }

// Por padrão, o método nesse caso sempre será public abstract, por isso é comum
// que nem se escreva isso no código, ele compila normalmente, já que é o padrão
// da interface.

// Em seguida, criaremos o CalculadorImposto. Novamente, clicaremos com o botão
// direito do mouse sobre o pacote do projeto e selecionaremos a opção "New >
// Class", a nomearemos como CalculadorDeImposto:

// public class CalculadorDeImposto {

// }

// Nela, teremos um método registra(), que recebe um tributavel:

// public class CalculadorDeImposto {

// public void registra(Tributavel t) {

// }

// }

// Todos que implementaram a interface Tributavel podem ser utilizados, por meio
// deste método.

// Em seguida, completaremos o método registra() com o método getValorImposto():

// public class CalculadorDeImposto {

// public void registra(Tributavel t) {

// double valor = t.getValorImposto();

// }

// }

// Nesse código, não sabemos exatamente o quê deve ser tributável. Pode ser
// tanto uma conta corrente, quanto um seguro de vida, por exemplo.

// Para somarmos o total de impostos, criaremos um atributo totalImposto:

// public class CalculadorDeImposto {

// private double totalImposto;

// public void registra(Tributavel t) {

// double valor = t.getValorImposto();
// this.totalImposto += valor;

// }

// }

// Por fim, teremos um método para nos devolver o valor total de impostos, que é
// o getTotalImposto():

// public class CalculadorDeImposto {

// private double totalImposto;

// public void registra(Tributavel t) {

// double valor = t.getValorImposto();
// this.totalImposto += valor;

// }

// public double getTotalImposto() {
// return totalImposto;
// }

// }

// Com essa arquitetura, poderíamos, inclusive, ter desenvolvedores diferentes,
// desde que ambos tenham definido a interface Tributavel em comum, as classes
// podem evoluir sem que nada seja alterado nela.

// O próximo passo será criarmos o tipo do seguro de vida. Criaremos uma nova
// classe, conforme o procedimento citado acima, e a nomearemos como
// SeguroDeVida. Definiremos a interface Tributavel para que ela a implemente,
// desde o momento de sua criação. Para isso, basta clicarmos no botão "Add..."
// e procurarmos pelo nome da nossa interface.

// Temos o seguinte resultado:

// public class SeguroDeVida implements Tributavel {

// @Override
// public double getValorImposto() {
// // TODO Auto-generated method stub
// return 0;
// }
// }

// O Eclipse já fez a implementação e, inclusive, criou o método necessário.
// Definiremos um valor de retorno de imposto, no caso, 42:

// public class SeguroDeVida implements Tributavel {

// @Override
// public double getValorImposto() {
// return 42;
// }
// }

// Além do SeguroDeVida, a classe ContaCorrente também implementa a interface
// Tributavel. Assim, adicionaremos a devida referência:

// public class ContaCorrente extends Conta implements Tributavel {

// public ContaCorrente(int agencia, int numero) {
// super(agencia, numero);
// }

// @Override
// public boolean saca(double valor) {
// double valorASacar = valor + 0.2;
// return super.saca(valorASacar);
// }

// @Override
// public void deposita(double valor) {
// super.saldo += valor;
// }
// }

// Mas isso não é o suficiente, precisamos ainda implementar os métodos, no
// caso, getValorImposto(), e cujo cálculo será 1% do valor do saldo:

// public class ContaCorrente extends Conta implements Tributavel {

// public ContaCorrente(int agencia, int numero) {
// super(agencia, numero);
// }

// @Override
// public boolean saca(double valor) {
// double valorASacar = valor + 0.2;
// return super.saca(valorASacar);
// }

// @Override
// public void deposita(double valor) {
// super.saldo += valor;
// }

// @Override
// public double getValorImposto() {
// return super.saldo * 0.01;
// }
// }

// Faremos a seguir um teste, para podermos verificar se tudo está funcionando.
// Criaremos uma nova classe, chamada TesteTributaveis:

// public class TesteTributaveis {

// public static void main(String[] args) {

// }
// }

// Criaremos uma conta corrente cc, que terá um saldo de 100. Em seguida,
// criaremos um seguro de vida, seguro:

// public class TesteTributaveis {

// public static void main(String[] args) {

// ContaCorrente cc = new ContaCorrente(222, 333);
// cc.deposita(100.0);

// SeguroDeVida seguro = new SeguroDeVida();

// }
// }

// Por fim, teremos um objeto CalculadorImposto() que receberá os objetos
// baseados na interface Tributavel:

// public class TesteTributaveis {

// public static void main(String[] args) {

// ContaCorrente cc = new ContaCorrente(222, 333);
// cc.deposita(100.0);

// SeguroDeVida seguro = new SeguroDeVida();

// CalculadorDeImposto calc = new CalculadorDeImposto();
// calc.registra(cc);
// calc.registra(seguro);

// }
// }

// Finalmente, apenas para verificarmos se realmente foi chamado, imprimiremos o
// total de impostos:

// public class TesteTributaveis {

// public static void main(String[] args) {

// ContaCorrente cc = new ContaCorrente(222, 333);
// cc.deposita(100.0);

// SeguroDeVida seguro = new SeguroDeVida();

// CalculadorDeImposto calc = new CalculadorDeImposto();
// calc.registra(cc);
// calc.registra(seguro);

// System.out.print(calc.getTotalImposto());

// }
// }

// Tudo está compilando, executaremos. Temos o seguinte resultado no console:

// 43.0

// Ou seja, 42 do seguro de vida, mais 1, que representa 1% de 100, da conta
// corrente. Funcionou!

// Até a próxima.