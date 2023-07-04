package expo.modules.location.services;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes5.dex */
public class LocationTaskService extends Service {
    private static final String TAG = "LocationTaskService";
    private static int sServiceId = 481756;
    private final IBinder mBinder;
    private String mChannelId;
    private boolean mKillService = false;
    private Context mParentContext;
    private int mServiceId;

    /* loaded from: classes5.dex */
    public class ServiceBinder extends Binder {
        public ServiceBinder() {
        }

        public LocationTaskService getService() {
            return LocationTaskService.this;
        }
    }

    public LocationTaskService() {
        int i11 = sServiceId;
        sServiceId = i11 + 1;
        this.mServiceId = i11;
        this.mBinder = new ServiceBinder();
    }

    private Notification buildServiceNotification(Bundle bundle) {
        prepareChannel(this.mChannelId);
        Notification.Builder builder = new Notification.Builder(this, this.mChannelId);
        String string = bundle.getString("notificationTitle");
        String string2 = bundle.getString("notificationBody");
        Integer colorStringToInteger = colorStringToInteger(bundle.getString("notificationColor"));
        if (string != null) {
            builder.setContentTitle(string);
        }
        if (string2 != null) {
            builder.setContentText(string2);
        }
        if (colorStringToInteger != null) {
            builder.setColorized(true).setColor(colorStringToInteger.intValue());
        } else {
            builder.setColorized(false);
        }
        Intent launchIntentForPackage = this.mParentContext.getPackageManager().getLaunchIntentForPackage(this.mParentContext.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(PKIFailureInfo.duplicateCertReq);
            builder.setContentIntent(PendingIntent.getActivity(this, 0, launchIntentForPackage, (Build.VERSION.SDK_INT >= 31 ? 33554432 : 0) | 134217728));
        }
        return builder.setCategory("service").setSmallIcon(getApplicationInfo().icon).build();
    }

    private Integer colorStringToInteger(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            return null;
        }
    }

    private void prepareChannel(String str) {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        if (notificationManager != null) {
            String charSequence = getApplicationInfo().loadLabel(getPackageManager()).toString();
            if (notificationManager.getNotificationChannel(str) == null) {
                NotificationChannel notificationChannel = new NotificationChannel(str, charSequence, 2);
                notificationChannel.setDescription("Background location notification channel");
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Log.w(TAG, "onBind");
        return this.mBinder;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i11, int i12) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            this.mChannelId = extras.getString("appId") + ":" + extras.getString("taskName");
            this.mKillService = extras.getBoolean("killService", false);
            return 3;
        }
        return 3;
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        if (this.mKillService) {
            super.onTaskRemoved(intent);
            stop();
        }
    }

    public void setParentContext(Context context) {
        this.mParentContext = context;
    }

    public void startForeground(Bundle bundle) {
        startForeground(this.mServiceId, buildServiceNotification(bundle));
    }

    public void stop() {
        stopForeground(true);
        stopSelf();
    }
}