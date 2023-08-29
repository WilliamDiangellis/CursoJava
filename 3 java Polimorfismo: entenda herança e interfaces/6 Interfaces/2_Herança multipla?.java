// Bem-vindo a mais uma aula no curso de Java - Parte 3!

// Nesta aula, daremos continuidade ao que falávamos na última aula, onde
// introduzimos a classe abstrata FuncionarioAutenticavel, e aumentamos nossa
// hierarquia.

// Antes de partirmos para um novo conceito, aprofundaremos este.

// Nosso SistemaInterno não depende diretamente do Administrador nem do Gerente.
// A abstração entre os tipos específicos de funcionários, e a classe
// SistemaInterno, é a classe FuncionarioAutenticavel. Esta é a vantagem,
// pensando sob a ótica de design.

// Podemos, inclusive, criar um novo tipo de funcionário autenticável, por
// exemplo, um diretor, com uma classe Diretor, que estenda a classe
// FuncionarioAutenticavel. Ou seja, podemos fazer isso sem alterar o código da
// classe SistemaInterno, nem da FuncionarioAutenticavel. Esta é a grande
// vantagem. Os dois lados podem evoluir separadamente.

// Desde que não haja uma alteração na classe FuncionarioAutenticavel, as suas
// classes filhas não serão afetadas. Esta é a vantagem do design desta
// abstração, do polimorfismo.

// Nosso novo desafio é que não basta mais representarmos apenas funcionários em
// nosso sistemas, teremos que representar também os clientes.

// A classe Cliente também terá acesso ao SistemaInterno, além disso, ela também
// será autenticável.

// Uma primeira ideia seria fazer com que a classe Cliente estendesse a classe
// FuncionarioAutenticavel - de cara não parece ser uma boa ideia, mas
// testaremos mesmo assim.

// Retornando ao Eclipse, fecharemos todas as classes, clicando com o botão
// direito do mouse sobre a barra de janelas e selecionando a opção "Close All".

// Abriremos o projeto bytebank-herdado, e criaremos uma nova classe, denominada
// Cliente, que estenderá a classe FuncionarioAutenticavel:

// public class Cliente extends FuncionarioAutenticavel {

// @Override
// public double getBonificacao() {
// //TODO Auto-generated method stub
// return 0;
// }

// }

// Já podemos perceber nosso primeiro problema - faz sentido o Cliente receber
// uma bonificação? Afinal de contas, ele não é um funcionário. Além disso, na
// nossa hierarquia, fazemos a seguinte leitura:

// O cliente é** um funcionário autenticável, o cliente **é um funcionário.

// A primeira parte da afirmação já nos soa estranho, porque apesar de ele
// querer se autenticar, não é um funcionário. Piora quando subimos mais na
// hierarquia, e vemos que não é possível afirmarmos que o "cliente é um
// funcionário". Ser um funcionário significa receber uma bonificação.

// Poderíamos zerar o retorno no método getBonificacao(), mas mesmo assim, ele
// ainda teria este comportamento.

// Para exemplificar, criaremos um objeto Cliente() na classe TesteFuncionario:

// public class TesteFuncionario {

// public static void main(String[] args) {

// Cliente cliente = new Cliente();

// //Código omitido
// Poderíamos ter, no lado esquerdo, a classe FuncionarioAutenticavel, graças ao
// polimorfismo:

// public class TesteFuncionario {

// public static void main(String[] args) {

// FuncionarioAutenticavel cliente = new Cliente();

// //Código omitido
// Além disso, seria possível utilizarmos a classe Funcionario:

// public class TesteFuncionario {

// public static void main(String[] args) {

// Funcionario cliente = new Cliente();

// //Código omitido
// Mas causaria estranheza, pois ele seria ao mesmo tempo um funcionário e um
// cliente. Além disso, seria aberta a possibilidade de definirmos um salário
// para o cliente, algo que também não faria sentido. A classe Cliente poderia
// chamar métodos que não deveria, não queremos permitir isso.

// Abandonaremos esta solução, e tentaremos resolver este problema de outra
// forma, mas ainda utilizando a herança.

// O nosso problema é que a solução na qual o Cliente se torna um Funcionario
// não é eficiente.

// Entretanto, observando a classe FuncionarioAutenticavel percebemos que ela,
// na verdade, tem relação somente com a senha e o método autentica(), e não
// necessariamente com os funcionários, por isso, ela será renomeada para
// Autenticavel.

// O Eclipse renomeou essa classe, e automaticamente substituiu o nome dela em
// todos os lugares nos quais aparece.

// Apesar dessa alteração, como não alteramos a hierarquia, o Cliente continua
// sendo um Funcionario, já que a classe Autenticavel estende Funcionario.
// Precisamos cortar esta relação.

// Retornaremos à classe Autenticavel:

// public abstract class Autenticavel extends Funcionario {

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

// E eliminaremos o extends:

// public abstract class Autenticavel {

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

// Salvaremos, e observamos que o Eclipse aponta vários erros em diversas
// classes.

// Na classe Gerente, temos um problema pois não estamos mais estendendo
// indiretamente a classe Funcionario, por isso, não temos mais um getSalario.

// Para o Administrador temos um erro similar, não é possível sobrescrever o
// método getBonificacao(), já que deixamos de herdá-lo.

// Sendo assim, resolvemos o problema do Cliente mas acabamos criando um novo
// problema.

// Retornando à classe Cliente no Eclipse, removeremos o método criado
// automaticamente, deixando a classe da seguinte forma:

// public class Cliente extends Autenticavel {

// }
// Agora podemos observar, na classe TesteFuncionario, que o método setSalario
// deixou de funcionar. O removeremos da classe:

// public class TesteFuncionario {

// public static void main(String[] args) {

// Cliente cliente = new Cliente();

// Gerente nico = new Gerente();
// nico.setNome("Nico Steppat");
// nico.setCpf("223355646-9");
// nico.setSalario(2600.00);

// System.out.print(nico.getNome());
// System.out.print(nico.getBonificacao());

// }
// }

// No entanto, os métodos setNome(), setCpf(), e setSalario do Gerente(), todos
// deixaram de funcionar, porque agora o Gerente e o Administrador não herdam
// mais Funcionario.

// Para solucionar isso, diremos que o Gerente estende tanto a classe
// Autenticavel quanto a classe Funcionario. Isto se chama herança múltipla., o
// que utilizamos até o momento foi a herança simples.

// Abriremos a classe Gerente, e utilizaremos a vírgula **,** para sinalizar a
// herança múltipla:

// public class Gerente extends Autenticavel, Funcionario {

// //Codigo omitido

// }

// Isto não funciona no mundo Java. Apesar de existirem linguagens em que este
// método funciona.

// A herança múltipla não é utilizada no Java porque poderia gerar confusão.
// Imaginemos que a classe Funcionario tem uma senha, e um método setSenha(),
// como sabemos, a classe Autenticavel possui exatamente isto. Se o Gerente
// estender ambas, qual dos dois prevalece? Para evitar este tipo de problema,
// no Java, não há herança múltipla.

// Sendo assim, precisamos encontrar outra solução para nosso problema.

// Resolveremos isso utilizando interfaces.

// O que fizemos nesta aula foi demonstrar que a herança não nos atende em
// certas situações, no nosso caso, para o Cliente. Adiante, resolveremos o
// problema.

// Assim, faremos com que o Gerente estenda somente a classe Funcionario:

// public class Gerente extends Funcionario {

// //Codigo omitido

// }

// O mesmo para o Administrador:

// public class Administrador extends Funcionario {

// //Código omitido

// }

// Na classe TesteGerente, deixaremos as linhas de código referentes ao método
// autentica() em comentários:

// public class TesteGerente {

// public static void main(String[] args) {

// //Código omitido

// System.out.println(g1.getNome());
// System.out.println(g1.getCpf());
// System.out.println(g1.getSalario());

// //g1.setSenha(2222);
// //boolean autenticou = g1.autentica(2222);

// //System.out.println(autenticou);

// //Código omitido

// Na classe TesteSistema', temos vários erros pois agora o Gerente não pode
// acessar o SistemaInterno. Por enquanto, comentaremos as seguintes linhas de
// código:

// public class TesteSistema {

// public static void main(String[] args) {
// // Gerente g = new Gerente();
// // g.setSenha(2222);
// //
// // Administrador adm = new Administrador();
// // adm.setSenha(3333);
// //
// // SistemaInterno si = new SistemaInterno();
// // si.autentica(g);
// // si.autentica(adm);

// }
// }

// Agora nosso código voltou a funcionar. Para isso, removemos a relação entre
// Gerente e a classe Autenticavel, e ele voltou a estender somente a classe
// Funcionario, o mesmo foi feito com a classe Administrador.

// Adiante, trabalharemos com a classe Autenticavel, e introduziremos o conceito
// de interfaces.