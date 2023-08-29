// Vamos começar a escrever nossos métodos.

// 1) Adicione o construtor Conta, de mesmo nome da classe:

// public Conta(){
//     System.out.println("Criando uma conta");
// }

// 2) Faça a inicialização dos atributos da classe Conta dentro do construtor:

// public Conta(int agencia, int numero){
//     this.agencia = agencia;
//     this.numero = numero;
//     this.saldo = 100; //isso significa que toda conta começa com 100 de saldo.
//     System.out.println("Estou criando uma conta");
// }

// 3) Para que seu construtor receba os parâmetros, devemos adicionar o que queremos passar na hora que construímos nosso objeto no método main:

// public static void main(String args[]){
//     Conta conta = new Conta(123,456);
    
// 4) Agora podemos utilizar nos getters e setters para pegarmos/alterarmos informações desejadas.

// 5) Crie a variável private static int total = 0; dentro da classe Conta (não dentro do construtor):

// public class Conta{
//    //outros atributos omitidos
//    private static int total = 0;

//    //outros métodos omitidos
// }

// 6) Dentro do construtor adicione total++;

// 7) Crie o método estático getter getTotal():

// public static int getTotal(){
//     return Conta.total;
// }

// 8) Teste o getter em seu método main:

// System.out.println(Conta.getTotal());

// 9) Rode o método main e fique atento no console.

// Nosso código será apresentado abaixo, mas é muito importante tentar fazer sem olhar o resultado final!

// VER OPINIÃO DO INSTRUTOR
// Opinião do instrutor

// Nossa classe Conta:


// public class Conta {

//     private double saldo;
//     private int agencia;
//     private int numero;
//     private Cliente titular;
//     private static int total = 0;

//     public Conta(int agencia, int numero){
//         Conta.total++;
//         System.out.println("O total de contas é " + Conta.total);
//         this.agencia = agencia;
//         this.numero = numero;
//         this.saldo = 100;
//         System.out.println("Estou criando uma conta" + this.numero);
//     }

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
//         if(numero <= 0) {
//             System.out.println("Nao pode valor menor igual a 0");
//             return;
//         }
//         this.numero = numero;
//     }

//     public int getAgencia(){
//         return this.agencia;
//     }

//     public void setAgencia(int agencia){
//        if(agencia <= 0) {
//            System.out.println("Nao pode valor menor igual a 0");
//            return;
//        }
//        this.agencia = agencia;
//     }

//     public void setTitular(Cliente titular){
//         this.titular = titular;
//     }

//     public Cliente getTitular(){
//         return this.titular;
//     }

//     public static int getTotal(){
//         return Conta.total;
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
