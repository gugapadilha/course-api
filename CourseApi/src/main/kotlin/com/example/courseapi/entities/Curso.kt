package com.example.courseapi.entities

import javax.persistence.*

@Entity
@Table(name = "curso")
data class Curso(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var idCurso: Long? = null,
        var nome: String? = null,
        @ManyToOne
        @JoinColumn(referencedColumnName = "idMateria", name = "id_materia")
        var materia: Materia? = null,
        @ManyToOne
        @JoinColumn(referencedColumnName = "idNivel", name = "id_nivel")
        var nivel: Nivel? = null
)
