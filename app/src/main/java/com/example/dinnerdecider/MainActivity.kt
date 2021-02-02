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
            var choice: Int = Random.nextInt(0, 6)
            when (choice) {
                0 -> {
                    food = "Chips"
                    binding.backgroud.setBackgroundColor(Color.BLUE)
                }
                1 -> {
                    food = "Rice"
                    binding.backgroud.setBackgroundColor(Color.GREEN)
                }
                2 -> {
                    food = "Ugali"
                    binding.backgroud.setBackgroundColor(Color.YELLOW)
                }
                3 -> {
                    food = "Matoke"
                    binding.backgroud.setBackgroundColor(Color.DKGRAY)
                }
                4 -> {
                    food = "Chapati"
                    binding.backgroud.setBackgroundColor(Color.RED)
                }
                5 -> {
                    food = "Pilau"
                    binding.backgroud.setBackgroundColor(Color.MAGENTA)
                }
                6 -> {
                    food = "Jollof"
                    binding.backgroud.setBackgroundColor(Color.CYAN)
                }
                7 -> {
                    food = "Moi Moi"
                    binding.backgroud.setBackgroundColor(Color.BLUE)
                }
                else -> food = "We could not decide"

            }
            binding.textView.text = food
        }


    }
}