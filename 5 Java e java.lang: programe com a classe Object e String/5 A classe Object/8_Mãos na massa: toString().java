// Vamos sobrescrever o método toString() da classe Object alterando as classes contas.

// 1) Abra a classe Conta e coloque o método toString com as informações básicas da conta:

// @Override
// public String toString() {
//     return "Numero: " + this.numero + ", Agencia: " + this.agencia;
// }

// 2) Rode a classe Teste para criar uma ContaCorrente e ContaPoupanca. A classe deve ficar parecida com essa:

// public class Teste {

//     public static void main(String[] args) {

//         Object cc = new ContaCorrente(22, 33);
//         Object cp = new ContaPoupanca(33, 22);

//         System.out.println(cc);
//         System.out.println(cp);
//     }
// }

// A saída deve ser:

// Numero: 33, Agencia: 22 
// Numero: 22, Agencia: 33

// 3) Repare que não tem como distinguir pela saida se é uma ContaPoupanca ou ContaCorrente. Por isso vamos sobrescrever o método nas classes filhas.

// Abra a classe ContaPoupanca e adicione:

// @Override
// public String toString() {
//     return "ContaPoupanca, " + super.toString();
// }

// E na classe ContaCorrente deve ficar:

// @Override
// public String toString() {
//     return "ContaCorrente, " + super.toString();
// }

// 4) Execute novamente classe Teste. A saída deve ser:

// ContaCorrente, Numero: 33, Agencia: 22 
// ContaPoupanca, Numero: 22, Agencia: 33