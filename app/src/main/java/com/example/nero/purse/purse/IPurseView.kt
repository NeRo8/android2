package com.example.nero.purse.purse

interface IPurseView {
    fun onNewPurse()
    fun onDeletePurse(status: Boolean)
    fun onUpdatePurse()
}