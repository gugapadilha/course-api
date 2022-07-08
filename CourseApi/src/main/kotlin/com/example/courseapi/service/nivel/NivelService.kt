package com.example.courseapi.service.nivel

import com.example.courseapi.entities.Nivel

interface NivelService {

    fun getAll(): List<Nivel>
    fun saveNivel(nivel: Nivel): Nivel
    fun deleteNivel(nivel: Nivel)

}