// O Autoboxing / unboxing pode ser confuso. Será que você desmistifica o código abaixo?

// public class TesteWrapper {

//     public static void main(String[] args){
//         Integer ref = Integer.valueOf("3");
//         ref++;
//         System.out.println(ref);
//     }
// }

// O código compila e roda? Qual seria resultado?

// Alternativa correta
// Compila, roda e imprime um valor aleatório.


// Errado, imprime 4!

// Alternativa correta
// Não compila, pois não podemos incrementar uma referência.


// Errado, compila, roda e imprime 4!

// Alternativa correta
// Compila, roda e imprime 4.


// Correto, realmente incrementa o valor inteiro, mesmo sendo uma referência. O que acontece por baixo dos panos 
// é um autoboxing / unboxing na linha que incrementa a variável (ref++). Você pode imaginar que essa linha 
// será substituída por três novas:

// int valor = ref.intValue();
// valor = valor + 1;
// ref = Integer.valueOf(valor);

// O valor é desembrulhado, depois incrementado e depois embrulhado de novo!

// Alternativa correta
// Compila e roda, mas lança um ArthmeticException.


// Errado, imprime 4!