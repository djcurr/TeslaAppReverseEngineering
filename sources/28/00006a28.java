package expo.modules.interfaces.sensors;

import android.hardware.SensorEventListener2;

/* loaded from: classes5.dex */
public interface SensorServiceInterface {
    SensorServiceSubscriptionInterface createSubscriptionForListener(SensorEventListener2 sensorEventListener2);
}