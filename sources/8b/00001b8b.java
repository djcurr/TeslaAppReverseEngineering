package com.google.android.exoplayer2.drm;

import android.media.MediaDrmException;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.j;
import hi.q;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h implements j {
    @Override // com.google.android.exoplayer2.drm.j
    public Class<q> a() {
        return q.class;
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void b() {
    }

    @Override // com.google.android.exoplayer2.drm.j
    public Map<String, String> c(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.j
    public hi.m d(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.j
    public j.e e() {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.j
    public byte[] f() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void g(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void h(j.c cVar) {
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void i(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void j(byte[] bArr) {
    }

    @Override // com.google.android.exoplayer2.drm.j
    public byte[] k(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.j
    public j.b l(byte[] bArr, List<e.b> list, int i11, HashMap<String, String> hashMap) {
        throw new IllegalStateException();
    }

    @Override // com.google.android.exoplayer2.drm.j
    public void release() {
    }
}