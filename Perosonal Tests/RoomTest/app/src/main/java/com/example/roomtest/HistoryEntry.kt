package com.example.roomtest

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "history_entity")
data class HistoryEntry(
    @ColumnInfo(name = "input") var input: String,
    @ColumnInfo(name = "result") var result: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}