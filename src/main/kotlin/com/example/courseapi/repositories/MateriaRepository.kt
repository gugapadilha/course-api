package com.example.courseapi.repositories

import com.example.courseapi.entities.Materia
import org.springframework.data.jpa.repository.JpaRepository

interface MateriaRepository : JpaRepository<Materia, Long> {
}