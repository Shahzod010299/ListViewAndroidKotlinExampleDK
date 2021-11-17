package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val name = intent.getStringExtra("name")
        val phone = intent.getStringExtra("phone")
        val country = intent.getStringExtra("country")
        val imageId = intent.getIntExtra("imageId",R.drawable.image_1)

        findViewById<TextView>(R.id.user_name).text = name
        findViewById<TextView>(R.id.user_number).text = phone
        findViewById<TextView>(R.id.user_country).text = country
        findViewById<ImageView>(R.id.user_image).setImageResource(imageId)
    }
}