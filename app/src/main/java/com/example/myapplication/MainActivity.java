package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {
//test
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void dispNotif(View view) {


            NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "personal_notifications");
            builder.setSmallIcon(R.drawable.ic_android_black_24dp);
            builder.setContentTitle("adsfasd");
            builder.setContentText("asdklfj;asd");
            builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

            NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);
            notificationManager.notify(001, builder.build());

    }
}