package com.example.courseapi.controllers

import com.example.courseapi.entities.Agenda
import com.example.courseapi.entities.Nivel
import com.example.courseapi.service.agenda.AgendaService
import com.example.courseapi.service.nivel.NivelService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("agenda")
class AgendaController(
        val service: AgendaService
) {
    @GetMapping
    fun getAll(): List<Agenda> = service.getAll()

    //exemple post
    @PostMapping("/save")
    fun create(@RequestBody agenda: Agenda): Agenda = service.saveAgenda(agenda)

    //exemple delete
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Agenda) = service.deleteAgenda(id)
}



