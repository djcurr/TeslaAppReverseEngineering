package com.fasterxml.jackson.core;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class a implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    protected static final int f12958a = EnumC0242a.collectDefaults();

    /* renamed from: b  reason: collision with root package name */
    protected static final int f12959b = c.collectDefaults();

    /* renamed from: c  reason: collision with root package name */
    protected static final int f12960c = b.collectDefaults();

    /* renamed from: d  reason: collision with root package name */
    private static final ah.c f12961d = dh.a.f23998a;

    /* renamed from: com.fasterxml.jackson.core.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public enum EnumC0242a {
        INTERN_FIELD_NAMES(true),
        CANONICALIZE_FIELD_NAMES(true),
        FAIL_ON_SYMBOL_HASH_OVERFLOW(true),
        USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING(true);
        
        private final boolean _defaultState;

        EnumC0242a(boolean z11) {
            this._defaultState = z11;
        }

        public static int collectDefaults() {
            EnumC0242a[] values;
            int i11 = 0;
            for (EnumC0242a enumC0242a : values()) {
                if (enumC0242a.enabledByDefault()) {
                    i11 |= enumC0242a.getMask();
                }
            }
            return i11;
        }

        public boolean enabledByDefault() {
            return this._defaultState;
        }

        public boolean enabledIn(int i11) {
            return (i11 & getMask()) != 0;
        }

        public int getMask() {
            return 1 << ordinal();
        }
    }

    static {
        new ThreadLocal();
    }

    public a() {
        this(null);
    }

    public a(ah.b bVar) {
        ch.c.b();
        ch.a.c();
        ch.b.a();
    }
}