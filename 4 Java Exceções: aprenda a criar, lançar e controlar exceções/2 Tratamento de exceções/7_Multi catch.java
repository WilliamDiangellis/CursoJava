// Temos o seguinte código:

// try {
// System.out.println(1/0);
// } catch(ArithmeticException ex) {
// ex.printStackTrace();
// } catch(NullPointerException ex) {
// ex.printStackTrace();
// }

// Marque a opção que demonstra corretamente o código anterior através de
// Multi-Catch:

// A)
// try {
// System.out.println(1 / 0);
// } catch (ArithmeticException || NullPointerException ex) {
// ex.printStackTrace();
// }

// Errado. Através de um | (pipe) e não || (ou) na cláusula catch, podemos
// capturar mais de uma exceção. Com isso, podemos ter um único bloco para
// tratar um ou mais exceções.

// B)
// try {
// System.out.println(1 / 0);
// } catch (ArithmeticException | NullPointerException ex) {
// ex.printStackTrace();
// }

// Certo. Através de um | (pipe) na cláusula catch, podemos capturar mais de uma
// exceção. Com isso, podemos ter um único bloco para tratar um ou mais
// exceções.

// C)
// try {
// System.out.println(1 / 0);
// } catch (ArithmeticException && NullPointerException ex) {
// ex.printStackTrace();
// }

// Errado. Através de um | (pipe) e não && na cláusula catch, podemos capturar
// mais de uma exceção. Com isso, podemos ter um único bloco para tratar um ou
// mais exceções.