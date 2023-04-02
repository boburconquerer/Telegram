package com.boburindustry.telegram.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.boburindustry.telegram.R

class MainActivity2 : AppCompatActivity() {
    var TAG = MainActivity2::class.java.toString()
    lateinit var textB: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initViews()
    }

    private fun initViews() {
        var open_page_id: TextView = findViewById(R.id.namee_id)

        var user = intent.getStringExtra("name")
        Log.d(TAG, user.toString())

        open_page_id.text = user.toString()
    }


    ////////////////////////////////////2222222222222222222222222222222
//    private fun initViews() {
//        var open_page_id: TextView = findViewById(R.id.namee_id)
//
//        var user = intent.getSerializableExtra("user")
//        Log.d(TAG, user.toString())
//
//        open_page_id.text = user.toString()
//    }



    /////////////////////333333333333333333333333333333333
//    private fun initViews() {
//        var open_page_id: TextView = findViewById(R.id.namee_id)
//
//        val textName = intent.getStringExtra("name")
//        Log.d(TAG, textName!!)
//
//        open_page_id.text = textName
//
//
//    }
}