package io.sentry.android.core;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.networking.FraudDetectionData;
import io.sentry.f3;
import io.sentry.g3;
import java.io.Closeable;

/* loaded from: classes5.dex */
public final class u0 implements io.sentry.m0, Closeable, SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32159a;

    /* renamed from: b  reason: collision with root package name */
    private io.sentry.c0 f32160b;

    /* renamed from: c  reason: collision with root package name */
    private SentryAndroidOptions f32161c;

    /* renamed from: d  reason: collision with root package name */
    SensorManager f32162d;

    public u0(Context context) {
        this.f32159a = (Context) rz.j.a(context, "Context is required");
    }

    @Override // io.sentry.m0
    public void a(io.sentry.c0 c0Var, g3 g3Var) {
        this.f32160b = (io.sentry.c0) rz.j.a(c0Var, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) rz.j.a(g3Var instanceof SentryAndroidOptions ? (SentryAndroidOptions) g3Var : null, "SentryAndroidOptions is required");
        this.f32161c = sentryAndroidOptions;
        io.sentry.d0 logger = sentryAndroidOptions.getLogger();
        f3 f3Var = f3.DEBUG;
        logger.c(f3Var, "enableSystemEventsBreadcrumbs enabled: %s", Boolean.valueOf(this.f32161c.isEnableSystemEventBreadcrumbs()));
        if (this.f32161c.isEnableSystemEventBreadcrumbs()) {
            try {
                SensorManager sensorManager = (SensorManager) this.f32159a.getSystemService("sensor");
                this.f32162d = sensorManager;
                if (sensorManager != null) {
                    Sensor defaultSensor = sensorManager.getDefaultSensor(13);
                    if (defaultSensor != null) {
                        this.f32162d.registerListener(this, defaultSensor, 3);
                        g3Var.getLogger().c(f3Var, "TempSensorBreadcrumbsIntegration installed.", new Object[0]);
                    } else {
                        this.f32161c.getLogger().c(f3.INFO, "TYPE_AMBIENT_TEMPERATURE is not available.", new Object[0]);
                    }
                } else {
                    this.f32161c.getLogger().c(f3.INFO, "SENSOR_SERVICE is not available.", new Object[0]);
                }
            } catch (Throwable th2) {
                g3Var.getLogger().a(f3.ERROR, th2, "Failed to init. the SENSOR_SERVICE.", new Object[0]);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SensorManager sensorManager = this.f32162d;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
            this.f32162d = null;
            SentryAndroidOptions sentryAndroidOptions = this.f32161c;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().c(f3.DEBUG, "TempSensorBreadcrumbsIntegration removed.", new Object[0]);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i11) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0 || fArr[0] == BitmapDescriptorFactory.HUE_RED || this.f32160b == null) {
            return;
        }
        io.sentry.c cVar = new io.sentry.c();
        cVar.p("system");
        cVar.l("device.event");
        cVar.m("action", "TYPE_AMBIENT_TEMPERATURE");
        cVar.m("accuracy", Integer.valueOf(sensorEvent.accuracy));
        cVar.m(FraudDetectionData.KEY_TIMESTAMP, Long.valueOf(sensorEvent.timestamp));
        cVar.n(f3.INFO);
        cVar.m("degree", Float.valueOf(sensorEvent.values[0]));
        io.sentry.t tVar = new io.sentry.t();
        tVar.e("android:sensorEvent", sensorEvent);
        this.f32160b.h(cVar, tVar);
    }
}