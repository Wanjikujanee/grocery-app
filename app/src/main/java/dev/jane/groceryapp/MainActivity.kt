package dev.jane.groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.view.animation.AnimationUtils
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnBMI:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnBMI = findViewById(R.id.btnBmi)
        btnBMI.setOnClickListener {
            val intent= Intent(this,ImageActivity::class.java)
            startActivity(intent)

        }


    }
}