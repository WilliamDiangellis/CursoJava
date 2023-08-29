// Continuando com a mesma hierarquia de classes:

// Temos a classe mãe objeto, dela são filhas funcionario e cliente, da classe
// funcionario sao filhas gerente e designer

// E a declaração do array:

// Funcionario[] referencias = new Funcionario[5];

// referencias[0] = new Designer();

// ???? ref = (????) referencias[0];

// O que podemos colocar no lugar de ???? para o código compilar?

// A)
// Gerente
// Correto, como o Gerente é um Funcionario o cast é possível e compila (mas ao
// rodar daria ClassCastException).

// B)
// Cliente
// Errado, pois é impossível guardar uma referência do tipo Cliente no array do
// tipo Funcionario. Não compila, nem com cast.

// C)
// Object
// Correto, no final todas as referências no array são do tipo Object. Usando
// Object o cast não precisa ser explícito, basta:
// Object ref = referencias[0];

// D)
// Designer
// Correto, como o Designer é um Funcionario o cast é possível (compila) e
// também rodaria normal.