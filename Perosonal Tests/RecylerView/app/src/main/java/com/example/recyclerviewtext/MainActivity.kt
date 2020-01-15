package com.example.recyclerviewtext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.recyclerviewtext.models.DataSource
import com.example.recyclerviewtext.models.HistoryRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var historyAdapter: HistoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()

    }

    private fun addDataSet(){
        //Grabs the data from the data source
        val data = DataSource.createDataSet()
        //Adds the data to the adapter
        historyAdapter.submitList(data)
    }

    //Creates the recylcer view
    private fun initRecyclerView(){
        recycler_view.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            historyAdapter = HistoryRecyclerAdapter()
            adapter = historyAdapter
        }
    }

}
