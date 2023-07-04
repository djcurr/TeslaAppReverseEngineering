package com.google.android.exoplayer2.source.dash;

import ak.k0;
import ci.i;
import ci.j;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import fj.r;

/* loaded from: classes3.dex */
final class d implements r {

    /* renamed from: a  reason: collision with root package name */
    private final i f13914a;

    /* renamed from: c  reason: collision with root package name */
    private long[] f13916c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f13917d;

    /* renamed from: e  reason: collision with root package name */
    private jj.e f13918e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13919f;

    /* renamed from: g  reason: collision with root package name */
    private int f13920g;

    /* renamed from: b  reason: collision with root package name */
    private final yi.c f13915b = new yi.c();

    /* renamed from: h  reason: collision with root package name */
    private long f13921h = -9223372036854775807L;

    public d(jj.e eVar, i iVar, boolean z11) {
        this.f13914a = iVar;
        this.f13918e = eVar;
        this.f13916c = eVar.f33830b;
        d(eVar, z11);
    }

    @Override // fj.r
    public void a() {
    }

    public String b() {
        return this.f13918e.a();
    }

    public void c(long j11) {
        boolean z11 = true;
        int e11 = k0.e(this.f13916c, j11, true, false);
        this.f13920g = e11;
        if (!this.f13917d || e11 != this.f13916c.length) {
            z11 = false;
        }
        if (!z11) {
            j11 = -9223372036854775807L;
        }
        this.f13921h = j11;
    }

    public void d(jj.e eVar, boolean z11) {
        int i11 = this.f13920g;
        long j11 = i11 == 0 ? -9223372036854775807L : this.f13916c[i11 - 1];
        this.f13917d = z11;
        this.f13918e = eVar;
        long[] jArr = eVar.f33830b;
        this.f13916c = jArr;
        long j12 = this.f13921h;
        if (j12 != -9223372036854775807L) {
            c(j12);
        } else if (j11 != -9223372036854775807L) {
            this.f13920g = k0.e(jArr, j11, false, false);
        }
    }

    @Override // fj.r
    public int f(j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11) {
        if (!z11 && this.f13919f) {
            int i11 = this.f13920g;
            if (i11 == this.f13916c.length) {
                if (this.f13917d) {
                    return -3;
                }
                decoderInputBuffer.o(4);
                return -4;
            }
            this.f13920g = i11 + 1;
            byte[] a11 = this.f13915b.a(this.f13918e.f33829a[i11]);
            decoderInputBuffer.r(a11.length);
            decoderInputBuffer.f13264c.put(a11);
            decoderInputBuffer.f13266e = this.f13916c[i11];
            decoderInputBuffer.o(1);
            return -4;
        }
        jVar.f9243b = this.f13914a;
        this.f13919f = true;
        return -5;
    }

    @Override // fj.r
    public boolean isReady() {
        return true;
    }

    @Override // fj.r
    public int p(long j11) {
        int max = Math.max(this.f13920g, k0.e(this.f13916c, j11, true, false));
        int i11 = max - this.f13920g;
        this.f13920g = max;
        return i11;
    }
}