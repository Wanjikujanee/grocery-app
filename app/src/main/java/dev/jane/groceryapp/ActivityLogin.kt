package dev.jane.groceryapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityLogin : AppCompatActivity() {
    lateinit var btnButton:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        btnButton=findViewById(R.id.btnButton)

        btnButton.setOnClickListener {
            var intent=Intent(this,ActivitySignUp::class.java)
            startActivity(intent)
        }

    }

}