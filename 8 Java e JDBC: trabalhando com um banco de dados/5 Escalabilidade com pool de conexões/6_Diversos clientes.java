// Em um cenário onde diversos clientes podem acessar uma mesma aplicação simultaneamente, qual a abordagem 
// mais apropriada?

// A)
// Reciclar um conjunto de conexões de tamanho fixo ou dinâmico
// Alternativa correta! Essa é a abordagem do pool de conexão. Vamos abrir uma quantidade de conexões e
// reaproveitá-las.

// B)
// Abrir uma nova conexão a cada novo usuário, e mantê-la aberta o tempo todo
// Alternativa errada! Essa abordagem pode gerar grandes problemas para o banco de dados, pois a conexão 
// é um recurso custoso. Um banco de dados tem um limite de conexões (dependendo do banco, infraestrutura 
// e configurações) que devemos respeitar.

// C)
// Criar uma única conexão e mantê-la aberta o tempo todo
// Alternativa errada! Essa abordagem não escala, pois só podemos atender um único cliente ao mesmo tempo. 
// É importante lembrar que uma conexão não pode ser compartilhada ao mesmo tempo.