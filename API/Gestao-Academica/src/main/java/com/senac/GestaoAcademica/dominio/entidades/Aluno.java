package com.senac.GestaoAcademica.dominio.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Aluno extends PessoaFisica{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCurso;
    private Double av1;
    private Double av2;
    private Double av3;
    private Double media;
    public Aluno(){
        super();
    }

    public Aluno(Long id, String curso, String nomeCompleto, String cpf,
                 String dataNascimento, String nomeMae, String nomePai, String email, String celular) {
        super( nomeCompleto, cpf, dataNascimento, nomeMae, nomePai, email, celular);
        id = id;
        curso = curso;
        av1 = 0d;
        av2 = 0d;
        av3 = 0d;
        media = 0d;
    }

    public Long getId() {
        return id;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }

    public Double getAv1() {
        return av1;
    }

    public void setAv1(Double av1) {
        this.av1 = av1;
    }

    public Double getAv2() {
        return av2;
    }

    public void setAv2(Double av2) {
        this.av2 = av2;
    }

    public Double getAv3() {
        return av3;
    }

    public void setAv3(Double av3) {
        this.av3 = av3;
    }

    public Double getMedia() {
        return media;
    }

}
