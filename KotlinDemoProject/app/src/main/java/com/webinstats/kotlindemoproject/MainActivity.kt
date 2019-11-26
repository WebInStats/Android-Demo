package com.webinstats.kotlindemoproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import webinstats.android_wis.Webinstats

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val wiso = Webinstats("//__YOUR_DOMAIN_.webinstats.com/","__YOUR_COMPAY_ID__","0")
        val map= HashMap<String,String>()
        map.put("p","Other")


        wiso.execute(this,map)


    }
}
