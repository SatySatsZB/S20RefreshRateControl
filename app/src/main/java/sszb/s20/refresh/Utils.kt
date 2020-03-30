package sszb.s20.refresh

import android.content.ContentValues
import android.content.Context
import android.net.Uri
import android.widget.Toast

fun setConfig(context: Context, key: String, value: String) {
    val contentResolver = context.contentResolver;
    try {
        val contentValues = ContentValues(2);
        contentValues.put("name", key);
        contentValues.put("value", value);
        contentResolver.insert(Uri.parse("content://settings/system"), contentValues);
        Toast.makeText(context, "Applied", Toast.LENGTH_SHORT).show();
    } catch (th: Exception) {
        Toast.makeText(context, "Failed to setConfig", Toast.LENGTH_SHORT).show();
        th.printStackTrace();
    }
}

fun set96HZ(context: Context){
    setConfig(context,"min_refresh_rate", "96.0");
    setConfig(context,"peak_refresh_rate", "96.0");
}

fun set120HZ(context: Context){
    setConfig(context,"min_refresh_rate", "120.0");
    setConfig(context,"peak_refresh_rate", "120.0");
}