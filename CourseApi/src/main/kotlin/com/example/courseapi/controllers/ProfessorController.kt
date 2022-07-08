package com.example.courseapi.controllers

import com.example.courseapi.entities.Professor
import com.example.courseapi.service.professor.ProfessorService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("professor")
class ProfessorController(
    val service: ProfessorService
) {
    @GetMapping
    fun getAll(): List<Professor> = service.getAll()

    //exemple post
    @PostMapping("/save")
    fun create(@RequestBody professor: Professor): Professor = service.saveProfessor(professor)

    //exemple delete
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Professor) = service.deleteProfessor(id)
}



