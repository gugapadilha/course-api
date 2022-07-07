package com.example.courseapi.service.curso

import com.example.courseapi.entities.Curso
import com.example.courseapi.repositories.CursoRepository
import org.springframework.stereotype.Service

@Service
class CursoServiceImpl(
        var repository: CursoRepository
) : CursoService {

    override fun getAll(): List<Curso> {
        return repository.findAll()
    }

}