package dev.jane.groceryapp

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class ImageActivity : AppCompatActivity() {
    lateinit var btnbutton2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnbutton2 = findViewById(R.id.btnbutton2)
//        btnbutton2.setOnClickListener {
//            val intent= Intent(this,ImageActivity2::class.java)
//            startActivity(intent)
//
//        }
        btnbutton2.setOnClickListener {
            val intent=Intent(this,ImageActivity::class.java)
            startActivity(intent)
        }
    }
}