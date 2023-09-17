package com.example.projetosenac.Controller;

import com.example.projetosenac.Repository.AlunoRepository;
import com.example.projetosenac.Repository.EnderecoRepository;
import com.example.projetosenac.dto.AlunoRecordDto;
import com.example.projetosenac.models.AlunoModel;
import com.example.projetosenac.models.EnderecoModel;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
import java.util.UUID;
@CrossOrigin(origins = "*")
@RestController
public class AlunoController {
    @Autowired
    AlunoRepository alunoRepository;
    @Autowired
    EnderecoRepository enderecoRepository;

    @PostMapping("/aluno")
    public ResponseEntity<AlunoModel> saveAluno(@RequestBody @Valid AlunoRecordDto alunoRecordDto) {
        var alunoModel = new AlunoModel();
        BeanUtils.copyProperties(alunoRecordDto, alunoModel);

        var enderecoModel = new EnderecoModel();
        BeanUtils.copyProperties(alunoRecordDto.endereco(), enderecoModel);

        alunoModel.setEndereco(enderecoModel);

        enderecoRepository.save(enderecoModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(alunoRepository.save(alunoModel));

    }

    @GetMapping("/alunos/{id}")
    public ResponseEntity<Object> getAlunos(@PathVariable (value = "id") UUID id) {
        Optional<AlunoModel>aluno0 = alunoRepository.findById(id);
        if(aluno0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum registro de aluno Localizado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(aluno0.get());
    }

    @PutMapping("/aluno/{id}")
    public ResponseEntity<Object> updateAluno(@PathVariable(value ="id")UUID id,
                                              @RequestBody @Valid AlunoRecordDto alunoRecordDto){
        Optional<AlunoModel> aluno0 = alunoRepository.findById(id);
        if(aluno0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Nenhum registro de aluno Localizado.");
        }
        var alunoModel = aluno0.get();
        BeanUtils.copyProperties(alunoRecordDto, alunoModel);

        var enderecoModel = new EnderecoModel();
        BeanUtils.copyProperties(alunoRecordDto.endereco(), enderecoModel);

        alunoModel.setEndereco(enderecoModel);

        enderecoRepository.save(enderecoModel);


        return ResponseEntity.status(HttpStatus.OK).body(alunoRepository.save(alunoModel));
    }

    @DeleteMapping("/aluno/{id}")
    public ResponseEntity<Object> deleteAluno(@PathVariable (value="id") UUID id)
    {
        Optional<AlunoModel> aluno0 = alunoRepository.findById(id);
        if(aluno0.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno não localizado");
        }
        alunoRepository.delete(aluno0.get());
        var endereco = enderecoRepository.findById(aluno0.get().getEndereco().Id);

        endereco.ifPresent(enderecoModel -> enderecoRepository.delete(enderecoModel));


        return ResponseEntity.status(HttpStatus.OK).body("Aluno excluido da base de dados com sucesso");}


}
