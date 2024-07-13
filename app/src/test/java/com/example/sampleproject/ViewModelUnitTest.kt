package com.example.sampleproject

import com.example.sampleproject.data.response.Resources
import com.example.sampleproject.feature.welcome.MedicineUseCase
import com.example.sampleproject.feature.welcome.OnBoardingViewModel
import com.example.sampleproject.model.ApiResponse
import com.example.sampleproject.model.ClassName
import com.example.sampleproject.model.Condition
import com.example.sampleproject.model.Drug
import com.example.sampleproject.model.Medication
import com.example.sampleproject.model.MedicationClass
import com.example.sampleproject.model.Problem
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentCaptor
import org.mockito.Captor
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.MockitoAnnotations
import org.mockito.kotlin.capture
import org.mockito.kotlin.doAnswer
import org.mockito.kotlin.whenever

@ExperimentalCoroutinesApi
class OnBoardingViewModelTest {
    //TODO Error Related to JDK byte code compatibility refactor
/*
    @Mock
    private lateinit var medicineUseCase: MedicineUseCase

    @InjectMocks
    private lateinit var viewModel: OnBoardingViewModel

    @Captor
    private lateinit var captor: ArgumentCaptor<(Resources<ApiResponse?>) -> Unit>

    @Before
    fun setUp() {
        MockitoAnnotations.openMocks(this)
    }

    @Test
    fun testMedicineListFetch() = runTest {
        val mockMedicines = listOf(
            Drug("Medicine1", "10mg", "500mg"),
            Drug("Medicine2", "20mg", "250mg")
        )

        val mockApiResponse = ApiResponse(
            listOf(
                Problem(
                    diabetes = listOf(
                        Condition(
                            medications = listOf(
                                Medication(
                                    medicationsClasses = listOf(
                                        MedicationClass(className = listOf(ClassName(associatedDrug = mockMedicines)))
                                    )
                                )
                            ), labs = listOf()
                        )
                    ),
                    asthma = null,
                    diarrhea = null
                )
            )
        )

        doAnswer { invocation ->
            val callback: (Resources<ApiResponse?>) -> Unit = invocation.getArgument(0)
            callback(Resources.Success(mockApiResponse))
            null
        }.whenever(medicineUseCase).invoke(capture(captor))

        viewModel.fetchMedicines()

        val medicines = viewModel._medicineState.value.drugList
        assertEquals(2, medicines.size)
        assertEquals("Medicine1", medicines[0].name)
        assertEquals("Medicine2", medicines[1].name)
    }*/
}