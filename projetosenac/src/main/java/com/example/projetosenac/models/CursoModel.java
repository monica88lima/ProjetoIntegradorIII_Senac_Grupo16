package com.example.projetosenac.models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;


import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "Curso")
public class CursoModel extends PadraoModel {
    private String nome;
    private String descricao;
    private int cargaHoraria;
    @OneToMany
    private List<AlunoModel> alunos;

    @ManyToMany
    private List<DisciplinaModel> disciplinas;

    public CursoModel(UUID Id, boolean ativo, Date dataCriacao, Date dataAtualizacao, String nome, String descricao, int cargaHoraria, List<AlunoModel> alunos, List<DisciplinaModel> disciplinas) {
        super(Id, ativo, dataCriacao, dataAtualizacao);
        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.alunos = alunos;
        this.disciplinas = disciplinas;
    }
    public CursoModel(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDecricao() {
        return descricao;
    }

    public void setDecricao(String decricao) {
        this.descricao = decricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<AlunoModel> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<AlunoModel> alunos) {
        this.alunos = alunos;
    }

    public List<DisciplinaModel> getDisciplinas() {
        return disciplinas;
    }

    public void setDisciplinas(List<DisciplinaModel> disciplinas) {
        this.disciplinas = disciplinas;
    }







}
