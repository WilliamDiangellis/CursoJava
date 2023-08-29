// Miguel estudou atentamente essa aula e fez as anotações encontradas abaixo.
// Você, estudioso que é, pode indicar quais afirmações Miguel escreveu
// equivocadamente através das alternativas abaixo?

// Existe uma hierarquia grande de classes que representam exceções. Por
// exemplo, ArithmeticException é filha de RuntimeException, que herda de
// Exception, que por sua vez é filha da classe mais ancestral das exceções,
// Throwable. Conhecer bem essa hierarquia significa saber utilizar exceções em
// sua aplicação.

// Throwable é a classe que precisa ser extendida para que seja possível jogar
// um objeto na pilha (através da palavra reservada throw)

// A hierarquia iniciada com a classe Throwable é dividida em exceções e erros.
// Exceções são usadas em códigos de aplicação. Erros são usados exclusivamente
// pela máquina virtual. Classes que herdam de ExceptionError são usadas para
// comunicar erros na máquina virtual. Desenvolvedores de aplicação não devem
// criar erros que herdam de Error

// StackOverflowError é um erro da máquina virtual para informar que a pilha de
// execução não tem mais memória.

// Exceções são separadas em duas grandes categorias: aquelas que são
// obrigatoriamente verificadas pelo compilador e as que não são verificadas. As
// primeiras são denominadas checked e são criadas através do pertencimento a
// uma hieraquia que não passe por RuntimeException. As segundas são as
// unchecked, e são criadas como descendentes de RuntimeException.

// A)
// Miguel se equivocou nas afirmações 3 e 5.

// Errado. Uma dessas afirmativas está correta. Experimente fazer uma classe no
// seu ambiente herdando de Error e de RuntimeException e tire suas próprias
// conclusões.

// B)
// Nenhuma. Todas as afirmações de Miguel estão corretas.

// Errado. Tem uma afirmação que Miguel acertou pela metade. Qual é?

// C)
// Miguel se equivocou na afirmação 3.

// Isso aí! A primeira frase da afirmação 3 está correta. Contudo, classes que
// comunicam erros da máquina virtual herdam de Error. Fala pro Miguel assistir
// os vídeos novamente!