package com.kotlinpro1.controller

import com.kotlinpro1.dto.UserDTO
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/mapping")
class MappingController {
    @PostMapping("")
    fun postUser(@RequestBody userDTO: UserDTO) = userDTO.name

    @PutMapping("")
    fun putUser(@RequestBody userDTO: UserDTO) = userDTO

    @DeleteMapping("")
    fun deleteUser(@RequestBody userDTO: UserDTO) = "삭제에 성공하였습니다."
}