// Miguel estava realmente animado com a aula e resolveu melhorar sua classe de
// exceção EstoqueInsuficienteException, forçando o compilador a verificar se a
// exceção estaria sendo tratada. Para isso mudou a herança da classe conforme o
// código abaixo:

// public class EstoqueInsuficienteException extends Exception {

// public EstoqueInsuficienteException(String msg)
// {
// super(msg);
// }
// }

// Contudo, o código do método RealizaCompra passou a dar erro. Analise como
// está:

// public void RealizaCompra(Produto produto) {
// //outras instruções aqui...
// if (totalDeProdutosNoEstoque < 0) {
// throw new EstoqueInsuficienteException("Estoque insuficiente");
// }
// }

// O que Miguel precisa fazer para que seu método volte a compilar?

// A)
// public void RealizaCompra(Produto produto) throws new
// EstoqueInsuficienteException {
// //outras instruções aqui...
// if (totalDeProdutosNoEstoque < 0) {
// throw new EstoqueInsuficienteException();
// }
// }

// Errado. O uso de throws new só pode ser empregado dentro de um bloco de
// código, e não em assinatura de métodos.

// B)
// public void RealizaCompra(Produto produto) throws
// EstoqueInsuficienteException {
// //outras instruções aqui...
// if (totalDeProdutosNoEstoque < 0) {
// throw new EstoqueInsuficienteException("Estoque insuficiente");
// }
// }

// Isso aí! Precisamos mudar a assinatura do método para explicitar que ele pode
// lançar tal exceção.

// C)
// public void RealizaCompra(Produto produto) throw RuntimeException {
// //outras instruções aqui...
// if (totalDeProdutosNoEstoque < 0) {
// throw new EstoqueInsuficienteException();
// }
// }

// Errado. Quase lá, mas falta definir corretamente a exceção que poderá ser
// lançada pelo método.