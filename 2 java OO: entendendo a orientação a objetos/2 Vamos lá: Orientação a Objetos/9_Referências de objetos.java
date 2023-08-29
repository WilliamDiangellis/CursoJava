// Usando o aprendizado sobre referências e atribuição de valores vamos definir
// uma classe abaixo.

// public class Conta {
// double saldo;
// }

// A partir desta classe, diga o que imprime o código:

// public class Teste {
// public static void main(String [] args) {
// Conta minhaConta = new Conta();
// minhaConta.saldo = 500.0;
// Conta outraConta = minhaConta;
// outraConta.saldo += 1000.0;
// System.out.println(minhaConta.saldo);
// }
// }

// A)
// Imprime 500.0
// Errado, como as duas variáveis referenciam o mesmo objeto em memória o valor
// de minhaConta será alterado pela atribuição feita em outraConta.

// B)
// Imprime 1000.0
// Errada, o valor adicionado usando '+=' será adicionado ao valor 500 já
// preenchido em minhaConta.

// C)
// Imprime 1500.0
// COrreto. Imprime 1500, pois as duas referências (minhaConta e outraConta)
// apontam para o mesmo objeto, fazendo com que a quantidade 1000 seja somada à
// anterior 500.