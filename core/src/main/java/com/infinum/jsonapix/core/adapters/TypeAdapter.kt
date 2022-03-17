package com.infinum.jsonapix.core.adapters

interface TypeAdapter<Model> {
    fun rootLinks(): String = "links"
    fun resourceObjectLinks(): String = "links"
    fun relationshipsLinks(): String = "links"
    fun convertFromString(input: String): Model
    fun convertToString(input: Model): String
}