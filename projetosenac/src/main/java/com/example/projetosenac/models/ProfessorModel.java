package com.example.projetosenac.models;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

import java.util.UUID;

@Entity
@Table(name = "Professor")
public class ProfessorModel extends PessoaModel{
    private String Titulacao;
    public ProfessorModel(UUID Id, boolean ativo, Date dataCriacao, Date dataAtualizacao, String NomeCompleto, String CPF, Date DataNascimento, String email, String senha, String numero, String titulacao) {
        super(Id, ativo, dataCriacao, dataAtualizacao, NomeCompleto, CPF, DataNascimento, email, senha, numero);
        Titulacao = titulacao;
    }
    public ProfessorModel(){

    }

    public String getTitulacao() {
        return Titulacao;
    }

    public void setTitulacao(String titulacao) {
        Titulacao = titulacao;
    }



}
