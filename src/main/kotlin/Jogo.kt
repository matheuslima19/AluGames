package org.example

class Jogo(val titulo: String, val capa : String) {
    val descricao = ""

    override fun toString(): String {
        return "\nMeu jogo:\n" +
                "Título: '$titulo'\n" +
                "Capa: '$capa'\n" +
                "Descricao: '$descricao')"
    }


}