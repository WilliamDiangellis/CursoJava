// Você está revisando um projeto do seu amigo e encontrou o código abaixo:

// Conta c = new Conta();
// c.CAIXA.getCodigo();

// A classe Conta está dentro de um outro package e foi importada corretamente.

// O que podemos dizer sobre a parte CAIXA no código acima? Marque todas as
// alternativas corretas:

// A)
// CAIXA tem visibilidade <<package private>>.
// Errado, pois no enunciado diz que estamos importando as classes corretamente.
// Isso significa que a classe Conta está dentro de um outro package.

// B)
// CAIXA é um atributo da instância.
// Correto, CAIXA é uma atributo da instância, pois usamos a referência c para
// acessar o atributo. Se fosse estático a chamada seria:
// Conta.CAIXA.getCodigo();

// C)
// CAIXA é uma referência.
// Correto, pois estamos usando o . para chamar o método getCodigo(). Se CAIXA
// fosso um primitivo não seria possível chamar um método.

// D)
// CAIXA é uma interface.
// Errado, qual é o tipo e se é interface ou classe não dá para saber. Para tal
// é preciso abrir a classe Conta.

// E)
// CAIXA é um método.
// Errado, uma chamada de um método sempre tem parênteses que não é o caso aqui.

// F)
// CAIXA tem visibilidade pública.
// Correto, pois no enunciado diz que estamos importando as classes
// corretamente. Isso significa que a classe Conta está dentro de um outro
// package.

// G)
// CAIXA tem acesso estático.
// Errado, CAIXA é uma atributo da instância pois usamos a referência c para
// acessar o atributo. Se fosse estático a chamada seria:
// Conta.CAIXA.getCodigo();