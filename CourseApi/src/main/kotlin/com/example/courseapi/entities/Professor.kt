package com.example.courseapi.entities

import javax.persistence.*

@Entity
@Table(name = "professor")
data class Professor(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var idProfessor: Long? = null,
        var nome: String? = null,
        var endereco: String? = null,
        var telefone: String? = null,
        var salario: String? = null
)

