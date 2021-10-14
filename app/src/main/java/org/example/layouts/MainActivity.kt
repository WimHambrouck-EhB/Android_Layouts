package org.example.layouts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.example.layouts.databinding.ActivityMainBinding
import java.lang.IllegalStateException

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding.root
        setContentView(rootView)

        val listener = View.OnClickListener {
            buttonClicked(it)
        }

        binding.btnEx1.setOnClickListener(listener)
        binding.btnEx2.setOnClickListener(listener)
        binding.btnEx3.setOnClickListener(listener)
        binding.btnEx4.setOnClickListener(listener)
        binding.btnEx5.setOnClickListener(listener)
    }

    private fun buttonClicked(button: View?) {
        val intent: Intent = when (button?.id) {
            R.id.btn_ex1 -> Intent(this, Exercise1Activity::class.java)
            R.id.btn_ex2 -> Intent(this, Exercise2Activity::class.java)
            R.id.btn_ex3 -> Intent(this, Exercise3Activity::class.java)
            R.id.btn_ex4 -> Intent(this, Exercise4Activity::class.java)
            R.id.btn_ex5 -> Intent(this, Exercise5Activity::class.java)
            else -> throw IllegalStateException("Unexpected value: " + button?.id)
        }

        startActivity(intent)
    }
}