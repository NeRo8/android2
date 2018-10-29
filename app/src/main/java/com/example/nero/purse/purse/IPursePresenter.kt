package com.example.nero.purse.purse

interface IPursePresenter {
    fun getAllPurse(): ArrayList<Purse>
    fun getPurse(indexPurse: Int): Purse
    fun deletePurse(indexPurse: Int)
    fun updatePurse(indexPurse: Int)
    fun createPurse()

}