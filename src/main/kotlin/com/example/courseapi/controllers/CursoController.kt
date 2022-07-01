package com.example.courseapi.controllers

import com.example.courseapi.entities.Curso
import com.example.courseapi.service.curso.CursoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("curso")
class CursoController(
        private val cursoService: CursoService
) {
    @GetMapping
    fun getAll(): List<Curso> = cursoService.getAll()
}



