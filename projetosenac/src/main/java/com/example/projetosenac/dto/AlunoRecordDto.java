package com.example.projetosenac.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;
import java.util.UUID;


public record AlunoRecordDto(
        @NotBlank String NomeCompleto,
        @NotBlank String CPF,
        @NotNull Date DataNascimento,
        @NotNull EnderecoRecordDto endereco,
        @NotBlank String email,
        @NotBlank String Numero,
        @NotNull UUID curso_id
) {
}
