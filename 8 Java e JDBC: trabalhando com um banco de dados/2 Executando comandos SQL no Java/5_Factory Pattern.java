// Qual a vantagem de utilizar uma ConnectionFactory na nossa aplicação?

// A)
// Não há vantagens, visto que a ConnectionFactory foi criada apenas para o curso de JDBC, não sendo 
// utilizada em aplicações corporativas
// Alternativa errada! A factory pattern é um padrão reconhecido e útil em vários contextos. Recomenda-se 
// utilizá-lo para a criação de objetos. Na API Java, encontramos vários exemplos do Factory Pattern como, por exemplo, o Calender.getInstance() ou Integer.valueOf("3").

// B)
// Fornecer uma maneira mais expressiva de criar um objeto com vários parâmetros
// Alternativa errada! Repare que a ConnectionFactory não possui nenhum parâmetro. Quando precisamos usar
// vários parâmetros, podemos usar o Builder Pattern, para deixar a criação mais expressiva.

// C)
// Fornecer uma maneira mais simples para criar um objeto
// Alternativa correta! Criamos objetos sem expor a lógica ou as configurações de criação ao cliente. 
// Além disso, podemos nos referir ao objeto recém-criado usando uma interface (usando uma abstração), 
// desacoplando a implementação.