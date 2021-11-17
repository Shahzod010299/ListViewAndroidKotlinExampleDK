package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageId = intArrayOf(R.drawable.image_1,R.drawable.image_2, R.drawable.image_3,R.drawable.image_4)
        val name = arrayOf("Manzara","Yulbars","Ko'l","Gullar")
        val phoneNumber = arrayOf("+998 99 670 03 25","+998 99 670 03 33","+998 99 670 03 55","+998 99 670 03 99")
        val lastTime = arrayOf("1:55","12:30","13:23","11:00")
        val country = arrayOf("USA","GER","UZB","RUS")
        val lastMessage = arrayOf( "Tabiat haqidagi yangliklar", "Yirqich yulbarsa haqida",
            "Chiroyli ko'llar", "Tabiat gullari" )

        userArrayList = ArrayList()

        for (i in name.indices) {
            val user = User(
                name[i],
                lastMessage[i],
                lastTime[i],
                phoneNumber[i],
                country[i],
                imageId[i]
            )
            userArrayList.add(user)
        }

        val listView: ListView = findViewById(R.id.list_view)

        listView.isClickable = false
        listView.adapter = MyAdapter(this, userArrayList)

        listView.setOnItemClickListener { parent, view, position, id ->
            val name = name[position]
            val phone = phoneNumber[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent(this, UserActivity::class.java)
            i.putExtra("name", name)
            i.putExtra("phone", phone)
            i.putExtra("country", country)
            i.putExtra("imageId", imageId)

            startActivity(i)
        }


    }
}