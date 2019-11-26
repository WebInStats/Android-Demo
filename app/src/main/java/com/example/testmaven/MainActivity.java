package com.example.testmaven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

import webinstats.android_wis.Webinstats;

public class MainActivity extends AppCompatActivity {
    Webinstats wiso = new Webinstats("//wis.webinstats.com","1","0");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Map<String,String> map = new HashMap<>();
        map.put("p","maventest");
        map.put("wistest","popup");
        wiso.execute(this,map);
    }
}
