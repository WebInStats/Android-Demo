package webinstats.demoexample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.android_wis_141.webinstats_object;

/**
 * Created by fatmaselin on 22/09/2017.
 */

public class DeepLink extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deep_link);

        Intent appIntent = getIntent();
        Uri appLinkData = appIntent.getData();
        webinstats_object wobj = new webinstats_object();
        wobj.saveTestParameters(this,appLinkData);
    }
}
