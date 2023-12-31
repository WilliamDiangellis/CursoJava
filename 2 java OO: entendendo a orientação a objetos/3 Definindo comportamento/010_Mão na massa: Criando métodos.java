// Vamos começar a escrever nossos métodos.

// 1) Escreva o método deposita, que recebe um valor do tipo double. Lembre-se que quando 
// nosso método não retorna nenhum valor, devemos colocar a palavra especial void, ficando assim:

// public void deposita(double valor){

// }

// 2) Complete seu método deposita, fazendo com que some o valor recebido ao saldo da conta, não 
// se esqueça de utilizar o this

// //dentro da class Conta

// public void deposita(double valor){
//     this.saldo += valor;
// }

// 3) Crie agora o método saca, que também recebe um valor do tipo double, nesse caso, nosso 
// método deve retornar um boolean, portanto não se esqueça do return

// public boolean saca(double valor){
//     if(this.saldo >= valor){
//         this.saldo -= valor;
//         return true;
//     } else {
//         return false;
//     }
// }

// 4) Escreva agora o método transfere, ele deve também retornar um booleano mas agora ele 
// receberá uma Conta que será o destino, e o valor a ser transferido.

// public boolean transfere(double valor, Conta destino){
//     if(this.saldo >= valor){
//         this.saldo -= valor;
//         destino.deposita(valor);    
//         return true;
//     }
//     return false;
// }

// 5) Não se esqueça de testar os seus métodos, para isso, crie uma classe 
// (utilizamos o nome TestaMetodos) e escreva o main, veja se está tudo dando certo!

// 6) Fica como desafio alterar o método transfere para reutilizar nosso código implementado 
// em saca para simplificar o código.

// Opinião do instrutor

// Até o momento, nosso código da classe Conta está assim:


// public class Conta {

//     double saldo;
//     int agencia;
//     int numero;
//     String titular;

//     public void deposita(double valor) {
//         this.saldo = this.saldo + valor;
//     }

//     public boolean saca(double valor) {
//         if(this.saldo >= valor) {
//             this.saldo -= valor;
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public boolean transfere(double valor, Conta destino) {
//         if(this.saldo >= valor) {
//             this.saldo -= valor;
//             destino.deposita(valor);
//             return true;
//         }
//         return false;
//     }
// }
