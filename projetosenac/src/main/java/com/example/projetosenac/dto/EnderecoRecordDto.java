package com.example.projetosenac.dto;

import com.example.projetosenac.models.CursoModel;
import com.example.projetosenac.models.EnderecoModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.Date;

public record EnderecoRecordDto(@NotBlank String logradouro,
                                @NotBlank String numero,
                                @NotBlank String bairro,
                                @NotBlank String estado,
                                @NotBlank String cidade,
                                @NotBlank String cep) {
}
