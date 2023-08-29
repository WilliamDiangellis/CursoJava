// A Ana está praticando OO com Java e criou uma outra classe Conta com apenas
// dois atributos e um método.
// No entanto, como o uso do this é opcional, ela está com dúvida onde se usa a
// palavra chave this dentro de uma classe.

// Ela nos enviou o código abaixo usando os caracteres [] em vários lugares,
// segue o código:

// class Conta {

// [1] double saldo;
// int numero;

// void deposita([2] double valor) {
// [3]saldo = [4]saldo + [5]valor;
// }
// }

// Repare que temos [1], [2], [3], [4] e [5] como possíveis lugares para colocar
// o this, mas qual realmente irá funcionar e ser compilado?

// Selecione uma alternativa

// A)
// [1], [2] e [3]
// Errado!

// B)
// Apenas [3] e [4]
// Usamos o this dentro de um método para acessar um atributo:

// class Conta {

// double saldo;
// int numero;

// void deposita(double valor) {
// this.saldo = this.saldo + valor;
// }
// }

// C)
// Apenas [1]
// Errado!

// D)
// Apenas [1] e [2]
// Errado!

// E)
// Apenas [5]
// Errado!