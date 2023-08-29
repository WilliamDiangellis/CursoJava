// Em um pool simples, com 9 conexões e todas elas ocupadas, o que acontece quando o 10º usuário se conecta?

// A)
// O usuário receberá uma exceção
// Alternativa errada! O pool de conexões tem mecanismos para gerenciar esta situação.

// B)
// O sistema deve identificar que não há conexão disponível e notificar o cliente para voltar mais tarde
// Alternativa errada! Se o sistema utiliza pool de conexões, não é necessário tal tratamento.

// C)
// O 10º usuário esperará alguma das 9 conexões ficar disponível
// Alternativa correta! Assim que for disponibilizada, o 10º cliente terá sua requisição processada.