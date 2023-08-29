// A classe Pessoa e Endereco de Juarez fez sucesso:

// public class Endereco {

// String logradouro;
// String complemento;
// String numero;
// String bairro;
// String cidade;
// String cep;
// }

// public class Pessoa {

// String nome;
// String cpf;
// int idade;
// Endereco endereco;

// }

// public class Programa {

// public static void main(String args[]) {

// Pessoa p = new Pessoa();
// p.nome = "Paulo";
// p.endereco.logradouro = "Avenida XYZ";
// }
// }

// Marque as opções que contém a alteração que fará o código funcionar em tempo
// de execução:

// A)
// public class Programa {

// public static void main(String args[]) {

// Pessoa p = new Pessoa();
// p.nome = "Paulo";
// p.endereco.logradouro = new Endereco();
// p.endereco.logradouro = "Aveninda XYZ";
// }
// }

// Errado.Quem deve receber new Endereco() é p.endereco e não
// p.endereco.logradouro.

// B)
// public class Pessoa {

// String nome;
// String cpf;
// int idade;
// Endereco endereco = new Endereco();
// }

// Correto. A inicialização da propriedade endereco esta sendo realizada na
// própria classe. Dessa forma, o programador não precisará se lembrar de
// iniciá-la.

// C)
// public class Programa {

// public static void main(String args[]) {

// Pessoa p = new Pessoa();
// p.nome = "Paulo";
// p.endereco = new Endereco();
// p.endereco.logradouro = "Aveninda XYZ";
// }
// }

// Correto. O cliente da classe Pessoa, ou seja, quem a esta utilizando, teve
// que atribuir uma instância de Endereco à propriedade p.endereco para que não
// houvesse NullPointerException.