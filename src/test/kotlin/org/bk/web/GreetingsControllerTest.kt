package org.bk.web

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.http.MediaType
import org.springframework.test.web.reactive.server.WebTestClient

@WebFluxTest(controllers = [GreetingsController::class])
class GreetingsControllerTest {

    @Autowired
    private lateinit var webTestClient: WebTestClient

    @Test
    fun `greetings with canned message`() {
        webTestClient.get()
            .uri("/greetings")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectBody()
            .jsonPath("$.payload").isEqualTo("hello")
    }

    @Test
    fun `greetings with user provided payload`() {
        webTestClient.get()
            .uri("/greetings/morning")
            .accept(MediaType.APPLICATION_JSON)
            .exchange()
            .expectBody()
            .jsonPath("$.payload").isEqualTo("morning")
    }
}