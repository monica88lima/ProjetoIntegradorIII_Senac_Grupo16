package com.senac.GestaoAcademica.api.controller;

import com.senac.GestaoAcademica.aplicacao.servicos.AlunoServico;
import com.senac.GestaoAcademica.aplicacao.servicos.EnderecoServico;
import com.senac.GestaoAcademica.aplicacao.servicos.UsuarioServico;
import com.senac.GestaoAcademica.dominio.entidades.Aluno;
import com.senac.GestaoAcademica.dominio.entidades.Endereco;
import com.senac.GestaoAcademica.dominio.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("/aluno")
public class AlunosController {

    @Autowired
    private AlunoServico alunoServico;

    @Autowired
    EnderecoServico enderecoServico;

    @GetMapping
    public ResponseEntity<List<Aluno>> buscarAlunos(){
        List<Aluno> alunos = alunoServico.buscarAlunos();
        return ResponseEntity.ok(alunos);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Aluno> buscarAluno(@PathVariable Long id){
        Aluno aluno = alunoServico.buscarAluno(id);
        return ResponseEntity.ok(aluno);
    }
    @PostMapping
    public ResponseEntity<Aluno> criarUsuario(@RequestBody Aluno aluno, UriComponentsBuilder uriBuilder){
        Aluno novoAluno = alunoServico.criarAluno(aluno);
        //Endereco novoEndereco = enderecoServico.criarEndereco(aluno.getEndereco());
        var uri = uriBuilder.path("/aluno/{id}").buildAndExpand(novoAluno.getId()).toUri();
        return ResponseEntity.created(uri).body(novoAluno);
    }

    @PutMapping
    public ResponseEntity<Aluno> editarAluno(@RequestBody Aluno alunoEditado){
        Aluno aluno = alunoServico.editarAluno(alunoEditado);
        return ResponseEntity.ok(aluno);
    }

}
