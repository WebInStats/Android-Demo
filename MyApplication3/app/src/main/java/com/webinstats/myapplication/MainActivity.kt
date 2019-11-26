package com.webinstats.myapplication

import android.app.PendingIntent.getActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import webinstats.android_wis.Webinstats

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val wiso = Webinstats("//_YOUR_DOMAIN_.webinstats.com/","__YOUR_COMPANY_ID_","0")
        val map = HashMap<String,String>()
        map.put("p","Other")
// For each activity => call execute function on onCreate() method
        wiso.execute(this,map)

    }
}
