package com.facebook.yoga;

/* loaded from: classes3.dex */
public enum t {
    STATIC(0),
    RELATIVE(1),
    ABSOLUTE(2);
    
    private final int mIntValue;

    t(int i11) {
        this.mIntValue = i11;
    }

    public static t fromInt(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return ABSOLUTE;
                }
                throw new IllegalArgumentException("Unknown enum value: " + i11);
            }
            return RELATIVE;
        }
        return STATIC;
    }

    public int intValue() {
        return this.mIntValue;
    }
}