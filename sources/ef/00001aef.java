package com.facebook.yoga;

/* loaded from: classes3.dex */
public enum i {
    FLEX(0),
    NONE(1);
    
    private final int mIntValue;

    i(int i11) {
        this.mIntValue = i11;
    }

    public static i fromInt(int i11) {
        if (i11 != 0) {
            if (i11 == 1) {
                return NONE;
            }
            throw new IllegalArgumentException("Unknown enum value: " + i11);
        }
        return FLEX;
    }

    public int intValue() {
        return this.mIntValue;
    }
}