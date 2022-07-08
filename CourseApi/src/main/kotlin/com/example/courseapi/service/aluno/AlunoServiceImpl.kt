package com.example.courseapi.service.aluno

import com.example.courseapi.entities.Aluno
import com.example.courseapi.repositories.AlunoRepository
import org.springframework.stereotype.Service

@Service
class AlunoServiceImpl(
        var repository: AlunoRepository
) : AlunoService {

    override fun getAll(): List<Aluno> {
        return repository.findAll()
    }

    override fun saveAluno(aluno: Aluno): Aluno {
        return repository.save(aluno)
    }

    override fun deleteAluno(aluno: Aluno) {
        return repository.delete(aluno)
    }

}