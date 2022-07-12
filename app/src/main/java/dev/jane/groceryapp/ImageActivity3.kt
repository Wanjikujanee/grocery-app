package dev.jane.groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class ImageActivity3 : AppCompatActivity() {
    lateinit var btnbutton3: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnbutton3 = findViewById(R.id.btnbutton4)
        btnbutton3.setOnClickListener {
            val intent= Intent(this,ActivityLogin::class.java)
            startActivity(intent)

        }
    }

}