// Juarez criou as seguintes classes:

// public class Pessoa {

// String nome;
// String cpf;
// int idade;
// String logradouro;
// String complemento;
// String numero;
// String bairro;
// String cidade;
// String cep;

// }

// public class Empresa {

// String razaoSocial;
// String cnpj;
// String logradouro;
// String complemento;
// String numero;
// String bairro;
// String cidade;
// String cep;
// }

// Podemos perceber que os atributos logradouro, complemento, numero, bairro,
// cidade e cep são
// os mesmos nas duas classes. Essas informações são fortes candidatas para
// serem externalizadas
// na classe Endereco e associadas às classes Pessoa e Empresa através de
// composição.

// public class Endereco {

// String logradouro;
// String complemento;
// String numero;
// String bairro;
// String cidade;
// String cep;

// }

// Marque a única alternativa verdadeira que modifica corretamente as classes
// Pessoa e Empresa
// para utilizarem a classe Endereco.

// A)
// public class Pessoa {

// String nome;
// String cpf;
// int idade;
// Endereco endereco;
// }

// public class Empresa {

// String razaoSocial;
// String cnpj;
// Endereco;
// }

// Na classe Empresa apenas o tipo Endereco foi definido, faltando declarar o
// atributo.

// B)
// public class Pessoa {

// String nome;
// String cpf;
// int idade;
// }

// public class Empresa {

// String razaoSocial;
// String cnpj;
// Endereco endereco;
// }

// Errado. Em nenhum momento a classe Pessoa define o atributo do endereco
// utilizando a classe Endereco.

// C)
// public class Pessoa {

// String nome;
// String cpf;
// int idade;
// Endereco endereco;
// }

// public class Empresa {

// String razaoSocial;
// String cnpj;
// Endereco endereco;
// }

// Correta!