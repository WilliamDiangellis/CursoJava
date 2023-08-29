// Fulano é novo na equipe da empresa KWZ. Ficou responsável por uma tela de
// cadastro, onde existe um campo que deve ser validado conforme a regra de
// negócio XYZ. Ele pergunta a seu gerente onde pode obter informações sobre a
// tal regra. Marque as alternativas que podem ser identificadas como respostas
// de quem usa o paradigma procedural em seus projetos.

// Selecione 3 alternativas

// A)
// "Copie o código de validação que está no formulário ABCD."

// Correto. Resposta típica de quem usa o paradigma procedural para não arriscar
// inserir erros em códigos que já estão funcionando ou em produção.

// B)
// Fulano deve entrar em contato com alguém da equipe de analistas de negócio da
// empresa, para ele entender a regra e implementá-la.

// Correto. Essa resposta indica que Fulano deve implementar novamente a regra,
// gerando mais um local caso a regra precise ser alterada. Tipicamente
// procedural.

// C)
// Dependendo do módulo, Fulano deve perguntar ao responsável técnico do mesmo.

// Correto. Essa resposta denota que a regra está implementada em vários
// lugares. Quem é o responsável por ela? Como diz o ditado popular "Cachorro
// que tem muitos donos acaba morrendo de fome". Tipicamente procedural.

// D)
// Basta que Fulano consuma uma classe que representa a informação a ser
// cadastrada pelo campo.

// Errado. Caso exista alguma alteração na regra, apenas essa classe será
// modificada, propagando a mudança para quem a consome. Tipicamente OO.