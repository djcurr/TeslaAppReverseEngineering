package com.facebook.yoga;

/* loaded from: classes3.dex */
public enum k {
    COLUMN(0),
    COLUMN_REVERSE(1),
    ROW(2),
    ROW_REVERSE(3);
    
    private final int mIntValue;

    k(int i11) {
        this.mIntValue = i11;
    }

    public static k fromInt(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return ROW_REVERSE;
                    }
                    throw new IllegalArgumentException("Unknown enum value: " + i11);
                }
                return ROW;
            }
            return COLUMN_REVERSE;
        }
        return COLUMN;
    }

    public int intValue() {
        return this.mIntValue;
    }
}