package webinstats.demoexample;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;

import webinstats.android_wis_141.Webinstats;

/**
 * Created by fatmaselin on 22/09/2017.
 */

public class DeepLink extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deep_link);
        Webinstats wobj = new Webinstats("//wisdemo.webinstats.com/","4e84-1481","0");
        Intent appIntent = getIntent();
        Uri appLinkData = appIntent.getData();
        wobj.saveTestParameters(this,appLinkData);
    }
}
