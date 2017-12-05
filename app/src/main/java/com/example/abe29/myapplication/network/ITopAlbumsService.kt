package com.example.abe29.myapplication.network

import com.example.abe29.myapplication.dto.AlbumDto

/**
 * Created by abe29 on 05/12/2017.
 */
interface ITopAlbumsService {

    fun requestAlbums(callback: Callback);

    interface Callback {
        fun success(albums: List<AlbumDto>)
        fun failure()
    }
}