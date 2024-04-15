package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.activity.ComponentActivity

//mainActivity Class
class MainActivity : ComponentActivity() {
    //onCreate function so code executes once created
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //connects activity to layout file
        setContentView(R.layout.layout)
        //create reference to textbox in layout file
        val textBox = findViewById(R.id.textView) as TextView
        //edit text of the text box
        textBox.text = "Hello, Android!"

    }
}

