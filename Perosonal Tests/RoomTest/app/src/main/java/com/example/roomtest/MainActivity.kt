package com.example.roomtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.room.Room
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


//Tutorials
//https://www.youtube.com/watch?v=SB0UepZ5lT4&list=PLB6lc7nQ1n4jTLDyU2muTBo8xk0dg0D_w&index=3
//https://android.jlelse.eu/android-room-using-kotlin-f6cc0a05bf23
//https://stackoverflow.com/questions/57670510/how-to-get-rid-of-incremental-annotation-processing-requested-warning
//https://codelabs.developers.google.com/codelabs/android-room-with-a-view-kotlin/#8
class MainActivity : AppCompatActivity() {

    val db = Room.databaseBuilder(applicationContext, HistoryDB::class.java, "HistoryDB.db").build()

    fun Add(view : View){
        db.HistoryDao().insertAll(HistoryEntry("Title", "Content"))
    }

    fun Clear(view : View){
        db.HistoryDao().clearTable()
    }

    fun Print(view : View){
        var data = db.HistoryDao().getAll()

        data?.forEach {
            println(it)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
        }
    }
}
