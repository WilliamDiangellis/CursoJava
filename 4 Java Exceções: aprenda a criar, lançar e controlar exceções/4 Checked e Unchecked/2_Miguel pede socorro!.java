// Miguel está seguindo o curso e decidiu criar sua própria exceção para
// representar a violação de uma regra em sua aplicação de estoque. Escreveu o
// código abaixo:

// public class EstoqueInsuficienteException {
// }

// Em seguida, todo feliz e faceiro, foi usar a exceção recém-criada em sua
// aplicação:

// public void RealizaCompra(Produto produto) {
// //outras instruções aqui...
// if (totalDeProdutosNoEstoque < 0) {
// throw new EstoqueInsuficienteException();
// }
// }

// Mas está recebendo um erro de compilação na hora de instanciar a classe.

// Ajude Miguel indicando o que ele precisa fazer para que a aplicação volte a
// funcionar.

// A)
// Miguel precisa fazer com o objeto lançado através da palavra reservada throw
// seja convertido para a classe Throwable. Assim:

// public void RealizaCompra(Produto produto) {
// //outras instruções aqui...
// if (totalDeProdutosNoEstoque < 0) {
// throw (Throwable)new EstoqueInsuficienteException();
// }
// }

// Errado. Ainda vai haver um erro de compilação nesse código. Experimente em
// seu ambiente e veja que esse erro vai indicar um caminho para a resposta
// certa.

// B)
// Miguel precisa fazer com a classe EstoqueInsuficienteException herde da
// classe Object, porque a palavra reservada throw só pode ser utilizada em
// objetos de classes que herdem explicitamente de Object. Assim:

// public class EstoqueInsuficienteException extends Object {
// }

// Errado. EstoqueInsuficienteException já herda de Object. Mesmo assim, ainda
// vai haver um erro de compilação nesse código.

// C)
// Miguel precisa fazer com a classe EstoqueInsuficienteException herde de
// alguma classe na hierarquia de Throwable. Por exemplo RuntimeException:

// public class EstoqueInsuficienteException extends RuntimeException {
// }

// Correto. Isso aí!