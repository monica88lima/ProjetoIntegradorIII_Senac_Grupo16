package com.example.projetosenac.Repository;

import com.example.projetosenac.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.UUID;
@Repository
public interface AlunoRepository extends JpaRepository<AlunoModel, UUID>  {


}
