package rw;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.util.Log;

/* loaded from: classes6.dex */
public class b implements SensorEventListener {

    /* renamed from: a  reason: collision with root package name */
    private final Runnable f49716a;

    /* renamed from: b  reason: collision with root package name */
    private final SensorManager f49717b;

    /* renamed from: c  reason: collision with root package name */
    private Sensor f49718c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f49719d = false;

    private b(Context context, Runnable runnable) {
        Log.d("AppRTCProximitySensor", "AppRTCProximitySensor");
        this.f49716a = runnable;
        this.f49717b = (SensorManager) context.getSystemService("sensor");
    }

    public static b a(Context context, Runnable runnable) {
        return new b(context, runnable);
    }

    private boolean b() {
        if (this.f49718c != null) {
            return true;
        }
        Sensor defaultSensor = this.f49717b.getDefaultSensor(8);
        this.f49718c = defaultSensor;
        if (defaultSensor == null) {
            return false;
        }
        c();
        return true;
    }

    private void c() {
        if (this.f49718c == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("Proximity sensor: ");
        sb2.append("name=");
        sb2.append(this.f49718c.getName());
        sb2.append(", vendor: ");
        sb2.append(this.f49718c.getVendor());
        sb2.append(", power: ");
        sb2.append(this.f49718c.getPower());
        sb2.append(", resolution: ");
        sb2.append(this.f49718c.getResolution());
        sb2.append(", max range: ");
        sb2.append(this.f49718c.getMaximumRange());
        sb2.append(", min delay: ");
        sb2.append(this.f49718c.getMinDelay());
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 20) {
            sb2.append(", type: ");
            sb2.append(this.f49718c.getStringType());
        }
        if (i11 >= 21) {
            sb2.append(", max delay: ");
            sb2.append(this.f49718c.getMaxDelay());
            sb2.append(", reporting mode: ");
            sb2.append(this.f49718c.getReportingMode());
            sb2.append(", isWakeUpSensor: ");
            sb2.append(this.f49718c.isWakeUpSensor());
        }
        Log.d("AppRTCProximitySensor", sb2.toString());
    }

    public boolean d() {
        return this.f49719d;
    }

    public boolean e() {
        Log.d("AppRTCProximitySensor", "start");
        if (b()) {
            this.f49717b.registerListener(this, this.f49718c, 3);
            return true;
        }
        return false;
    }

    public void f() {
        Log.d("AppRTCProximitySensor", "stop");
        Sensor sensor = this.f49718c;
        if (sensor == null) {
            return;
        }
        this.f49717b.unregisterListener(this, sensor);
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i11) {
        if (i11 == 0) {
            Log.e("AppRTCProximitySensor", "The values returned by this sensor cannot be trusted");
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (sensorEvent.values[0] < this.f49718c.getMaximumRange()) {
            Log.d("AppRTCProximitySensor", "Proximity sensor => NEAR state");
            this.f49719d = true;
        } else {
            Log.d("AppRTCProximitySensor", "Proximity sensor => FAR state");
            this.f49719d = false;
        }
        Runnable runnable = this.f49716a;
        if (runnable != null) {
            runnable.run();
        }
        Log.d("AppRTCProximitySensor", "onSensorChanged: accuracy=" + sensorEvent.accuracy + ", timestamp=" + sensorEvent.timestamp + ", distance=" + sensorEvent.values[0]);
    }
}