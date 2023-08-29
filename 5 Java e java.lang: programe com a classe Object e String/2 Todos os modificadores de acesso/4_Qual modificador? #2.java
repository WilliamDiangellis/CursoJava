// E agora, qual modificador é visível nos seguintes lugares?

// Classe Package Classe Filho Qq Package
// ────────────────────────────────────────────
// ✔ ✔ ✘ ✘
// ────────────────────────────────────────────

// A)
// <<package private>> (ausência do modificador)
// A ausência do modificador, também chamado de package private ou default, o
// membro fica visível na classe e no package, mas é invisível fora do pacote
// (nem para filhos).

// B)
// public
// Errado.

// C)
// private
// Errado.

// D)
// protected
// Errado.