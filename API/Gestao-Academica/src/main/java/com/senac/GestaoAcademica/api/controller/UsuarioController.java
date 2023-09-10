package com.senac.GestaoAcademica.api.controller;

import com.senac.GestaoAcademica.aplicacao.servicos.UsuarioServico;
import com.senac.GestaoAcademica.dominio.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioServico usuarioServico;

    @GetMapping
    public ResponseEntity<List<Usuario>> todosUsuarios(){
        List<Usuario> usuarios = usuarioServico.todosUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario, UriComponentsBuilder uriBuilder){
        Usuario novoUsuario = usuarioServico.criarUsuario(usuario);
        var uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(novoUsuario.getId()).toUri();
        return ResponseEntity.created(uri).body(novoUsuario);
    }

}
