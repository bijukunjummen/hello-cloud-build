package org.bk.web

import org.bk.web.model.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingsController {

    @GetMapping("/greetings")
    fun greetings(): Message {
        return Message("hello")
    }

    @GetMapping("/greetings/{payload}")
    fun greetings(@PathVariable("payload") payload: String): Message {
        return Message(payload)
    }
}