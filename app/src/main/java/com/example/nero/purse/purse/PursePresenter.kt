package com.example.nero.purse.purse

import com.example.nero.purse.R

class PursePresenter(internal var iPurseView: IPurseView) : IPursePresenter {
    val purse: Purse? = null

    private val purseList: ArrayList<Purse> = arrayListOf(
        Purse(R.drawable.ic_launcher_background, 100.00, "UAH"),
        Purse(R.drawable.ic_launcher_background, 110.00, "USD"),
        Purse(R.drawable.ic_launcher_background, 200.00, "EUR")
    )

    override fun loadAllPurse(): ArrayList<Purse> {
        return purseList
    }

    override fun deletePurse(indexPurse: Int) {
        purse?.deleteItemPurse(indexPurse)
        iPurseView.onDeletePurse(true)
    }

    override fun updatePurse(indexPurse: Int) {
        iPurseView.onUpdatePurse()
    }

    override fun addNewPurse() {
        iPurseView.onNewPurse()
    }
}