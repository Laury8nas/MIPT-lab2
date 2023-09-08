package com.example.miptlab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener
import android.widget.Toast
import com.example.miptlab2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnCount.setOnClickListener {

            var number = 0
            if (binding.etField.text.toString().isNotEmpty()) {


                val text = binding.etField.text.toString()

                if (binding.spOptions.selectedItemPosition == 0) {
                    number = Count().countSymbols(text)
                    binding.tvResult.text = "Rezultatas: $number"
                } else {
                    number = Count().countWords(text)
                    binding.tvResult.text = "Rezultatas: $number"
                }

            } else {
                Toast.makeText(this, "Teksto laukas yra tuščias!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}