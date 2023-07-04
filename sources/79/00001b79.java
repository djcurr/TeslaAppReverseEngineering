package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.f;
import java.io.IOException;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public interface DrmSession {

    /* loaded from: classes3.dex */
    public static class DrmSessionException extends IOException {
        public DrmSessionException(Throwable th2) {
            super(th2);
        }
    }

    static void f(DrmSession drmSession, DrmSession drmSession2) {
        if (drmSession == drmSession2) {
            return;
        }
        if (drmSession2 != null) {
            drmSession2.a(null);
        }
        if (drmSession != null) {
            drmSession.b(null);
        }
    }

    void a(f.a aVar);

    void b(f.a aVar);

    UUID c();

    default boolean d() {
        return false;
    }

    hi.m e();

    Map<String, String> g();

    DrmSessionException getError();

    int getState();
}