package com.google.android.datatransport.runtime.backends;

/* loaded from: classes3.dex */
public abstract class b {

    /* loaded from: classes3.dex */
    public enum a {
        OK,
        TRANSIENT_ERROR,
        FATAL_ERROR,
        INVALID_PAYLOAD
    }

    public static b a() {
        return new com.google.android.datatransport.runtime.backends.a(a.FATAL_ERROR, -1L);
    }

    public static b d() {
        return new com.google.android.datatransport.runtime.backends.a(a.INVALID_PAYLOAD, -1L);
    }

    public static b e(long j11) {
        return new com.google.android.datatransport.runtime.backends.a(a.OK, j11);
    }

    public static b f() {
        return new com.google.android.datatransport.runtime.backends.a(a.TRANSIENT_ERROR, -1L);
    }

    public abstract long b();

    public abstract a c();
}