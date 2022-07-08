package com.example.courseapi.service.aluno

import com.example.courseapi.entities.Aluno


interface AlunoService {

    //alteracoes vao aqui na regra de negocio / validacao
    fun getAll(): List<Aluno>
    fun saveAluno(aluno: Aluno): Aluno
    fun deleteAluno(aluno: Aluno)

}