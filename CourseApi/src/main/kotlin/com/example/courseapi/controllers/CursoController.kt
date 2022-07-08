package com.example.courseapi.controllers

import com.example.courseapi.entities.Curso
import com.example.courseapi.service.curso.CursoService
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("curso")
class CursoController(
        val service: CursoService
) {
    @GetMapping
    fun getAll(): List<Curso> = service.getAll()

    //exemple post
    @PostMapping("/save")
    fun create(@RequestBody curso: Curso): Curso = service.saveCurso(curso)

    //exemple delete
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Curso) = service.deleteCurso(id)

}



