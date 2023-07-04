package com.google.android.exoplayer2;

import com.google.android.exoplayer2.z0;

/* loaded from: classes3.dex */
public abstract class e implements s0 {

    /* renamed from: a  reason: collision with root package name */
    protected final z0.c f13377a = new z0.c();

    private int F() {
        int z11 = z();
        if (z11 == 1) {
            return 0;
        }
        return z11;
    }

    public final int D() {
        long v11 = v();
        long k11 = k();
        if (v11 == -9223372036854775807L || k11 == -9223372036854775807L) {
            return 0;
        }
        if (k11 == 0) {
            return 100;
        }
        return ak.k0.r((int) ((v11 * 100) / k11), 0, 100);
    }

    public final long E() {
        z0 l11 = l();
        if (l11.q()) {
            return -9223372036854775807L;
        }
        return l11.n(g(), this.f13377a).d();
    }

    public final void G(long j11) {
        n(g(), j11);
    }

    @Override // com.google.android.exoplayer2.s0
    public final boolean e() {
        z0 l11 = l();
        return !l11.q() && l11.n(g(), this.f13377a).f14794h;
    }

    @Override // com.google.android.exoplayer2.s0
    public final boolean hasNext() {
        return y() != -1;
    }

    @Override // com.google.android.exoplayer2.s0
    public final boolean hasPrevious() {
        return u() != -1;
    }

    @Override // com.google.android.exoplayer2.s0
    public final boolean isPlaying() {
        return w() == 3 && o() && j() == 0;
    }

    @Override // com.google.android.exoplayer2.s0
    public final int u() {
        z0 l11 = l();
        if (l11.q()) {
            return -1;
        }
        return l11.l(g(), F(), A());
    }

    @Override // com.google.android.exoplayer2.s0
    public final int y() {
        z0 l11 = l();
        if (l11.q()) {
            return -1;
        }
        return l11.e(g(), F(), A());
    }
}