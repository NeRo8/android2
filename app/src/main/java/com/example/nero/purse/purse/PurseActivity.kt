package com.example.nero.purse.purse

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.nero.purse.R
import kotlinx.android.synthetic.main.content_purse.rv_list_purse
import kotlinx.android.synthetic.main.activity_purse.*

class PurseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purse)
        setSupportActionBar(toolbar)

        val purseList: ArrayList<Purse> = arrayListOf(
            Purse(R.drawable.ic_launcher_background, 100.00, "UAH"),
            Purse(R.drawable.ic_launcher_background, 110.00, "USD"),
            Purse(R.drawable.ic_launcher_background, 200.00, "EUR")
        )
//Button
        fab.setOnClickListener { view ->
            val intent = Intent(this, PurseAddActivity::class.java)
            startActivity(intent)
        }

        rv_list_purse.layoutManager = LinearLayoutManager(this)
        rv_list_purse.adapter = PurseAdapter(purseList)
    }
}
