package com.facebook.yoga;

/* loaded from: classes3.dex */
public enum l {
    FLEX_START(0),
    CENTER(1),
    FLEX_END(2),
    SPACE_BETWEEN(3),
    SPACE_AROUND(4),
    SPACE_EVENLY(5);
    
    private final int mIntValue;

    l(int i11) {
        this.mIntValue = i11;
    }

    public static l fromInt(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return SPACE_EVENLY;
                            }
                            throw new IllegalArgumentException("Unknown enum value: " + i11);
                        }
                        return SPACE_AROUND;
                    }
                    return SPACE_BETWEEN;
                }
                return FLEX_END;
            }
            return CENTER;
        }
        return FLEX_START;
    }

    public int intValue() {
        return this.mIntValue;
    }
}