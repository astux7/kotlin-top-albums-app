package com.example.abe29.myapplication

/**
 * Created by abe29 on 05/12/2017.
 */
class MainActivityPresenter(private var view: MainActivityView) {

    fun requestAlbumsClicked() {
        view.showProgressDialog()
    }

}