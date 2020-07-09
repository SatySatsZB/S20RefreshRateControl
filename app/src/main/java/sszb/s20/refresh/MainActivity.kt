package sszb.s20.refresh

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import jp.wasabeef.takt.Seat
import jp.wasabeef.takt.Takt
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        set96.setOnClickListener { setRefreshRate(RefreshRate.NinetySix) }
        set120.setOnClickListener { setRefreshRate(RefreshRate.HundredTwenty) }

        Takt.stock(this.application)
            .seat(Seat.TOP_RIGHT)
            .interval(233)
            .color(Color.BLACK)
            .size(18f)
            .alpha(.8f)
    }



}

