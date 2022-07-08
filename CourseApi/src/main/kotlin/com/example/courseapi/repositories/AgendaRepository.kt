package com.example.courseapi.repositories

import com.example.courseapi.entities.Agenda
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AgendaRepository : JpaRepository<Agenda, Long> {
}