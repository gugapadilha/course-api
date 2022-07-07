package com.example.courseapi.service.curso

import com.example.courseapi.entities.Curso

interface CursoService {

    //alteracoes vao aqui na regra de negocio / validacao
    fun getAll(): List<Curso>
}