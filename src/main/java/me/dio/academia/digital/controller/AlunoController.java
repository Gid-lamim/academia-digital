package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//é aqui que ficam os métodos do CRUD

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    //o service é o local onde fica toda a lógica
    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    //Post irá ser usado para criar o aluno
    //precisamos passar um formulário JSON no body
    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }


}
