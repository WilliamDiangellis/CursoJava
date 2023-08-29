// Agora, iremos entender sobre a história do MySQL e mencionar algumas de suas características.

// Já conversamos um pouco sobre a história do SQL, quando os bancos relacionais estavam começando a ser 
// popularizados. À época, três desenvolvedores, o David Axmark, Allan Larsson e Michael Widenius, buscaram 
// elaborar uma interface SQL que fosse compatível com o que estava surgindo no mercado de banco de dados.

// No início, eles utilizaram APIs de terceiros para efetuar os comandos SQL que buscavam informações de alguns 
// outros bancos de dados de mercado. Porém, não obtiveram um retorno satisfatório e, por esse motivo, começaram 
// a desenvolver sua própria API de consulta - e não apenas isso, também o seu próprio banco de dados, utilizando 
// a linguagem C++.

// Foi a partir disso que se iniciou o projeto MySQL. Ele se tornou bastante popular, primeiramente por ser 
// apresentado como um software livre (open source), isto é, a comunidade teria acesso ao código-fonte para 
// realizar alterações e contribuir com melhorias para o banco de dados. Além disso, se mostrou um banco de dados 
// bastante ágil para a época, mais rápido que os concorrentes, além de apresentar um excelente mecanismo de 
// multitarefas e de multiusuário.

// Com isso, o MySQL mostrou que o seu servidor poderia ser usado e suportava bem a escalabilidade robusta em 
// missão crítica, como, por exemplo, em um banco que nunca pode parar a operação dos serviços prestados.

// Missão crítica: todo sistema tecnológico fundamental para que os serviços de uma empresa continuem operando 
// sem interrupções.

// Como consequência, o MySQL se popularizou como software livre, inclusive de modo corporativo. No ano de 2008,
// o MySQL AB, empresa que gerenciava o código desse banco de dados, foi comprada por um bilhão de dólares por uma
// empresa chamada Sun Microsystems, uma empresa grande que a princípio atuava na área de hardware e depois 
// começou a entrar para o ramo de software. Essa companhia também era responsável pela criação do Java.

// Em 2009, após um ano da compra do MySQL, a Sun Microsystems foi comprada pela Oracle, que passou a ter 
// propriedade sobre todos os produtos. Por esse motivo, a Oracle é hoje dona do Java e do MySQL. Houve uma
// grande movimentação no mercado naquele tempo, já que a Oracle possuía o seu banco de dados relacional robusto 
// e o MySQL estava se mostrando um concorrente à altura.

// Quando o MySQL foi vendido, a comunidade open source criou outro banco de dados, o MariaDB, que se tornou o 
// sucessor em código aberto do MySQL.

// Devido à sua popularidade, sendo uma opção de baixo custo para as empresas do mercado corporativo e de mercado 
// online (que vinha crescendo bastante a partir dos 2009 e 2010), a Oracle manteve o desenvolvimento do MySQL.

// A Oracle permitiu que os usuários pudessem escolher entre usar o programa como produto open source, sob os 
// termos da licença GNU (GNU's Not Unix!) ou comprar a licença padrão comercial do MySQL. Para esse último caso, 
// a Oracle oferecia algumas vantagens para as empresas que comprassem o MySQL de forma corporativa, como 
// suporte mais rápido e acesso à alguma documentação específica.

// Porém, a licença oferecida de forma aberta ainda mantém a eficiência e características apresentadas antes 
// do MySQL ser comprado por essas empresas gigantes da área de tecnologia.

// Lembrando que o MySQL é um banco de dados relacional e compatível com a linguagem SQL. Por isso, vamos aprender 
// nesse treinamento o SQL utilizando o MySQL.

// O servidor do MySQL é robusto até certo ponto, já que deriva de características de multiacesso, integridade 
// de dados, efetua o relacionamento entre tabelas, trabalha a concorrência quando vários usuários tentam 
// acessar o mesmo dado na mesma tabela, realiza o controle de transações, entre outros processos. Essa robustez é 
// uma característica importante no que diz respeito ao servidor do MySQL.

// Outro aspecto importante é a portabilidade do banco de dados. O MySQL pode ser transacionado entre diversos 
// sistemas. Isso significa que consigo desenvolver o banco de dados MySQL em Windows e posteriormente utilizar
// no Linux ou Unix, sendo assim, interplataforma.

// Ademais, o banco MySQL provém várias APIs que permitem acessar os dados do MySQL usando .Net, Java, Python, 
// PHP, JavaScript e JQuery, por exemplo. Isto é, as linguagens de programação que são mais usadas no mercado 
// possuem APIs nativas para acesso ao MySQL.

// Outro atributo importante é o multithreads. O MySQL usa uma programação de threads utilizando diretamente o 
// Kernel do sistema operacional, permitindo aumentar a velocidade de transações, além de facilitar a integração
// da ferramenta com hardwares, possibilitando a escalabilidade da performance. Isto quer dizer que, caso tenha 
// um MySQL usando um servidor com determinado número de CPUs, é possível acrescentar mais CPUs que o banco de 
// dados se adapta usando o máximo do hardware disponível.

// O banco de dados MySQL atua com diversas formas de armazenamento que se adaptam às características das suas 
// necessidades. Por exemplo, algumas formas priorizam a velocidade, enquanto outras o alto volume de 
// armazenamento, tudo dependendo do objetivo pelo qual você utiliza o MySQL. Discutiremos mais sobre isso 
// em treinamentos futuros, quando abordarmos a parte de administração.

// A velocidade é outro aspecto fundamental. O MySQL é considerado um dos bancos mais rápidos do mercado, 
// sobretudo quando são utilizadas funcionalidades ligadas à internet. Como exemplo, podemos citar sites 
// de e-commerce e de aplicações de internet, já que as nuvens da Amazon, do Google e da Microsoft (Azure) 
// disponibilizam instâncias de MySQL com uma alta escalabilidade.

// Já sobre segurança, o banco de dados MySQL possui internamente diversos mecanismos de segurança, o que o 
// torna bastante seguro para o mercado. Além disso, permite a segregação dos dados por usuários de acesso, 
// isto é, a pessoa possui acesso somente ao que lhe for permitido.

// O MySQL também permite o armazenamento de uma quantidade enorme de dados, tornando a sua capacidade alta, 
// a depender das formas de armazenamento. Se for escolhida uma forma que prioriza o volume de dados, há um 
// limite hoje de até 65 mil terabytes de dados armazenados. Claro, recuperar e manipular esse volume de 
// informação pode ser um pouco difícil e depender de muito hardware. A maioria das aplicações corporativas 
// não precisam desse tamanho todo de armazenamento para trabalharem.

// Já referente à aplicabilidade, o MySQL não se aplica somente a utilidades de internet - apesar de ser preferido
// por desenvolvedores web -, mas também aplicações de desktop ou corporativas, essas chamadas de On Premises, 
// nas quais o banco de dados é instalado no próprio servidor da empresa. Esses bancos possuem o que chamamos
// ODBCs (Open Database Connectivity, comum em bancos baseados em Windows) ou JDBCs (Java Database Connectivity,
// comum em bancos baseados em Java), que permitem realizar acessos rápidos ao banco de dados MySQL em 
// aplicações desktop.

// Finalmente, falaremos um pouco sobre o log. No MySQL há um forte gerenciamento de log, que registra tudo o que 
// fazemos no banco. Isso é um ponto interessante quando é necessário realizar uma recuperação de dados ou se for 
// preciso fazer o que é chamado réplica de servidores, técnica bastante usada quando temos um servidor chamado
// master e outro slave, existindo uma sincronização de dados entre eles.

// Por esse motivo, é um dos bancos de dados mais usados em nuvem, já que esse tipo de banco possui diversas 
// replicações em diferentes lugares do planeta para que, caso um CPD (Centro de Processamento de Dados) caia,
// outro continue operando e a aplicação siga tendo alta disponibilidade de acesso.

// Isso é um pouco da história e características do banco MySQL, que vamos usar nesse treinamento para mostrar 
// como funciona a linguagem SQL.