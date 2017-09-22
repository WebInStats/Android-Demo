package webinstats.demoexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.android_wis_141.webinstats_object;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    webinstats_object wiso = new webinstats_object();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Map<String,String> map=new HashMap<>();
        map.put("s","4e84-1481");
        map.put("_cburl", "//wisdemo.webinstats.com/");
        map.put("p","Home Page");
        wiso.execute(this,map,map);
    }
}
