package com.example.abe29.myapplication

import com.example.abe29.myapplication.dto.AlbumDto

/**
 * Created by abe29 on 05/12/2017.
 */
open interface MainActivityView {
    fun showProgressDialog() {

    }

    fun displayAlbums(expected: List<AlbumDto>) {
        return Unit
    }

    fun hideProgressDialog() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}