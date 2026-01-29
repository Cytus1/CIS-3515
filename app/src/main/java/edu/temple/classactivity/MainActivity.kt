package edu.temple.classactivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        val button = findViewById<Button>(R.id.button)
        val editText = findViewById<EditText>(R.id.editTextText)
        val textView = findViewById<TextView>(R.id.textView)

        button.setOnClickListener {
            textView.text = editText.text.toString()
        }

    }
}