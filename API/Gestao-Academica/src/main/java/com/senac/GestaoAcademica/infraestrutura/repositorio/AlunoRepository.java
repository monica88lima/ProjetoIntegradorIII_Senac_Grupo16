package com.senac.GestaoAcademica.infraestrutura.repositorio;

import com.senac.GestaoAcademica.dominio.entidades.Aluno;
import com.senac.GestaoAcademica.dominio.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
