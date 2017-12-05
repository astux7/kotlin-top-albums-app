package com.example.abe29.myapplication

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations.initMocks

//33:44
/**
 * Created by abe29 on 05/12/2017.
 */
class MainActivityPresenterTest{

    @Mock
    private lateinit var presenter: MainActivityPresenter

    @Mock
    private lateinit var view: MainActivityView

    @Before
    fun setUp(){
        view = Mockito.mock(MainActivityView::class.java)

        presenter = MainActivityPresenter(view)
    }

    @Test
    fun when_request_albums_clicked_should_perform_correct(){
        presenter.requestAlbumsClicked()
        Mockito.verify(view).showProgressDialog()
    }

}
