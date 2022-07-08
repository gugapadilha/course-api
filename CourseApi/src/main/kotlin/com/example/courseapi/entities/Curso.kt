package com.example.courseapi.entities

import javax.persistence.*

@Entity
@Table(name = "curso")
data class Curso(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var idCurso: Long? = null,
        var nome: String? = null,
        var horario: String? = null,
        @ManyToOne
        @JoinColumn(referencedColumnName = "idMateria", name = "id_materia")
        var materia: Materia? = null,
        @OneToMany
        @JoinTable(name = "curso_nivel",
                joinColumns = [JoinColumn(name = "id_curso")],
                inverseJoinColumns = [JoinColumn(name = "id_nivel")]
        )
        var niveis: List<Nivel>? = null
)
