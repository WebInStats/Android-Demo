package com.webinstats.basicdemoapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

import webinstats.android_wis.Webinstats;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Webinstats wiso = new Webinstats("//__YOUR__DOMAIN__.webinstats.com/","__COMPANY__ID__","0");
        Map<String,String> map=new HashMap<>();
        map.put("p","Other");
        map.put("_enable_push","1");
        // call execute function on onCreate() method
        wiso.execute(this,map);

    }
}
