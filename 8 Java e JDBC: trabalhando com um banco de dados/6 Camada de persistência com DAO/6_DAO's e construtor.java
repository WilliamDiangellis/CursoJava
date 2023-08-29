// Os DAO's que criamos recebem a conexão no construtor. Imagine que, ao invés disso, pegamos uma nova
// conexão automaticamente em um construtor sem argumentos, como no código a seguir:

// public class ProdutosDAO {
//     private final Connection con;
//     ProdutosDAO() {
//         con = Database.getConnection();
//     }
//     // resto do DAO aqui
// }

// O que acontece caso uma tarefa tenha que acessar dois DAO's, como ProdutoDAO e CategoriaDAO?
// Qual a desvantagem desta abordagem?

// A)
// Não será possível utilizar transação
// Alternativa correta! Como cada um dos DAO's possui uma conexão distinta, eles não estarão envolvidos
// na mesma transação e ficamos incapazes de utilizar tal recursos.

// B)
// A mesma conexão pode ser reaproveitada
// Alternativa errada! Não seria possível reaproveitar, pois se precisa de dois DAO's, serão duas conexões.

// C)
// Não há desvantagens, visto que seria a mesma coisa de passar a conexão como parâmetro do construtor
// Alternativa errada! Com esta abordagem, perdemos o poder de utilizar transações e abriríamos muitas
// conexões sem necessidade.
