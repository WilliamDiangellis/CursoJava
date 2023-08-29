// Por que, ao utilizar o try-with-resources, não é mais necessário explicitar o close para fechar o 
// statements (ResultSet, Connection, PreparedStatement)?

// A)
// Essa prática está errada, todo recurso aberto deverá ser fechado
// Alternativa errada! O recurso realmente deverá ser fechado, mas o try com recurso faz isso para nós.

// B)
// Pelo fato dos statements estenderem AutoCloseable
// Alternativa correta! Estendendo o AutoCloseable, o try-with-resources executa o método close sem que 
// precise estar explícito.

// C)
// Não é necessário fechar os statements quando utilizamos try-with-resources
// Alternativa errada! Os recursos continuam sendo fechados, porém não de forma explícita.