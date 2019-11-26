package webinstats.ProviderTest;

import android.content.SharedPreferences;
import android.util.Log;


import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import webinstats.android_wis.WebinstatsMessagingService;

public class NotificationService extends FirebaseMessagingService {
    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
        Log.v("token : ",s);
        this.getSharedPreferences("wis_defaults",MODE_PRIVATE);
        new WebinstatsMessagingService().onNewToken(s,getApplicationContext());
    }

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);

        new WebinstatsMessagingService().onMessageReceived(remoteMessage,getApplicationContext());
    }
}
