package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class f implements com.google.android.exoplayer2.upstream.a {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f13942a;

    /* renamed from: b  reason: collision with root package name */
    private final int f13943b;

    /* renamed from: c  reason: collision with root package name */
    private final a f13944c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f13945d;

    /* renamed from: e  reason: collision with root package name */
    private int f13946e;

    /* loaded from: classes3.dex */
    public interface a {
        void c(ak.v vVar);
    }

    public f(com.google.android.exoplayer2.upstream.a aVar, int i11, a aVar2) {
        ak.a.a(i11 > 0);
        this.f13942a = aVar;
        this.f13943b = i11;
        this.f13944c = aVar2;
        this.f13945d = new byte[1];
        this.f13946e = i11;
    }

    private boolean o() {
        if (this.f13942a.read(this.f13945d, 0, 1) == -1) {
            return false;
        }
        int i11 = (this.f13945d[0] & 255) << 4;
        if (i11 == 0) {
            return true;
        }
        byte[] bArr = new byte[i11];
        int i12 = i11;
        int i13 = 0;
        while (i12 > 0) {
            int read = this.f13942a.read(bArr, i13, i12);
            if (read == -1) {
                return false;
            }
            i13 += read;
            i12 -= read;
        }
        while (i11 > 0 && bArr[i11 - 1] == 0) {
            i11--;
        }
        if (i11 > 0) {
            this.f13944c.c(new ak.v(bArr, i11));
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void b(zj.n nVar) {
        ak.a.e(nVar);
        this.f13942a.b(nVar);
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Map<String, List<String>> c() {
        return this.f13942a.c();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public long i(com.google.android.exoplayer2.upstream.b bVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.upstream.a
    public Uri m() {
        return this.f13942a.m();
    }

    @Override // zj.f
    public int read(byte[] bArr, int i11, int i12) {
        if (this.f13946e == 0) {
            if (!o()) {
                return -1;
            }
            this.f13946e = this.f13943b;
        }
        int read = this.f13942a.read(bArr, i11, Math.min(this.f13946e, i12));
        if (read != -1) {
            this.f13946e -= read;
        }
        return read;
    }
}