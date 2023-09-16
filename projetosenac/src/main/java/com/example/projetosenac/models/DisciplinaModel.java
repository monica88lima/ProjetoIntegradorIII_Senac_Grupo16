package com.example.projetosenac.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Disciplina")
public class DisciplinaModel extends PadraoModel {
    private String nome;
    @ManyToMany
    private List<CursoModel> cursos;

    public DisciplinaModel(UUID Id, boolean ativo, Date dataCriacao, Date dataAtualizacao, String nome, List<CursoModel> cursos) {
        super(Id, ativo, dataCriacao, dataAtualizacao);
        this.nome = nome;
        this.cursos = cursos;
    }
    public DisciplinaModel(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<CursoModel> getCursos() {
        return cursos;
    }

    public void setCursos(List<CursoModel> cursos) {
        this.cursos = cursos;
    }


}
