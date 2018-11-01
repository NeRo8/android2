package com.example.nero.purse.purse

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.example.nero.purse.R
import com.example.nero.purse.database.PurseViewModel
import com.example.nero.purse.purse.create.purse.PurseCreateActivity
import com.example.nero.purse.purse.update.purse.PurseUpdateActivity
import kotlinx.android.synthetic.main.content_purse.rv_list_purse
import kotlinx.android.synthetic.main.activity_purse.*

class PurseActivity : AppCompatActivity(), IPurseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purse)
        setSupportActionBar(toolbar)

        val pPresenter = PursePresenter(this)

        //Button
        fab.setOnClickListener { view ->
            pPresenter.createPurse()
        }
        val adapter = PurseAdapter(this)
        rv_list_purse.layoutManager = LinearLayoutManager(this)
        rv_list_purse.adapter = adapter

        //Заповнення recyclerView
        // Get a new or existing ViewModel from the ViewModelProvider.
        var purseViewModel: PurseViewModel = ViewModelProviders.of(this).get(PurseViewModel::class.java)
        purseViewModel.allPurse.observe(this, Observer { purse ->
            // Update the cached copy of the words in the adapter.
            purse?.let { adapter.updatePurseList(it) }
        })
    }

    override fun onCreatePurse() {
        startActivity(Intent(this, PurseCreateActivity::class.java))
    }

    override fun onUpdatePurse() {
        val intent = Intent(this, PurseUpdateActivity::class.java)
        startActivity(intent)
    }

    override fun onDeletePurse(status: Boolean) {
        if (status)
            Snackbar.make(this.rv_list_purse, "Запис видалено", Snackbar.LENGTH_SHORT).show()
        else
            Snackbar.make(this.rv_list_purse, "Виникла помилка", Snackbar.LENGTH_SHORT).show()
    }
}
