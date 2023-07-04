package com.wix.reactnativenotifications;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.c0;
import com.facebook.react.v;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.messaging.FirebaseMessaging;
import com.wix.reactnativenotifications.fcm.FcmInstanceIdRefreshHandlerService;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes6.dex */
public final class i implements v {

    /* renamed from: a */
    public static final i f22960a = new i();

    private i() {
    }

    public static /* synthetic */ void a(Void r02) {
        k(r02);
    }

    public static /* synthetic */ void b(Exception exc) {
        j(exc);
    }

    public static /* synthetic */ void c(Void r02) {
        i(r02);
    }

    public static /* synthetic */ void d(Exception exc) {
        l(exc);
    }

    public static final void e(Application application) {
        s.g(application, "application");
        com.google.firebase.d.p(application.getApplicationContext());
    }

    public static final boolean f() {
        return true;
    }

    public static final boolean g(Context context) {
        s.g(context, "context");
        return false;
    }

    public static final void h(Context context) {
        s.g(context, "context");
        com.google.firebase.installations.c.q().i().addOnSuccessListener(new OnSuccessListener() { // from class: com.wix.reactnativenotifications.h
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                i.c((Void) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.wix.reactnativenotifications.e
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                i.b(exc);
            }
        });
        FirebaseMessaging.o().l().addOnSuccessListener(new OnSuccessListener() { // from class: com.wix.reactnativenotifications.g
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                i.a((Void) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: com.wix.reactnativenotifications.f
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                i.d(exc);
            }
        });
        pw.b.f(context).e();
    }

    public static final void i(Void r12) {
        c.a("ReactNativeNotifs", "[FCM] Installations revocation success");
    }

    public static final void j(Exception it2) {
        s.g(it2, "it");
        c.a("ReactNativeNotifs", "[FCM] Installations revocation failed");
    }

    public static final void k(Void r12) {
        c.a("ReactNativeNotifs", "[FCM] Token revocation success");
    }

    public static final void l(Exception it2) {
        s.g(it2, "it");
        c.a("ReactNativeNotifs", "[FCM] Token revocation failed");
    }

    public static final void m(Context context, String extraFlag) {
        s.g(context, "context");
        s.g(extraFlag, "extraFlag");
        Intent intent = new Intent(context, FcmInstanceIdRefreshHandlerService.class);
        intent.putExtra(extraFlag, true);
        FcmInstanceIdRefreshHandlerService.j(context, intent);
    }

    public static final void n(boolean z11) {
    }

    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> i11;
        s.g(reactContext, "reactContext");
        i11 = w.i();
        return i11;
    }

    @Override // com.facebook.react.v
    public List<ViewManager<View, c0<?>>> createViewManagers(ReactApplicationContext reactContext) {
        List<ViewManager<View, c0<?>>> i11;
        s.g(reactContext, "reactContext");
        i11 = w.i();
        return i11;
    }
}