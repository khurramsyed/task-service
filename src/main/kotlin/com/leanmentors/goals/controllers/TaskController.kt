package com.leanmentors.goals.controllers

import com.leanmentors.goals.data.Tasks
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import reactor.core.publisher.Flux
import java.time.LocalDate
import java.util.*

@Controller("/tasks")
class TaskController {
    @Get(produces = [MediaType.APPLICATION_JSON] )
    fun createTasks():Flux<Tasks>{
        return Flux.just(Tasks("Create Project", "Create Project Today", LocalDate.parse("2020-10-05"), LocalDate.parse("2020-10-05")))
    }

}