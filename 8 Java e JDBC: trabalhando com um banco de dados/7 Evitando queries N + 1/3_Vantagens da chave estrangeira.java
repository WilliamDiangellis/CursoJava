// Gabriela, para categorizar os produtos, resolveu criar mais uma coluna na tabela, do tipo String, e
// chamou de Categoria. Assim foi possível, no momento da inserção de um produto, já informar qual a
// sua categoria. Qual a desvantagem dessa abordagem?

// A)
// As categorias não se repetiriam
// Alternativa errada! Uma das principais desvantagens dessa abordagem é que teríamos muitas categorias
// repetidas na tabela. O ideal para isto não ocorrer é utilizar chaves estrangeiras.

// B)
// Nenhuma, é dessa forma que se categoriza o produto
// Alternativa errada! Funciona, porém há recursos no banco de dados específico para tal ação.

// C)
// Não daria para padronizar a inserção desta categoria, deixando livre para as pessoas escreverem como
// quisessem, podendo prejudicar um possível filtro dos produtos por determinada categoria
// Alternativa correta! Como cada um poderia escrever como bem entendesse, poderia haver diferenciação
// no nome das categorias (uns podem usar acentos, outros não, por exemplo) e os resultados dos select's,
// filtrados por categoria, estariam errados.
