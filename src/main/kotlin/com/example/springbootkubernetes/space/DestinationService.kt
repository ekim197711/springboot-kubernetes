package com.example.springbootkubernetes.space

import org.springframework.stereotype.Service

@Service
class DestinationService {

    fun destination(): String{
        return "Mars"
    }
}