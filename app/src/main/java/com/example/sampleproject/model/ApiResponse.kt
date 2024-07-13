package com.example.sampleproject.model

import com.google.gson.annotations.SerializedName

data class ApiResponse(
    val problems: List<Problem>
)

data class Problem(
    @SerializedName("Diabetes")
    val diabetes: List<Condition>?,

    @SerializedName("Asthma")
    val asthma: List<Condition>?,

    @SerializedName("Diarrhea")
    val diarrhea: List<Condition>?
)

data class Condition(
    val medications: List<Medication>,
    val labs: List<Lab>
)

data class Medication(
    val medicationsClasses: List<MedicationClass>
)

data class MedicationClass(
    val className: List<ClassName>
)

data class ClassName(
    val associatedDrug: List<Drug>
)

data class Drug(
    val name: String,
    val dose: String,
    val strength: String
)

data class Lab(
    @SerializedName("missing_field")
    val missingField: String
)

