package com.mak.gardening_journal.model

data class PlantResponse (
    val plantList: List<Plant>,
    val totalResults: String,
    val Response: String
)