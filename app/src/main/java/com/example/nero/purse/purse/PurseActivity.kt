package com.example.nero.purse.purse

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.nero.purse.R
import com.example.nero.purse.database.purse.PurseViewModel
import com.example.nero.purse.purse.create.purse.PurseCreateActivity
import com.example.nero.purse.purse.update.purse.PurseUpdateActivity
import kotlinx.android.synthetic.main.content_purse.rv_list_purse
import kotlinx.android.synthetic.main.activity_purse.*

class PurseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purse)
        setSupportActionBar(toolbar)

        //Button
        fab.setOnClickListener { view ->
            onCreatePurse()
        }
        val adapter = PurseAdapter(this) { purseId: Int ->
            onUpdatePurse(purseId)
        }
        rv_list_purse.layoutManager = LinearLayoutManager(this)
        rv_list_purse.adapter = adapter

        //Заповнення recyclerView
        // Get a new or existing ViewModel from the ViewModelProvider.
        val purseViewModel: PurseViewModel = ViewModelProviders.of(this).get(PurseViewModel::class.java)
        purseViewModel.allPurse.observe(this, Observer { purse ->
            // Update the cached copy of the words in the adapter.
            purse?.let { adapter.updatePurseList(it) }
        })
    }

    fun onCreatePurse() {
        startActivity(Intent(this, PurseCreateActivity::class.java))
    }

    fun onUpdatePurse(purseId: Int) {
        startActivity(Intent(this, PurseUpdateActivity::class.java).putExtra("purseId", purseId))
    }
}
