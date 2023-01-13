package hu.petrik.kotlinproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class KotlinActivity : AppCompatActivity() {
    private lateinit var visszaGomb: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        init()
        addListeners()
    }

    private fun addListeners() {
        visszaGomb.setOnClickListener { view: View? ->
            val intent = Intent(this@KotlinActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    private fun init() {
        visszaGomb = findViewById(R.id.visszaGomb)
    }

}