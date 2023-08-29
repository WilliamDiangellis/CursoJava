// Fernanda decidiu aplicar seu conhecimento sobre composição utilizando as
// classes
// Pessoa e Endereço criadas por Juarez. Porém, seu código não esta funcionando
// em tempo
// de execução (runtime). Vejamos seu código:

// public class Pessoa {

// String nome;
// String cpf;
// int idade;
// Endereco endereco;
// }

// public class Endereco {

// String logradouro;
// String complemento;
// String numero;
// String bairro;
// String cidade;
// String cep;

// }

// public class Programa {

// public static void main(String[] args) {

// Pessoa p = new Pessoa();
// p.nome = "Paulo";
// p.endereco.logradouro = "Avenida XYZ";
// }
// }

// Marque a opção que explica corretamente o erro no código de Fernanda.

// A)
// Ela deveria ter feito p.logradouro = "Aveninda XYZ", pois há a composição de
// Endereco com Pessoa.

// Errado. Ela fez corretamente p.endereco.logradouro, pois primeiro é
// necessário acessar o objeto da composição, no caso, endereco para então
// acessar logradouro. O problema é outro. Como a classe Pessoa não instanciou
// internamente a propriedade endereco ela é null. É por isso que a instrução
// p.endereco.logradouro resulta na exceção NullPointerException, pois
// p.endereco é null.

// B)
// Ela esta acessando uma propriedade de um objeto que não foi inicializado.

// Correto. Como a classe Pessoa não instanciou internamente a propriedade
// endereco ela é null. É por isso que a instrução p.endereco.logradouro resulta
// na exceção NullPointerException, pois p.endereco é null.

// C)
// Fernanda não atribui valores à todas as propriedades da instância da classe
// Pessoa e por isso seu código não funcionará em tempo de execução.

// Errado. Não há nada no código que a obrigue atribuir os valores às
// propriedades da instância da classe Pessoa, logo, a causa do erro em seu
// código não é esta.