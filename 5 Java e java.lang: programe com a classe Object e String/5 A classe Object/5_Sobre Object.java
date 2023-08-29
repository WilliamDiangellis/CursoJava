// A classe Object é a classe raiz do Java, sobre ela é correto afirmar:

// A)
// Somente uma classe que não estenda de outra, herda comportamentos de Object.
// Por exemplo, se a classe Gerente herda de Funcionario e o Funcionario herda
// de Object, o Gerente não herda nada da classe Object, apenas o Funcionario.
// Errado, na herança você sempre herda o comportamento de todas classes na
// hierarquia. Se o Gerente herda do Funcionario e Funcionario herda do Objeto,
// ambos Gerente e Funcionario são objetos e herdam as funcionalidades da classe
// Object.

// B)
// Não é preciso deixar explícito na declaração de uma classe que ela deve
// herdar de Object, porque isso é automático.
// Correto, não é preciso herda do Object explicitamente, o compilador
// automaticamente insere a declaração.

// C)
// Essa classe existe apenas porque Java é orientado a objetos e qualquer
// linguagem orientada a objetos tem esse tipo. Além disso, ela não possui
// métodos.
// Errado, Object possui sim métodos e mesmo sem essa classe o Java seria uma
// linguagem orientada a objetos.

// D)
// Qualquer objeto pode ser referenciado pelo tipo Object, já que ela é a
// principal.
// Correto, o tipo Object é a forma mais genérica de referenciar um objeto.