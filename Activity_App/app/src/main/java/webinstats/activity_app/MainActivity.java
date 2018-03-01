package webinstats.activity_app;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import webinstats.android_wis_144.Webinstats;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        handleIntent();
        setContentView(R.layout.activity_main);
        btn1 = (Button)findViewById(R.id.act1);
        btn2 = (Button)findViewById(R.id.act2);
        btn3 = (Button)findViewById(R.id.act3);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act1 = new Intent(MainActivity.this,Act1.class);
                startActivity(act1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act2 = new Intent(MainActivity.this,Act2.class);
                startActivity(act2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent act3 = new Intent(MainActivity.this,Act3.class);
                startActivity(act3);
            }
        });
    }
    private void handleIntent(){
        Intent appLinkIntent = getIntent();
        Bundle bundle = getIntent().getExtras();
        Uri appLinkData = appLinkIntent.getData();
        Webinstats wobj = new Webinstats("//wisdemo.webinstats.com/","1481","0");
        wobj.saveTestParameters(this,appLinkData,bundle);
    }
}
