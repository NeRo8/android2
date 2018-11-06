package com.example.nero.purse.purse.update.purse

import android.arch.lifecycle.ViewModelProviders
import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nero.purse.R
import com.example.nero.purse.database.PurseDatabase
import com.example.nero.purse.database.purse.Purse
import com.example.nero.purse.database.purse.PurseRepository
import com.example.nero.purse.database.purse.PurseViewModel
import com.example.nero.purse.databinding.ActivityPurseChangeBinding

class PurseUpdateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val PurseDao = PurseDatabase.getDatabase(this).purseDao()
        val repository: PurseRepository = PurseRepository(PurseDao)
        val purse: Purse = repository.getPurseById(Intent().getIntExtra("purseId", 0))

        val binding: ActivityPurseChangeBinding = DataBindingUtil.setContentView(this, R.layout.activity_purse_change)
    }

}
