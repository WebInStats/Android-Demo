package com.example.fatmaselin.frameworktest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

import webinstats.android_wis.Webinstats;
import webinstats.android_wis.WebinstatsMessagingService;

//import webinstats.android_wis.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Webinstats wiso = new Webinstats("//testframe.webinstats.com/","1549","0");
        Map<String,String> map=new HashMap<>();
        map.put("ls", "|");
        map.put("ps", "/");
        map.put("p","Push Notification Panel");
        map.put("_cstto","1440");
        map.put("_csttoi","60");
        map.put("_enable_push","1");
        wiso.execute(this,map);
    }
}
