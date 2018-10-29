package com.example.nero.purse.purse

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import com.example.nero.purse.R
import kotlinx.android.synthetic.main.activity_purse_add.*

class PurseAddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_purse_add)

        spn_type_purse?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                iv_purse_image.setImageResource(R.drawable.ic_ukraine)
            }

            override fun onItemSelected(adapter: AdapterView<*>?, view: View?, index: Int, p3: Long) {
                when (index) {
                    0 -> iv_purse_image.setImageResource(R.drawable.ic_ukraine)
                    1 -> iv_purse_image.setImageResource(R.drawable.ic_united_states)
                    3 -> iv_purse_image.setImageResource(R.drawable.ic_european_union)
                }
            }
        }
        btn_cancel.setOnClickListener {
            startActivity(Intent(this, PurseActivity::class.java))
        }
        btn_ok.setOnClickListener {

        }
    }
}
