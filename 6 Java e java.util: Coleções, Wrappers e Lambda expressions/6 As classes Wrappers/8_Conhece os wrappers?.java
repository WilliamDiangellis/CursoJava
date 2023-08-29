// Você está querendo ajudar o Pedro que está trabalhando com Java mas nunca aprendeu os generics. 
// Ele te mostrou o código abaixo:

// List referencias = new ArrayList(); //AQUI
// referencias.add(Double.valueOf(30.9));
// referencias.add(Integer.valueOf(10));
// referencias.add(Float.valueOf(13.4f));

// Com qual código você pode substituir a linha com o comentário //AQUI para usar generics?

// A)
// List<Number> referencias = new ArrayList<>();
// Correto, todos os elementos dessa lista são números.

// B)
// List<Object> referencias = new ArrayList<>();
// Correto, todas as referências também são Objects.

// C)
// List<Double> referencias = new ArrayList<>();
// Errado, pois o tipo Integer não é um Double (Todos são Number e Object apenas). Igualmente o tipo Float não é um Double.

// D)
// List<double> referencias = new ArrayList<>();
// Errado, pois estamos usando o tipo primitivo na declaração da lista. Isso jamais funcionaria.