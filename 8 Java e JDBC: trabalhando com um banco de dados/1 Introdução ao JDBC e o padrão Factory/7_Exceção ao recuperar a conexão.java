// Paulo desenvolveu o seguinte código, que abre e fecha uma conexão com o banco de dados:

// public class TestaConexaoParaExercicio {

//     public static void main(String[] args) throws SQLException {
//         // TODO Auto-generated method stub

//         Connection con = DriverManager
//             .getConnection("jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC");

//         con.close();
//     }
    
// Mas na hora de executar, o mesmo recebe a seguinte exceção: Access denied for user.

// O que Paulo precisa fazer para conseguir realizar com sucesso a sua operação?

// A)
// Precisa adicionar o driver do MySQL ao build path da aplicação
// Alternativa errada! O driver está inserido no build path, caso contrário, a exceção seria: No suitable driver 
//found for jdbc.

// B)
// Precisa inserir o usuário e senha na string de conexão
// Alternativa correta! Se, ao configurar o banco de dados, foi cadastrado um usuário e senha, essas informações
// devem estar na string de conexão, por exemplo:
// "jdbc:mysql://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC", "root", "root"

// C)
// O banco de dados informado na string de conexão está errado, sendo necessário alterar para:
// "jdbc:sqlserver://localhost/loja_virtual?useTimezone=true&serverTimezone=UTC"
// Alternativa errada! O banco de dados informado está correto, caso contrário, a exceção seria: No suitable driver found for jdbc, pois a aplicação estaria procurando pelo driver do SQL Server, que não está no build path.