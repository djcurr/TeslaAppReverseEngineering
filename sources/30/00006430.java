package com.zxcpoiu.incallmanager;

import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.lang.reflect.Method;

/* loaded from: classes6.dex */
public class b {

    /* renamed from: b  reason: collision with root package name */
    private Method f22998b;

    /* renamed from: d  reason: collision with root package name */
    private rw.b f23000d;

    /* renamed from: a  reason: collision with root package name */
    private PowerManager.WakeLock f22997a = null;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22999c = false;

    /* loaded from: classes6.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ InCallManagerModule f23001a;

        a(InCallManagerModule inCallManagerModule) {
            this.f23001a = inCallManagerModule;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23001a.onProximitySensorChangedState(b.this.f23000d.d());
        }
    }

    private b(Context context, InCallManagerModule inCallManagerModule) {
        this.f23000d = null;
        Log.d("InCallProximityManager", "InCallProximityManager");
        c(context);
        if (this.f22999c) {
            this.f23000d = rw.b.a(context, new a(inCallManagerModule));
        }
    }

    private void c(Context context) {
        boolean booleanValue;
        if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(8) == null) {
            this.f22999c = false;
            return;
        }
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        this.f22999c = true;
        try {
            int intValue = ((Integer) PowerManager.class.getDeclaredField("PROXIMITY_SCREEN_OFF_WAKE_LOCK").get(null)).intValue();
            if (Build.VERSION.SDK_INT < 17) {
                booleanValue = (((Integer) powerManager.getClass().getDeclaredMethod("getSupportedWakeLockFlags", new Class[0]).invoke(powerManager, new Object[0])).intValue() & intValue) != 0;
            } else {
                booleanValue = ((Boolean) powerManager.getClass().getDeclaredMethod("isWakeLockLevelSupported", Integer.TYPE).invoke(powerManager, Integer.valueOf(intValue))).booleanValue();
            }
            if (booleanValue) {
                PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(intValue, "InCallProximityManager");
                this.f22997a = newWakeLock;
                newWakeLock.setReferenceCounted(false);
            }
        } catch (Exception e11) {
            Log.d("InCallProximityManager", "Failed to get proximity screen locker. exception: ", e11);
        }
        if (this.f22997a != null) {
            Log.d("InCallProximityManager", "use native screen locker...");
            try {
                this.f22998b = this.f22997a.getClass().getDeclaredMethod("release", Integer.TYPE);
                return;
            } catch (Exception e12) {
                Log.d("InCallProximityManager", "failed to get proximity screen locker: `release()`. exception: ", e12);
                return;
            }
        }
        Log.d("InCallProximityManager", "fallback to old school screen locker...");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b d(Context context, InCallManagerModule inCallManagerModule) {
        return new b(context, inCallManagerModule);
    }

    public void b() {
        if (f()) {
            synchronized (this.f22997a) {
                if (!this.f22997a.isHeld()) {
                    Log.d("InCallProximityManager", "acquireProximityWakeLock()");
                    this.f22997a.acquire();
                }
            }
        }
    }

    public boolean e() {
        return this.f22999c;
    }

    public boolean f() {
        return this.f22997a != null;
    }

    public void g(boolean z11) {
        if (f()) {
            synchronized (this.f22997a) {
                if (this.f22997a.isHeld()) {
                    try {
                        this.f22998b.invoke(this.f22997a, Integer.valueOf(z11 ? 1 : 0));
                        Log.d("InCallProximityManager", "releaseProximityWakeLock()");
                    } catch (Exception e11) {
                        Log.e("InCallProximityManager", "failed to release proximity lock. e: ", e11);
                    }
                }
            }
        }
    }

    public boolean h() {
        if (this.f22999c) {
            return this.f23000d.e();
        }
        return false;
    }

    public void i() {
        this.f23000d.f();
    }
}