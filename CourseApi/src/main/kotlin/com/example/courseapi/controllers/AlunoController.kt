package com.example.courseapi.controllers

import com.example.courseapi.entities.Aluno
import com.example.courseapi.entities.Curso
import com.example.courseapi.service.aluno.AlunoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("aluno")
class AlunoController(
    val service: AlunoService
) {
    @GetMapping
    fun getAll(): List<Aluno> = service.getAll()

    //example post
    @PostMapping("/save")
    fun create(@RequestBody aluno: Aluno): Aluno = service.saveAluno(aluno)

    //example delete
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Aluno) = service.deleteAluno(id)

    //example update
    @PutMapping("/{id}") fun update(@PathVariable id: Long, @RequestBody aluno: Aluno):
            Aluno = service.updateAluno(id, aluno)

}



