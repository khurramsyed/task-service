package com.leanmentors.goals.data

import java.time.LocalDate

data class Tasks(val name: String,
                 val description: String,
                 val startDate: LocalDate,
                 val endDate: LocalDate)