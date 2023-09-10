package com.senac.GestaoAcademica.dominio.interfaces;

import com.senac.GestaoAcademica.dominio.entidades.Usuario;

public interface InterfaceUsuario {
    public Usuario criarUsuario(Usuario usuario);
    public Usuario esqueciMinhaSenha(String cpf);
}
