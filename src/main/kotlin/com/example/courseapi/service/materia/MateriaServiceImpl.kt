package com.example.courseapi.service.materia

import com.example.courseapi.entities.Materia
import com.example.courseapi.repositories.MateriaRepository

class MateriaServiceImpl(
        val repository: MateriaRepository
) : MateriaService {
    override fun getAll(): List<Materia> {
        return repository.findAll()
    }

    override fun saveMateria(materia: Materia): Materia {
        return repository.save(materia)
    }
}