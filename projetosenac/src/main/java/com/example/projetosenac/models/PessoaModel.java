package com.example.projetosenac.models;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToOne;


import java.util.Date;
import java.util.UUID;
@MappedSuperclass
public abstract class PessoaModel extends PadraoModel {
    private String NomeCompleto;
    private String CPF;
    private Date DataNascimento;
    private String email;
    private String senha;
    //telefone
    private String Numero;
    @OneToOne
    @JoinColumn(name = "endereco_id")
    private EnderecoModel endereco;

    // Construtor
    public PessoaModel(UUID Id, boolean ativo, Date dataCriacao, Date dataAtualizacao, String NomeCompleto, String CPF, Date DataNascimento, String email, String senha, String numero) {
        super(Id,ativo, dataCriacao, dataAtualizacao);
        this.NomeCompleto = NomeCompleto;
        this.CPF = CPF;
        this.DataNascimento = DataNascimento;

        this.email = email;
        this.senha = senha;
        this.Numero = numero;
    }
    public PessoaModel() {

    }


    public String getNomeCompleto() {
        return NomeCompleto;
    }

    public void setNomeCompleto(String NomeCompleto) {
        this.NomeCompleto = NomeCompleto;
    }


    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


    public Date getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(Date DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }



    public String getNumero() {
        return Numero;
    }

    public void setNumero(String numero) {
        this.Numero = numero;
    }

}
