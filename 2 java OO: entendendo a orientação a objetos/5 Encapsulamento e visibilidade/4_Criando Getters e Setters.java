// Paulo está criando getters e setters para seguinte classe:

// public class Aluno {
// private String nome;
// private String matricula;
// }

// Como ficaria, seguindo a convenção explicada no vídeo anterior, a declaração
// dos getters e setters para os dois atributos da classe?

// A)
// public String getNome(){
// return this.nome;
// }

// public String getMatricula(){
// return this.matricula;
// }

// public void setMatricula(String matricula){
// this.matricula = matricula;
// }

// public void setNome(String nome){
// this.nome = nome;
// }
// Correto!

// B)
// public void getNome(){
// return this.nome;
// }

// public void getMatricula(){
// return this.matricula;
// }

// public String setMatricula(String matricula){
// this.matricula = matricula;
// }

// public String setNome(String nome){
// this.nome = nome;
// }

// Errado. Veja que o tipo de retorno de cada um dos métodos get e set estão
// invertidos.

// C)
// public int pegaNome(){
// return this.nome;
// }

// public String pegaMatricula(){
// return this.matricula;
// }

// public void atribuiMatricula(String matricula){
// this.matricula = matricula;
// }

// public void atribuiNome(String nome){
// this.nome = nome;
// }

// Errado. Apesar de funcionar, esta opção não segue a convenção de utilizar get
// e set no início dos métodos.