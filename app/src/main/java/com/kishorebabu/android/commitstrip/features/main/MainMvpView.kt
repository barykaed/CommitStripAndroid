package com.kishorebabu.android.commitstrip.features.main

import com.kishorebabu.android.commitstrip.data.model.Comic
import com.kishorebabu.android.commitstrip.features.base.MvpView

interface MainMvpView : MvpView {
    fun showComics(count: Int)
    fun showComicTitleAndDate(comic: Comic)
}