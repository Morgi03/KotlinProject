package hu.petrik.kotlinproject

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {
    private lateinit var visszaGomb: Button
    private lateinit var kuldesGomb: Button
    private lateinit var nevInput: Button
    private lateinit var koszontoSzoveg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        init()
        addListeners()
    }

    private fun addListeners() {
        visszaGomb.setOnClickListener {
            val intent = Intent(this@KotlinActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        kuldesGomb.setOnClickListener {
            val nev = nevInput.text
            koszontoSzoveg.text = "Hello $nev"

            /*
                if (nev.length <= 10) koszontoSzoveg.setTextColor(Color.RED)
                else if (nev.length > 10 && nev.length <= 20) koszontoSzoveg.setTextColor(Color.GREEN)
                else if (nev.length > 20 && nev.length <= 30) koszontoSzoveg.setTextColor(Color.BLUE)
                else koszontoSzoveg.setTextColor(Color.BLACK)
            */

            val color = when (nev.length) {
                in 0..10 -> Color.RED
                in 11..20 -> Color.GREEN
                in 21..30 -> Color.BLUE
                else -> Color.BLACK
            }
            koszontoSzoveg.setTextColor(color)
        }
    }

    private fun init() {
        visszaGomb = findViewById(R.id.visszaGomb)
        kuldesGomb = findViewById(R.id.kuldesGomb)
        nevInput = findViewById(R.id.nevInput)
        koszontoSzoveg = findViewById(R.id.koszontoSzoveg)
    }

}