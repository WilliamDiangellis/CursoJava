// Já vimos nesse curso duas formas de capturar várias exceções através do bloco
// catch. (1) A forma tradicional, que funciona desde inicio do Java,
// simplesmente repete o bloco catch para cada exceção:

// try {
// metodoPerigosoQuePodeLancarVariasExcecoes();
// } catch(MinhaExcecao ex) {
// ex.printStackTrace();
// } catch(OutraExcecao ex) {
// ex.printStackTrace();
// }

// E (2) a forma mais atual, que foi introduzido no Java 7, permite definir as
// várias exceções no mesmo bloco (multi catch):

// try {
// metodoPerigosoQuePodeLancarVariasExcecoes();
// } catch(MinhaExcecao | OutraExcecao ex) { //multi-catch
// ex.printStackTrace();
// }

// Você vai encontrar ambas as formas no seu dia a dia de desenvolvedor Java.
// Agora, veja assinatura do "método perigoso" em questão:

// //funciona, podemos colocar duas exceções na assinatura
// public void metodoPerigosoQuePodeLancarVariasExcecoes() throws MinhaExcecao,
// OutraExcecao{
// //código omitido
// }

// Vimos mais uma variação do catch, não sintática, mas conceitual. Qual
// afirmação abaixo pode ser usada para capturar todas exceções desse "método
// perigoso"?

// Importante: Assumindo que ambas as exceções são do tipo checked!

// A)
// try {
// metodoPerigosoQuePodeLancarVariasExcecoes();
// } catch(RuntimeException ex) {
// ex.printStackTrace();
// }

// Errado. Esse código só funcionasse se as exceções realmente fossem unchecked.
// Como isso não é o caso, o código nem compila.

// Lembrando, para ser unchecked precisa estender a classe RuntimeException.

// B)
// try {
// metodoPerigosoQuePodeLancarVariasExcecoes();
// }

// Errado, o try desse forma não é válido. Em geral, apenas um try isolado nunca
// funciona. Precisa ter "algo" a mais. Ainda vamos veremos em detalhe o que
// significo isso.

// C)
// try {
// metodoPerigosoQuePodeLancarVariasExcecoes();
// } catch(Exception ex) {
// ex.printStackTrace();
// }

// Correto. Criamos um catch genérico que captura qualquer exceção, incluindo
// exceções checked.

// Isso pode parecer uma boa prática, mas normalmente não é. Como regra geral,
// sempre tente ser mais especifico possível no bloco catch favorecendo vários
// blocos catch ou usando multi-catch.