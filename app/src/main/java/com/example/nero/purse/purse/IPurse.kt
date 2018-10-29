package com.example.nero.purse.purse


interface IPurse {
    val imagePurse: Int
    val valuePurse: Double
    val typePurse: String

    fun addItemPurse()
    fun deleteItemPurse(index: Int)
    fun updateItemPurse(index: Int)
    fun loadAllPurse(): ArrayList<Purse>
}