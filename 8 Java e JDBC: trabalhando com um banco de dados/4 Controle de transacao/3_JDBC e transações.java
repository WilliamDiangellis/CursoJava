// Qual o padrão do JDBC (ou seja do driver) para lidar com transações e o banco de dados?

// A)
// Rollback-on-Close
// Alternativa errada! Não existe esse modo.

// B)
// Auto-Commit
// Alternativa correta! Esse é o padrão, que pode ser alterado pelo método setAutoCommit, 
// da interface Connection.

// C)
// Commit-on-Close
// Alternativa errada! Não existe esse modo.

// D)
// Depende da implementação do driver JDBC
// Alternativa errada! Existe sim um padrão JDBC!