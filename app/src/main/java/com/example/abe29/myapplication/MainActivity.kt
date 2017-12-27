package com.example.abe29.myapplication
//https://itunes.apple.com/gb/rss/topalbums/limit=25/json

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var requestAlbumsTextView: TextView
   // lateinit var presenter: MainActivityPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        requestAlbumsTextView = findViewById(R.id.request_album)

        requestAlbumsTextView.setOnClickListener(View.OnClickListener {
            fun onClick(v: View) {
                // make request

            }
        })
    }
}
