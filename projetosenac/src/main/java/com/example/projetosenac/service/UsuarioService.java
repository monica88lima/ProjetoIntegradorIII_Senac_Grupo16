package com.example.projetosenac.service;

import com.example.projetosenac.Repository.UsuarioRepository;
import com.example.projetosenac.models.AlunoModel;
import com.example.projetosenac.models.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;
@Service
public class UsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;
    public boolean ConsultaUsuario(String email, String senha){
        if(email.equals("maria@senac.com.br") && senha.equals("SempreSenha123") ){
            UUID chaveFixa = UUID.fromString("0562f27f-c610-4f56-aa30-9453f930ebbf");
            Optional<UsuarioModel> usuario0 = usuarioRepository.findById(chaveFixa);
            return true;
        }
        else{
            return false;
        }


    }
}
