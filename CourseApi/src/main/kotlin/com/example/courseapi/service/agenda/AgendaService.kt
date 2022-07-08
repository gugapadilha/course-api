package com.example.courseapi.service.agenda

import com.example.courseapi.entities.Agenda


interface AgendaService {

    //alteracoes vao aqui na regra de negocio / validacao
    fun getAll(): List<Agenda>
    fun saveAgenda(agenda: Agenda): Agenda
    fun deleteAgenda(agenda: Agenda)

}