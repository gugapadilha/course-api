package com.example.courseapi.service.professor

import com.example.courseapi.entities.Professor

interface ProfessorService {

    fun getAll(): List<Professor>
    fun saveProfessor(professor: Professor): Professor
    fun deleteProfessor(professor: Professor)

}