package com.example.projetosenac.models;
import jakarta.persistence.*;


import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Aluno")
public class AlunoModel extends PessoaModel{

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matricula_seq")
    @SequenceGenerator(name = "matricula_seq", sequenceName = "matricula_sequence", allocationSize = 1)
    @Column(name = "matricula", updatable = false, nullable = false)
    private int matricula;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private CursoModel curso;


    public AlunoModel(UUID Id, boolean ativo, Date dataCriacao, Date dataAtualizacao, String NomeCompleto, String CPF, Date DataNascimento, String email, String senha, String numero, CursoModel curso, int matricula) {
        super(Id, ativo, dataCriacao, dataAtualizacao, NomeCompleto, CPF, DataNascimento, email, senha, numero);
        this.curso = curso;
        this.matricula = matricula;
    }

    public AlunoModel() {


    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }



    public CursoModel getCurso() {
        return curso;
    }

    public void setCurso(CursoModel curso) {
        this.curso = curso;
    }







}
