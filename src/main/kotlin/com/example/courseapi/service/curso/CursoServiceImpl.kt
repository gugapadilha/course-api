package com.example.courseapi.service.curso

import com.example.courseapi.entities.Curso
import com.example.courseapi.repositories.CursoRepository

class CursoServiceImpl(
        var repository: CursoRepository
) : CursoService {

    override fun getAll(): List<Curso> {
        return repository.findAll()
    }

}