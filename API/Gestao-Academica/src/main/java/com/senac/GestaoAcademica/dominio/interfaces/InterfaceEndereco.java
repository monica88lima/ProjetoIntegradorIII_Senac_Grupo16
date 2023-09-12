package com.senac.GestaoAcademica.dominio.interfaces;

import com.senac.GestaoAcademica.dominio.entidades.Endereco;
import com.senac.GestaoAcademica.dominio.entidades.Usuario;

public interface InterfaceEndereco {
    public Endereco buscarEndereco(Long id);
    public Endereco criarEndereco(Endereco endereco);
    public Endereco editarEndereco(Endereco Endereco);
}
