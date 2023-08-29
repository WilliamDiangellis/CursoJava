// O Pedro escreveu o método saca abaixo que não está compilando:

// //assumindo que esse método está dentro da classe Conta que possui os
// atributos
// public void saca(double valor) {

// if(saldo >= valor) {
// saldo -= valor;
// return true;
// } else {
// return false;
// }
// }

// O que está errado com o método?

// A)
// É necessário usar o this no atributo.
// Errado, pois o this é opcional.

// B)
// O método não pode ser public.
// Errado, pois o método pode usar o public (ou não). Veremos o motivo de usar o
// public mais para frente.

// C)
// Faltou definir o tipo correto do retorno no método.
// Correto, o método não pode ser declarado como void. Correto é usar o tipo
// boolean:

// public boolean saca(double valor) {

// if(saldo >= valor) {
// saldo -= valor;
// return true;
// } else {
// return false;
// }
// }