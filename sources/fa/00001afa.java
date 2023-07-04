package com.facebook.yoga;

/* loaded from: classes3.dex */
public enum s {
    VISIBLE(0),
    HIDDEN(1),
    SCROLL(2);
    
    private final int mIntValue;

    s(int i11) {
        this.mIntValue = i11;
    }

    public static s fromInt(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    return SCROLL;
                }
                throw new IllegalArgumentException("Unknown enum value: " + i11);
            }
            return HIDDEN;
        }
        return VISIBLE;
    }

    public int intValue() {
        return this.mIntValue;
    }
}