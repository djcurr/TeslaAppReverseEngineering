package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class b1 implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f16761f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static Boolean f16762g;

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f16763h;

    /* renamed from: a  reason: collision with root package name */
    private final Context f16764a;

    /* renamed from: b  reason: collision with root package name */
    private final i0 f16765b;

    /* renamed from: c  reason: collision with root package name */
    private final PowerManager.WakeLock f16766c;

    /* renamed from: d  reason: collision with root package name */
    private final a1 f16767d;

    /* renamed from: e  reason: collision with root package name */
    private final long f16768e;

    /* loaded from: classes2.dex */
    class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private b1 f16769a;

        public a(b1 b1Var) {
            this.f16769a = b1Var;
        }

        public void a() {
            if (b1.b()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            b1.this.f16764a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            b1 b1Var = this.f16769a;
            if (b1Var == null) {
                return;
            }
            if (b1Var.i()) {
                if (b1.b()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f16769a.f16767d.l(this.f16769a, 0L);
                context.unregisterReceiver(this);
                this.f16769a = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(a1 a1Var, Context context, i0 i0Var, long j11) {
        this.f16767d = a1Var;
        this.f16764a = context;
        this.f16768e = j11;
        this.f16765b = i0Var;
        this.f16766c = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    static /* synthetic */ boolean b() {
        return j();
    }

    private static String e(String str) {
        return "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest";
    }

    private static boolean f(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f16761f) {
            Boolean bool = f16763h;
            if (bool == null) {
                booleanValue = g(context, "android.permission.ACCESS_NETWORK_STATE", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f16763h = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    private static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z11 = context.checkCallingOrSelfPermission(str) == 0;
        if (!z11 && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", e(str));
        }
        return z11;
    }

    private static boolean h(Context context) {
        boolean booleanValue;
        boolean booleanValue2;
        synchronized (f16761f) {
            Boolean bool = f16762g;
            if (bool == null) {
                booleanValue = g(context, "android.permission.WAKE_LOCK", bool);
            } else {
                booleanValue = bool.booleanValue();
            }
            Boolean valueOf = Boolean.valueOf(booleanValue);
            f16762g = valueOf;
            booleanValue2 = valueOf.booleanValue();
        }
        return booleanValue2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean i() {
        boolean z11;
        ConnectivityManager connectivityManager = (ConnectivityManager) this.f16764a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo != null) {
            z11 = activeNetworkInfo.isConnected();
        }
        return z11;
    }

    private static boolean j() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    @Override // java.lang.Runnable
    public void run() {
        PowerManager.WakeLock wakeLock;
        if (h(this.f16764a)) {
            this.f16766c.acquire(d.f16779a);
        }
        try {
            try {
                try {
                    this.f16767d.m(true);
                } catch (IOException e11) {
                    Log.e("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e11.getMessage());
                    this.f16767d.m(false);
                    if (!h(this.f16764a)) {
                        return;
                    }
                    wakeLock = this.f16766c;
                }
                if (!this.f16765b.g()) {
                    this.f16767d.m(false);
                    if (h(this.f16764a)) {
                        try {
                            this.f16766c.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else if (f(this.f16764a) && !i()) {
                    new a(this).a();
                    if (h(this.f16764a)) {
                        try {
                            this.f16766c.release();
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                    }
                } else {
                    if (this.f16767d.p()) {
                        this.f16767d.m(false);
                    } else {
                        this.f16767d.q(this.f16768e);
                    }
                    if (h(this.f16764a)) {
                        wakeLock = this.f16766c;
                        wakeLock.release();
                    }
                }
            } catch (Throwable th2) {
                if (h(this.f16764a)) {
                    try {
                        this.f16766c.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th2;
            }
        } catch (RuntimeException unused4) {
            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
        }
    }
}