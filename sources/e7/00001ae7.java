package com.facebook.yoga;

/* loaded from: classes3.dex */
public enum a {
    AUTO(0),
    FLEX_START(1),
    CENTER(2),
    FLEX_END(3),
    STRETCH(4),
    BASELINE(5),
    SPACE_BETWEEN(6),
    SPACE_AROUND(7);
    
    private final int mIntValue;

    a(int i11) {
        this.mIntValue = i11;
    }

    public static a fromInt(int i11) {
        switch (i11) {
            case 0:
                return AUTO;
            case 1:
                return FLEX_START;
            case 2:
                return CENTER;
            case 3:
                return FLEX_END;
            case 4:
                return STRETCH;
            case 5:
                return BASELINE;
            case 6:
                return SPACE_BETWEEN;
            case 7:
                return SPACE_AROUND;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i11);
        }
    }

    public int intValue() {
        return this.mIntValue;
    }
}