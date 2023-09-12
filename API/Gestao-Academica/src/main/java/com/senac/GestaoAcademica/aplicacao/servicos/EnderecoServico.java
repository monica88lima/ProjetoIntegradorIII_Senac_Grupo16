package com.senac.GestaoAcademica.aplicacao.servicos;

import com.senac.GestaoAcademica.dominio.entidades.Aluno;
import com.senac.GestaoAcademica.dominio.entidades.Endereco;
import com.senac.GestaoAcademica.infraestrutura.persistencia.AlunoPersistencia;
import com.senac.GestaoAcademica.infraestrutura.persistencia.EnderecoPersistencia;
import com.senac.GestaoAcademica.infraestrutura.repositorio.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoServico {
    @Autowired
    EnderecoPersistencia enderecoPersistencia;
    public EnderecoLeituraDTO buscarEndereco(Long id){
        try {
            Endereco endereco =  enderecoPersistencia.buscarEndereco(id);
            if(endereco == null){
                throw new RuntimeException("Endereco não encontrados!");
            }
            return new EnderecoLeituraDTO(endereco);
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
    public Endereco criarEndereco(Endereco endereco){
        try {
            if(endereco == null){
                throw new RuntimeException("não é permitido criar um endereco invalido");
            }
            enderecoPersistencia.criarEndereco(endereco);
            return endereco;
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
    public Endereco editarEndereco(Endereco endereco){
        try{
            if(endereco == null){
                throw  new RuntimeException("Não é permitido salvar um endereco nulo!");
            }

            Endereco enderecoDb = enderecoPersistencia.buscarEndereco(endereco.getId());
            enderecoDb.setLogradouro(endereco.getLogradouro());
            enderecoDb.setNumero(endereco.getNumero());
            enderecoDb.setComplemento(endereco.getComplemento());
            enderecoDb.setCep(endereco.getCep());
            enderecoDb.setBairro(endereco.getBairro());
            enderecoDb.setCidade(endereco.getCidade());
            enderecoDb.setEstado(endereco.getEstado());
            enderecoPersistencia.editarEndereco(enderecoDb);
            return enderecoDb;
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }

    }
}
