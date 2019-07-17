package com.ShadySelim.alc4

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about__andela.*

class About_Andela : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about__andela)

        webView.loadUrl("https://andela.com/alc/")
    }
}
