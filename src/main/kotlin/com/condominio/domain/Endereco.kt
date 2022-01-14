package com.condominio.domain

data class Endereco (
        var id: Long? = null,
        val logradouro: String,
        val numero: Integer,
        val bairro: String,
        val estado: String,
        val cep: String,
        val complemento: String
    )