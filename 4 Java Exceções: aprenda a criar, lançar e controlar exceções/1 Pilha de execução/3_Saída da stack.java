// Temos a seguinte classe com o método main:

// public class Principal {

// public static void main(String[] args) {
// System.out.println("MAIN BEGIN");
// m1();
// System.out.println("MAIN END");
// }

// public static void m1() {
// System.out.println("B BEGIN");
// m2();
// System.out.println("B END");
// }

// public static void m2() {
// System.out.println("A BEGIN");
// System.out.println("A END");
// }
// }

// Marque a alternativa que exibe corretamente a saída do programa ao ser
// executado:

// A)
// MAIN BEGIN
// A BEGIN
// B BEGIN
// B END
// A END
// MAIN END

// Errado. O primeiro método a ser chamado por main é aquele que exibe o texto B
// BEGIN e não A BEGIN.

// B)
// MAIN BEGIN
// B BEGIN
// A BEGIN
// A END
// B END
// MAIN END
// Exato!

// C)
// MAIN BEGIN
// B BEGIN
// A BEGIN
// A END
// B END

// Errado. Quase! Faltou a saída de MAIN END.