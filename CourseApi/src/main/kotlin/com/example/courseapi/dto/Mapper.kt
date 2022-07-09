package com.example.courseapi.dto

interface Mapper<D, E> {
    fun fromEntity(entity: E) : D
    fun toEntity(domain: D) : E
}