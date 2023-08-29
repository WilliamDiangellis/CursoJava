// Você está fazendo a leitura de um arquivo de texto com vários números. O problema é que os dados vêm como String, 
// por exemplo:

// String diaComoTexto = "29";
// int dia = ????;

// O que você pode colocar no lugar de ???? para converter o texto?

// A)
// Integer.valueOf(diaComoTexto)
// Correto, mas não seria a melhor opção pois devolve uma referência (e ai é feito um unboxing).

// B)
// Integer.fromString(diaComoTexto)
// Errado, pois não existe o método fromString.

// C)
// Integer.parseInt(diaComoTexto)
// Correto e seria a opção mais adequada pois devolve um primitivo.

// D)
// Integer.convert(diaComoTexto)
// Errado, pois não existe o método convert.