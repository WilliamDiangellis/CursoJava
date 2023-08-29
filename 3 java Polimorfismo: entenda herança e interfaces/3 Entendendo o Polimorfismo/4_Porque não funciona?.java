// Veja o código abaixo, que deve estar dentro do método main:

// Funcionario f = new Gerente();
// f.autentica(1234);

// Baseado no que você aprendeu na aula, por que o código não compilou?

// A)
// Porque a classe Gerente não possui um método autentica.
// Errado, pois a classe Gerente realmente tem o método autentica.
// Quem define o que podemos chamar é a referência, que é do tipo Funcionario, e
// a classe Funcionario realmente não tem esse método.

// B)
// Porque a referência f é do tipo Funcionario e a classe Funcionario não tem o
// método autentica.
// Correto! Quem define o que podemos chamar é a referência, que é do tipo
// Funcionario, e a classe Funcionario realmente não tem esse método.

// C)
// Porque a classe Gerente não sobrescreveu o método autentica.
// Errado, esse exemplo não tem a ver com sobrescrita.

// D)
// Porque a referência f sempre precisa ser do mesmo tipo do objeto.
// Errado, o polimorfismo justamente diz que podemos referenciar um objeto
// através do mesmo tipo de referência, o mais genérico.