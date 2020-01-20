package com.example.roomtestthree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var historyViewModel: HistoryViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val adapter = HistoryListAdapter(this)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)

            // Get a new or existing ViewModel from the ViewModelProvider.
            historyViewModel = ViewModelProvider(this).get(HistoryViewModel::class.java)

            // Add an observer on the LiveData returned by getAlphabetizedWords.
            // The onChanged() method fires when the observed data changes and the activity is
            // in the foreground.
            historyViewModel.allEntries.observe(this, Observer { words ->
                // Update the cached copy of the words in the adapter.
                words?.let { adapter.setHistory(it) }
            })
        }

        fun add(view : View){
            historyViewModel.insert(HistoryEntry("4+4", "= 8", "Port"))
        }

        fun clear(view : View){
            historyViewModel.clear()
        }
    }
