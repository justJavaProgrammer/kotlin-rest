package com.odeyalo.kotlin.repository

import com.odeyalo.kotlin.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Int> {

}
