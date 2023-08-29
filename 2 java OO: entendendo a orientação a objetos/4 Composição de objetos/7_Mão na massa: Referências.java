// Continuando nosso código...

// 1) Caso queira, crie um novo projeto e copie a classe Conta, ou apenas crie uma 
// nova classe Cliente para compor nosso bytebank, nossa classe Cliente deve ter a seguinte cara:


// public class Cliente {

//     String nome;
//     String cpf;
//     String profissao;

// }

// 2) Defina os atributos da classe Cliente como preferir, no curso, usamos nome, cpf e profissão.

// 3) Modifique a classe Conta adicionando um atributo do tipo Cliente.

// public class Conta{

//     double saldo;
//     int agencia;
//     int numero;
//     Cliente titular;
// }

// 4) Crie um classe de teste e instancie um cliente e uma conta! Lembre-se de que o atributo 
// Titular de uma conta guarda um Cliente

// 5) Repare que podemos fazer de uma forma mais direta!

// Conta contaDaMarcela = new Conta();

// contaDaMarcela.titular = new Cliente();

// Podemos definir o nome de um cliente fazendo:

// contaDaMarcela.titular.nome = "Marcela";