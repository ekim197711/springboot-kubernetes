package com.example.springbootkubernetes

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringbootKubernetesApplication

fun main(args: Array<String>) {
    runApplication<SpringbootKubernetesApplication>(*args)
}
