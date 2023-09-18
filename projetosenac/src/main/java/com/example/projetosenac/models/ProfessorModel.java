package com.example.projetosenac.models;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

import java.util.UUID;

@Entity
@Table(name = "Professor")
public class ProfessorModel extends PessoaModel{
    private String Titulacao;

    public ProfessorModel(){

    }

    public ProfessorModel(UUID Id, boolean ativo, Date dataCriacao, Date dataAtualizacao, String NomeCompleto, String CPF, Date DataNascimento, String email, String senha, String numero, EnderecoModel endereco, String titulacao) {
        super(Id, ativo, dataCriacao, dataAtualizacao, NomeCompleto, CPF, DataNascimento, email, senha, numero, endereco);
        Titulacao = titulacao;
    }

    public String getTitulacao() {
        return Titulacao;
    }

    public void setTitulacao(String titulacao) {
        Titulacao = titulacao;
    }



}
