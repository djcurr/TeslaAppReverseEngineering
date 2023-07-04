package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.i0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public final class g implements h0 {

    /* renamed from: a  reason: collision with root package name */
    private final float f13414a;

    /* renamed from: b  reason: collision with root package name */
    private final float f13415b;

    /* renamed from: c  reason: collision with root package name */
    private final long f13416c;

    /* renamed from: d  reason: collision with root package name */
    private final float f13417d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13418e;

    /* renamed from: f  reason: collision with root package name */
    private final long f13419f;

    /* renamed from: g  reason: collision with root package name */
    private final float f13420g;

    /* renamed from: h  reason: collision with root package name */
    private long f13421h;

    /* renamed from: i  reason: collision with root package name */
    private long f13422i;

    /* renamed from: j  reason: collision with root package name */
    private long f13423j;

    /* renamed from: k  reason: collision with root package name */
    private long f13424k;

    /* renamed from: l  reason: collision with root package name */
    private long f13425l;

    /* renamed from: m  reason: collision with root package name */
    private long f13426m;

    /* renamed from: n  reason: collision with root package name */
    private float f13427n;

    /* renamed from: o  reason: collision with root package name */
    private float f13428o;

    /* renamed from: p  reason: collision with root package name */
    private float f13429p;

    /* renamed from: q  reason: collision with root package name */
    private long f13430q;

    /* renamed from: r  reason: collision with root package name */
    private long f13431r;

    /* renamed from: s  reason: collision with root package name */
    private long f13432s;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f13433a = 0.97f;

        /* renamed from: b  reason: collision with root package name */
        private float f13434b = 1.03f;

        /* renamed from: c  reason: collision with root package name */
        private long f13435c = 1000;

        /* renamed from: d  reason: collision with root package name */
        private float f13436d = 1.0E-7f;

        /* renamed from: e  reason: collision with root package name */
        private long f13437e = ci.b.c(20);

        /* renamed from: f  reason: collision with root package name */
        private long f13438f = ci.b.c(500);

        /* renamed from: g  reason: collision with root package name */
        private float f13439g = 0.999f;

        public g a() {
            return new g(this.f13433a, this.f13434b, this.f13435c, this.f13436d, this.f13437e, this.f13438f, this.f13439g);
        }
    }

    private void f(long j11) {
        long j12 = this.f13431r + (this.f13432s * 3);
        if (this.f13426m > j12) {
            float c11 = (float) ci.b.c(this.f13416c);
            this.f13426m = fl.f.b(j12, this.f13423j, this.f13426m - (((this.f13429p - 1.0f) * c11) + ((this.f13427n - 1.0f) * c11)));
            return;
        }
        long s11 = ak.k0.s(j11 - (Math.max((float) BitmapDescriptorFactory.HUE_RED, this.f13429p - 1.0f) / this.f13417d), this.f13426m, j12);
        this.f13426m = s11;
        long j13 = this.f13425l;
        if (j13 == -9223372036854775807L || s11 <= j13) {
            return;
        }
        this.f13426m = j13;
    }

    private void g() {
        long j11 = this.f13421h;
        if (j11 != -9223372036854775807L) {
            long j12 = this.f13422i;
            if (j12 != -9223372036854775807L) {
                j11 = j12;
            }
            long j13 = this.f13424k;
            if (j13 != -9223372036854775807L && j11 < j13) {
                j11 = j13;
            }
            long j14 = this.f13425l;
            if (j14 != -9223372036854775807L && j11 > j14) {
                j11 = j14;
            }
        } else {
            j11 = -9223372036854775807L;
        }
        if (this.f13423j == j11) {
            return;
        }
        this.f13423j = j11;
        this.f13426m = j11;
        this.f13431r = -9223372036854775807L;
        this.f13432s = -9223372036854775807L;
        this.f13430q = -9223372036854775807L;
    }

    private static long h(long j11, long j12, float f11) {
        return (((float) j11) * f11) + ((1.0f - f11) * ((float) j12));
    }

    private void i(long j11, long j12) {
        long j13 = j11 - j12;
        long j14 = this.f13431r;
        if (j14 == -9223372036854775807L) {
            this.f13431r = j13;
            this.f13432s = 0L;
            return;
        }
        long max = Math.max(j13, h(j14, j13, this.f13420g));
        this.f13431r = max;
        this.f13432s = h(this.f13432s, Math.abs(j13 - max), this.f13420g);
    }

    @Override // com.google.android.exoplayer2.h0
    public void a(i0.f fVar) {
        this.f13421h = ci.b.c(fVar.f13547a);
        this.f13424k = ci.b.c(fVar.f13548b);
        this.f13425l = ci.b.c(fVar.f13549c);
        float f11 = fVar.f13550d;
        if (f11 == -3.4028235E38f) {
            f11 = this.f13414a;
        }
        this.f13428o = f11;
        float f12 = fVar.f13551e;
        if (f12 == -3.4028235E38f) {
            f12 = this.f13415b;
        }
        this.f13427n = f12;
        g();
    }

    @Override // com.google.android.exoplayer2.h0
    public float b(long j11, long j12) {
        if (this.f13421h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j11, j12);
        if (this.f13430q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f13430q < this.f13416c) {
            return this.f13429p;
        }
        this.f13430q = SystemClock.elapsedRealtime();
        f(j11);
        long j13 = j11 - this.f13426m;
        if (Math.abs(j13) < this.f13418e) {
            this.f13429p = 1.0f;
        } else {
            this.f13429p = ak.k0.q((this.f13417d * ((float) j13)) + 1.0f, this.f13428o, this.f13427n);
        }
        return this.f13429p;
    }

    @Override // com.google.android.exoplayer2.h0
    public long c() {
        return this.f13426m;
    }

    @Override // com.google.android.exoplayer2.h0
    public void d() {
        long j11 = this.f13426m;
        if (j11 == -9223372036854775807L) {
            return;
        }
        long j12 = j11 + this.f13419f;
        this.f13426m = j12;
        long j13 = this.f13425l;
        if (j13 != -9223372036854775807L && j12 > j13) {
            this.f13426m = j13;
        }
        this.f13430q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.h0
    public void e(long j11) {
        this.f13422i = j11;
        g();
    }

    private g(float f11, float f12, long j11, float f13, long j12, long j13, float f14) {
        this.f13414a = f11;
        this.f13415b = f12;
        this.f13416c = j11;
        this.f13417d = f13;
        this.f13418e = j12;
        this.f13419f = j13;
        this.f13420g = f14;
        this.f13421h = -9223372036854775807L;
        this.f13422i = -9223372036854775807L;
        this.f13424k = -9223372036854775807L;
        this.f13425l = -9223372036854775807L;
        this.f13428o = f11;
        this.f13427n = f12;
        this.f13429p = 1.0f;
        this.f13430q = -9223372036854775807L;
        this.f13423j = -9223372036854775807L;
        this.f13426m = -9223372036854775807L;
        this.f13431r = -9223372036854775807L;
        this.f13432s = -9223372036854775807L;
    }
}