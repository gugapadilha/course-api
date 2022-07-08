package com.example.courseapi.controllers

import com.example.courseapi.entities.Aluno
import com.example.courseapi.service.aluno.AlunoService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("aluno")
class AlunoController(
    val service: AlunoService
) {
    @GetMapping
    fun getAll(): List<Aluno> = service.getAll()

    //exemple post
    @PostMapping("/save")
    fun create(@RequestBody aluno: Aluno): Aluno = service.saveAluno(aluno)

    //exemple delete
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Aluno) = service.deleteAluno(id)
}



