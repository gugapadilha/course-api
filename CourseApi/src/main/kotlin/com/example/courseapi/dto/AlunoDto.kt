package com.example.courseapi.dto

import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id


data class AlunoDto(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var idAluno: Long? = null,
    var nome: String? = null,
    var idade: String? = null,
    var endereco: String? = null,
    var telefone: String? = null
)