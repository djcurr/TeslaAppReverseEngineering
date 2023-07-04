package com.facebook.yoga;

/* loaded from: classes3.dex */
public enum u {
    UNDEFINED(0),
    POINT(1),
    PERCENT(2),
    AUTO(3);
    
    private final int mIntValue;

    u(int i11) {
        this.mIntValue = i11;
    }

    public static u fromInt(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return AUTO;
                    }
                    throw new IllegalArgumentException("Unknown enum value: " + i11);
                }
                return PERCENT;
            }
            return POINT;
        }
        return UNDEFINED;
    }

    public int intValue() {
        return this.mIntValue;
    }
}