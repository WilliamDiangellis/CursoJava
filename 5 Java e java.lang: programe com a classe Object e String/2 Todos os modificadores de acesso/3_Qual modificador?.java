// Qual modificador é visível nos seguintes lugares?

// Classe Package Classe Filho Qualquer Package
// ────────────────────────────────────────────
// ✔ ✔ ✔ ✘
// ────────────────────────────────────────────

// A)
// <<package private>> (ausência do modificador)
// Errado.

// B)
// protected
// Correto! O modificador protected funciona igual ao *<<package private>> mas
// adiciona a visibilidade para os filhos (chamado de "publico para os filhos").

// C)
// private
// Errado.

// D)
// public
// Errado