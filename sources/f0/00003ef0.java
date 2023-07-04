package com.lwansbrough.RCTCamera;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.facebook.react.bridge.ReactApplicationContext;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: c  reason: collision with root package name */
    private SensorManager f17913c;

    /* renamed from: a  reason: collision with root package name */
    int f17911a = 0;

    /* renamed from: d  reason: collision with root package name */
    private f f17914d = null;

    /* renamed from: b  reason: collision with root package name */
    private SensorEventListener f17912b = new b();

    /* loaded from: classes2.dex */
    private class b implements SensorEventListener {
        private b() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i11) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] fArr = sensorEvent.values;
            float f11 = fArr[0];
            float f12 = fArr[1];
            int i11 = (f11 > 5.0f ? 1 : (f11 == 5.0f ? 0 : -1));
            if (i11 < 0 && f11 > -5.0f && f12 > 5.0f) {
                e.this.f17911a = 0;
            } else if (f11 < -5.0f && f12 < 5.0f && f12 > -5.0f) {
                e.this.f17911a = 3;
            } else if (i11 < 0 && f11 > -5.0f && f12 < -5.0f) {
                e.this.f17911a = 2;
            } else if (f11 > 5.0f && f12 < 5.0f && f12 > -5.0f) {
                e.this.f17911a = 1;
            }
            if (e.this.f17914d != null) {
                e.this.f17914d.a();
            }
        }
    }

    public e(ReactApplicationContext reactApplicationContext) {
        this.f17913c = (SensorManager) reactApplicationContext.getSystemService("sensor");
    }

    public int b() {
        return this.f17911a;
    }

    public void c() {
        this.f17913c.unregisterListener(this.f17912b);
    }

    public void d() {
        SensorManager sensorManager = this.f17913c;
        sensorManager.registerListener(this.f17912b, sensorManager.getDefaultSensor(1), 3);
    }

    public void e(f fVar) {
        this.f17914d = fVar;
    }

    public void f() {
        this.f17914d = null;
    }
}