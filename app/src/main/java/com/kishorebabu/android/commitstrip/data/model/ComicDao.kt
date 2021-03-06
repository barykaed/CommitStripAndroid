package com.kishorebabu.android.commitstrip.data.model

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Insert
import android.arch.persistence.room.OnConflictStrategy.REPLACE
import android.arch.persistence.room.Query
import io.reactivex.Flowable
import io.reactivex.Maybe
import io.reactivex.Single

/**
 * Created by kishore on 20/09/17.
 */
@Dao
interface ComicDao {
    @Query("SELECT * from comic ORDER BY date DESC")
    fun getAllComicsByDate(): Flowable<List<Comic>>

    @Insert(onConflict = REPLACE)
    fun insertComic(comic: Comic)

    @Insert
    fun insertComics(comics: List<Comic>)

    @Query("SELECT * from COMIC ORDER BY date DESC LIMIT 1")
    fun getLatestComic(): Maybe<Comic>

    @Query("SELECT * from COMIC ORDER BY date DESC LIMIT 1 OFFSET :position")
    fun getComicAtPosition(position: Int): Single<Comic>

    @Query("SELECT COUNT(*) from comic")
    fun getTotalComicsCount(): Single<Int>
}