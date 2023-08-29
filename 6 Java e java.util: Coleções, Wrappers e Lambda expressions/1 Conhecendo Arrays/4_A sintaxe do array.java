// Um array realmente possui uma sintaxe estranha pois usa esses colchetes ([]).
// Então, se tiver com dúvida, relaxe e teste cada linha dentro de um método
// main. Não há problema em errar, pois estamos aprendendo...

// Sabendo disso, qual é a forma correta de criar um array do tipo double?

// A)
// double[5] precos = new double[];
// Errado, o tamanho do array deve aparecer no lado direito da inicialização. O
// correto é:
// double[] precos = new double[5];

// B)
// double precos[] = new double[];
// Errado, pois faltou definir o tamanho do array. Qualquer array tem um tamanho
// fixo. O correto é:
// double[] precos = new double[5];

// C)
// double precos[] = new[5];
// Errado, faltou definir o tipo no lado direito da inicialização. O correto é:
// double[] precos = new double[5];

// D)
// double[] precos = new double[5];
// Correto, definimos o tamanho na hora de criar o array.
// Além da sintaxe apresentada na alternativa, tem uma alternativa (menos
// utilizada):
// double precos[] = new double[5];
// Ambas as formas são corretas.