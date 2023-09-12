package com.senac.GestaoAcademica.dominio.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idCurso;
    private Double av1;
    private Double av2;
    private Double av3;
    private Double media;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;
    @OneToOne(cascade = CascadeType.ALL)
    private PessoaFisica pessoaFisica;
    public Aluno(){
        super();
    }

    public Aluno(String curso, String nomeCompleto, String cpf,
                 String dataNascimento, String nomeMae, String nomePai, String email, String celular, Endereco endereco, PessoaFisica pessoaFisica){
        av1 = 0d;
        av2 = 0d;
        av3 = 0d;
        media = 0d;
        this.endereco = endereco;
        this.pessoaFisica = pessoaFisica;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public PessoaFisica getPessoaFisica() {
        return pessoaFisica;
    }

    public void setPessoaFisica(PessoaFisica pessoaFisica) {
        this.pessoaFisica = pessoaFisica;
    }
}
