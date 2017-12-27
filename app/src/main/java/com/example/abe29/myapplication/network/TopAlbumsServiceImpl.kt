package com.example.abe29.myapplication.network

import com.example.abe29.myapplication.dto.AlbumDto
import java.lang.reflect.Array

/**
 * Created by abe29 on 27/12/2017.
 */
class TopAlbumsServiceImpl: ITopAlbumsService {
    override fun requestAlbums(callback: ITopAlbumsService.Callback) {
       callback.success(listOf(AlbumDto("test", "test label")))
    }

}