package com.example.listview

import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val context: Activity,private val arrayList: ArrayList<User>):
    ArrayAdapter<User>(context,R.layout.list_item,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val infilate: LayoutInflater = LayoutInflater.from(context)
        val view: View = infilate.inflate(R.layout.list_item,null)

        val imageView: ImageView = view.findViewById(R.id.image)
        val userName: TextView = view.findViewById(R.id.text_name)
        val titleMessage: TextView = view.findViewById(R.id.text_title)
        val time: TextView = view.findViewById(R.id.text_time)

        imageView.setImageResource(arrayList[position].imageId)
        userName.text = arrayList[position].name
        titleMessage.text = arrayList[position].lastMessage
        time.text = arrayList[position].lastMsgTime

        return view

    }
}