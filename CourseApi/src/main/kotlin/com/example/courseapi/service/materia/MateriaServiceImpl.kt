package com.example.courseapi.service.materia

import com.example.courseapi.entities.Curso
import com.example.courseapi.entities.Materia
import com.example.courseapi.repositories.MateriaRepository
import org.springframework.stereotype.Service

@Service
class MateriaServiceImpl(
        val repository: MateriaRepository
) : MateriaService {

    override fun getAll(): List<Materia> {
        return repository.findAll()
    }

    override fun saveMateria(materia: Materia): Materia {
        return repository.save(materia)
    }

    override fun validMateria(nomeMateria: String): Boolean {
        val foundPeople = repository.findMateriaByName(nomeMateria)
        if (foundPeople.isPresent) {
            return false
        } else {
            return true
        }
    }

    override fun deleteMateria(materia: Materia) {
        return repository.delete(materia)
    }

    override fun update(id: Long, materia: Materia): Materia {
        var materiaSelecionada = repository.findById(id).get()
        materiaSelecionada.nome = materia.nome
        return repository.save(materiaSelecionada)
    }
}