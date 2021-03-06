package com.kishorebabu.android.commitstrip

import com.kishorebabu.android.commitstrip.data.DataManager
import com.kishorebabu.android.commitstrip.features.main.MainMvpView
import com.kishorebabu.android.commitstrip.features.main.MainPresenter
import com.kishorebabu.android.commitstrip.util.RxSchedulersOverrideRule
import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by ravindra on 24/12/16.
 */
@RunWith(MockitoJUnitRunner::class)
class MainPresenterTest {

    @Mock lateinit var mMockMainMvpView: MainMvpView
    @Mock lateinit var mMockDataManager: DataManager
    private var mMainPresenter: MainPresenter? = null

    @JvmField
    @Rule
    val mOverrideSchedulersRule = RxSchedulersOverrideRule()

    @Before
    fun setUp() {
        mMainPresenter = MainPresenter(mMockDataManager)
        mMainPresenter?.attachView(mMockMainMvpView)
    }

    @After
    fun tearDown() {
        mMainPresenter?.detachView()
    }

//    @Test
//    @Throws(Exception::class)
//    fun getPokemonReturnsPokemonNames() {
//        val pokemonList = TestDataFactory.makePokemonNamesList(10)
//        `when`(mMockDataManager.getPokemonList(10))
//                .thenReturn(Single.just(pokemonList))
//
//        mainPresenter?.getPokemon(10)
//
//        verify<MainMvpView>(mMockMainMvpView, times(2)).showProgress(anyBoolean())
//        verify<MainMvpView>(mMockMainMvpView).showPokemon(pokemonList)
//        verify<MainMvpView>(mMockMainMvpView, never()).showError(RuntimeException())
//
//    }
//
//    @Test
//    @Throws(Exception::class)
//    fun getPokemonReturnsError() {
//        `when`(mMockDataManager.getPokemonList(10))
//                .thenReturn(Single.error<List<String>>(RuntimeException()))
//
//        mainPresenter?.getPokemon(10)
//
//        verify<MainMvpView>(mMockMainMvpView, times(2)).showProgress(anyBoolean())
////        verify<MainMvpView>(mMockMainMvpView).showError(RuntimeException())
//        verify<MainMvpView>(mMockMainMvpView, never()).showPokemon(ArgumentMatchers.anyList<String>())
//    }

}