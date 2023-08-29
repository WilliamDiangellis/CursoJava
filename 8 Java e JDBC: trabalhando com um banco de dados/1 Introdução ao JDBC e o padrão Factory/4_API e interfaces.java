// Qual a vantagem de utilizar uma API como o JDBC, baseada em interfaces, para fazer a comunicação entre
// o seu código e um banco de dados relacional?

// A)
// Podemos utilizar as classes e interfaces do driver do banco de dados
// Alternativa errada! Utilizamos apenas as classes e interfaces do pacote java.sql.*.

// B)
// Facilidade ao trocar de um banco de dados para outro, sem muitas alterações
// Alternativa correta! Só é necessário trocar o driver JDBC (JAR) para o banco específico e o JDBC se 
// encarregará do resto.

// C)
// Dessa forma, poderemos conhecer os protocolos do banco de dados
// Alternativa errada! Ao usarmos esse tipo de API, temos a independência do protocolo de comunicação do 
// banco de dados em si.