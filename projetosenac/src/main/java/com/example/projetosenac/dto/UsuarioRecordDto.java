package com.example.projetosenac.dto;

import jakarta.validation.constraints.NotBlank;

public record UsuarioRecordDto(@NotBlank String email,
                               @NotBlank String senha) {
}
