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
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class w0 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final long f16875a;

    /* renamed from: b  reason: collision with root package name */
    private final PowerManager.WakeLock f16876b;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseMessaging f16877c;

    @VisibleForTesting
    /* loaded from: classes2.dex */
    static class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private w0 f16878a;

        public a(w0 w0Var) {
            this.f16878a = w0Var;
        }

        public void a() {
            if (w0.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f16878a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            w0 w0Var = this.f16878a;
            if (w0Var != null && w0Var.d()) {
                if (w0.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f16878a.f16877c.m(this.f16878a, 0L);
                this.f16878a.b().unregisterReceiver(this);
                this.f16878a = null;
            }
        }
    }

    @VisibleForTesting
    public w0(FirebaseMessaging firebaseMessaging, long j11) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory("firebase-iid-executor"));
        this.f16877c = firebaseMessaging;
        this.f16875a = j11;
        PowerManager.WakeLock newWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f16876b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    static boolean c() {
        return Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3));
    }

    Context b() {
        return this.f16877c.n();
    }

    boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @VisibleForTesting
    boolean e() {
        try {
            if (this.f16877c.k() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Token successfully retrieved");
                return true;
            } else {
                return true;
            }
        } catch (IOException e11) {
            if (d0.h(e11.getMessage())) {
                Log.w("FirebaseMessaging", "Token retrieval failed: " + e11.getMessage() + ". Will retry token retrieval");
                return false;
            } else if (e11.getMessage() == null) {
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            } else {
                throw e11;
            }
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (s0.b().e(b())) {
            this.f16876b.acquire();
        }
        try {
            try {
                this.f16877c.F(true);
            } catch (IOException e11) {
                Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e11.getMessage() + ". Won't retry the operation.");
                this.f16877c.F(false);
                if (!s0.b().e(b())) {
                    return;
                }
            }
            if (!this.f16877c.w()) {
                this.f16877c.F(false);
                if (s0.b().e(b())) {
                    this.f16876b.release();
                }
            } else if (s0.b().d(b()) && !d()) {
                new a(this).a();
                if (s0.b().e(b())) {
                    this.f16876b.release();
                }
            } else {
                if (e()) {
                    this.f16877c.F(false);
                } else {
                    this.f16877c.I(this.f16875a);
                }
                if (!s0.b().e(b())) {
                    return;
                }
                this.f16876b.release();
            }
        } catch (Throwable th2) {
            if (s0.b().e(b())) {
                this.f16876b.release();
            }
            throw th2;
        }
    }
}