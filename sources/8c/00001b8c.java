package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.f;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes3.dex */
public final class i implements DrmSession {

    /* renamed from: a  reason: collision with root package name */
    private final DrmSession.DrmSessionException f13363a;

    public i(DrmSession.DrmSessionException drmSessionException) {
        this.f13363a = (DrmSession.DrmSessionException) ak.a.e(drmSessionException);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void a(f.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public void b(f.a aVar) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID c() {
        return ci.b.f9153a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public boolean d() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public hi.m e() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public Map<String, String> g() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public DrmSession.DrmSessionException getError() {
        return this.f13363a;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public int getState() {
        return 1;
    }
}