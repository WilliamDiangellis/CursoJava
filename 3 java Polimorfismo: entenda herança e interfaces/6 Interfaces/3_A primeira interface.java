// Anteriormente, falávamos sobre a inexistência de herança múltipla no Java.
// Ainda não conseguimos resolver nosso problema com as classes Cliente,
// Administrador e Gerente.

// Nosso objetivo é que essas três classes consigam acessar o SistemaInterno,
// considerando que apenas o Administrador e o Gerente são funcionários, e
// herdam Funcionario.

// Teremos que estabelecer algum tipo de relacionamento entre a classe Gerente e
// a Autenticavel, que não poderá ser a herança, já que não é possível que o
// Gerente estenda duas classes ao mesmo tempo, esta outra relação se chama
// interface.

// No Eclipse, temos as classes Autenticavel, Administrador, Gerente e Cliente
// abertas.

// Inicialmente, precisaremos transformar a classe Autenticavel em uma
// interface, que é uma classe abstrata, com todos os métodos abstratos. Dentro
// de uma interface, não há nada concreto.

// A classe Autenticavel tem os seguintes atributos:

// public abstract class Autenticavel {

// private int senha;

// public void setSenha(int senha) {
// this.senha = senha;
// }

// public boolean autentica(int senha) {
// if(this.senha == senha) {
// return true;
// } else {
// return false;
// }
// }
// }

// Temos o atributo private int senha, que é concreto. Ele que permite a
// atribuição de um valor para o objeto que será autenticável. Nós o removeremos
// da classe, pois não queremos manter nenhum atributo concreto.

// Em seguida, temos uma implementação do método setSenha(). Como sabemos,
// métodos abstratos não têm implementação, por isso, removeremos o corpo do
// método e o declararemos abstrato:

// public abstract class Autenticavel {

// public abstract void setSenha(int senha);

// public boolean autentica(int senha) {
// if(this.senha == senha) {
// return true;
// } else {
// return false;
// }
// }
// }

// O mesmo será feito para o método autentica():

// public abstract class Autenticavel {

// public abstract void setSenha(int senha);

// public abstract boolean autentica(int senha);

// }

// Pronto, eliminamos da classe tudo que era concreto, mantivemos apenas as
// assinaturas dos métodos. Agora podemos transformá-la em uma interface.

// Para isso, em vez de colocarmos a palavra class, utilizamos a palavra
// interface:

// public abstract interface Autenticavel {

// public abstract void setSenha(int senha);

// public abstract boolean autentica(int senha);

// }

// Se tentarmos inserir algo concreto na interface, o código sequer compila.

// Utilizaremos a analogia de um contrato, que se chama "Autenticavel":

// //contrato Autenticavel
// public abstract interface Autenticavel {

// public abstract void setSenha(int senha);

// public abstract boolean autentica(int senha);

// }

// Este contrato precisa ser assinado. Quem o faz, está obrigado a implementar
// os métodos setSenha, e o autentica():

// //contrato Autenticavel
// //quem assinar esse contrato precisa implementar
// //metodo setSenha
// //metodo autentica
// public abstract interface Autenticavel {

// public abstract void setSenha(int senha);

// public abstract boolean autentica(int senha);

// }

// Assim podemos entender o que está escrito na sintaxe Java.

// O que fizemos foi alterar a classe, passando para uma interface, removendo
// tudo que nela havia de concreto.

// Em seguida, a colocaremos em prática, para verificarmos o seu funcionamento.

// Na classe Cliente, vemos que ela já apresenta um erro de compilação, pois
// temos a referência extends:

// public class Cliente extends Autenticavel {

// }

// Utilizamos este termo somente quando queremos herdar algo de outra classe,
// mas com a interface, estamos "assinando um contrato", isto significa no mundo
// Java que estamos implementando, por isso, utilizamos o implements:

// public class Cliente implements Autenticavel {

// }

// Precisamos implementar aquilo que a interface definiu, podemos ler também
// como: "a classe Cliente assinou o contrato Autenticavel".

// Como ela assinou o contrato, agora precisa cumprir a obrigação, que é de
// implementar os métodos setSenha() e autentica(). Podemos utilizar a função
// automática do Eclipse, e ele nos fornece o seguinte código:

// public class Cliente implements Autenticavel {

// @Override
// public void setSenha(int senha) {
// //TODO Auto-generated method stub
// }

// @Override
// public boolean autentica(int senha) {
// //TODO Auto-generated method stub
// return false;
// }

// }

// Ele gerou os métodos concretos, agora nos cabe fazer a implementação:

// public class Cliente implements Autenticavel {

// private int senha;

// @Override
// public void setSenha(int senha) {
// this.senha = senha;
// }

// @Override
// public boolean autentica(int senha) {
// if(this.senha == senha) {
// return true;
// } else {
// return false;
// }
// }
// }

// Assim, obrigamos o Cliente a ter uma senha e um método autentica(). Quem for
// Autenticavel, deverá implementar estes métodos.

// Visualmente, isto é representado por uma seta pontilhada, que parte da classe
// Cliente e aponta para a interface Autenticavel.

// A seguir, repetiremos o mesmo processo para o Administrador e o Gerente -
// ambos estarão conectados à interface por uma seta pontilhada, indicando que
// ambos também "assinam o contrato" Autenticavel.

// Ao passo em que só é possível fazer com que uma classe herde apenas uma outra
// classe, podemos fazer com que sejam "assinados" tantos "contratos" quanto
// necessário, ou seja, não há limite para o número de implementações.

// Veremos mais sobre isso adiante.