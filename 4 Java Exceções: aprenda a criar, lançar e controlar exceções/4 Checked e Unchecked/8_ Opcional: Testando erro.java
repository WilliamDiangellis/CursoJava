// No projeto java-pilha, se ainda não criou, crie uma nova classe FluxoComError com o seguinte conteúdo:

// public class FluxoComError {

//     public static void main(String[] args) {
//         System.out.println("Ini do main");
//         try{
//             metodo1();
//         } catch(ArithmeticException | NullPointerException ex) {
//             String msg = ex.getMessage();
//             System.out.println("Exception " + msg);
//             ex.printStackTrace();
//         } 
//         System.out.println("Fim do main");
//     }

//     private static void metodo1() {
//         System.out.println("Ini do metodo1");
//         metodo2();
//         System.out.println("Fim do metodo1");
//     }

//     private static void metodo2() {
//         System.out.println("Ini do metodo 2");
//         metodo2();    
//         System.out.println("Fim do metodo 2");
//     }
// }

// Repare que método2() chama a si mesmo. Isso também é chamado de recursão.

// 2) Ao executar a classe FluxoComError recebemos um Error. Você se lembra por quê?

