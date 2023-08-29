// Dada a classe Veiculo:

// public class Veiculo {
// public void liga() {
// System.out.println("Ligando Veiculo");
// }
// }

// A classe Carro:

// class Carro extends Veiculo {
// public void liga() {
// System.out.println("Ligando Carro");
// }
// }

// E a classe Moto:

// class Moto extends Veiculo {
// public void liga() {
// System.out.println("Ligando Moto");
// }
// }

// Veja o código com o método main:

// public class Teste {

// public static void main(String[] args) {

// Veiculo m = new Moto();
// m.liga();

// Veiculo c = new Carro();
// c.liga();
// }

// }

// Ao executar, o que será impresso no console?

// A)
// Ligando Veiculo
// Ligando Veiculo
// Errado! Sempre será chamado o método mais específico. A saída correta é:
// Ligando Moto
// Ligando Carro

// B)
// O código não compila, pois o Moto não é um Veiculo.
// Errado, o código compila e roda. A saída correta é:
// Ligando Moto
// Ligando Carro

// C)
// Ligando Veiculo
// Ligando Moto
// Errado! Primeiro é chamado o método liga de Moto, depois de Veiculo.

// D)
// Ligando Moto
// Ligando Carro
// Correto! Sempre será chamado o método mais específico, primeiro o método de
// Moto, depois de Carro.