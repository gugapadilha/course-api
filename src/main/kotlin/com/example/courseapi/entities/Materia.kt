package com.example.courseapi.entities

import javax.persistence.*

@Entity
@Table(name = "materia")
data class Materia(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var idMateria: Long? = null,
        var nome: String? = null
)

