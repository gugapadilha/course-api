package com.example.courseapi.service.aluno

import com.example.courseapi.entities.Aluno
import com.example.courseapi.entities.Curso


interface AlunoService {

    //alteracoes vao aqui na regra de negocio / validacao
    fun getAll(): List<Aluno>
    fun saveAluno(aluno: Aluno): Aluno
    fun deleteAluno(aluno: Aluno)
    fun updateAluno(id: Long, aluno: Aluno) : Aluno

}