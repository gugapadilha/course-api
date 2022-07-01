package com.example.courseapi.service.curso

import com.example.courseapi.entities.Curso

interface CursoService {

    fun getAll(): List<Curso>
}