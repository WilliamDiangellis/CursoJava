// Faremos uma pequena revisão, antes de continuarmos o estudo sobre Exceptions.

// ##Pilha de Execução##

// Vimos que o Java organiza a execução de uma pilha, que sempre começa com o
// método main() e pode crescer e diminuir de tamanho, dependendo da quantidade
// de métodos que forem executados.

// Assim como várias outras linguagens, o Java utiliza essa pilha de execução,
// que é importante para entendermos o "rastro" da exceção. O nosso principal
// objetivo é entender que quando acontece a exceção, ela se lembra por quais
// métodos ela passou.

// Alguns eventos excepcionais e imprevistos podem aparecer em nossa aplicação.
// Portanto, precisamos saber lidar com isso, entendendo a exceção, suas
// mensagens e o seu rastro.

// ##Fluxo##

// Vimos que exceção muda o fluxo. Se o método não for capaz de tratá-la, o
// fluxo de execução sai abruptamente dele e vai para o próximo, até encontrar
// algum método que saiba tratá-la.

// ##Try Catch##

// Para lidar com essa "bomba" e voltar para uma execução normal, podemos
// utilizar o try-catch. Com o try, alertamos a máquina virtual, e com o catch,
// definimos qual exceção pode acontecer. Trabalhamos exemplos com
// NullPointerException e ArithmeticException por enquanto.

// A referência ex declarada no bloco catch, é um objeto onde podemos chamar
// métodos como o getMessage() para receber a mensagem, e o printStackTrace()
// para mostrar o rastro da pilha.

// Assim, concluímos que as exceções envolvem conhecimento sobre orientação a
// objeto, sobre pilha e têm uma sintaxe especial por meio de try-catch.
// Adiante, criaremos as nossas próprias exceções.