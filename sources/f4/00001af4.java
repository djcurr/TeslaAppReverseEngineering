package com.facebook.yoga;

/* loaded from: classes3.dex */
public enum n {
    UNDEFINED(0),
    EXACTLY(1),
    AT_MOST(2);
    
    private final int mIntValue;

    n(int i11) {
        this.mIntValue = i11;
    }

    public static n fromInt(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return AT_MOST;
                }
                throw new IllegalArgumentException("Unknown enum value: " + i11);
            }
            return EXACTLY;
        }
        return UNDEFINED;
    }

    public int intValue() {
        return this.mIntValue;
    }
}