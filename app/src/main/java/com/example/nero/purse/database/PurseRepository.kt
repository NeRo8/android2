package com.example.nero.purse.database

import android.arch.lifecycle.LiveData
import android.support.annotation.WorkerThread

class PurseRepository(private val purseDao: PurseDAO) {
    val allPurse: LiveData<List<PurseDB>> = purseDao.getAllPurse()

    @WorkerThread
    suspend fun insert(purse: PurseDB) {
        purseDao.insertPurse(purse)
    }

    @WorkerThread
    suspend fun update(purse: PurseDB) {
        purseDao.updatePurse(purse)
    }

    @WorkerThread
    suspend fun delete(purse: PurseDB) {
        purseDao.deletePurse(purse)
    }

    @WorkerThread
    suspend fun getPurseById(purseId: Int): LiveData<List<PurseDB>> {
        return purseDao.getPurseById(purseId)
    }

}