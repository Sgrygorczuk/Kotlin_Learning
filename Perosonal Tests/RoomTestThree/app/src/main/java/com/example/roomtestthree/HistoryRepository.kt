package com.example.roomtestthree

import androidx.lifecycle.LiveData

class HistoryRepository(private val historyDao: HistoryDao) {

    // Room executes all queries on a separate thread.
    // Observed LiveData will notify the observer when the data has changed.
    val allEntries: LiveData<List<HistoryEntry>> = historyDao.loadAll()

    suspend fun insert(historyEntry: HistoryEntry) {
        historyDao.insert(historyEntry)
    }

    suspend fun clear(){
        historyDao.deleteAll()
    }
}
