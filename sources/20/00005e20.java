package com.swmansion.reanimated.sensor;

import android.util.Log;
import com.facebook.react.bridge.ReactApplicationContext;
import com.swmansion.reanimated.NativeProxy;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class ReanimatedSensorContainer {
    private final WeakReference<ReactApplicationContext> reactContext;
    private int nextSensorId = 0;
    private final HashMap<Integer, ReanimatedSensor> sensors = new HashMap<>();

    public ReanimatedSensorContainer(WeakReference<ReactApplicationContext> weakReference) {
        this.reactContext = weakReference;
    }

    public int registerSensor(ReanimatedSensorType reanimatedSensorType, int i11, NativeProxy.SensorSetter sensorSetter) {
        if (new ReanimatedSensor(this.reactContext, reanimatedSensorType, i11, sensorSetter).initialize()) {
            int i12 = this.nextSensorId;
            this.nextSensorId = i12 + 1;
            this.sensors.put(Integer.valueOf(i12), new ReanimatedSensor(this.reactContext, reanimatedSensorType, i11, sensorSetter));
            return i12;
        }
        return -1;
    }

    public void unregisterSensor(int i11) {
        ReanimatedSensor reanimatedSensor = this.sensors.get(Integer.valueOf(i11));
        if (reanimatedSensor != null) {
            reanimatedSensor.cancel();
            this.sensors.remove(Integer.valueOf(i11));
            return;
        }
        Log.e("Reanimated", "Tried to unregister nonexistent sensor");
    }
}