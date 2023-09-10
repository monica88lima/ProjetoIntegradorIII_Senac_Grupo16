package com.senac.GestaoAcademica.aplicacao.servicos;

import com.senac.GestaoAcademica.dominio.entidades.Aluno;
import com.senac.GestaoAcademica.dominio.entidades.Usuario;
import com.senac.GestaoAcademica.dominio.enun.TipoCadastro;
import com.senac.GestaoAcademica.infraestrutura.persistencia.AlunoPersistencia;
import com.senac.GestaoAcademica.infraestrutura.persistencia.UsuarioPersistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServico {
    @Autowired
    UsuarioPersistencia usuarioPersistencia;

    @Autowired
    AlunoPersistencia alunoPersistencia;

    public List<Usuario> todosUsuarios(){
        try {
            List<Usuario> usuarios =  usuarioPersistencia.todosUsuario();
            if(usuarios == null){
                throw new RuntimeException("Usuarios não encontrados!");
            }
            return usuarios;
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }
    }
    public Usuario criarUsuario(Usuario usuario){
        try{
            if(usuario == null){
                throw  new RuntimeException("Não é permitido salvar um usuario nulo!");
            }
            usuarioPersistencia.criarUsuario(usuario);
            return usuario;
        }catch (RuntimeException ex){
            throw new RuntimeException(ex.getMessage());
        }

    }
}
