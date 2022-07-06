package com.example.courseapi.repositories

import com.example.courseapi.entities.Materia
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import java.util.*

interface MateriaRepository : JpaRepository<Materia, Long> {

    @Query("select m from Materia m where m.nome = :nomeMateria")
    fun findMateriaByName(nomeMateria: String?): Optional<Materia>
}