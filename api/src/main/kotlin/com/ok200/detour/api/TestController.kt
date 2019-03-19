package com.ok200.detour.api

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RefreshScope
class TestController @Autowired constructor(
    @Value("\${api.key}") val apiKey: String,
    @Value("\${api.isEnabled}") val apiIsEnabled: Boolean,
    @Value("\${api.rate}") val apiRate: Int
){

    val propertiesSampleModel = PropertiesSampleModel(
        apiKey = apiKey,
        apiIsEnabled = apiIsEnabled,
        apiRate = apiRate
    )

    @GetMapping("/test/properties/loaded")
    fun geLoadedProperties() = ResponseEntity.of(Optional.of(propertiesSampleModel))

    @GetMapping("/test/echo/{name}")
    fun getMessagesOfUser(@PathVariable("name") name: String) = ResponseEntity.of(Optional.of("Hi $name"))

}