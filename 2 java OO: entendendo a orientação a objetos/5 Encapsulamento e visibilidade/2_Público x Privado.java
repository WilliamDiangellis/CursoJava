// Luan resolveu criar um modelo para treinar orientação a objeto e
// encapsulamento:

// public class Cliente {
// String nome;
// private String cpf;
// int idade;
// }

// E está criando um objeto Cliente na outra classe:

// public class Banco {
// public static void main(String[] args) {
// Cliente cliente = new Cliente();
// cliente.nome = "José";
// cliente.cpf = "12312312312";
// cliente.idade = 49;
// }
// }

// O que podemos afirmar sobre o código?

// A)
// Não compila pois a classe Cliente não foi criada do jeito correto.

// Errado, não tem nenhum problema na classe Cliente.

// B)
// Não compila pois o cpf é privado.

// Correto, não podemos acessar o atributo cpf na classe Banco (o atributo cpf é
// visível apenas na classe Cliente ).

// C)
// As atribuições estão sendo feitas do jeito correto. O código compila e
// executa.

// Errado, pois na classe Banco não temos acesso ao cpf da classe Cliente.