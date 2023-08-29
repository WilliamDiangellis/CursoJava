// Olá!

// Para finalizarmos o curso, veremos onde a herança é utilizada no mundo Java.

// O Java possui uma biblioteca específica para a criação de aplicações para
// Desktop, nela há diversas classes para representarmos botões, ou campos de
// texto, por exemplo.

// No Eclipse, com o atalho "Ctrl + Shift + T" podemos buscar qualquer classe.
// No caso, abriremos a JTextField, ela serve para a criação de um campo de
// texto.

// Trata-se de uma classe complicada, e não veremos detalhes sobre a sua
// constituição. Por ora, observaremos a seguinte linha:

// //Código omitido

// public class JTextField extends JTextComponent implements SwingConstants {

// //Código omitido

// Ou seja, temos a classe JTextField, que é um JTextComponent, e implementa
// SwingConstants.

// Como podemos observar, temos aqui a utilização da herança.

// Pressionando a tecla "Ctrl", clicaremos sobre a classe JTextComponent para
// abri-la:

// //Código omitido

// public abstract class JTextComponent extends JComponent implements
// Scrollable, Accessible {

// //Código omitido

// É uma classe abstrata, ou seja, é um conceito. Por que ela assume essa
// natureza? Porque há outras classes concretas que dependem desta mesma
// abstração, elas representam objetos concretos que são visíveis ao usuário
// final, já a classe abstrata serve para o polimorfismo, e para evitar a
// repetição de código.

// Abriremos uma nova classe, a JTextArea. Podemos ver que ela também é um
// JTextComponent:

// //Código omitido

// public class JTextArea extends JTextComponent {

// //Código omitido

// A própria classe JTextComponent tem uma classe mãe, além de implementar uma
// interface. Ao observarmos a hierarquia como um todo, vemos que ela é bastante
// complexa.

// O conceito de herança é bastante utilizado em aplicações Android, aqueles que
// pretendem seguir este caminho da programação costumam utilizar com
// frequência.

// Outro exemplo comum é para a conexão com banco de dados, onde temos de enviar
// comandos para referido banco. Esta ideia independe de qual banco utilizamos,
// pode ser MySQL, Oracle, ou outros. Para isso, há uma ideia genérica, que é a
// Connection, por meio da qual enviamos estes comandos.

// Internamente, apesar de os diferentes bancos funcionarem de formas
// diferentes, para a Connection isso não importa.

// Abriremos a interface Connection:

// //Código omitido

// public interface Connection extends Wrapper, AutoCloseable {

// //Código omitido

// Podemos ver, inclusive, que ela estende outras interfaces. Ela contém uma
// série de cláusulas para o envio de comandos. Ao criarmos um banco de dados,
// implementamos esta interface, e somos compelidos a implementar seus métodos.

// Este é um exemplo clássico de interfaces. Vamos praticar e até a próxima!