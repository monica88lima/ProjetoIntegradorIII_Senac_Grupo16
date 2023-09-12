package com.senac.GestaoAcademica.infraestrutura.repositorio;

import com.senac.GestaoAcademica.dominio.entidades.Endereco;
import com.senac.GestaoAcademica.dominio.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
