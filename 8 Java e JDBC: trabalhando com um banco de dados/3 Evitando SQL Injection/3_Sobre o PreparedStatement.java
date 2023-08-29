// Quais os riscos de utilizar um Statement, ao invés de um PreparedStatement?

// A)
// Nenhum, os dois funcionam igualmente
// Alternativa errada! Uma das vantagens em se utilizar o PreparedStatement é que o mesmo evita o 
//SQL injection.

// B)
// Não trará problemas ao utilizar apóstrofo em um campo de formulário
// Alternativa errada! Um dos problemas de se utilizar o Statement é que, quando o usuário insere uma string
// em um formulário, utilizando um apóstrofo, ele não diferencia na hora de concatenar na query, causando 
// uma SQLException.

// C)
// O Statement não mantém uma versão da consulta compilada no banco de dados
// Alternativa correta! O PreparedStatement mantém a consulta compilada no banco de dados, para o usuário
// que necessitar realizar a mesma consulta, diversas vezes, com parâmetros diferentes.