package sszb.s20.refresh

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        set96.setOnClickListener { set96HZ(this)};
        set120.setOnClickListener { set120HZ(this)}
    }



}

