package com.senac.GestaoAcademica.infraestrutura.persistencia;

import com.senac.GestaoAcademica.dominio.entidades.Usuario;
import com.senac.GestaoAcademica.dominio.interfaces.InterfaceUsuario;
import com.senac.GestaoAcademica.infraestrutura.repositorio.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioPersistencia implements InterfaceUsuario {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> todosUsuario(){
        return usuarioRepository.findAll();
    }
    @Override
    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario esqueciMinhaSenha(String cpf) {
        return null;
    }
}
