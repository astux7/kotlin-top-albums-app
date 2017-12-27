package com.example.abe29.myapplication

import com.example.abe29.myapplication.dto.AlbumDto
import com.example.abe29.myapplication.network.ITopAlbumsService
import javax.security.auth.callback.Callback

/**
 * Created by abe29 on 05/12/2017.
 */
open class MainActivityPresenter(private var view: MainActivityView, private var service: ITopAlbumsService) {

    fun requestAlbumsClicked() {
        view.showProgressDialog()

        service.requestAlbums(object : ITopAlbumsService.Callback {
            override fun success(albums: List<AlbumDto>) {
                view.hideProgressDialog()
                view.displayAlbums(albums)
            }

            override fun failure() {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })

    }

}