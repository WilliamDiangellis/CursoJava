// Você encontrou um código legado que ainda não usa generics:

// ArrayList lista = new ArrayList();
// Cliente cliente = new Cliente();
// lista.add(cliente);

// Como você pode melhorar o código e aplicar os generics?

// A)
// ArrayList<Cliente> lista = new ArrayList<Cliente>();
// Correto, parametrizamos a ArrayList usando <>. Há uma variação/simplificação
// que entrou no Java 1.7. O código abaixo é equivalente a alternativa:
// ArrayList<Cliente> lista = new ArrayList<>();

// B)
// ArrayList[Cliente] lista = new ArrayList[Cliente]();
// Errado, generics sempre usa <> e os arrays usam [].

// C)
// ArrayList lista = new ArrayList<Cliente>();
// Quase, mas faltou parametrizar o tipo da variável. O correto é:
// ArrayList<Cliente> lista = new ArrayList<Cliente>();