package com.leanmentors.goals

import com.leanmentors.goals.controllers.TaskController
import com.leanmentors.goals.data.Tasks
import org.junit.jupiter.api.Test
import reactor.test.StepVerifier
import java.time.LocalDate

class TaskServiceTest {
    @Test
    fun testController() {
        StepVerifier.create(TaskController().createTasks())
                .expectNext(Tasks("Create Project", "Create Project Today", LocalDate.parse("2020-10-05"), LocalDate.parse("2020-10-05")))
                .verifyComplete()
    }

}