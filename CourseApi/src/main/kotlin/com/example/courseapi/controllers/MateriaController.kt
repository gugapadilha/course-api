package com.example.courseapi.controllers

import com.example.courseapi.entities.Curso
import com.example.courseapi.entities.Materia
import com.example.courseapi.service.materia.MateriaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("materia")
class MateriaController(
        val service: MateriaService
) {
    @GetMapping
    fun getAll(): List<Materia> = service.getAll()

    @PostMapping ("/save")
    fun create(@RequestBody materia: Materia): ResponseEntity<Materia> {
        val created = service.saveMateria(materia)
        return ResponseEntity(created, HttpStatus.CREATED)
    }

    @DeleteMapping("/{id}")
        fun delete(@PathVariable id: Materia) = service.deleteMateria(id)

    @PutMapping("/{id}")
    fun update(@PathVariable id: Long, @RequestBody materia: Materia): Materia = service.update(id, materia)

}


