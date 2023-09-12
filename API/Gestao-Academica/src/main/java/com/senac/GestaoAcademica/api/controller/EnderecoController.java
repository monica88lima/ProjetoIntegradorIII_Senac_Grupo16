package com.senac.GestaoAcademica.api.controller;

import com.senac.GestaoAcademica.aplicacao.servicos.EnderecoLeituraDTO;
import com.senac.GestaoAcademica.aplicacao.servicos.EnderecoServico;
import com.senac.GestaoAcademica.aplicacao.servicos.UsuarioServico;
import com.senac.GestaoAcademica.dominio.entidades.Endereco;
import com.senac.GestaoAcademica.dominio.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    private EnderecoServico enderecoServico;

    @GetMapping("/{id}")
    public ResponseEntity<EnderecoLeituraDTO> buscarEndereco(@PathVariable Long id){
        EnderecoLeituraDTO endereco = enderecoServico.buscarEndereco(id);
        return ResponseEntity.ok(endereco);
    }
}
