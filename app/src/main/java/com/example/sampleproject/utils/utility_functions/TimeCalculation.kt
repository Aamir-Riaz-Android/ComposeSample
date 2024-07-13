package com.example.sampleproject.utils.utility_functions

import android.icu.util.Calendar
class TimeProvider {
    fun getCurrentHour(): Int {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    }
}
fun getGreetingMessage(timeProvider: TimeProvider = TimeProvider()): String {
    val currentHour = timeProvider.getCurrentHour()
    return when {
        currentHour < 12 -> "Good morning"
        currentHour < 17 -> "Good afternoon"
        else -> "Good evening"
    }
}

/*
fun getGreetingMessage(): String {
    val currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY)
    return when {
        currentHour < 12 -> "Good morning"
        currentHour < 17 -> "Good afternoon"
        else -> "Good evening"
    }
}*/
