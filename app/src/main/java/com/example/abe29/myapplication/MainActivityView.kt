package com.example.abe29.myapplication

import com.example.abe29.myapplication.dto.AlbumDto

/**
 * Created by abe29 on 05/12/2017.
 */
interface MainActivityView {
    fun showProgressDialog()

    fun displayAlbums(expected: List<AlbumDto>)

    fun hideProgressDialog()
}