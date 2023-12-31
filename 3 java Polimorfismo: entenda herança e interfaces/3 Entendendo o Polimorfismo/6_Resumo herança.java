// Olá! Neste vídeo, faremos um resumo do que aprendemos até o momento sobre a
// herança, com a linguagem Java.

// Temos duas características principais da herança:

// Reutilização de código; e

// Polimorfismo.

// Sobre a primeira, temos o conceito de extensão da classe, com a palavra
// extends, isso faz com que a classe filha herde automaticamente os dados,
// atributos e funcionalidades dos métodos.

// Em nosso caso, a classe Gerente é baseada em todos os atributos da
// hierarquia.

// Ao criarmos um gerente, ele terá uma senha, porque isso está definido dentro
// da classe Gerente. Além disso, ele também terá um nome, um cpf e um salário,
// todos estes, atributos da classe Funcionario. O mesmo vale para os métodos,
// como getters e setters, e getBonificacao(), incluindo os métodos específicos
// de Gerente que terão preferência em relação aos mais genéricos.

// Já o conceito de polimorfismo é mais complexo. Temos por exemplo a hierarquia
// da classe Funcionario, em que ela é mãe das classes Gerente e EditorVideo.

// Quando criamos um gerente, temos um objeto do tipo Gerente:

// Gerente gerente = new Gerente();

// O objeto nunca muda o tipo. Uma vez que ele é criado com o tipo Gerente, terá
// sempre este tipo. O mesmo vale para o EditorVideo:

// EditorVideo editor = new EditorVideo();

// Neste caso, seu tipo será sempre EditorVideo. O que pode variar é o tipo da
// referência - isso é o polimorfismo.

// Antes de aprendermos sobre este conceito, colocávamos o tipo da referência
// igual ao tipo do objeto, com o polimorfismo, aprendemos que a referência pode
// ser de um tipo mais genérico. No nosso exemplo, esta classe mais genérica é
// Funcionario:

// Funcionario gerente = new Gerente();

// Isto funciona, porque todo Gerente é um Funcionario. Isso se aplica também ao
// EditorVideo:

// Funcionario editor = new EditorVideo();

// Temos uma referência genérica, do tipo Funcionario, que aponta para objetos
// de tipos diferentes. É possível comunicar com tipos diferentes de objetos, a
// partir de uma mesma referência genérica. Daí surge a vantagem do
// polimorfismo, como vimos em nosso código.

// Se observarmos a classe ControleBonificacao:

// public class ControleBonificacao {

// private double soma;

// public void registra(Funcionario f) {
// double boni = f.getBonificacao();
// this.soma = this.soma + boni;
// }

// public double getSoma() {
// return soma;
// }

// }

// Temos uma referência genérica Funcionario, que pode apontar para tipos de
// objetos diferentes, desde que pertençam à mesma hierarquia. Pode apontar
// tanto para um Gerente, quanto um EditorVideo, ou ainda para um Funcionario.

// Por isso, não temos como saber, somente a partir desta classe, qual objeto
// getBonificacao()será chamado. No caso do Gerente, há um método específico
// para o cálculo da bonificação, e por ser específico, é ele quem será chamado.
// Isso é verdade também para o EditorVideo.

// Para exemplificar, criaremos um novo tipo de funcionário, criando uma nova
// classe. Ele será um Designer:

// public class Designer extends Funcionario {

// public double getBonificacao() {
// System.out.println("Chamando o método de bonificacao do Designer");
// return 200;
// }
// }

// Importante lembrar que o Designer também é um Funcionario.

// Retornaremos à classe ControleBonificacao. Podemos observar que o método
// continua funcionando, poderíamos ter mais n tipos de funcionários, o cálculo
// continua funcionando pois é genérico o suficiente, já que utiliza o
// Funcionario como referência.

// Na classe TesteReferencia acrescentaremos o Designer para testarmos:

// public class TesteReferencia {

// //Código omitido

// EditorVideo ev = new EditorVideo();
// ev.setSalario(2500.0);

// Designer d = new Designer();
// d.setSalario(2000.0);

// ControleBonificacao controle = new ControleBonificacao();
// controle.registra(g1);
// controle.registra(f);
// controle.registra(ev);
// controle.registra(d);

// //Código omitido

// Tudo está compilando, e parece que funciona. Não foi necessário alterar o
// método apenas porque criamos um novo tipo de funcionário, essa é a vantagem
// do polimorfismo - é possível criar um código genérico que depende de um tipo
// genérico, criar outros tipos em nosso código, e tudo continua funcionando. Ao
// alterarmos um lado, o outro não é afetado.

// Retornaremos à classe TesteReferencia e a executaremos. No console, temos:

// Chamando o método de bonificacao do GERENTE
// Chamando o método de bonificacao do Editor de video
// Chamando o método de bonificacao do Designer
// 5775.0

// Funcionou. O controle de bonificação está funcionando, também, para o
// Designer.

// Adiante, faremos um mesmo teste de herança, agora utilizando os conceitos de
// conta corrente e conta poupança.
