// Os generics entraram na versão 1.5 na plataforma Java e foram levemente
// melhorados no Java 1.7. Quais são os principais benefícios?

// A)
// Antecipar problemas de casts no momento de compilação.
// Correto, o compilador avisa se erramos no tipo, por exemplo:

// ArrayList<String> lista = new ArrayList<String>();
// lista.add("Nico");
// Conta c = lista.get(0); //nao compila

// B)
// Evitar casts excessivos
// Correto, uma vez parametrizada a lista, não precisamos mais o cast, por
// exemplo:

// Cliente ref = (Cliente) lista.get(0); // desnecessário com generics

// C)
// O compilador consegue otimizar o código para deixar a execução mais
// performática.
// Errado, em geral, o compilador Java não otimiza o código. Isso é a tarefa da
// JVM. Os generics ajudam na hora de escrever o código, na hora de rodar não há
// impacto.

// D)
// O código mais legível, já que fica explícito o tipo dos elementos.
// Correto, na criação da lista fica claro qual a intenção. Por exemplo, na
// declaração abaixo está bem claro que a lista guarda Strings:

// ArrayList<String> nomes = new ArrayList<String>();