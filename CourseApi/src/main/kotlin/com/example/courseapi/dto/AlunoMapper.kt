package com.example.courseapi.dto

import com.example.courseapi.entities.Aluno

class AlunoMapper: Mapper<AlunoDto , Aluno> {
    override fun fromEntity(entity: Aluno): AlunoDto {
        return AlunoDto(
            entity.idAluno,
            entity.nome,
            entity.idade,
            entity.endereco,
            entity.telefone

        )
    }

    override fun toEntity(domain: AlunoDto): Aluno {
        return Aluno(
            domain.idAluno,
            domain.nome,
            domain.idade,
            domain.endereco,
            domain.telefone
        )
    }
}