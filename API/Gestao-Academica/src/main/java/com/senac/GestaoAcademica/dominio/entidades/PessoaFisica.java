package com.senac.GestaoAcademica.dominio.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoas_fisica")
public class PessoaFisica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private String cpf;
    private String dataNascimento;
    private String nomeMae;
    private String nomePai;
    private String email;
    private String celular;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public PessoaFisica(){
    }
    public PessoaFisica(Long id, String nomeCompleto, String cpf, String dataNascimento, String nomeMae, String nomePai,
                        String email, String celular, Endereco endereco) {
        this.id =id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.nomeMae = nomeMae;
        this.nomePai = nomePai;
        this.email = email;
        this.celular = celular;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
