// A equipe de desenvolvedores decidiu criar duas exceções para trabalhar com
// contas:

// public class SacaException extends RuntimeException {
// }

// e

// public class DepositaException extends RuntimeException {
// }

// Conhecendo as duas exceções, você precisa fazer um tratamento. Das opções
// abaixo, quais são as válidas (que compilam)?

// A)
// try {}
// catch(SacaException ex) {}
// catch(DepositaException ex) {}
// finally {}

// Correto, temos um try com dois blocos catch (clássicos) e o bloco finally.

// B)
// try {}
// try {}
// catch(Exception ex) {}
// finally {}

// Errado, nunca e jamais terá dois blocos try seguidos (mas poderia ter um
// try-catch dentro do outro).

// C)
// try {}
// catch(SacaException | DepositaException ex) {}

// Correto, um tratamento com try e multi-catch.

// D)
// try {}
// finally {}

// Correto, no tratamento o bloco catch é opcional quando tem o bloco finally.

// E)
// catch(Exception ex) {}
// finally {}

// Errado, o tratamento deve começar com try sempre