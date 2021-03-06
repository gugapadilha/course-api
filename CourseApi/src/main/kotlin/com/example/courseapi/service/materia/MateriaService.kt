package com.example.courseapi.service.materia

import com.example.courseapi.entities.Curso
import com.example.courseapi.entities.Materia

interface MateriaService {

    fun getAll(): List<Materia>

    fun saveMateria(materia: Materia): Materia

    fun validMateria(nomeMateria: String): Boolean

    fun update(id: Long, materia: Materia): Materia

    fun deleteMateria(materia: Materia)
}