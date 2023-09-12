package com.senac.GestaoAcademica.infraestrutura.persistencia;

import com.senac.GestaoAcademica.dominio.entidades.Endereco;
import com.senac.GestaoAcademica.dominio.interfaces.InterfaceEndereco;
import com.senac.GestaoAcademica.infraestrutura.repositorio.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EnderecoPersistencia implements InterfaceEndereco {

    @Autowired
    private EnderecoRepository enderecoRepository;
    @Override
    public Endereco buscarEndereco(Long id) {
        return enderecoRepository.getReferenceById(id);
    }

    @Override
    public Endereco criarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }

    @Override
    public Endereco editarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
}
