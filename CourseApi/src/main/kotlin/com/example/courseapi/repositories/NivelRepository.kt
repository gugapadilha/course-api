package com.example.courseapi.repositories

import com.example.courseapi.entities.Nivel
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NivelRepository : JpaRepository<Nivel, Long> {
}