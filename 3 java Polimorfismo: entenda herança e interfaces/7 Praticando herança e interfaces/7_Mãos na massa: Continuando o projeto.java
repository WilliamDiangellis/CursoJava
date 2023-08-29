// 1) Repare que ainda estamos repetindo código, o que não é uma boa prática.

// 2) Crie uma nova classe AutenticacaoUtil e coloque o código abaixo:

// public class AutenticacaoUtil{

//     private int senha;

//     public void setSenha(int senha){
//         this.senha = senha;
//     }

//     public boolean autentica(int senha){
//         if(this.senha == senha){
//             return true;
//         } else {
//             return false;
//         }
//     }
// }

// 3) No código da classe Cliente, modifique o código conforme abaixo:

// public class Cliente implements Autenticavel{

//     private AutenticacaoUtil autenticador;

//     public Cliente(){

//         this.autenticador = new AutenticacaoUtil();
//     }

//     @Override
//     public void setSenha(int senha){
//         this.autenticador.setSenha(senha);
//     }

//     @Override
//     public boolean autentica(int senha){
//         return this.autenticador.autentica(senha);
//     }
// }

// 4) Faça as mesmas modificações na classe Administrador e Gerente, não se esqueça de criar o construtor!

// 5) Teste tudo e veja se está tudo ok!

