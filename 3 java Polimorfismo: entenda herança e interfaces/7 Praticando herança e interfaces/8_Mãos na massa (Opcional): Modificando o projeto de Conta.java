// 1) Volte para nosso projeto de conta.

// 2) Crie uma interface com o nome de Tributavel veja o código abaixo:

// public interface Tributavel{

//     double getValorImposto();


// }

// 3) Crie agora uma classe chamada CalculadorDeImposto, veja o conteúdo abaixo:

// public class CalculadorDeImposto{

//     private double totalImposto;

//     public void registra(Tributavel t){
//         double valor = t.getValorImposto();
//         this.totalImposto += valor;
//     }

//     public double getTotalImposto(){
//         return totalImposto;
//     }

// }

// 4) Crie uma classe chamada SeguroDeVida e defina a interface Tributavel, defina também a ContaCorrente como Tributavel e complete o código, veja abaixo:

// ContaCorrente

// public class ContaCorrente implements Tributavel{

//     @Override
//     public double getValorImposto(){
//         return super.saldo * 0.01;
//     }
// }

// SeguroDeVida OBS: Repare que ainda falta implementar o método corretamente:

// public class SeguroDeVida implements Tributavel{

//     @Override
//     public double getValorImposto(){
//         return 0;
//     }
// }

// 5) Crie uma classe TesteTributaveis com o método main veja o código abaixo:

// public class TesteTributaveis{

//     public static void main(String[] args){
//         ContaCorrente cc = new ContaCorrente(222, 333);
//         cc.deposita(100.0);

//         SeguroDeVida seguro = new SeguroDeVida();

//         CalculadorDeImposto calc = new CalculadorDeImposto();

//         calc.registra(cc);
//         calc.registra(seguro);

//         System.out.println(calc.getTotalImposto());
//     }
// }

// 6) Execute e veja se está tudo ok!