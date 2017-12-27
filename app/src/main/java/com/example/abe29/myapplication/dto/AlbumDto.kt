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
   // command + N generate equals + hascode

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as AlbumDto

        if (imageUrl != other.imageUrl) return false
        if (label != other.label) return false

        return true
    }

    override fun hashCode(): Int {
        var result = imageUrl?.hashCode() ?: 0
        result = 31 * result + (label?.hashCode() ?: 0)
        return result
    }


}