// Iremos trabalhar mais com a primeiraConta. Lembrando que nosso código se encontra deste modo:

// public class CriaConta { 

//     public static void main(String[] args) {
//          Conta primeiraConta = new Conta();
//          primeiraConta.saldo = 200; 
//          System.out.println(primeiraConta.saldo); 
//     }
// }    COPIAR CÓDIGO
// Além de atribuirmos valores utilizando sinal =, podemos fazer uso de outros elementos 
// da sintaxe básica do Java, como +=. Este elemento significa que o valor final de primeiraConta 
// é aquele que já foi atribuído anteriormente (200) mais 100.

// public class CriaConta { 

//     public static void main(String[] args) {
//         Conta primeiraConta = new Conta();
//         primeiraConta.saldo = 200; 
//         System.out.println(primeiraConta.saldo); 

//         primeiraConta.saldo += 100;
//         System.out.println(primeiraConta.saldo);
//     }
// }    

// Ao executarmos a aplicação, veremos que será impresso o valor de 300.

// impresso o valor 300

// O novo valor de primeiraConta.saldo é o resultado da soma do saldo anterior 200, mais 100. 
// Chegando ao valor de 300. A variável primeiraConta é uma referência à uma conta específica, 
// que chamamos de objeto.

// novo saldo de primeira.conta

// Iremos modificar outras contas do nosso banco. Faremos uma referência à outra conta bancária 
// através da referência segundaConta.

// segunda conta

// Como já vimos, daremos uma instanciação através do nosso código base embutido em Conta. Com isso, 
// já temos os atributos criados (saldo, agência, número e titular) na conta nova que iremos trabalhar. 
// Adicionaremos, também, a palavra chave new. A informação devolvida por new será guardada dentro 
// da referência segundaConta, que será uma variável do tipo Conta.

// public class CriaConta { 

//     public static void main(String[] args) {
//         Conta primeiraConta = new Conta();
//         primeiraConta.saldo = 200; 
//         System.out.println(primeiraConta.saldo); 

//         primeiraConta.saldo += 100;
//         System.out.println(primeiraConta.saldo);

//         Conta segundaConta = new Conta();
//     }
// }

// Declararemos que em segundaConta há um saldo de 50.

// public class CriaConta { 

//     public static void main(String[] args) {
//             Conta primeiraConta = new Conta();
//         primeiraConta.saldo = 200; 
//         System.out.println(primeiraConta.saldo); 

//         primeiraConta.saldo += 100;
//         System.out.println(primeiraConta.saldo);

//         Conta segundaConta = new Conta();
//         segundaConta.saldo = 50;
//         }
// }

// Portanto, segundaConta possui um saldo de 50 reais. Esse valor não possui qualquer ligação com o 
// saldo de primeiraConta.

// saldo segunda.conta

// Para testarmos essa individualidade das contas, podemos pedir o saldo de primeiraConta e adicionar 
// uma String "primeira conta tem". Faremos o mesmo procedimento com segundaConta.

// Lembre-se de utilizar o + para a concatenação dos elementos.

// public class CriaConta { 

//     public static void main(String[] args) {
//         Conta primeiraConta = new Conta();
//         primeiraConta.saldo = 200; 
//         System.out.println(primeiraConta.saldo); 

//         primeiraConta.saldo += 100;
//         System.out.println(primeiraConta.saldo);

//         Conta segundaConta = new Conta();
//         segundaConta.saldo = 50;

//         System.out.println("primeira conta tem " + primeiraConta.saldo);
//         System.out.println("segunda conta tem " + segundaConta.saldo);
//     }
// }

// Ao executarmos a aplicação, veremos o saldos das contas apresentandos individualmente, pois 
// são instâncias diferentes.

// saldo de contas
// Não podemos simplesmente escrever no nosso código saldo = 50, pois o programa não achará a variável saldo 
// no escopo, e ainda que achasse, existem múltiplos saldos devido a variedade de contas bancárias. 
// Por isso, sempre devemos escrever a referência . atributo, ou seja, trabalhar de uma forma orientada 
// ao objeto.