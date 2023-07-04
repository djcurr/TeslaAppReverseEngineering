package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.j;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f16787a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f16788b;

    /* renamed from: c  reason: collision with root package name */
    private final j0 f16789c;

    public e(Context context, j0 j0Var, ExecutorService executorService) {
        this.f16787a = executorService;
        this.f16788b = context;
        this.f16789c = j0Var;
    }

    private boolean b() {
        if (((KeyguardManager) this.f16788b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!PlatformVersion.isAtLeastLollipop()) {
            SystemClock.sleep(10L);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f16788b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.importance == 100;
                }
            }
            return false;
        }
        return false;
    }

    private void c(c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f16788b.getSystemService("notification")).notify(aVar.f16773b, aVar.f16774c, aVar.f16772a.b());
    }

    private f0 d() {
        f0 l11 = f0.l(this.f16789c.p("gcm.n.image"));
        if (l11 != null) {
            l11.C(this.f16787a);
        }
        return l11;
    }

    private void e(j.e eVar, f0 f0Var) {
        if (f0Var == null) {
            return;
        }
        try {
            Bitmap bitmap = (Bitmap) Tasks.await(f0Var.m(), 5L, TimeUnit.SECONDS);
            eVar.r(bitmap);
            eVar.C(new j.b().i(bitmap).h(null));
        } catch (InterruptedException unused) {
            Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
            f0Var.close();
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            Log.w("FirebaseMessaging", "Failed to download image: " + e11.getCause());
        } catch (TimeoutException unused2) {
            Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
            f0Var.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a() {
        if (this.f16789c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        f0 d11 = d();
        c.a d12 = c.d(this.f16788b, this.f16789c);
        e(d12.f16772a, d11);
        c(d12);
        return true;
    }
}