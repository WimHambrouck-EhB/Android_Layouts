package org.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Exercise5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise5)

        setTitle(R.string.exercise_5)
    }
}