package net.time4j.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import net.time4j.android.spi.AndroidResourceLoader;
import net.time4j.b0;
import net.time4j.base.d;
import net.time4j.format.e;
import net.time4j.g0;
import net.time4j.h0;
import net.time4j.i0;
import net.time4j.p0;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.p;

/* loaded from: classes5.dex */
public class ApplicationStarter {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicBoolean f40794a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f40795b = new AtomicBoolean(false);

    /* loaded from: classes5.dex */
    private static class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long nanoTime = System.nanoTime();
            k s11 = p.s(TimeZone.getDefault().getOffset(System.currentTimeMillis()) / 1000);
            Locale locale = Locale.getDefault();
            try {
                b0 b11 = p0.b();
                s11 = l.O().z();
                Log.i("TIME4A", "System time zone at start: [" + s11.a() + "]");
                Log.i("TIME4A", "System locale at start: [" + locale.toString() + "]");
                e eVar = e.FULL;
                Log.i("TIME4A", net.time4j.format.expert.c.B(eVar, eVar, locale, s11).l(b11));
                Log.i("TIME4A", "Prefetch thread consumed (in ms): " + ((System.nanoTime() - nanoTime) / 1000000));
            } catch (Throwable th2) {
                Log.e("TIME4A", "Error on prefetch thread with: time zone=" + s11.a() + ", locale=" + locale + "!", th2);
                throw new IllegalStateException(th2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l.b.a();
            Log.i("TIME4A", "Event ACTION_TIMEZONE_CHANGED received, system timezone changed to: [" + l.O().z().a() + "]. Original tz-id reported by Android: [" + intent.getStringExtra("time-zone") + "]");
        }
    }

    private ApplicationStarter() {
    }

    public static void a(Context context, Runnable runnable) {
        long nanoTime = System.nanoTime();
        c(context, null);
        d(context.getApplicationContext());
        i0 o02 = g0.N0(2021, 3, 27).o0(h0.H0());
        Log.i("TIME4A", "Starting Time4A (v4.8-2021a published on " + o02.d0() + ")");
        if (runnable != null) {
            Executors.defaultThreadFactory().newThread(runnable).start();
        }
        Log.i("TIME4A", "Main-Thread consumed in ms: " + ((System.nanoTime() - nanoTime) / 1000000));
    }

    public static void b(Context context, boolean z11) {
        a(context, z11 ? new b() : null);
    }

    public static void c(Context context, j30.a aVar) {
        if (f40794a.getAndSet(true)) {
            return;
        }
        System.setProperty("net.time4j.base.ResourceLoader", "net.time4j.android.spi.AndroidResourceLoader");
        ((AndroidResourceLoader) d.c()).j(context, aVar);
    }

    public static void d(Context context) {
        if (context == null || f40795b.getAndSet(true)) {
            return;
        }
        System.setProperty("net.time4j.allow.system.tz.override", "true");
        context.registerReceiver(new c(), new IntentFilter("android.intent.action.TIMEZONE_CHANGED"));
    }
}