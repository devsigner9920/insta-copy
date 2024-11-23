package me.dvsgn.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(("/v1/posts"))
class InstaController(
) {
    @GetMapping
    suspend fun searchPlace(@RequestParam(value = "q", required = true) query: String) {

    }
}