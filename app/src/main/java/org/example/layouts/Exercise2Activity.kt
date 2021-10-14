package org.example.layouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Exercise2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise2)

        setTitle(R.string.exercise_2)
    }
}