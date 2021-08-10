package org.bk.web

import org.bk.web.model.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingsController {

    @GetMapping("/greetings")
    fun greetings(): Message {
        return Message("hello")
    }

}