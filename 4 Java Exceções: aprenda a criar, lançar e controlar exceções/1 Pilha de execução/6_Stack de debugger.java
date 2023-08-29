// Temos o seguinte código sendo executado através do debugger do Eclipse.

// package alura;

// public class Main {

// public static void main(String[] args) {
// System.out.println("MAIN BEGIN");
// m1();
// System.out.println("MAIN END");
// }
// }

// Sobre as informações exibidas, marque apenas as afirmações verdadeiras:

// Alternativa correta
// Nosso código esta parado na linha 7.

// Exato. Através do debugger podemos saber em qual linha do nosso programa
// estamos.

// A)
// Se clicarmos no ícone do Step Into (F5) entraremos dentro do método m1 para
// que possamos acompanhar sua execução.
// Exato! Isso permite depurar o método também.

// B)
// A instrução System.out.println("MAIN END"); já foi executada.
// Falso. O depurador esta parado na linha 7 e a referida instrução esta na
// linha 8, logo, não foi executada.

// C)
// Se clicarmos no ícone do Step Over (F6) entraremos dentro do método m1 para
// que possamos acompanhar sua execução.
// Falso. Na verdade, o step over executará o método m1 sem que possamos
// interagir com suas instruções. Isso é interessante, quando queremos depurar
// uma linha após a chamada de um método, evitando assim uma depuração
// desnecessária.