package com.example.abe29.myapplication

import com.example.abe29.myapplication.dto.AlbumDto
import com.example.abe29.myapplication.network.ITopAlbumsService
import com.nhaarman.mockito_kotlin.argumentCaptor
import com.nhaarman.mockito_kotlin.verify
import org.junit.Before
import org.junit.Test
import org.mockito.ArgumentMatchers.any
import org.mockito.ArgumentMatchers.isA
import org.mockito.Matchers
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.doAnswer
import org.mockito.MockitoAnnotations
import org.mockito.invocation.InvocationOnMock
import org.mockito.stubbing.Answer

//33:44
/**
 * Created by abe29 on 05/12/2017.
 */
class MainActivityPresenterTest{

    private lateinit var presenter: MainActivityPresenter

    @Mock
    private lateinit var view: MainActivityView

    @Mock
    private lateinit var service: ITopAlbumsService


    @Before
    fun setUp(){
        MockitoAnnotations.initMocks(this)
        presenter = MainActivityPresenter(view, service)
    }

    @Test
    fun when_request_albums_clicked_should_perform_correct() {
        val callbackCaptor = argumentCaptor<ITopAlbumsService.Callback>()
        presenter.requestAlbumsClicked()

        verify(service).requestAlbums(callbackCaptor.capture())

        val albums = listOf(AlbumDto("test", "test label"))
        callbackCaptor.firstValue.success(albums)
        verify(view).showProgressDialog()
        verify(view).displayAlbums(albums)
        verify(view).hideProgressDialog()
    }

//    @Test
//    fun when_request_albums_clicked_should_perform_correct(){
//        // given
//
//        var expected: List<AlbumDto> = listOf( AlbumDto("test","mess"))
//        primeCallbackForSuccess(expected)
//
//        //when
//        presenter.requestAlbumsClicked()
//
//        // then
//     //   Mockito.verify(view).showProgressDialog()
//       // Mockito.verify(service).requestAlbums(any())
////        Mockito.verify(view).hideProgressDialog()
//
//        Mockito.verify(view).displayAlbums(expected)
//    }

//    private fun primeCallbackForSuccess(toReturn: List<AlbumDto>) {
//        doAnswer(Answer() {
//            @Throws(Throwable::class)
//            fun answer(invocation: InvocationOnMock): Any? {
//                val args = invocation.getArguments()
//
//                val callback = args[0] as ITopAlbumsService.Callback
//                callback.success(toReturn)
//
//                return null
//            }
//        }).`when`(service).requestAlbums(any())
//    }

    private fun <T> any(): T {
        Mockito.any<T>()
        return uninitialized()
    }

   private fun <T> uninitialized(): T = null as T


}
