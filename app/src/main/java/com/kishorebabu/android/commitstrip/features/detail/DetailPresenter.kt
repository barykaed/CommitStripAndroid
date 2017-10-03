package com.kishorebabu.android.commitstrip.features.detail

import com.kishorebabu.android.commitstrip.data.DataManager
import com.kishorebabu.android.commitstrip.features.base.BasePresenter
import com.kishorebabu.android.commitstrip.injection.ConfigPersistent
import javax.inject.Inject

@ConfigPersistent
class DetailPresenter @Inject
constructor(private val mDataManager: DataManager) : BasePresenter<DetailMvpView>() {

    fun getPokemon(name: String) {
//        checkViewAttached()
//        mvpView?.showProgress(true)
//        mDataManager.getPokemon(name)
//                .compose<Pokemon>(SchedulerUtils.ioToMain<Pokemon>())
//                .subscribe({ pokemon ->
//                    // It should be always checked if MvpView (Fragment or Activity) is attached.
//                    // Calling showProgress() on a not-attached fragment will throw a NPE
//                    // It is possible to ask isAdded() in the fragment, but it's better to ask in the presenter
//                    mvpView?.showProgress(false)
//                    mvpView?.showPokemon(pokemon)
//                    for (statistic in pokemon.stats) {
//                        mvpView?.showStat(statistic)
//                    }
//                }) { throwable ->
//                    mvpView?.showProgress(false)
//                    mvpView?.showError(throwable)
//                }
    }
}
