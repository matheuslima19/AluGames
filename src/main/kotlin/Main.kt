package org.example

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse.BodyHandlers


fun main() {
    val client: HttpClient = HttpClient.newHttpClient()
    val request: HttpRequest = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=146"))
        .build()

    val response = client
        .send(request, BodyHandlers.ofString())

    val json = response.body()
    println(json)

    val meuJogo = Jogo(
        "Batman: Arkham Asylum Game of the Year Edition",
        "https:\\/\\/shared.akamai.steamstatic.com\\/store_item_assets\\/steam\\/apps\\/35140\\/capsule_sm_120.jpg?t=1702934705");
    println(meuJogo)

    val novoJogo = Jogo(
        capa = "https:\\/\\/shared.akamai.steamstatic.com\\/store_item_assets\\/steam\\/apps\\/35140\\/capsule_sm_120.jpg?t=1702934705",
        titulo = "Batman: Arkham City - Game of the Year Edition");
    println(novoJogo)


}