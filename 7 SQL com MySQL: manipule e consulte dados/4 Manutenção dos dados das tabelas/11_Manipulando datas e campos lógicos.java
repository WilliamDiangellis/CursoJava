// Vamos manipular duas categorias de campos que não estudamos até o momento, o LÓGICO e a DATA, utilizando a 
// tabela de cliente.

// Do lado esquerdo do Workbench, em "sucos > tables > tbcliente > columns", temos todas as colunas da tabela, 
// perceba que o campo "PRIMEIRA_COMPRA" é do tipo BIT (lógico), mas que não há campo do tipo DATA nessa tabela, 
// apenas "IDADE" que é INT.

// Conversando com o gerente da empresa "Suco de Frutas", ele menciona que gostaria de incluir a data de nascimento
// dos clientes. Para tanto, iremos primeiro inserir uma chave primária em "tbcliente", que será o número do "CPF" e
// em seguida, adicionar a coluna "DATA_NASCIMENTO". Depois, vamos inserir um registro para analisar como incluir data e informação lógica , representada por 1 ou 0, na tabela.

// Criando um ambiente para o script, insira o comando USE sucos; e na linha seguinte ALTER TABLE tbcliente ADD
// PRIMARY KEY (CPF);, para gerar a chave primária. Já para incluir a nova coluna "DATA_NASCIMENTO" utilizaremos 
// também o ALTER TABLE com algumas modificações ALTER TABLE tbcliente ADD COLUMN (DATA_NASCIMENTO DATE);.

// USE sucos;

// ALTER TABLE tbcliente ADD PRIMARY KEY (CPF);

// ALTER TABLE tbcliente ADD COLUMN (DATA_NASCIMENTO DATE);
// 

// Então, ALTER TABLE (nome da tabela), ADD COLUMN (adicionando um campo novo), e DATA_NASCIMENTO DATE, específico
// o novo campo que quero adicionar e o seu tipo. Vamos rodar esse script com os três comandos. Em "Columns",
// selecionando o botão direito do mouse e escolhendo a opção "Refresh All", aparece o campo que incluímos 
// "DATA_NASCIMENTO".

// Vamos inserir os campos usando o INSERT INTO, como fizemos em algumas aulas passadas.

// INSERT INTO tbcliente (
// CPF, 
// NOME, 
// ENDERECO1, 
// ENDERECO2, 
// BAIRRO, 
// CIDADE, 
// ESTADO, 
// CEP, 
// IDADE, 
// SEXO, 
// LIMITE_CREDITO, 
// VOLUME_COMPRA, 
// PRIMEIRA_COMPRA, 
// DATA_NASCIMENTO) VALUES (
// '00388934505', 
// 'João da Silva', 
// 'Rua projetada A número 10', 
// '', 
// 'Vila Roman', 
// 'CARATINGA', 
// 'AMAZONAS', 
// '2222222', 
// 30, 
// 'M', 
// 10000.00, 
// 2000, 
// 0, 
// '1989-10-05');
// 

// Perceba que da coluna "CPF" até "CEP" será do tipo VARCHAR por isso, utilizamos aspas simples ('') entre os
// valores. Já referente ao campo "ENDERECO2" inserimos apenas (‘’), que significa que essa coluna está vazia -
// indicar o campo é obrigatório mesmo que seja vazio - visto que o apenas a coluna "ENDERECO1" já foi suficiente
// para guardar o endereço completo do cliente.

// Na coluna "PRIMEIRA_COMPRA" é do tipo BIT (0 ou1), sendo 1 caso o cliente já tenha realizado uma compra e 0 se 
// ainda não. Vamos inserir o zero, sem as aspas já que é representado como um número, para informar que esse cliente
// ainda não realizou a primeira compra ainda.

// Finalmente, o campo "DATA_NASCIMENTO", possível ser reproduzido de diversas maneiras e ordens conforme o país. 
// Mas, há uma forma universal de representar DATA no MySQL e com ela não é preciso se preocupar se é no formato 
// americano, brasileiro, se utiliza barra, aspas ou traços.

// Primeiro, essa data será tratada como STRING por isso, ficará entre aspas simples (''). Vamos digitar o ano com
// quatro dígitos, traço, o mês com dois dígitos, traço e o dia com dois dígitos.

// Selecionando somente a instrução INSERT INTO e rodando, será exibida a mensagem informando que o comando foi
// executado. Para verificar, vamos incluir o SELECT * FROM tbcliente; na área do código, selecionar somente ele 
// e executar.

// Tabela exibida após o select:

// CPF	NOME	ENDERECO1	ENDERECO2	BAIRRO	CIDADE	ESTADO	CEP	IDADE	SEXO	LIMITE_CREDITO	VOLUME_COMPRA	PRIMEIRA_COMPRA	DATA_NASCIMENTO
// 00388934505	João da Silva	Rua projetada A número 10		Vila Roman	CARATINGA	Amazonas	2222222	30	M	10000.00	2000	0	1989-10-05
// Note que o campo "ENDERECO2" está vazio, como indicado no comando VALUES por (''), a coluna "PRIMEIRA_COMPRA" está com o número 0 e a "DATA_NASCIMENTO" 
// representada com ano, mês e dia. 
// Nessa aula aprendemos sobre manipulação e inclusão dos campos dos tipos lógico e data.