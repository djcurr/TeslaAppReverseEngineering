package expo.modules.interfaces.sensors;

/* loaded from: classes5.dex */
public interface SensorServiceSubscriptionInterface {
    Long getUpdateInterval();

    boolean isEnabled();

    void release();

    void setUpdateInterval(long j11);

    void start();

    void stop();
}