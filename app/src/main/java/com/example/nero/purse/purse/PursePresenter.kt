package com.example.nero.purse.purse

import com.example.nero.purse.R

class PursePresenter(internal var iPurseView: IPurseView) : IPursePresenter {

    val purse: Purse? = null

    private val purseList: ArrayList<Purse> = arrayListOf(
        Purse(R.drawable.ic_ukraine, 100.00, "UAH"),
        Purse(R.drawable.ic_united_states, 110.00, "USD"),
        Purse(R.drawable.ic_european_union, 200.00, "EUR")
    )

    override fun getAllPurse(): ArrayList<Purse> {
        return purseList
    }

    override fun getPurse(indexPurse: Int): Purse {
        return purseList[indexPurse]
    }

    override fun deletePurse(indexPurse: Int) {
        purse?.deletePurse(indexPurse)
        iPurseView.onDeletePurse(true)
    }

    override fun updatePurse(indexPurse: Int) {
        iPurseView.onUpdatePurse()
    }

    override fun createPurse() {
        iPurseView.onCreatePurse()
    }
}