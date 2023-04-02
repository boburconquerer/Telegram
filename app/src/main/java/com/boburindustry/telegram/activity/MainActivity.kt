package com.boburindustry.telegram.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.boburindustry.telegram.R
import com.boburindustry.telegram.activity.model.User

class MainActivity : AppCompatActivity() {

    lateinit var textButton: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()

    }

    private fun initViews() {
        var open_detail: TextView = findViewById(R.id.open_page_id)
        open_detail.setOnClickListener {
            var user = User(id= 13, name = "Bobur")
            openDetailActivity(user)
        }

    }

    private fun openDetailActivity(user: User) {
        val intent = Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("id", user.id)
        intent.putExtra("name", user.name)
        startActivity(intent)
    }


    //////////////////////22222222222222222222
//    private fun initViews() {
//        var open_detail: TextView = findViewById(R.id.open_page_id)
//        open_detail.setOnClickListener {
//            var user = User(id = 13, name = "Bobur")
//            openDetailActivity(user)
//        }
//
//    }
//
//    private fun openDetailActivity(user: User) {
//        val intent = Intent(this@MainActivity, MainActivity2::class.java)
//        intent.putExtra("user", user)
//        startActivity(intent)
//    }



    //////////////////////1111111111111111111111111111

//    private fun initViews() {
//        var open_detail: TextView = findViewById(R.id.open_page_id)
//        open_detail.setOnClickListener {
//            openDetailActivity()
//        }
//    }
//
//    private fun openDetailActivity() {
//        var intent = Intent(this@MainActivity, MainActivity2::class.java)
//        intent.putExtra("name", "Open page 13 Bobur")
//        startActivity(intent)
//    }


}