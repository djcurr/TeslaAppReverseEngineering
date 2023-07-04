package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.stats.WakeLock;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
final class c1 {

    /* renamed from: a  reason: collision with root package name */
    private static final long f16776a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b  reason: collision with root package name */
    private static final Object f16777b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static WakeLock f16778c;

    private static void a(Context context) {
        if (f16778c == null) {
            WakeLock wakeLock = new WakeLock(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f16778c = wakeLock;
            wakeLock.setReferenceCounted(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b(Intent intent) {
        synchronized (f16777b) {
            if (f16778c != null && c(intent)) {
                d(intent, false);
                f16778c.release();
            }
        }
    }

    static boolean c(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    private static void d(Intent intent, boolean z11) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ComponentName e(Context context, Intent intent) {
        synchronized (f16777b) {
            a(context);
            boolean c11 = c(intent);
            d(intent, true);
            ComponentName startService = context.startService(intent);
            if (startService == null) {
                return null;
            }
            if (!c11) {
                f16778c.acquire(f16776a);
            }
            return startService;
        }
    }
}