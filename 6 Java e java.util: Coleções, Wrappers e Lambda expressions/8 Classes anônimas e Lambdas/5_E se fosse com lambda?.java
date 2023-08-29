// Veja o código abaixo legado escrito com uma versão de Java pre 1.8. Repare que esse código usa ainda uma classe anônima no método sort:

// List<String> nomes = new ArrayList<>();
// nomes.add("Super Mario");
// nomes.add("Yoshi"); 
// nomes.add("Donkey Kong"); 

// Collections.sort(nomes, new Comparator<String>() {

//     @Override
//     public int compare(String s1, String s2) {
//         return s1.length() - s2.length();
//     }
// });

// System.out.println(nomes);

// Como seria a implementação da chamada do método sort com lambda? Marque as implementações corretas:

// A)
// nomes.sort( -> s1.length() - s2.length());
// Errado. Quase, mas falta a definição dos parâmetros na definição lambda.

// B)
// nomes.sort((s1, s2) ->  {return s1.length() - s2.length();} );
// Correto. Também é possível usar o método sort da lista. Repare também que o return é opcional (desde que 
//tiremos também o {} ):

// nomes.sort((s1, s2) ->  s1.length() - s2.length());

// C)
// Collections.sort(nomes, (s1, s2) ->  s1.length() - s2.length());

// Perfeito, repare que nem o return é preciso! Muito mais enxuto e conciso.

// D)
// Collections.sort(nomes, <String> ->) {
//         return s1.length() - s2.length();
//     }
// });

// Errado, não existe essa sintaxe. As lambdas são mais simples!!