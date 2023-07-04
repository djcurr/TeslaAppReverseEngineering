package com.wix.reactnativenotifications.fcm;

import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.o0;
import com.tesla.logging.g;
import com.wix.reactnativenotifications.core.notification.IPushNotification;
import com.wix.reactnativenotifications.core.notification.b;

/* loaded from: classes6.dex */
public class FcmInstanceIdListenerService extends FirebaseMessagingService {

    /* renamed from: g  reason: collision with root package name */
    private final g f22957g = g.g("ReactNativeNotifs");

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q(o0 o0Var) {
        Bundle extras = o0Var.K1().getExtras();
        g gVar = this.f22957g;
        gVar.i("FCM message data: " + extras);
        try {
            b.j(getApplicationContext(), extras).a();
        } catch (IPushNotification.InvalidNotificationException e11) {
            g gVar2 = this.f22957g;
            gVar2.f("Failed to handle message" + e11.getMessage(), e11);
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void s(String str) {
        super.s(str);
        pw.b.f(getApplicationContext()).c(str);
    }
}