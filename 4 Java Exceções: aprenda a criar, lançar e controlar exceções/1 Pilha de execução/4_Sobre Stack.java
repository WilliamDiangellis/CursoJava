// Por que a JVM usa um Stack?

// A)
// Para saber qual método está sendo executado
// Correto!
// Uma pilha Java faz parte da JVM e armazena os métodos que estão sendo
// executados. Além do bloco de código a pilha guarda as variáveis e as
// referências desse bloco. Assim a JVM organiza a execução e sabe exatamente
// qual método está sendo executado que é sempre o método no topo da pilha. A
// JVM também sabe quais outros precisam ser executados ainda, que são
// justamente os métodos abaixo.

// B)
// Para guardar e gerenciar os objetos criados
// Errado. Os objetos vivem no HEAP e quem controle o HEAP é o coletor de lixo
// (Garbage Coletor).
// Na pilha (Stack) vivem apenas as variáveis e as referências locais.

// C)
// Para liberar a memória
// Errado, liberar memória é a tarefa do Coletor de Lixo ou Garbage Colector.

// D)
// Para organizar a execução dos métodos
// Correto!
// Uma pilha Java faz parte da JVM e armazena os métodos que estão sendo
// executados. Além do bloco de código a pilha guarda as variáveis e as
// referências desse bloco. Assim a JVM organiza a execução e sabe exatamente
// qual método está sendo executado que é sempre o método no topo da pilha. A
// JVM também sabe quais outros precisam ser executados ainda, que são
// justamente os métodos abaixo.