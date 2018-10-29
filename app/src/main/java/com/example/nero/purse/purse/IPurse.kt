package com.example.nero.purse.purse


interface IPurse {
    val imagePurse: Int
    val valuePurse: Double
    val typePurse: String

    fun createPurse()
    fun deletePurse(index: Int)
    fun updatePurse(index: Int)
    fun getAllPurse(): ArrayList<Purse>
    fun getPurse(index: Int): Purse
}