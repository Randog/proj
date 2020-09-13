package com.example.myapplication;
import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.*;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;




public class ReminderBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "personal_notifications")
                .setSmallIcon(R.drawable.ic_android_black_24dp)
                .setContentTitle("hiiiiiiiiiiiiiiiiiii")
                .setContentText("asdklfdsfdsfsfsfsfsffs")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);


        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
        notificationManager.notify(01, builder.build());
    }
}
