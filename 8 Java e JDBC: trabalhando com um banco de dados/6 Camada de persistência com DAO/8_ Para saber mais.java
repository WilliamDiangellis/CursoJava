// Nesta aula, aprendemos que:

// Para cada tabela de domínio, temos uma classe de domínio
//     Por exemplo, a tabela produtos tem uma classe Produto associada
//     Objetos dessa classe representa um registro na tabela
// Para acessar a tabela, usaremos um padrão chamado Data Access Object (DAO)
//     Para cada classe de domínio, existe um DAO. Por exemplo, a classe Produto possui um ProdutoDao
//     Todos os métodos JDBC relacionados com o produto devem estar encapsulados no ProdutoDao
