package com.wix.reactnativenotifications.core;

import android.app.IntentService;
import android.content.Intent;
import com.wix.reactnativenotifications.core.notification.IPushNotification;
import com.wix.reactnativenotifications.core.notification.b;
import lw.f;

/* loaded from: classes6.dex */
public class ProxyService extends IntentService {
    public ProxyService() {
        super("notificationsProxyService");
    }

    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        IPushNotification j11 = b.j(this, f.d(intent));
        if (j11 != null) {
            j11.c();
        }
    }
}