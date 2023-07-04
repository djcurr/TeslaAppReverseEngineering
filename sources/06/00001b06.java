package com.fasterxml.jackson.core;

/* loaded from: classes3.dex */
public enum c {
    AUTO_CLOSE_SOURCE(true),
    ALLOW_COMMENTS(false),
    ALLOW_YAML_COMMENTS(false),
    ALLOW_UNQUOTED_FIELD_NAMES(false),
    ALLOW_SINGLE_QUOTES(false),
    ALLOW_UNQUOTED_CONTROL_CHARS(false),
    ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER(false),
    ALLOW_NUMERIC_LEADING_ZEROS(false),
    ALLOW_NON_NUMERIC_NUMBERS(false),
    STRICT_DUPLICATE_DETECTION(false),
    IGNORE_UNDEFINED(false);
    
    private final boolean _defaultState;
    private final int _mask = 1 << ordinal();

    c(boolean z11) {
        this._defaultState = z11;
    }

    public static int collectDefaults() {
        c[] values;
        int i11 = 0;
        for (c cVar : values()) {
            if (cVar.enabledByDefault()) {
                i11 |= cVar.getMask();
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