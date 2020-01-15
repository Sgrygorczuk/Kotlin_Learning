package com.example.spinnertest

import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.View.GONE
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.demo_spinner.view.*

class MoodArrayAdapter(ctx: Context, private val moods: List<mood>) : ArrayAdapter<mood>(ctx, 0, moods) {
    override fun getView(position: Int, recycledView: View?, parent: ViewGroup): View {
        return this.createView(position, recycledView, parent)
    }
    override fun getDropDownView(position: Int, recycledView: View?, parent: ViewGroup): View {
        return this.createView(position, recycledView, parent)
    }
    private fun createView(position: Int, recycledView: View?, parent: ViewGroup): View {
        //Sets the background behind the textboxes to be black, otherwise it'd be white
        parent.setBackgroundResource(R.drawable.unpressed)
        //Connects the view to the custom layout
        val view = recycledView ?: LayoutInflater.from(context).inflate(R.layout.demo_spinner, parent, false)
        //Connects the position to the current data class
        val mood = getItem(position)
        if (mood != null) { view.moodText.text = mood.description
                            view.imageView.visibility = mood.visiblity
                            view.moodText.setTextColor(Color.parseColor(mood.color))}
        //Picks what kind of corners the textbox will have
        when (position) {
            0 -> {view.setBackgroundResource(R.drawable.top)}
            moods.size-1 -> {view.setBackgroundResource(R.drawable.bottom)}
            else -> {view.setBackgroundResource(R.drawable.mid)}
        }
        return view
    }
}