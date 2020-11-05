package com.leanmentors.goals

import com.leanmentors.goals.controllers.TaskController
import com.leanmentors.goals.data.Tasks
import io.micronaut.http.HttpRequest
import io.micronaut.http.HttpResponse
import io.micronaut.http.client.annotation.Client
import io.micronaut.reactor.http.client.ReactorHttpClient
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import reactor.core.publisher.Flux
import reactor.test.StepVerifier
import java.util.*
import javax.inject.Inject
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf

@MicronautTest
class TaskServiceIntTest {

    @Inject
    lateinit var server: EmbeddedServer

    @Inject
    @field:Client("/")
    lateinit var client: ReactorHttpClient


    @Test
    fun testHelloWorldResponse() {
        val response: Flux<HttpResponse<Tasks>>? = client.exchange("/tasks", Tasks::class.java)
        response?.map { it.body() }?.count()
     }
}


