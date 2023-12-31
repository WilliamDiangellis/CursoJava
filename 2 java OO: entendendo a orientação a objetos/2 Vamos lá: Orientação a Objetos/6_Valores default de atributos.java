// Vimos que os tipos de variáveis apresentadas no primeiro curso não possuíam
// valor padrão, ou seja, valor default. Não era possível se quer executar a
// aplicação com esse tipo de variável, pois não havia valores definidos.

// O tipos de variáveis que estamos trabalhando na classe Conta, não são as
// mesmas que ficam dentro do método main. As variáveis que estamos nos
// referindo ficam diretamente na classe.

// Essas variáveis nós chamamos de atributos ou características de um objeto,
// comparativamente, elas são similares às especificações da planta de uma casa:
// se terá quatro quartos, uma sala, um banheiro. No caso de uma conta bancária,
// seus atributos seriam agência, conta, titular. Esses atributos podem ser
// chamados de campo ou propriedade.

// Esse tipo de variável especial que possui significado para objetos tem um
// comportamento diferente.
// Quando acionamos a palavra-chave new e o Java instancia o objeto, todo os
// campos são zerados.

// Para entendermos melhor essa ideia, observaremos os cartões cinzas que
// representam as especificações das nossas contas bancárias.

// Percebam que os campos que não possuem valores estipulados estão zerados.
// Como titular é um tipo String, ou seja, não numérico, utilizamos as
// interrogações.

// campos zerados

// Para vermos como isso está representado no Eclipse, iremos na nossa classe
// CriaConta e solicitaremos a impressão do valor de agencia e numero de
// primeiraConta.

// public class CriaConta {
// public static void main(String[] args) {
// Conta primeiraConta = new Conta();
// primeiraConta.saldo = 200;
// System.out.println(primeiraConta.saldo);
// primeiraConta.saldo += 100;
// System.out.println(primeiraConta.saldo);

// Conta segundaConta = new Conta();
// segundaConta.saldo = 50;

// System.out.println("primeira conta tem " + primeiraConta.saldo);
// System.out.println("segunda conta tem " + segundaConta.saldo);

// System.out.println(primeiraConta.agencia);
// System.out.println(primeiraConta.numero);
// }
// }

// Ao solicitarmos a execução da aplicação, teremos o resultado dos valores de
// agencia e numero, que como sabemos, será 0 para ambos os casos. Percebam que
// não houve erros na execução, mesmo não existindo valores definidos para estes
// atributos.

// resultado dos campos zerados
// Quando o Java constrói objetos, todos os seus atributos são zerados. 0 é o
// valor default de vários tipos numéricos, como int, double e long. No caso do
// tipo boolean o valor é false.

// Poderíamos configurar valores padrão diferentes de zero, mas isso não seria
// interessante no nosso caso.
// Por exemplo, poderíamos dizer o valor de agencia sempre será 42 para todas as
// contas bancárias.

// public class Conta {
// double saldo;
// int agencia = 42;
// int numero;
// String titular;
// }

// A agência de todas as contas bancárias será 42. Podemos verificar isso
// solicitando a impressão de agencia da segundaConta e da primeiraConta.

// public class CriaConta {
// public static void main(String[] args) {
// Conta primeiraConta = new Conta();
// primeiraConta.saldo = 200;
// System.out.println(primeiraConta.saldo);

// primeiraConta.saldo += 100;
// System.out.println(primeiraConta.saldo);

// Conta segundaConta = new Conta();
// segundaConta.saldo = 50;

// System.out.println("primeira conta tem " + primeiraConta.saldo);
// System.out.println("segunda conta tem " + segundaConta.saldo);

// System.out.println(primeiraConta.agencia);
// System.out.println(primeiraConta.numero);

// System.out.println(segundaConta.agencia);
// }
// }

// O resultado será 42 para ambos os casos.

// resultado valor agencia

// Configuramos o valor 42 como default para todas as agências. Podemos
// representar essa ideia tomando como configuração padrão o cartão cinza no
// canto esquerdo da tela.

// cards com valor default

// Podemos alterar o valor no objeto em si. Como por exemplo, redefiniremos um
// novo valor de agencia
// para segundaConta, que será 146.

// public class CriaConta {
// public static void main(String[] args) {
// Conta primeiraConta = new Conta();
// primeiraConta.saldo = 200;
// System.out.println(primeiraConta.saldo);

// primeiraConta.saldo += 100;
// System.out.println(primeiraConta.saldo);

// Conta segundaConta = new Conta();
// segundaConta.saldo = 50;

// System.out.println("primeira conta tem " + primeiraConta.saldo);
// System.out.println("segunda conta tem " + segundaConta.saldo);

// System.out.println(primeiraConta.agencia);
// System.out.println(primeiraConta.numero);

// System.out.println(segundaConta.agencia);

// segundaConta.agencia = 146;
// System.out.println("agora a segunda conta está na agencia " +
// segundaConta.agencia);
// }
// }

// Com isso, modificamos o valor de agencia de segundaConta para 146.