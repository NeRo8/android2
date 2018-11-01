package com.example.nero.purse.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.Room
import android.arch.persistence.room.RoomDatabase
import android.content.Context

@Database(entities = [PurseDB::class], version = 1)
abstract class PurseDatabase : RoomDatabase() {
    abstract fun purseDao(): PurseDAO

    companion object {
        @Volatile
        private var INSTANCE: PurseDatabase? = null

        fun getDatabase(context: Context): PurseDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PurseDatabase::class.java,
                    "Word_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}