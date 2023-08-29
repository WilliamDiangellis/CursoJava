// Temos o seguinte código que faz uso dos blocos try e catch:

// public class Principal {

// public static void main(String[] args) {

// String nome = "Alura";
// System.out.println("ANTES");

// try {
// System.out.println(nome);
// } catch(ArrayIndexOutOfBoundsException ex) {
// System.out.println("CATCH");
// }

// System.out.println("DEPOIS");
// }
// }

// Sobre a saída do código, marque a opção verdadeira:

// A)
// Saída:

// ANTES
// Alura
// DEPOIS
// Exato. Nenhum erro acontecerá e por isso a condição catch não será chamada.

// B)
// Saída:

// ANTES
// Alura
// CATCH
// DEPOIS
// Errado, Nenhum erro acontecerá e por isso o bloco catch não será chamado.

// C)
// O código não compila, pois só podemos usar o bloco try com um trecho de
// código que lance uma exceção.
// Errado. Se usamos o bloco try é porque eventualmente algum erro pode
// acontecer no seu bloco durante sua execução, ou seja, o erro pode ou não
// acontecer.

// D)
// Saída:

// ANTES
// Alura
// Errado. Nenhum erro acontecerá e por isso o bloco catch não será chamado.
// Chamando ou não o bloco catch, a instrução logo após o bloco catch será
// chamada e por conseguinte exibirá no console o texto "DEPOIS".

// Parabéns, você acertou!
