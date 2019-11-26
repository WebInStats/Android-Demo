package webinstats.ProviderTest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.HashMap;
import java.util.Map;

import webinstats.android_wis.Webinstats;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Webinstats wiso = new Webinstats("//wis.webinstats.com","1549","0");
        Map<String,String> map = new HashMap<>();
        map.put("p","page name");
        map.put("_enable_push","1");
        wiso.execute(this,map);
    }
}
