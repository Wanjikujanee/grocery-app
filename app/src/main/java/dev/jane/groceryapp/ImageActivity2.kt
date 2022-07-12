package dev.jane.groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class ImageActivity2 : AppCompatActivity() {
    lateinit var btnbutton4: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnbutton4 = findViewById(R.id.btnbutton4)
        btnbutton4.setOnClickListener {
            val intent= Intent(this,ImageActivity3::class.java)
            startActivity(intent)

        }
    }


}