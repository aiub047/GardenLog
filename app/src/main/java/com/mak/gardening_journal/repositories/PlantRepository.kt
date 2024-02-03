package com.mak.gardening_journal.repositories

import com.mak.gardening_journal.model.Plant
import com.mak.gardening_journal.repositories.database.GardenJournalDB
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import javax.inject.Inject

class PlantRepository @Inject constructor(
    private val plantDatabase: GardenJournalDB
) {
    val plants = plantDatabase.plantDatabaseDao.getAllPlants()

    suspend fun refreshPlants() {
        withContext(Dispatchers.IO) {
            val plants = async { PlantNetworkDataSource().fetchPlants() }
            plants.await()?.let { plantDatabase.plantDatabaseDao.insert(it) }
        }
    }

    suspend fun insertPlant(plant: Plant) {
        withContext(Dispatchers.IO) {
            plantDatabase.plantDatabaseDao.insertPlant(plant);
        }
    }
}