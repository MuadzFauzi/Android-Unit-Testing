package com.example.simpletestassignment

object RegistrationUtil {
    fun validateRegistrationInput(username: String, pass: String): Boolean {
        if (username.isEmpty() || pass.isEmpty()) return false
        if (pass.length < 6) return false
        return true
    }
}