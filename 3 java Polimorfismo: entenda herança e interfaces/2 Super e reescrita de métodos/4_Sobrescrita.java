// Vimos que a sobrescrita é um conceito importante na herança, pois permite
// redefinir um comportamento previsto na classe mãe através da classe filha.

// Agora veja a classe Veiculo abaixo:

// class Veiculo {

// public void liga() {
// // alguma implementação
// }
// }

// E a classe filha Carro:

// class Carro extends Veiculo {
// // ????
// }

// No que aprendemos até agora, qual dos métodos abaixo inserido no lugar de //
// ???? sobrescreve corretamente o método liga?

// A)
// public void liga(int tentativas) {
// // implementação
// }

// Errado, pois introduzimos um novo parâmetro (tentativas). O que fizemos aqui
// não é sobrescrita e sim sobrecarga.

// Falaremos mais sobre a sobrecarga na outra atividade.

// B)
// private void liga() {
// // implementação
// }

// Errado, pois o método foi declarado como private. Como regra de ouro, na
// sobrescrita a visibilidade não pode diminuir, deve ser a mesma ou maior!

// C)
// public int liga() {
// // implementação
// }

// Errado, pois alteramos o tipo do retorno do método. Repare que o método na
// classe Veiculo tem o retorno void.

// D)
// public void liga() {
// // implementação
// }

// Correto! Repare que o método possui a mesma assinatura. Isto é, a mesma
// visibilidade, mesmo retorno, mesmo nome e os mesmos parâmetros.