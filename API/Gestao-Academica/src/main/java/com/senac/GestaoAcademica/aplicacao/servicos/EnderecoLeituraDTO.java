package com.senac.GestaoAcademica.aplicacao.servicos;

import com.senac.GestaoAcademica.dominio.entidades.Endereco;

public record EnderecoLeituraDTO(
        Long id,
        String logradouro,
        String numero,
        String complemento,
        String cep,
        String bairro,
        String cidade,
        String estado
) {
    public EnderecoLeituraDTO(Endereco endereco){
        this(endereco.getId(), endereco.getLogradouro(), endereco.getNumero(), endereco.getComplemento(), endereco.getCep(),
                endereco.getBairro(), endereco.getCidade(), endereco.getEstado());
    }
}
