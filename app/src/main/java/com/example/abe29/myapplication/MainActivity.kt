package com.example.abe29.myapplication
//https://itunes.apple.com/gb/rss/topalbums/limit=25/json

import android.app.ProgressDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.abe29.myapplication.network.TopAlbumsServiceImpl
import com.example.abe29.myapplication.dto.AlbumDto

class MainActivity: AppCompatActivity(), MainActivityView  {

    lateinit var requestAlbumsTextView: TextView
    lateinit var presenter: MainActivityPresenter
    lateinit var progressDialog: ProgressDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainActivityPresenter(this, TopAlbumsServiceImpl())

        requestAlbumsTextView = findViewById(R.id.request_album)

        requestAlbumsTextView.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View) {
                presenter.requestAlbumsClicked()
            }
        })

    }
    override fun showProgressDialog() {
        progressDialog = ProgressDialog.show(this, null, getString(R.string.my_progress_dialog), true)
    }

    override fun displayAlbums(expected: List<AlbumDto>) {
        return Unit
    }

    override fun hideProgressDialog() {
        if (progressDialog.isShowing) {
            progressDialog.dismiss()
        }
    }


}
