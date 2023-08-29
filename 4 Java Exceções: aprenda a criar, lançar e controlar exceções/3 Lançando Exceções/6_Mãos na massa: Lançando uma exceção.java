// Vamos lançar nossa primeira exceção! Para isso, siga os passos abaixo:

// 1) No projeto java-pilha, faça uma cópia da classe Fluxo, renomeando-a para FluxoComTratamento.

// 2) Na classe FluxoComTratamento, no metodo2, apague por completo o laço for.

// 3) Instancie uma ArithmeticException:

// ArithmeticException exception = new ArithmeticException();

// 4) Agora, lance a exceção:

// private static void metodo2() {
//     System.out.println("Ini do metodo2");
//     ArithmeticException exception = new ArithmeticException();
//     throw exception;
// }

// 5) Não é necessário guardar a exceção em uma referência, você pode lançá-la diretamente em uma linha só:

// private static void metodo2() {
//     System.out.println("Ini do metodo2");
//     throw new ArithmeticException();
// }

// 6) E você também pode enviar uma mensagem por parâmetro para o construtor da exceção:

// private static void metodo2() {
//     System.out.println("Ini do metodo2");
//     throw new ArithmeticException("Deu erro");
// }

// Na próxima aula você verá como criar sua própria exceção!