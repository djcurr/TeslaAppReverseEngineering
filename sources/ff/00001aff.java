package com.facebook.yoga;

/* loaded from: classes3.dex */
public enum w {
    NO_WRAP(0),
    WRAP(1),
    WRAP_REVERSE(2);
    
    private final int mIntValue;

    w(int i11) {
        this.mIntValue = i11;
    }

    public static w fromInt(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return WRAP_REVERSE;
                }
                throw new IllegalArgumentException("Unknown enum value: " + i11);
            }
            return WRAP;
        }
        return NO_WRAP;
    }

    public int intValue() {
        return this.mIntValue;
    }
}