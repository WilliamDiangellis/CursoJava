// 1) Primeiro, vamos criar a classe MinhaExcecao que herda de RuntimeException:

// public class MinhaExcecao extends RuntimeException {
// }

// 2) Na classe MinhaExcecao, vamos criar um construtor que recebe uma mensagem do tipo string e passaremos ela para o construtor da classe mãe RuntimeException:

// public class MinhaExcecao extends RuntimeException {
//     public MinhaExcecao(String msg) {
//         super(msg);
//     }
// }

// 3) Agora iremos lançar nossa exceção dentro do metodo2(), na classe Fluxo. Vamos substituir o throw atual pelo seguinte:

// throw new MinhaExcecao("deu muito errado");

// 4) Também precisamos adicionar o tipo MinhaExcecao dentro do catch na classe Fluxo:

// try {
//     metodo1();
// } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) {
//     String msg = ex.getMessage();
//     System.out.println("Exception " + msg);
//     ex.printStackTrace();
// } 

// 5) Agora altera a classe MinhaExcecao para estender a classe Exception (deixando checked):

// public class MinhaExcecao extends Exception { //checked

// }

// 6) Na classe Fluxo, faça que o código volte a compilar e use throws MinhaExcecao no metodo1() e no metodo2():

//     private static void metodo1() throws MinhaExcecao {
//         System.out.println("Ini do metodo1");
//         metodo2();
//         System.out.println("Fim do metodo1");
//     }

//     private static void metodo2() throws MinhaExcecao{
//         System.out.println("Ini do metodo2");
//         throw new MinhaExcecao("deu muito errado");
//         //System.out.println("Fim do metodo2");        
//     }