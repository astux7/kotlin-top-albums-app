package com.example.abe29.myapplication.dto

/**
 * Created by abe29 on 05/12/2017.
 */
class AlbumDto{
    private var imageUrl: String? = null
    private var label: String? = null

    constructor(imageUrl: String?, label: String?) {
        this.imageUrl = imageUrl
        this.label = label
    }

    fun getImageUrl(): String? {
        return imageUrl
    }

    fun getLabel(): String? {
        return label
    }
}