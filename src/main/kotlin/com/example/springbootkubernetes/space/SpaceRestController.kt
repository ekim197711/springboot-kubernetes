package com.example.springbootkubernetes.space

import org.apache.tomcat.jni.Global
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/space")
class SpaceRestController(dest : DestinationService) {

    @GetMapping("/")
    fun goingTo(): String{
        return "Mars"
    }
}