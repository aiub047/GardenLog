package com.mak.gardening_journal.repositories

import com.mak.gardening_journal.model.Plant
import com.mak.gardening_journal.model.PlantResponse
import retrofit2.Response
import java.io.IOException

class PlantDataSource {
    suspend fun fetchPlants(): List<Plant>? {
        var response: Response<PlantResponse>? = null
        var plants: List<Plant>? = null

        try {
            response = MyAPI().getPlants()
        } catch (e: IOException) {
            e.printStackTrace()
        }
        response?.let {
            if (response.isSuccessful) {
                plants = response.body()?.plantList
            }
        }
        return plants
    }
}