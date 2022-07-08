package com.example.courseapi.controllers

import com.example.courseapi.entities.Materia
import com.example.courseapi.service.materia.MateriaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*


@RestController
@RequestMapping("materia")
class MateriaController(
        val service: MateriaService
) {
    @GetMapping
    fun getAll(): List<Materia> = service.getAll()

//    @PostMapping("/save")
//    fun save(@RequestBody materia: Materia): ResponseEntity<Materia> {
//        val validName = materia.nome?.let { service.validMateria(it) }
//        return if (validName == true) {
//            ResponseEntity(service.saveMateria(materia), HttpStatus.OK)
//        } else {
//            ResponseEntity(Materia(null, null), HttpStatus.BAD_REQUEST)
//        }
//    }

    @PostMapping ("/save")
    fun create(@RequestBody materia: Materia): ResponseEntity<Materia> {
        val created = service.saveMateria(materia)
        return ResponseEntity(created, HttpStatus.CREATED)
    }

    //data transfer object - DTO's
    //modelar dados, tanto na entrega, quando no recebimento
    //posso fazer uma serie de anotacoes para validar automaticamente minha entidade

    //caso de um usuario - preciso receber um dto pra salvar ele
    //mas nao preciso necessariamente listar isso na listagem
}


