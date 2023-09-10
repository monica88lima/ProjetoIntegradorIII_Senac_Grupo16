package com.senac.GestaoAcademica.infraestrutura.persistencia;

import com.senac.GestaoAcademica.dominio.entidades.Aluno;
import com.senac.GestaoAcademica.dominio.entidades.Usuario;
import com.senac.GestaoAcademica.dominio.interfaces.IntefaceAluno;
import com.senac.GestaoAcademica.dominio.interfaces.InterfaceUsuario;
import com.senac.GestaoAcademica.infraestrutura.repositorio.AlunoRepository;
import com.senac.GestaoAcademica.infraestrutura.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AlunoPersistencia implements IntefaceAluno {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public List<Aluno> buscarAlunos() {
        return alunoRepository.findAll();
    }

    @Override
    public Aluno buscarAluno(Long id) {
        return alunoRepository.getReferenceById(id);
    }
    @Override
    public Aluno criarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @Override
    public Aluno editarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}
