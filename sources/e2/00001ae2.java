package com.facebook.yoga;

@xf.a
/* loaded from: classes3.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);
    
    private final int mIntValue;

    YogaLogLevel(int i11) {
        this.mIntValue = i11;
    }

    @xf.a
    public static YogaLogLevel fromInt(int i11) {
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 == 5) {
                                return FATAL;
                            }
                            throw new IllegalArgumentException("Unknown enum value: " + i11);
                        }
                        return VERBOSE;
                    }
                    return DEBUG;
                }
                return INFO;
            }
            return WARN;
        }
        return ERROR;
    }

    public int intValue() {
        return this.mIntValue;
    }
}