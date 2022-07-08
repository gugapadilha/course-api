package com.example.courseapi.service.curso

import com.example.courseapi.entities.Curso
import javax.persistence.Id

interface CursoService {

    //alteracoes vao aqui na regra de negocio / validacao
    fun getAll(): List<Curso>
    fun saveCurso(curso: Curso): Curso
    fun deleteCurso(curso: Curso)
}