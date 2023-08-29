// Renata, ao saber dos benefícios de se utilizar o PreparedStatement, resolveu refatorar a sua aplicação, 
// para passar a utilizá-lo. O código dela ficou assim:

// Statement stm = con.prepareStatement("DELETE FROM CLIENTE WHERE NOME = ? AND CPF = ?");

// stm.setString(1, "Renata");
// stm.setString(2, "94809849874");

// Renata observou que o seu código não estava compilando no momento de setar os valores dos atributos. 
// O que precisa ser feito para o código compilar?

// A)
// Renata precisa alterar a interface de Statement para PreparedStatement
// Alternativa correta! A interface Statement não conhece o método setString, pois o mesmo é da interface 
// PreparedStatement.

// B)
// O PreparedStatement não funciona com queries de remoção
// Alternativa errada! O PreparedStatement não tem diferenciação por tipo de query.

// C)
// Renata inverteu a ordem dos parâmetros do setString, sendo necessário primeiro a string e depois o index
// Alternativa errada! A ordem é exatamente esta, primeiro indica o índice, informando quais dos "?" serão
// substituídos pela string e depois informa a string em si.