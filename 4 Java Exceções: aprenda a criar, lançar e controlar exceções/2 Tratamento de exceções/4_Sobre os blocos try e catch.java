// Marque as alternativas verdadeiras sobre os blocos try e catch:

// A)
// Não é possível ter uma instrução catch, sem uma instrução try.
// Exato. A lógica de tratamento de erro no bloco catch só é disparada quando
// uma exceção é lançada dentro de um bloco try.

// B)
// Para tratarmos uma exceção, que pode ocorrer enquanto nosso programa esta
// sendo executado, precisamos tratá-la antecipadamente com um bloco de código
// específico.
// Exato, justamente o bloco try-catch.

// C)
// Um bloco try envolve um código que potencialmente pode gerar uma exceção. É
// dentro do seu bloco que definimos como o código deve ser tratado.
// Errado, O bloco try apenas delimita a área na qual uma exceção pode ser
// lançada. É através do bloco catch que lidamos com a exceção capturada dentro
// de um bloco try.