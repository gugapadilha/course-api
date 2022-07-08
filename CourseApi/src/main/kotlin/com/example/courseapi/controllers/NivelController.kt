package com.example.courseapi.controllers

import com.example.courseapi.entities.Nivel
import com.example.courseapi.service.nivel.NivelService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("nivel")
class NivelController(
        val service: NivelService
) {
    @GetMapping
    fun getAll(): List<Nivel> = service.getAll()

    //exemple post
    @PostMapping("/save")
    fun create(@RequestBody nivel: Nivel): Nivel = service.saveNivel(nivel)

    //exemple delete
    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Nivel) = service.deleteNivel(id)
}



