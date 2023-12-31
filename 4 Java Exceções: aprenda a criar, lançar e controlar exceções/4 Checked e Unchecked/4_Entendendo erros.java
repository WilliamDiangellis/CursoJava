// Anteriormente, falamos sobre a hierarquia dos erros.

// Para acessibilidade: A hierarquia abordada contém uma classe mãe chamada
// Throwable. A partir dela, formam-se duas categorias: uma para exceções onde o
// desenvolvedor pode gerenciar e uma outra categoria voltada para erros da
// máquina virtual.

// As exceções ArithmeticException, NullPointerException e MinhaException herdam
// de RuntimeException, que por sua vez, herda de Exception e Exception herda de
// Throwable, formando a primeira categoria de exceções. Já a segunda categoria
// de erros possui StackOverflowError, que herda de VirtualMachineError, que
// herda de Error, que herda de Throwable, formando a segunda categoria.

// Lembrando que a segunda categoria é a hierarquia utilizada pela máquina
// virtual. Entretanto, o que nos interessa é a hierarquia da Exception, a
// primeira categoria. E por que a classe ArithmeticException não estende
// diretamente da classe Exception? Por que a MinhaExcecao não estende a classe
// Exception? Vamos tentar resolver esse enigma.

// Acessaremos a classe MinhaExcecao, e estenderemos diretamente da classe
// Exception. Repare que o código já para de compilar. Apareceu algum problema.
// Vamos ver a classe Fluxo.

// Existe um erro de compilação na linha do throw new MinhaExcecao("deu muito
// errado"). Se retirarmos a palavra throw dessa frase, o problema desaparecerá.
// O problema é que o Java faz uma separação. Duas categorias de exceções são
// criadas dentro das exceções para o desenvolvedor de aplicações.

// A primeira categoria é a que estende de RuntimeException, e a outra é a que
// estende diretamente de Exception. O compilador faz uma verificação sintática
// para ver quem dá throw nessas exceções. Isso significa que a exceção exige
// que fique explícito na assinatura do método que estamos jogando a exceção:

// private static void metodo2() throws MinhaExcecao {
// System.out.println("Ini do metodo2");
// throw new MinhaExcecao("deu muito errado");

// //System.out.println("Fim do metodo2");
// }

// Dessa forma, dizemos que o método joga uma exceção do tipo MinhaExcecao.
// Agora, o método volta a compilar. Quando usamos throw new de uma exceção que
// estende diretamente da classe Exception, o compilador exige que coloquemos,
// explicitamente, throws na assinatura do método.

// A ideia é que o "perigo" — a exceção — fique explícita na assinatura do
// método. Com isso, temos duas categorias novas de Exception. A primeira é a
// que estende de RuntimeException e se chama Unchecked. A segunda categoria é a
// que estende diretamente de Exception, chamada de Checked.

// ##Por que Checked e Unchecked?##

// Na categoria Unchecked, o compilador não dá muita importância. Se dermos
// throws ou não, ele não toma atitude, ou seja, ele não verifica — unchecked
// (não verificado pelo compilador).

// Já a categoria Checked é verificada pelo compilador. No metodo2(), somos
// obrigados a colocar throws na assinatura do método, pois a exceção do tipo
// MinhaExcecao estende diretamente de Exception e, por isso, é verificada pelo
// compilador.

// Legal! Mas repare que a chamada do metodo2(), no metodo1(), não compila mais.
// Agora, isso acontece porque o compilador detecta que existe uma exceção
// checked na assinatura e, por isso, é necessário também deixar explícito o
// throws MinhaExcecao na assinatura do metodo1().

// private static void metodo1() throws MinhaExcecao {}

// Podemos colocar throws no método ou transferir a exceção para a categoria
// unchecked. Repare que colocamos throws nos dois métodos, mas não o colocamos
// em main() e, mesmo assim, o código compilou. Isso aconteceu porque estamos
// fazendo um tratamento da exceção com o try-catch. Ou seja, temos duas formas
// de resolver uma exceção checked.

// Ou colocamos o throws na assinatura, ou fazemos um try-catch. Por exemplo:

// private static void metodo1() {
// System.out.println("Ini do metodo1");
// try {
// metodo2();
// } catch(MinhaExcecao ex) {}
// System.out.println("Fim do metodo1");
// }

// Assim, o compilador não se manifestou, pois estamos resolvendo o problema da
// exceção. Se estamos resolvendo, não é necessário colocar o throws na
// assinatura do método. Considerando que foi só um exemplo, vamos deixar como
// estava, pois já temos um try-catch em main().

// O conceito de exceções existe em várias linguagens, mas o que acabamos de
// estudar — checked e o unchecked — é algo específico do mundo Java.

// Entendemos que todas as categorias são exceções, são como bombas que caem na
// pilha e mudam o fluxo na hora da execução, mas a diferença entre eles é na
// hora de compilar. O Checked e o Unchecked estão relacionados ao processo de
// compilação.