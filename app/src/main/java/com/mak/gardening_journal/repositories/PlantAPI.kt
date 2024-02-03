package com.mak.gardening_journal.repositories

import com.mak.gardening_journal.model.PlantResponse
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

class PlantAPI {
    @GET("4bf3a3e1-e56f-45a5-a9b7-f0362df65aca/ddcfa039-58ec-41cd-9ddf-d5ada06d8037")
    suspend fun getPlants(): Response<PlantResponse>

    companion object {
        operator fun invoke(): PlantAPI {
            return Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl("https://api.jsonstorage.net/v1/json/") // My Json server
                .build()
                .create(PlantAPI::class.java)
        }
    }
}