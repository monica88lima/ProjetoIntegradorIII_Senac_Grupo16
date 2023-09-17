package com.example.projetosenac.dto;

import com.example.projetosenac.models.CursoModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record CursoRecordDto(
        @NotNull int cargaHoraria,
        @NotBlank String descricao,
        @NotBlank String nome) {
}
