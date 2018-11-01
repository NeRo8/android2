package com.example.nero.purse.database

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.LiveData
import kotlinx.coroutines.experimental.*
import kotlinx.coroutines.experimental.android.Main
import kotlin.coroutines.experimental.CoroutineContext

class PurseViewModel(application: Application) : AndroidViewModel(application) {
    private var parentJob = Job()
    private val coroutineContext: CoroutineContext
        get() = parentJob + Dispatchers.Main
    private val scope = CoroutineScope(coroutineContext)

    private val repository: PurseRepository
    val allPurse: LiveData<List<Purse>>

    init {
        val wordsDao = PurseDatabase.getDatabase(application).purseDao()
        repository = PurseRepository(wordsDao)
        allPurse = repository.allPurse
    }

    fun insert(purse: Purse) = scope.launch(Dispatchers.IO) {
        repository.insert(purse)
    }


    fun update(purse: Purse) = scope.launch(Dispatchers.IO) {
        repository.update(purse)
    }

    fun delete(purse: Purse) = scope.launch(Dispatchers.IO) {
        repository.delete(purse)
    }

    fun getPurseById(purseId: Int) = scope.launch(Dispatchers.IO) {
        repository.getPurseById(purseId)
    }

    override fun onCleared() {
        super.onCleared()
        parentJob.cancel()
    }
}