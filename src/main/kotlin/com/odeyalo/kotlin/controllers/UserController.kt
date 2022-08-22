package com.odeyalo.kotlin.controllers

import com.odeyalo.kotlin.dto.UserDTO
import com.odeyalo.kotlin.entity.User
import com.odeyalo.kotlin.repository.UserRepository
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UserController(private val repository: UserRepository) {

    @GetMapping("/{id}")
    fun byId(@PathVariable id: Int): User {
        return repository.findById(id).orElse(null)
    }

    @PostMapping("/add")
    fun addUser(@RequestBody dto: UserDTO): User {
        val user = User()
        user.name = dto.name
        return repository.save(user)
    }

    @GetMapping("/all")
    fun allUsers(): List<User> {
        return repository.findAll()
    }
}
