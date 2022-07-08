package com.example.courseapi.service.agenda

import com.example.courseapi.entities.Agenda
import com.example.courseapi.entities.Aluno
import com.example.courseapi.repositories.AgendaRepository
import com.example.courseapi.repositories.AlunoRepository
import org.springframework.stereotype.Service

@Service
class AgendaServiceImpl(
        var repository: AgendaRepository
) : AgendaService {

    override fun getAll(): List<Agenda> {
        return repository.findAll()
    }

    override fun saveAgenda(agenda: Agenda): Agenda {
        return repository.save(agenda)
    }

    override fun deleteAgenda(agenda: Agenda) {
        return repository.delete(agenda)
    }

}