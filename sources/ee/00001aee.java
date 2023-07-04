package com.facebook.yoga;

/* loaded from: classes3.dex */
public enum h {
    INHERIT(0),
    LTR(1),
    RTL(2);
    
    private final int mIntValue;

    h(int i11) {
        this.mIntValue = i11;
    }

    public static h fromInt(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return RTL;
                }
                throw new IllegalArgumentException("Unknown enum value: " + i11);
            }
            return LTR;
        }
        return INHERIT;
    }

    public int intValue() {
        return this.mIntValue;
    }
}