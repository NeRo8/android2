package com.example.nero.purse.purse

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.nero.purse.R

class PurseAdapter(private val purseList: List<Purse>) : RecyclerView.Adapter<PurseAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent?.context).inflate(R.layout.list_purse_view, parent, false))
    }

    override fun getItemCount() = purseList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder?.purseImage.setImageResource(purseList[position!!].imagePurse!!)
        holder?.purseValue.text = purseList[position!!].valuePurse.toString()
        holder?.purseType.text = purseList[position!!].typePurse
        holder?.itemView.setOnClickListener {

        }
    }

    class ViewHolder(view: View?) : RecyclerView.ViewHolder(view) {
        val purseImage by lazy { view!!.findViewById<ImageView>(R.id.iv_purse_pictures) }
        val purseValue by lazy { view!!.findViewById<TextView>(R.id.tv_purse_value) }
        val purseType by lazy { view!!.findViewById<TextView>(R.id.tv_purse_type) }
    }
}