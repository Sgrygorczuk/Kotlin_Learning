package com.example.roomtest

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

//Define the database and all of the different entities stored in it
@Database(
    entities = [HistoryEntry::class],
    version = 1
)

abstract class HistoryDB : RoomDatabase(){
    abstract fun HistoryDao(): HistoryDao

    companion object {
        @Volatile private var instance: HistoryDB? = null
        private val LOCK = Any()

        operator fun invoke(context: Context)= instance ?: synchronized(LOCK){
            instance ?: buildDatabase(context).also { instance = it}
        }

        private fun buildDatabase(context: Context) = Room.databaseBuilder(context,
            HistoryDB::class.java, "todo-list.db")
            .build()
    }
}