package com.alura.forumhub.forumAlura.topicos;

import jakarta.validation.constraints.NotBlank;

public record dadosCadastroTopico(
        Long id,
        @NotBlank
        String titulo,
        @NotBlank
        String mensagem,
        @NotBlank
        String autor,
        @NotBlank
        String curso) {}
