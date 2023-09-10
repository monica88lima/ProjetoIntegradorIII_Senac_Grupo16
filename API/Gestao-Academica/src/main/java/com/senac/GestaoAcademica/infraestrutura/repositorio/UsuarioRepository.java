package com.senac.GestaoAcademica.infraestrutura.repositorio;

import com.senac.GestaoAcademica.dominio.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
