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
        @OneToMany
        @JoinTable(name = "agenda_aluno",
                joinColumns = [JoinColumn(name = "id_agenda")],
                inverseJoinColumns = [JoinColumn(name = "id_aluno")]
        )
        var alunos: List<Aluno>? = null,
        @ManyToOne
        @JoinColumn(referencedColumnName = "idProfessor", name = "id_professor")
        var professor: Professor? = null,
        @ManyToOne
        @JoinColumn(referencedColumnName = "idCurso", name = "id_curso")
        var curso: Curso? = null
)

