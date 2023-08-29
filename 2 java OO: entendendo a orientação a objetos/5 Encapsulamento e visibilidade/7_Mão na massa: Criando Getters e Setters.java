// Vamos incrementar nosso código, modificando-o de acordo com as aulas.

// 1) Vamos proteger os atributos da classe Conta, para isso adicione a palavra reservada private:

// private double saldo;
// private int agencia;
// private int numero;
// private Cliente titular;

// Repare que quando fazemos isso, não conseguiremos mais acessar os valores.

// 2) Precisamos criar métodos que nos possibilite receber os valores dos atributos, ou até alterá-los, 
// caso seja interessante. Para isso criaremos os Getters e os Setters, siga os modelos abaixo e 
// modifique para que retorne/altere o atributo correto!

// Não esqueça de alterar o tipo de retorno do método! Nesse caso é double

// //Getter

// public double getSaldo(){
//     return this.saldo;
// }

// //Setter
// public void setNumero(int numero){
//     this.numero = numero;
// }

// No curso criamos getSaldo, getNumero, setNumero, getAgencia, setAgencia, setTitular, getTitular.

// 3) Na classe Cliente, escreva os métodos getters e setters e modifique os atributos adicionando private

// Faça uma classe de teste e veja as possibilidades, dessa forma, esse conhecimento será consolidado!

// Nosso código está abaixo, apenas clique para ver a opinião, mas recomendamos que tente fazer antes de 
// ver o código completo!

// Opinião do instrutor

// Nossa classe Conta está da seguinte forma:


// public class Conta {

//     private double saldo;
//     private int agencia;
//     private int numero;
//     private Cliente titular;

//     public void deposita(double valor) {
//         this.saldo = this.saldo + valor;
//     }

//     public boolean saca(double valor) {
//         if(this.saldo >= valor) {
//             this.saldo -= valor;
//             return true;
//         } else {
//             return false;
//         }
//     }

//     public boolean transfere(double valor, Conta destino) {
//         if(this.saldo >= valor) {
//             this.saldo -= valor;
//             destino.deposita(valor);
//             return true;
//         }
//         return false;
//     }

//     public double getSaldo(){
//         return this.saldo;
//     }

//     public int getNumero(){
//         return this.numero;
//     }

//     public void setNumero(int numero){
//         this.numero = numero;
//     }

//     public int getAgencia(){
//         return this.agencia;
//     }

//     public void setAgencia(int agencia){
//         this.agencia = agencia;
//     }

//     public void setTitular(Cliente titular){
//         this.titular = titular;
//     }

//     public Cliente getTitular(){
//         return this.titular;
//     }

// }

// Nossa classe Cliente:

// public class Cliente {

//     private String nome;
//     private String cpf;
//     private String profissao;

//     public String getNome() {
//         return nome;
//     }
//     public void setNome(String nome) {
//         this.nome = nome;
//     }
//     public String getCpf() {
//         return cpf;
//     }
//     public void setCpf(String cpf) {
//         this.cpf = cpf;
//     }
//     public String getProfissao() {
//         return profissao;
//     }
//     public void setProfissao(String profissao) {
//         this.profissao = profissao;
//     }

// }