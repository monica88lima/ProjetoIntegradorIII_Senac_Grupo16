package com.senac.GestaoAcademica.aplicacao.servicos;

import com.senac.GestaoAcademica.dominio.entidades.Aluno;
import com.senac.GestaoAcademica.dominio.entidades.Usuario;
import com.senac.GestaoAcademica.infraestrutura.persistencia.AlunoPersistencia;
import com.senac.GestaoAcademica.infraestrutura.persistencia.UsuarioPersistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoServico {
    @Autowired
    AlunoPersistencia alunoPersistencia;

    public List<Aluno> buscarAlunos(){
        try {
            List<Aluno> alunos =  alunoPersistencia.buscarAlunos();
            if(alunos == null){
                throw new RuntimeException("alunos não encontrados!");
            }
            return alunos;
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
    public Aluno buscarAluno(Long id){
        try {
            Aluno aluno =  alunoPersistencia.buscarAluno(id);
            if(aluno == null){
                throw new RuntimeException("aluno não encontrados!");
            }
            return aluno;
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
    public Aluno criarAluno(Aluno aluno){
        try {
            if(aluno == null){
                throw new RuntimeException("não é permitido criar um aluno invalido");
            }
            alunoPersistencia.criarAluno(aluno);
            return aluno;
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
    public Aluno editarAluno(Aluno aluno){
        try{
            if(aluno == null){
                throw  new RuntimeException("Não é permitido salvar um aluno nulo!");
            }

            Aluno alunoDb = alunoPersistencia.buscarAluno(aluno.getId());
            alunoDb.setNomeCompleto(aluno.getNomeCompleto());
            alunoDb.setCpf(aluno.getCpf());
            alunoDb.setDataNascimento(aluno.getDataNascimento());
            alunoDb.setNomeMae(aluno.getNomeMae());
            alunoDb.setNomePai(aluno.getNomePai());
            alunoDb.setEmail(aluno.getEmail());
            alunoDb.setCelular(aluno.getCelular());

            alunoPersistencia.editarAluno(aluno);
            return aluno;
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }

    }
}
