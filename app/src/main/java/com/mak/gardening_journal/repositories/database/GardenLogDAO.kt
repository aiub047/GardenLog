package com.mak.gardening_journal.repositories.database

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.mak.gardening_journal.model.Plant

interface GardenLogDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(plants: List<Plant>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPlant(plant: Plant)

    @Query("SELECT * FROM plants_table")
    fun getAllPlants(): LiveData<List<Plant>>

    @Query("DELETE FROM plants_table")
    suspend fun clear()
}