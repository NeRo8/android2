package com.example.nero.purse.purse.update.purse

import android.content.Intent
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.nero.purse.BR
import com.example.nero.purse.R
import com.example.nero.purse.databinding.ActivityPurseChangeBinding

class PurseUpdateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purse_change)

        val binding: ActivityPurseChangeBinding = DataBindingUtil.setContentView(this, R.layout.activity_purse_change)
        binding.setVariable(BR.purse, Intent().getSerializableExtra("purse"))
        binding.notifyChange()
    }
}
