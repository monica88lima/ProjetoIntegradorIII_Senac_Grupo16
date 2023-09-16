package com.example.projetosenac.dto;

import com.example.projetosenac.models.CursoModel;
import com.example.projetosenac.models.EnderecoModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;


public record AlunoRecordDto(
        @NotBlank String NomeCompleto,
        @NotBlank String CPF,
        @NotNull Date DataNascimento,
        @NotNull EnderecoRecordDto endereco,
        @NotNull CursoRecordDto curso,

        @NotBlank String email,
        @NotBlank String Numero) {
}
