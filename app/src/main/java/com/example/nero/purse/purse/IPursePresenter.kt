package com.example.nero.purse.purse

interface IPursePresenter {
    fun loadAllPurse(): ArrayList<Purse>
    fun deletePurse(indexPurse: Int)
    fun updatePurse(indexPurse: Int)
    fun addNewPurse()

}