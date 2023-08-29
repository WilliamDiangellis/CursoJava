// Neste vídeo, retornaremos ao exemplo da classe Conta, ContaCorrente e
// ContaPoupanca.

// Não será apresentado nenhum conceito novo, apenas veremos mais um exemplo de
// interfaces.

// Nossa hierarquia está estruturada da seguinte forma: A classe Conta é a mãe,
// e é abstrata, por sua vez, as classes ContaCorrente e ContaPoupanca a herdam.

// Nosso objetivo será incluir um calculador de imposto, representado pela
// classe CalculadorImposto. Uma conta corrente é tributável, enquanto que uma
// conta poupança não é.

// Além disso, teremos também um seguro de vida, representado pela classe
// SeguroDeVida, que não herda a classe Conta, mas também é tributado de acordo
// com o CalculadorImposto.

// Para que o CalculadorImposto não fique atrelado a nenhum método específico,
// teremos um intermediário, que será uma interface, chamada Tributavel.

// Recapitulando: Uma interface contém somente abstrações, não possui nenhum
// atributo ou método concreto.

// O CalculadorImposto, por sua vez, trabalhará com esta interface Tributavel.
// As classes SeguroDeVida e ContaCorrente deverão implementar a interface
// Tributavel.

// A ideia do CalculadorImposto é que ele armazena o valor dos impostos, somando
// todos os valores.

// Fica o desafio para que você tente fazer toda essa implementação, adiante,
// mostrarei como eu resolvi toda essa questão.