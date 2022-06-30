package com.example.courseapi.entities

import javax.persistence.*

@Entity
@Table(name = "nivel")
data class Nivel(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var idNivel: Long? = null,
        var nome: String? = null
)

