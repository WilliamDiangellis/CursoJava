// Vimos agora que em um arquivo de classe ou interface existe a declaração do
// package, a declaração do import e a definição da classe.

// a) Só pode ter uma declaração package por arquivo

// b) A declaração do import é opcional

// c) É possível repetir a declaração import para importações de packages
// diferentes

// d) A definição da classe sempre deve vir por último (após package e import)

// Quais afirmações estão corretas?

// A)
// b, c, d
// Errado, pois falta a opção a:
// Só pode ter uma declaração package no código fonte e, além disso, a
// declaração deve ser a primeira clausula no código fonte (só comentários pode
// ter antes do package).

// B)
// Todas
// Correto!

// C)
// a, c e d
// Errado, pois falta a opção b:
// A declaração do import é opcional
// Não é preciso usar o import (porém útil). Sempre podemos usar o FQN da
// classe.

// D)
// a e d
// Errado, pois faltam as opções b e c:
// A declaração do import é opcional (b) e é possível repetir a declaração
// import para importações de packages diferentes (c).