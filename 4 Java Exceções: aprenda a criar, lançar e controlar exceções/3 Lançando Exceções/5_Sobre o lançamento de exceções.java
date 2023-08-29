// Sobre o lançamento de exceções, julgue as afirmativas abaixo:

// 1) Para lançar uma exceção, além de instanciá-la, é necessário lançá-la
// através do throw.

// 2) A exceção só pode ser lançada através de uma variável que mantém sua
// referência, por exemplo:

// ArithmeticException exception = new ArithmeticException();
// throw exception;

// 3) Quando a exceção é lançada, o código para de executar abruptamente.

// 4) Podemos atribuir uma mensagem à exceção.

// A)
// A afirmativa 4 é falsa.
// Alternativa errada! A afirmativa 4 é verdadeira. Podemos passar uma mensagem
// para o construtor da exceção, atribuindo assim uma mensagem à mesma.

// B)
// A afirmativa 1 é falsa.
// Alternativa errada! A afirmativa 1 é verdadeira. O processo de lançar uma
// exceção basicamente se resume em dois passos: sua instanciação e o seu
// lançamento, através do throw.

// C)
// A afirmativa 2 é falsa.
// Alternativa correta! A afirmativa 2 é realmente falsa, já que não é
// necessário guardar a exceção em uma variável, podendo lançá-la diretamente em
// uma linha só, por exemplo:

// throw new ArithmeticException();

// D)
// A afirmativa 3 é falsa.
// Alternativa errada! A afirmativa 3 é verdadeira. Quando uma exceção é
// lançada, mesmo que ainda haja linhas de código a serem executadas, a sua
// execução é encerrada abruptamente.