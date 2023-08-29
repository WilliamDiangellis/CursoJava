// Digamos que eu tenha um sistema de dados de uma multinacional que controla chamados de suporte. 
// Um chamado é aberto no Japão e resolvido pela equipe da Alemanha. Que tipo de campo data é o melhor 
// para que possamos fazer cálculos corretos para obtermos o tempo de resposta dos chamados?

// A)
// Timestamp
// Alternativa correta! Temos que levar em conta o fuso horario da data para tratarmos de datas em diferentes
// partes do mundo.

// B)
// Datetime
// Alternativa Errada! Usar esse campo sem levar em consideração o fuso pode levar a erros.

// C)
// Date
// Alternativa Errada! O Date não guarda hora, minuto e segundo. Além disso, não leva em consideração o fuso horario.