package webinstats.activity_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;
import java.util.Map;

import webinstats.android_wis_144.Webinstats;

/**
 * Created by fatmaselin on 28/12/2017.
 */

public class Act3 extends Activity {
    Webinstats wiso = new Webinstats("//wisdemo.webinstats.com/","1481","0");
    Button back3;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act3);
        back3 = (Button) findViewById(R.id.back3);

        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main3 = new Intent(Act3.this,MainActivity.class);
                startActivity(main3);
                finish();
            }
        });

        Map<String,String> map=new HashMap<>();

        map.put("a", "a");
        map.put("ls", "|");
        map.put("ps", "/");
        map.put("p","Act3");
        map.put("_cstto","1440");
        map.put("_csttoi","60");
        map.put("wistest","ntf");
        wiso.execute(this,map);
    }
}
