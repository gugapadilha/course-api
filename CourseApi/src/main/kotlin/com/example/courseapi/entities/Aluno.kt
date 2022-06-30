package com.example.courseapi.entities

import javax.persistence.*

@Entity
@Table(name = "aluno")
data class Aluno(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        var idAluno: Long? = null,
        var nome: String? = null,
        var idade: String? = null,
        var endereco: String? = null,
        var telefone: String? = null,
        @ManyToOne
        @JoinColumn(referencedColumnName = "idCurso", name = "id_curso")
        var curso: Curso? = null
)

