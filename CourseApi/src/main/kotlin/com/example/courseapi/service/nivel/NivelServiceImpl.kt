package com.example.courseapi.service.nivel

import com.example.courseapi.entities.Nivel
import com.example.courseapi.entities.Professor
import com.example.courseapi.repositories.NivelRepository
import com.example.courseapi.repositories.ProfessorRepository
import org.springframework.stereotype.Service

@Service
class NivelServiceImpl(
    var repository: NivelRepository
) : NivelService {

    override fun getAll(): List<Nivel> {
        return repository.findAll()
    }

    override fun saveNivel(nivel: Nivel): Nivel {
        return repository.save(nivel)
    }

    override fun deleteNivel(nivel: Nivel) {
        return repository.delete(nivel)
    }
}