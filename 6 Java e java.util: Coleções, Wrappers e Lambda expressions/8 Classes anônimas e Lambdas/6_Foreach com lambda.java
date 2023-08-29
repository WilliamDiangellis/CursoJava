// Veja o código usando um for "tradicional":

// List<String> nomes = new ArrayList<>();
// nomes.add("Super Mario");
// nomes.add("Yoshi"); 
// nomes.add("Donkey Kong"); 

// for(int i = 0; i < nomes.size(); i++) {
//     System.out.println(nomes.get(i));
// }

// Você gostou das lambdas e gostaria de usá-las também na hora do laço. Qual alternativa usa corretamente a 
// expressão lambda para iterar os elementos da lista?

// Obs: Todas as alternativas abaixo realmente funcionam mas apenas uma usa lambdas.

// A)
// for (String nome : nomes) {
//     System.out.println(nome);
// }

// Bom, essa é a forma que entrou no Java 1.5 (não tão velha) mas ela não usa lambda expression.

// B)
// for(int i = 0; i < nomes.size(); i++) {
//     System.out.println(nomes.get(i));
// }

// Nãoooooooo, esse laço é de "castigo" :)

// C)
// nomes.forEach((nome) -> System.out.println(nome));

// Corretíssima! A linguagem evoluiu muito como esse exercício mostra. Nas primeiras versões realmente era 
// burocrático iterar as listas. Com as lambdas, o laço (for) se tornou uma simples chamada de um método. Muito legal!

// D)
// for (Iterator<String> i = nomes.iterator(); i.hasNext();) {
//     String nome = i.next();
//     System.out.println(nome);
// }

// Essa forma realmente funciona mas é bem, bem burocrática e nem usa lambdas. No entanto, o interessante aqui é 
// que esse laço usa um padrão de projeto chamado Iterator.

// Mais sobre o padrão Iteraror na atividade dedicada.