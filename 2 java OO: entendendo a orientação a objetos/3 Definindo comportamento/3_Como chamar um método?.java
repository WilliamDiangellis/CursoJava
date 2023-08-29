// Qual é a sintaxe e ordem correta para chamar um método com Java?

// A)
// nomeDaReferencia.nomeDoMetodo();
// Correto, sempre usando nomeDaReferencia.nomeDoMetodo(); , por exemplo:
// Conta contaDoPaulo = new Conta();
// contaDoPaulo.deposita(30.0);

// B)
// nomeDaReferencia -> nomeDoMetodo();
// Errado, não existe a sintaxe -> no mundo Java, mas sim no mundo PHP. O
// correto é:
// nomeDaReferencia.nomeDoMetodo();

// Por exemplo:
// Conta contaDoPaulo = new Conta();
// contaDoPaulo.deposita(30.0);

// C)
// nomeDoMetodo.nomeDaReferencia();
// Errado, primeiro vem o nomeDaReferencia, depois o operado . e o
// nomeDoMetodo(), por exemplo:
// Conta contaDoPaulo = new Conta();
// contaDoPaulo.deposita(30.0);

// D)
// nomeDaReferencia.nomeDoMetodo;
// Errado, aqui faltaram as () no final. O correto é:
// nomeDaReferencia.nomeDoMetodo();

// Por exemplo:
// Conta contaDoPaulo = new Conta();
// contaDoPaulo.deposita(30.0);