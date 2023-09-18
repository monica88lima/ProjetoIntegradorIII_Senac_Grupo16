package com.example.projetosenac.Repository;

import com.example.projetosenac.models.AlunoModel;
import com.example.projetosenac.models.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EnderecoRepository extends JpaRepository<EnderecoModel, UUID> {
}
