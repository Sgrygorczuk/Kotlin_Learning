package com.example.roomtest

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface HistoryDao {
    //Returns all the results from the table
    @Query("SELECT * FROM history_entity")
    fun getAll(): List<HistoryEntry>

    //Inserts a result to the table
    @Insert
    fun insertAll(vararg todo: HistoryEntry)

    //Deletes all of the entries in the table
    @Query("DELETE FROM history_entity")
    fun clearTable()
}