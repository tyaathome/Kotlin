package com.example.tyaathome.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import com.example.tyaathome.kotlin.adapter.ItemAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var log : String? = ""
    private var listdata : List<String> = mutableListOf("1", "2", "3")
    private var adapter : ItemAdapter? = ItemAdapter(this, listdata)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("hello!")
        listview.adapter = adapter
    }

    private fun println(str : String?) {
        if(TextUtils.isEmpty(str)) {
            return
        }

        log += str
        tv.text = log
    }
}
