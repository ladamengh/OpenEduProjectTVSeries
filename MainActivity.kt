package com.example.mytvseries

import android.os.Bundle
import android.view.View
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    fun getListTv(text: String): ArrayList<String> {
        val list = arrayListOf<String>()
        if (text.equals("Comedy")) list.add("Friends")
        if (text.equals("Fantasy")) list.add("The Game of Thrones")
        if (text.equals("Horror")) list.add("The Walking Dead")
        if (text.equals("Fiction")) list.add("Futurama")
        if (text.equals("Criminal")) {
            list.add("The Breaking Bad")
            list.add("True Detective")
        }
        return list
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickChoose(view: View) {
        val textView = findViewById<TextView>(R.id.shows_text)
        val spinner = findViewById<Spinner>(R.id.genre_list)
        val text = spinner.selectedItem.toString()
        val newShow = getListTv(text)

        val builder = StringBuilder()
        for (value in newShow) {
            builder.append(value).append("\n")
        }
        val ntext = builder.toString()
        textView.setText(ntext)
    }
}
