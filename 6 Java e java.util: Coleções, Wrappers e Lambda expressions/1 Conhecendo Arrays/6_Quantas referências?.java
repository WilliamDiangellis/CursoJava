// Você está se preparando para a certificação Java e passou pelo código
// seguinte:

// ContaPoupanca[] contas = new ContaPoupanca[10];
// ContaPoupanca cp1 = new ContaPoupanca(11,22);
// ContaPoupanca cp2 = new ContaPoupanca(33,44);

// contas[0] = cp1;
// contas[1] = cp1;
// contas[4] = cp2;
// contas[5] = cp2;

// ContaPoupanca ref1 = contas[1];
// ContaPoupanca ref2 = contas[4];

// Quantas referências apontam para a ContaPoupanca com a agencia 33 e número
// 44?

// A)
// 3.
// Infelizmente não. São mais de 3.

// B)
// 2.
// Infelizmente não. São mais de 2.

// C)
// 4.
// Bingo! Vamos contar?

// 1) ContaPoupanca cp2 = new ContaPoupanca(33, 44);
// 2) contas[4] = cp2;
// 3) contas[5] = cp2;
// 4) ContaPoupanca ref2 = contas[4];

// D)
// 5.
// Infelizmente não. São menos de 5.