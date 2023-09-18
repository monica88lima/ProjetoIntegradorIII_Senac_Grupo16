package com.example.projetosenac.models;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;


import java.util.Date;
import java.util.UUID;
@MappedSuperclass
public abstract class PadraoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public UUID Id;
    public boolean Ativo = true;
    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_criacao", updatable = false)
    public Date DataCriacao;
    @LastModifiedDate
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_atualizacao")
    public Date DataAtualizacao;
    public PadraoModel(UUID Id, boolean ativo, Date dataCriacao, Date dataAtualizacao){
        this.Id = Id;
        this.Ativo= ativo;
        this.DataCriacao = dataCriacao;
        this.DataAtualizacao = dataAtualizacao;
    }
    public PadraoModel(){

    }

    public UUID getId() {
        return Id;
    }


    public void setId(UUID Id) {
        this.Id = Id;
    }


    public boolean isAtivo() {
        return Ativo;
    }


    public void setAtivo(boolean Ativo) {
        this.Ativo = Ativo;
    }


    public Date getDataCriacao() {
        return DataCriacao;
    }


    public void setDataCriacao(Date DataCriacao) {
        this.DataCriacao = DataCriacao;
    }


    public Date getDataAtualizacao() {
        return DataAtualizacao;
    }


    public void setDataAtualizacao(Date DataAtualizacao) {
        this.DataAtualizacao = DataAtualizacao;
    }
}
