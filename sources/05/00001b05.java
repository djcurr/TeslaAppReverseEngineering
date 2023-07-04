package com.fasterxml.jackson.core;

/* loaded from: classes3.dex */
public enum b {
    AUTO_CLOSE_TARGET(true),
    AUTO_CLOSE_JSON_CONTENT(true),
    FLUSH_PASSED_TO_STREAM(true),
    QUOTE_FIELD_NAMES(true),
    QUOTE_NON_NUMERIC_NUMBERS(true),
    WRITE_NUMBERS_AS_STRINGS(false),
    WRITE_BIGDECIMAL_AS_PLAIN(false),
    ESCAPE_NON_ASCII(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNKNOWN(false);
    
    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    b(boolean z11) {
        this._defaultState = z11;
    }

    public static int collectDefaults() {
        b[] values;
        int i11 = 0;
        for (b bVar : values()) {
            if (bVar.enabledByDefault()) {
                i11 |= bVar.getMask();
            }
        }
        return i11;
    }

    public boolean enabledByDefault() {
        return this._defaultState;
    }

    public boolean enabledIn(int i11) {
        return (i11 & this._mask) != 0;
    }

    public int getMask() {
        return this._mask;
    }
}