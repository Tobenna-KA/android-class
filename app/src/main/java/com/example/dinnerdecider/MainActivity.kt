package com.example.dinnerdecider

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.dinnerdecider.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        lateinit var food: String
        binding.button.setOnClickListener {
            var choice: Int = Random.nextInt(0, 5)
            when (choice) {
                0 -> {
                    food = "Chips"
                    binding.backgroud.setBackgroundColor(Color.BLUE)
                }
                1 -> {
                    food = "Rice"
                    binding.backgroud.setBackgroundColor(Color.GREEN)
                }
                2 -> food = "Ugali"
                3 -> food = "Matoke"
                4 -> food = "Chapati"
                5 -> food = "Pilau"
                else -> food = "We could not decide"

            }
            binding.textView.text = food
        }


    }
}