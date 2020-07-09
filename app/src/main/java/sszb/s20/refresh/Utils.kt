package sszb.s20.refresh

import android.content.ContentValues
import android.content.Context
import android.net.Uri
import android.widget.Toast

private const val MIN_REFRESH_RATE = "min_refresh_rate"
private const val PEAK_REFRESH_RATE = "peak_refresh_rate"

enum class RefreshRate(val refreshRateValue: String) {
    NinetySix("96.0"),
    HundredTwenty("120.0")
}

fun setConfig(context: Context, key: String, value: String) {
    val contentResolver = context.contentResolver
    try {
        val contentValues = ContentValues(2)
        contentValues.put("name", key)
        contentValues.put("value", value)
        contentResolver.insert(Uri.parse("content://settings/system"), contentValues)
        Toast.makeText(context, "Applied", Toast.LENGTH_SHORT).show()
    } catch (th: Exception) {
        Toast.makeText(context, "Failed to setConfig", Toast.LENGTH_SHORT).show()
        th.printStackTrace()
    }
}

fun Context.setRefreshRate(rate: RefreshRate) {
    setConfig(this, MIN_REFRESH_RATE, rate.refreshRateValue)
    setConfig(this, PEAK_REFRESH_RATE, rate.refreshRateValue)
}