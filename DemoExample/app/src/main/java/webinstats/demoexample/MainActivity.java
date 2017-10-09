package webinstats.demoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.util.HashMap;
import java.util.Map;

import webinstats.android_wis_141.Webinstats;

public class MainActivity extends AppCompatActivity {
    Webinstats wiso = new Webinstats("//wisdemo.webinstats.com/","4e84-1481","0");
    // ( String _cburl ,String s ,String sscookie)

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Map<String,String> map=new HashMap<>();
        map.put("p","Home Page");
        wiso.execute(this,map,map);

    }
}
