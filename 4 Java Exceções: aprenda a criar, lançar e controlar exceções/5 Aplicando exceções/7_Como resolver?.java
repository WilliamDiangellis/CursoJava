// Johann criou uma exceção SaldoInsuficienteException, como foi apresentado no
// último vídeo:

// public class SaldoInsuficienteException extends Exception{

// public SaldoInsuficienteException(String msg) {
// super(msg);
// }
// }

// Depois, ele alterou a implementação do método saca para lançar uma exceção:

// public abstract class Conta {

// //atributos e outros métodos omitidos

// public void saca(double valor) throws SaldoInsuficienteException{

// if(this.saldo < valor) {
// throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " +
// valor);
// }

// this.saldo -= valor;
// }
// }

// Tudo bem até aqui, mas a implementação do método saca na classe ContaCorrente
// não quer compilar:

// public class ContaCorrente extends Conta implements Tributavel {

// //atributos e outros métodos omitidos

// @Override
// public void saca(double valor) {
// double valorASacar = valor + 0.2;
// super.saca(valorASacar);
// }
// }

// Qual é o problema?

// A)
// Como a exceção é unchecked, não é preciso usar throws
// SaldoInsuficienteException na assinatura do método saca da classe
// ContaCorrente.
// Errado, pois a exceção é checked.

// B)
// Como a exceção é checked, devemos tirar throws SaldoInsuficienteException na
// assinatura do método saca da classe Conta.
// Errado, ao tirar throws SaldoInsuficienteException da assinatura do método
// saca da classe Conta o código não compila mais.

// C)
// Como a exceção é checked, devemos usar throws SaldoInsuficienteException na
// assinatura do método saca da classe ContaCorrente.
// Correto! Repare que chamamos super.saca(..) no método saca da classe
// ContaCorrente. O compilador perecebe que o método da classes mãe tem o throws
// de uma exceção checked é obriga o método filho tomar uma atitude.