// O que está garantido quando usamos o try-with-resources?

// try(Conexao con = new Conexao()) {
// con.leDados();
// }

// A)
// O bloco finally é criado automaticamente.
// Correto, automaticamente é criado um bloco finally. Nele é chamado o método
// close() do recurso.

// B)
// A exceção é automaticamente capturada.
// Errado, pois o desenvolvedor continua sendo responsável em criar o bloco
// catch.

// C)
// O recurso precisa implementar o método close().
// Correto, automaticamente é criado um bloco finally. Nele é chamado o método
// close() do recurso.