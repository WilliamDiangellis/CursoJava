// Neste curso já vimos as classes, classes abstratas e interfaces.

// Anteriormente, definimos nossa própria interface e, como vimos, ela não
// possui um código concreto. Não é possível definir um atributo dentro de uma,
// o código simplesmente não compila. Da mesma forma, nenhum método poderá ter
// uma implementação.

// Uma interface só define métodos, as regras destes devem ser definidas nas
// classes que a implementem.

// No caso da interface Autenticavel:

// public abstract interface Autenticavel {

// public abstract void setSenha(int senha);

// public abstract boolean autentica(int senha);
// }

// Todas as classes que a implementarem terão a obrigação de implementar os
// métodos setSenha() e autentica().

// Em comparação com o conceito de herança, onde temos os pilares da
// reutilização de código e do polimorfismo, quando falamos de interfaces, não
// há código concreto, assim, o objetivo não é a reutilização de código, ela é,
// sim, uma alternativa ao polimorfismo.

// Se quisermos somente uma solução pura de polimorfismo, podemos utilizar a
// interface.

// Mas e se quisermos somente a reutilização de código, é recomendado utilizar a
// herança? Não, a herança é recomendada quando há a combinação das necessidades
// de reutilização de código e polimorfismo.

// E se a necessidade for somente a reutilização de código? É o que veremos a
// seguir.

// Anteriormente, havíamos observado que repetimos muitas vezes, em nosso
// programa, as linhas de código referentes aos métodos setSenha() e
// autentica(). A ideia é isolarmos estas linhas de código em uma classe.

// Criaremos uma nova classe, e teremos que nomeá-la. Idealmente, criaremos este
// nome orientado pela pessoa que criou o sistema, entretanto, nem sempre é este
// o caso, e devemos criar um nome. A nossa classe se chamará AutenticacaoUtil.

// Incluiremos nesta nova classes os métodos setSenha() e autentica():

// public class AutenticacaoUtil {

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

// Agora, não podemos simplesmente apagar estes métodos das outras classes, pois
// isso quebraria nosso "compromisso" com a interface Autenticavel. Manteremos
// somente as assinatura, e eliminaremos a lógica dos métodos.

// Tomaremos, primeiro, a classe Cliente como exemplo.

// Para resolvermos o problema citado acima, teremos um atributo
// AtenticacaoUtile criaremos um construtor padrão para, dentro dele, termos uma
// instância da AutenticacaoUtil:

// public class Cliente implements Autenticavel {
// private int senha;
// private AutenticacaoUtil util;

// public Cliente() {
// this.util = new AutenticacaoUtil();
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

// Com isso, eliminamos a necessidade da existência do atributo senha:

// public class Cliente implements Autenticavel {

// private AutenticacaoUtil util;

// public Cliente() {
// this.util = new AutenticacaoUtil();
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

// Assim, quando o Cliente chamar a senha, quem guardará esta informação não
// será diretamente a própria classe, e sim a AutenticacaoUtil. No autenticador,
// chamaremos o util, desta forma, utilizamos o seu setSenha. Isso significa que
// delegamos a chamada - o método não foi embora, mas a implementação, que era
// concreta, agora foi delegada:

// public class Cliente implements Autenticavel {

// private AutenticacaoUtil util;

// public Cliente() {
// this.util = new AutenticacaoUtil();
// }

// @Override
// public void setSenha(int senha) {
// this.util.setSenha(senha);
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

// No método autentica(), também delegaremos a chamada do método, mas como ele
// nos dá um retorno true ou false, precisamos utilizar o return:

// public class Cliente implements Autenticavel {

// private AutenticacaoUtil util;

// public Cliente() {
// this.util = new AutenticacaoUtil();
// }

// @Override
// public void setSenha(int senha) {
// this.util.setSenha(senha);
// }

// @Override
// public boolean autentica(int senha) {
// return this.util.autentica(senha);
// }
// }

// Para alterarmos o nome util, basta clicarmos com o botão direito do mouse
// sobre a palavra util e selecionarmos a opção "Refactor > Rename". O novo nome
// será autenticador.

// A lógica de autenticação permanece armazenada em apenas um lugar e, em
// seguida, replicaremos este processo na classe Administrador:

// public class Administrador extends Funcionario implements Autenticavel {

// private AutenticacaoUtil autenticador;

// public Administrador() {
// this.autenticador = new AutenticacaoUtil();
// }

// @Override
// public double getBonificacao() {
// return 50;
// }

// @Override
// public void setSenha(int senha) {
// this.autenticador.setSenha(senha);
// }

// @Override
// public boolean autentica(int senha) {
// return this.autenticador.autentica(senha);
// }
// }

// O mesmo será feito na classe Gerente:

// public class Gerente extends Funcionario implements Autenticavel {
// private AutenticacaoUtil autenticador;

// public Gerente() {
// this.autenticador = new AutenticacaoUtil();
// }

// public double getBonificacao() {
// System.out.println("Chamando o metodo de bonificacao do GERENTE");
// return super.getSalario();
// }

// @Override
// public void setSenha(int senha) {
// this.autenticador.setSenha(senha);
// }

// @Override
// public boolean autentica(int senha) {
// return this.autenticador.autentica(senha);
// }
// }

// Recapitulando:

// Criamos uma nova classe, chamada AutenticacaoUtil;
// As classes Cliente, Administrador e Gerente as utilizam, esse relacionamento
// se chama composição;
// O relacionamento de composição difere do relacionamento de herança, naquele,
// há uma interdependência onde a existência de um depende da do outro, já na
// composição, cada classe existe independentemente.

// Isso significa que, quando queremos fazer apenas a reutilização de código,
// podemos utilizar a composição. Teoricamente, podemos trabalhar sem a herança
// com o Java.

// James Gosling, o inventor da linguagem Java, em uma entrevista falou que, à
// época da criação do Java, ele estava experimentando com as interfaces e que
// talvez, se tivesse mais tempo e menos pressão comercial para lançar a
// linguagem, a teria lançado sem a herança.

// Ele não afirma que a herança é algo negativo, pelo contrário, mas é um
// conceito difícil de se acertar. Já a interface e a composição são mais
// flexíveis e fáceis de trabalhar.

// No fim, temos as duas opções em Java. Atualmente, é mais comum a utilização
// das interfaces e composições, em detrimento da herança, mas é importante
// sabermos que ambos existem.

// Adiante, veremos mais exemplos de interfaces e voltaremos a trabalhar com a
// classe Conta.