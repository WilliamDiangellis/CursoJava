// Veja a hierarquia de classes:

// Temos a classe mãe objeto, dela são filhas funcionario e cliente, da classe
// funcionario sao filhas gerente e designer
// E a declaração do array:

// ????[] referencias = new ????[5];

// referencias[0] = new Designer();
// referencias[1] = new Gerente();

// Designer designer = (Designer) referencias[0];
// Gerente gerente = (Gerente) referencias[1];

// O que podemos colocar no lugar de ???? para o código compilar?

// A)
// Gerente
// Errado, um array de gerentes só pode guardar referências do tipo Gerente.

// B)
// Object
// Correto, como o tipo consegue guardar qualquer tipo Object de referências o
// código compilar:
// Object[] referencias = new Object[5];

// C)
// Designer
// Errado, um array de designer só pode guardar referências do tipo Designer.

// D)
// Funcionario
// Correto, como os tipos Designer e Gerente são Funcionarios basta colocar:

// Funcionario[] referencias = new Funcionario[5];