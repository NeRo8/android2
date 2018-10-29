package com.example.nero.purse.purse

interface IPurseView {
    fun onCreatePurse()
    fun onDeletePurse(status: Boolean)
    fun onUpdatePurse()
}