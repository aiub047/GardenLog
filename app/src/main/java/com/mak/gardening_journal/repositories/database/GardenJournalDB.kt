package com.mak.gardening_journal.repositories.database

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase


abstract class GardenJournalDB : RoomDatabase() {
    abstract val plantDatabaseDao: GardenLogDAO

    companion object {
        @Volatile
        private var INSTANCE: GardenJournalDB? = null

        fun getInstance(context: Context): GardenJournalDB {
            synchronized(this) {
                var instance = INSTANCE
                if (instance == null) {
                    instance = Room.databaseBuilder(
                        context.applicationContext,
                        GardenJournalDB::class.java,
                        "gardendb"
                    )
                        .fallbackToDestructiveMigration()
                        .build()

                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}