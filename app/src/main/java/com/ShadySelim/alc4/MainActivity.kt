package com.ShadySelim.alc4

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        aboutAndela.setOnClickListener {
            startActivity(Intent(this, About_Andela::class.java))
        }

        aboutMe.setOnClickListener {
            startActivity(Intent(this, About_Me::class.java))
        }
    }
}
