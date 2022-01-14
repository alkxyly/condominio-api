package com.condominio.domain

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Condominio (
        @Id
        var id: Long? = null,
        val nome: String,
        val login: String,
        val senha: String
    )