package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import io.sentry.f3;
import io.sentry.g3;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes5.dex */
public final class t0 implements io.sentry.m0, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32150a;

    /* renamed from: b  reason: collision with root package name */
    a f32151b;

    /* renamed from: c  reason: collision with root package name */
    private SentryAndroidOptions f32152c;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f32153d;

    /* loaded from: classes5.dex */
    static final class a extends BroadcastReceiver {

        /* renamed from: a  reason: collision with root package name */
        private final io.sentry.c0 f32154a;

        /* renamed from: b  reason: collision with root package name */
        private final io.sentry.d0 f32155b;

        a(io.sentry.c0 c0Var, io.sentry.d0 d0Var) {
            this.f32154a = c0Var;
            this.f32155b = d0Var;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            io.sentry.c cVar = new io.sentry.c();
            cVar.p("system");
            cVar.l("device.event");
            String action = intent.getAction();
            String c11 = rz.m.c(action);
            if (c11 != null) {
                cVar.m("action", c11);
            }
            Bundle extras = intent.getExtras();
            HashMap hashMap = new HashMap();
            if (extras != null && !extras.isEmpty()) {
                for (String str : extras.keySet()) {
                    try {
                        Object obj = extras.get(str);
                        if (obj != null) {
                            hashMap.put(str, obj.toString());
                        }
                    } catch (Throwable th2) {
                        this.f32155b.a(f3.ERROR, th2, "%s key of the %s action threw an error.", str, action);
                    }
                }
                cVar.m("extras", hashMap);
            }
            cVar.n(f3.INFO);
            io.sentry.t tVar = new io.sentry.t();
            tVar.e("android:intent", intent);
            this.f32154a.h(cVar, tVar);
        }
    }

    public t0(Context context) {
        this(context, g());
    }

    private static List<String> g() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.appwidget.action.APPWIDGET_DELETED");
        arrayList.add("android.appwidget.action.APPWIDGET_DISABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_ENABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_HOST_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
        arrayList.add("android.intent.action.ACTION_POWER_CONNECTED");
        arrayList.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        arrayList.add("android.intent.action.ACTION_SHUTDOWN");
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        arrayList.add("android.intent.action.BATTERY_LOW");
        arrayList.add("android.intent.action.BATTERY_OKAY");
        arrayList.add("android.intent.action.BOOT_COMPLETED");
        arrayList.add("android.intent.action.CAMERA_BUTTON");
        arrayList.add("android.intent.action.CONFIGURATION_CHANGED");
        arrayList.add("android.intent.action.CONTENT_CHANGED");
        arrayList.add("android.intent.action.DATE_CHANGED");
        arrayList.add("android.intent.action.DEVICE_STORAGE_LOW");
        arrayList.add("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add("android.intent.action.DOCK_EVENT");
        arrayList.add("android.intent.action.DREAMING_STARTED");
        arrayList.add("android.intent.action.DREAMING_STOPPED");
        arrayList.add("android.intent.action.INPUT_METHOD_CHANGED");
        arrayList.add("android.intent.action.LOCALE_CHANGED");
        arrayList.add("android.intent.action.REBOOT");
        arrayList.add("android.intent.action.SCREEN_OFF");
        arrayList.add("android.intent.action.SCREEN_ON");
        arrayList.add("android.intent.action.TIMEZONE_CHANGED");
        arrayList.add("android.intent.action.TIME_SET");
        arrayList.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        arrayList.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        arrayList.add("android.intent.action.APP_ERROR");
        arrayList.add("android.intent.action.BUG_REPORT");
        arrayList.add("android.intent.action.MEDIA_BAD_REMOVAL");
        arrayList.add("android.intent.action.MEDIA_MOUNTED");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTABLE");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTED");
        return arrayList;
    }

    @Override // io.sentry.m0
    public void a(io.sentry.c0 c0Var, g3 g3Var) {
        rz.j.a(c0Var, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) rz.j.a(g3Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) g3Var : null, "SentryAndroidOptions is required");
        this.f32152c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(f3.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f32152c.isEnableSystemEventBreadcrumbs()));
        if (this.f32152c.isEnableSystemEventBreadcrumbs()) {
            this.f32151b = new a(c0Var, this.f32152c.getLogger());
            IntentFilter intentFilter = new IntentFilter();
            for (String str : this.f32153d) {
                intentFilter.addAction(str);
            }
            try {
                this.f32150a.registerReceiver(this.f32151b, intentFilter);
                this.f32152c.getLogger().c(f3.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
            } catch (Throwable th2) {
                this.f32152c.setEnableSystemEventBreadcrumbs(false);
                this.f32152c.getLogger().b(f3.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a aVar = this.f32151b;
        if (aVar != null) {
            this.f32150a.unregisterReceiver(aVar);
            this.f32151b = null;
            SentryAndroidOptions sentryAndroidOptions = this.f32152c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(f3.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        }
    }

    public t0(Context context, List<String> list) {
        this.f32150a = (Context) rz.j.a(context, "Context is required");
        this.f32153d = (List) rz.j.a(list, "Actions list is required");
    }
}