package com.example.nero.purse.purse

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.nero.purse.R
import com.example.nero.purse.database.PurseDB

class PurseAdapter internal constructor(context: Context) : RecyclerView.Adapter<PurseAdapter.PurseViewHolder>() {

    private var purseList = emptyList<PurseDB>() // Cached copy of words

    inner class PurseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val purseImage by lazy { view!!.findViewById<ImageView>(R.id.iv_purse_pictures) }
        val purseValue by lazy { view!!.findViewById<TextView>(R.id.tv_purse_value) }
        val purseType by lazy { view!!.findViewById<TextView>(R.id.tv_purse_type) }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PurseViewHolder {
        return PurseViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.list_purse_view, parent, false))
    }

    override fun onBindViewHolder(holder: PurseViewHolder, position: Int) {
        holder?.purseImage.setImageResource(purseList[position].purseImage!!)
        holder?.purseValue.text = purseList[position!!].purseValue.toString()
        holder?.purseType.text = purseList[position!!].purseType.toString()
    }

    override fun getItemCount() = purseList.size

    internal fun updatePurseList(purseList: List<PurseDB>) {
        this.purseList = purseList
        notifyDataSetChanged()
    }
}