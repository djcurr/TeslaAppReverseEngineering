package com.facebook.yoga;

/* loaded from: classes3.dex */
public enum j {
    LEFT(0),
    TOP(1),
    RIGHT(2),
    BOTTOM(3),
    START(4),
    END(5),
    HORIZONTAL(6),
    VERTICAL(7),
    ALL(8);
    
    private final int mIntValue;

    j(int i11) {
        this.mIntValue = i11;
    }

    public static j fromInt(int i11) {
        switch (i11) {
            case 0:
                return LEFT;
            case 1:
                return TOP;
            case 2:
                return RIGHT;
            case 3:
                return BOTTOM;
            case 4:
                return START;
            case 5:
                return END;
            case 6:
                return HORIZONTAL;
            case 7:
                return VERTICAL;
            case 8:
                return ALL;
            default:
                throw new IllegalArgumentException("Unknown enum value: " + i11);
        }
    }

    public int intValue() {
        return this.mIntValue;
    }
}