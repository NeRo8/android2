package com.example.nero.purse.database

import android.arch.lifecycle.LiveData
import android.arch.persistence.room.*

@Dao
interface PurseDAO {
    @Insert
    fun insertPurse(purse: PurseDB)

    @Delete
    fun deletePurse(purse: PurseDB)

    @Update
    fun updatePurse(purse: PurseDB)

    @Query("SELECT * FROM purse WHERE id=:purseId")
    fun getPurseById(purseId: Int): LiveData<List<PurseDB>>

    @Query("SELECT * FROM purse")
    fun getAllPurse(): LiveData<List<PurseDB>>
}