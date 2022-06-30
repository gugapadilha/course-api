package com.example.courseapi.entities

import javax.persistence.*

@Entity
@Table(name = "agenda")
data class Agenda(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var idAgenda: Long? = null,
        var horario: String? = null,
        var diaSemana: String? = null,
        @ManyToOne
        @JoinColumn(referencedColumnName = "idAluno", name = "id_aluno")
        var aluno: Aluno? = null,
        @ManyToOne
        @JoinColumn(referencedColumnName = "idProfessor", name = "id_professor")
        var professor: Professor? = null
)

