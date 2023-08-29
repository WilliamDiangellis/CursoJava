// Renata decidiu que não queria mais que o JDBC controlasse as suas transações e por isso setou o 
// Auto-Commit para false. O que mais precisa ser feito para Renata ter o controle total de suas transações?

// A)
// É necessário explicitar o commit e o rollback
// Alternativa correta! Caso a transação não dê problema, Renata precisará commitá-la, explicitando o 
// commit, assim como em caso de erro, o rollback precisará estar explícito.

// B)
// Renata precisará configurar o controle de transação do seu banco de dados
// Alternativa errada! A maioria dos bancos de dados suportam transações, não sendo necessário configurações 
// adicionais.

// C)
// Não precisa alterar mais nada, apenas o Auto-Commit para false já é o suficiente
// Alternativa errada! O Auto-Commit para false é necessário, mas não é o suficiente para commitar uma 
// transação, caso seja com sucesso, nem desfazer, caso dê algum erro.