package com.example.courseapi.controllers

import com.example.courseapi.entities.Curso
import com.example.courseapi.service.curso.CursoService
import org.springframework.web.bind.annotation.*


@RestController //especify thats is actually a controller
@RequestMapping("curso")
class CursoController(
        val service: CursoService
) {
    @GetMapping
    fun getAll(): List<Curso> = service.getAll()

    //example post
    @PostMapping("/save")
    fun create(@RequestBody curso: Curso): Curso = service.saveCurso(curso)

    //example delete
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Curso) = service.deleteCurso(id)

    //example update
    @PutMapping("/curso/{id}") fun update(@PathVariable id: Long, @RequestBody curso: Curso):
            Curso = service.updateCurso(Curso())
}



