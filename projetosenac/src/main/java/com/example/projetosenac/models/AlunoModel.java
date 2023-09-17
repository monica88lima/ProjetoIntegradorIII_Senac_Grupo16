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
//    @ManyToOne
//    private CursoModel curso;

    public UUID curso_id;




    public AlunoModel() {


    }

    public AlunoModel(
            UUID Id,
            boolean ativo,
            Date dataCriacao,
            Date dataAtualizacao,
            String NomeCompleto,
            String CPF,
            Date DataNascimento,
            String email,
            String senha,
            String numero,
            EnderecoModel endereco,
            int matricula,
            UUID curso_id) {
        super(Id, ativo, dataCriacao, dataAtualizacao, NomeCompleto, CPF, DataNascimento, email, senha, numero, endereco);
        this.matricula = matricula;
        this.curso_id = curso_id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public UUID getCurso_id() {
        return curso_id;
    }

    public void setCurso_id(UUID curso_id) {
        this.curso_id = curso_id;
    }


//    public CursoModel getCurso() {
//        return curso;
//    }
//
//    public void setCurso(CursoModel curso) {
//        this.curso = curso;
//    }







}
