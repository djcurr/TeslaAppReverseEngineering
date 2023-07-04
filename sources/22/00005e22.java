package com.swmansion.reanimated.sensor;

/* loaded from: classes6.dex */
public enum ReanimatedSensorType {
    ACCELEROMETER(1),
    GYROSCOPE(4),
    GRAVITY(9),
    MAGNETIC_FIELD(2),
    ROTATION_VECTOR(11);
    
    private final int type;

    ReanimatedSensorType(int i11) {
        this.type = i11;
    }

    public static ReanimatedSensorType getInstanceById(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            return ROTATION_VECTOR;
                        }
                        throw new IllegalArgumentException("[Reanimated] Unknown sensor type");
                    }
                    return MAGNETIC_FIELD;
                }
                return GRAVITY;
            }
            return GYROSCOPE;
        }
        return ACCELEROMETER;
    }

    public int getType() {
        return this.type;
    }
}