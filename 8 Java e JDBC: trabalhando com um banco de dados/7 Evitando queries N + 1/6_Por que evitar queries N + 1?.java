// Qual é o problema das queries N + 1?

// A)
// Utilizam várias queries, aumentando a quantidade de acesso ao banco de dados
// Alternativa correta! Quando estamos falando de consultas simples, pode-se não ver o problema, mas
// conforme a complexidade vai aumentando e precisa-se trazer informações de várias tabelas, o acesso
// aumenta exponencialmente, atrapalhando a performance do banco de dados.

// B)
// Nenhum, queries N + 1 não apresentam problemas
// Alternativa errada! Queries N + 1 apresentam alguns problemas, sendo um dos piores a quantidade de vezes
// que o banco de dados é acessado.

// C)
// Só vai ao banco de dados uma única vez, trazendo todas as informações necessárias
// Alternativa errada! Isto é exatamente o contrário sobre o conceito de queries N + 1.
