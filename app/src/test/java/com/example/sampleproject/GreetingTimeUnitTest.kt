package com.example.sampleproject

import com.example.sampleproject.utils.utility_functions.TimeProvider
import com.example.sampleproject.utils.utility_functions.getGreetingMessage
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*
import org.mockito.MockitoAnnotations

class GreetingTimeUnitTest {

    @Mock
    private lateinit var timeProvider: TimeProvider

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun testGreetingMessage_Morning() {
        `when`(timeProvider.getCurrentHour()).thenReturn(9) // Mock a morning hour
        val message = getGreetingMessage(timeProvider)
        assertEquals("Good morning", message)
    }

    @Test
    fun testGreetingMessage_Afternoon() {
        `when`(timeProvider.getCurrentHour()).thenReturn(15) // Mock an afternoon hour
        val message = getGreetingMessage(timeProvider)
        assertEquals("Good afternoon", message)
    }

    @Test
    fun testGreetingMessage_Evening() {
        `when`(timeProvider.getCurrentHour()).thenReturn(20) // Mock an evening hour
        val message = getGreetingMessage(timeProvider)
        assertEquals("Good evening", message)
    }
}