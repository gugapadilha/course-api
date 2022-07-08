package com.example.courseapi.service.professor

import com.example.courseapi.entities.Professor
import com.example.courseapi.repositories.ProfessorRepository
import org.springframework.stereotype.Service

@Service
class ProfessorServiceImpl(
    var repository: ProfessorRepository
) : ProfessorService {

    override fun getAll(): List<Professor> {
        return repository.findAll()
    }

    override fun saveProfessor(professor: Professor): Professor {
        return repository.save(professor)
    }

    override fun deleteProfessor(professor: Professor) {
        return repository.delete(professor)
    }

}