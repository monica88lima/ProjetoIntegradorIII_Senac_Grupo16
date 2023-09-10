package com.senac.GestaoAcademica.dominio.interfaces;

import com.senac.GestaoAcademica.dominio.entidades.Aluno;
import com.senac.GestaoAcademica.dominio.entidades.Usuario;

import java.util.List;

public interface IntefaceAluno {
    public List<Aluno> buscarAlunos();
    public Aluno buscarAluno(Long id);
    public Aluno criarAluno(Aluno aluno);
    public Aluno editarAluno(Aluno aluno);
}
