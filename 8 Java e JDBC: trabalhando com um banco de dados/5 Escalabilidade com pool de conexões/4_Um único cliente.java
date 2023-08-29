// Imagine uma aplicação onde só existe um único cliente e ele só pode executar uma tarefa por vez.
// Enquanto uma tarefa não acaba, ele não pode executar outra tarefa. Qual abordagem você usaria?

// A)
// Abrir uma conexão a cada nova tarefa que o usuário fizer
// Alternativa correta! Como temos apenas um cliente, nunca vai ter mais que uma conexão.

// B)
// Abrir uma única conexão e mantê-la aberta o tempo todo
// Alternativa correta! Essa abordagem funcionaria, pois temos apenas um cliente.

// C)
// Abrir diversas conexões e manter um pool de conexões
// Parabéns, você acertou!
