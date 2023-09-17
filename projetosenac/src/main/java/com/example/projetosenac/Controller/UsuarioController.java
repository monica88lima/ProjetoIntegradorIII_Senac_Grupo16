package com.example.projetosenac.Controller;

import com.example.projetosenac.Repository.AlunoRepository;
import com.example.projetosenac.Repository.UsuarioRepository;
import com.example.projetosenac.dto.AlunoRecordDto;
import com.example.projetosenac.dto.UsuarioRecordDto;
import com.example.projetosenac.models.AlunoModel;
import com.example.projetosenac.models.UsuarioModel;
import com.example.projetosenac.service.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    UsuarioService usuarioService;

    @CrossOrigin(origins = "*")
    @PostMapping("/usuario")
    public ResponseEntity<Object> saveUsuario(@RequestBody @Valid UsuarioRecordDto usuarioRecordDto) {
        var usuarioModel = new UsuarioModel();
        BeanUtils.copyProperties(usuarioRecordDto, usuarioModel);
        String email = usuarioRecordDto.email();
        String senha = usuarioRecordDto.senha();
        var validaUsuario = usuarioService.ConsultaUsuario(email,senha);
        if(validaUsuario){
            return ResponseEntity.status(HttpStatus.OK).body(usuarioModel);
        }
        else{
            return ResponseEntity.status(HttpStatus.FORBIDDEN).body("Acesso Negado!");
        }



    }
}
