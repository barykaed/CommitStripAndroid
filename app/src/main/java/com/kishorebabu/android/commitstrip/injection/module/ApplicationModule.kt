package com.kishorebabu.android.commitstrip.injection.module

import android.app.Application
import android.arch.persistence.room.Room
import android.content.Context
import com.kishorebabu.android.commitstrip.data.model.ComicDao
import com.kishorebabu.android.commitstrip.data.model.ComicDatabase
import com.kishorebabu.android.commitstrip.injection.ApplicationContext
import com.twitter.sdk.android.core.TwitterCore
import com.twitter.sdk.android.core.services.StatusesService
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ApplicationModule(private val mApplication: Application) {

    @Provides
    fun provideApplication(): Application {
        return mApplication
    }

    @Provides
    @Singleton
    @ApplicationContext
    fun provideContext(): Context {
        return mApplication
    }

    @Provides
    @Singleton
    fun provideComicDatabase(@ApplicationContext context: Context): ComicDatabase {
        return Room.databaseBuilder(context, ComicDatabase::class.java, "commit-strip-comics-db").build()
    }

    @Provides
    @Singleton
    fun provideComicDao(database: ComicDatabase): ComicDao {
        return database.comicDao()
    }

    @Provides
    @Singleton
    fun provideTwitterService(twitterCore: TwitterCore): StatusesService {
        val twitterApiClient = twitterCore.apiClient
        return twitterApiClient.statusesService

    }

    @Provides
    @Singleton
    fun provideTwitterInstance(): TwitterCore {
        return TwitterCore.getInstance()
    }


}
