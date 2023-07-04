package com.google.android.exoplayer2.audio;

import ak.k0;
import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes3.dex */
final class c {
    private long A;
    private long B;
    private long C;
    private boolean D;
    private long E;
    private long F;

    /* renamed from: a  reason: collision with root package name */
    private final a f13115a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f13116b;

    /* renamed from: c  reason: collision with root package name */
    private AudioTrack f13117c;

    /* renamed from: d  reason: collision with root package name */
    private int f13118d;

    /* renamed from: e  reason: collision with root package name */
    private int f13119e;

    /* renamed from: f  reason: collision with root package name */
    private b f13120f;

    /* renamed from: g  reason: collision with root package name */
    private int f13121g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f13122h;

    /* renamed from: i  reason: collision with root package name */
    private long f13123i;

    /* renamed from: j  reason: collision with root package name */
    private float f13124j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f13125k;

    /* renamed from: l  reason: collision with root package name */
    private long f13126l;

    /* renamed from: m  reason: collision with root package name */
    private long f13127m;

    /* renamed from: n  reason: collision with root package name */
    private Method f13128n;

    /* renamed from: o  reason: collision with root package name */
    private long f13129o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13130p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f13131q;

    /* renamed from: r  reason: collision with root package name */
    private long f13132r;

    /* renamed from: s  reason: collision with root package name */
    private long f13133s;

    /* renamed from: t  reason: collision with root package name */
    private long f13134t;

    /* renamed from: u  reason: collision with root package name */
    private long f13135u;

    /* renamed from: v  reason: collision with root package name */
    private int f13136v;

    /* renamed from: w  reason: collision with root package name */
    private int f13137w;

    /* renamed from: x  reason: collision with root package name */
    private long f13138x;

    /* renamed from: y  reason: collision with root package name */
    private long f13139y;

    /* renamed from: z  reason: collision with root package name */
    private long f13140z;

    /* loaded from: classes3.dex */
    public interface a {
        void a(int i11, long j11);

        void b(long j11);

        void c(long j11);

        void d(long j11, long j12, long j13, long j14);

        void e(long j11, long j12, long j13, long j14);
    }

    public c(a aVar) {
        this.f13115a = (a) ak.a.e(aVar);
        if (k0.f477a >= 18) {
            try {
                this.f13128n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f13116b = new long[10];
    }

    private boolean a() {
        return this.f13122h && ((AudioTrack) ak.a.e(this.f13117c)).getPlayState() == 2 && f() == 0;
    }

    private long b(long j11) {
        return (j11 * 1000000) / this.f13121g;
    }

    private long f() {
        AudioTrack audioTrack = (AudioTrack) ak.a.e(this.f13117c);
        if (this.f13138x != -9223372036854775807L) {
            return Math.min(this.A, this.f13140z + ((((SystemClock.elapsedRealtime() * 1000) - this.f13138x) * this.f13121g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.f13122h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f13135u = this.f13133s;
            }
            playbackHeadPosition += this.f13135u;
        }
        if (k0.f477a <= 29) {
            if (playbackHeadPosition == 0 && this.f13133s > 0 && playState == 3) {
                if (this.f13139y == -9223372036854775807L) {
                    this.f13139y = SystemClock.elapsedRealtime();
                }
                return this.f13133s;
            }
            this.f13139y = -9223372036854775807L;
        }
        if (this.f13133s > playbackHeadPosition) {
            this.f13134t++;
        }
        this.f13133s = playbackHeadPosition;
        return playbackHeadPosition + (this.f13134t << 32);
    }

    private long g() {
        return b(f());
    }

    private void m(long j11, long j12) {
        b bVar = (b) ak.a.e(this.f13120f);
        if (bVar.e(j11)) {
            long c11 = bVar.c();
            long b11 = bVar.b();
            if (Math.abs(c11 - j11) > 5000000) {
                this.f13115a.e(b11, c11, j11, j12);
                bVar.f();
            } else if (Math.abs(b(b11) - j12) > 5000000) {
                this.f13115a.d(b11, c11, j11, j12);
                bVar.f();
            } else {
                bVar.a();
            }
        }
    }

    private void n() {
        long g11 = g();
        if (g11 == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        if (nanoTime - this.f13127m >= 30000) {
            long[] jArr = this.f13116b;
            int i11 = this.f13136v;
            jArr[i11] = g11 - nanoTime;
            this.f13136v = (i11 + 1) % 10;
            int i12 = this.f13137w;
            if (i12 < 10) {
                this.f13137w = i12 + 1;
            }
            this.f13127m = nanoTime;
            this.f13126l = 0L;
            int i13 = 0;
            while (true) {
                int i14 = this.f13137w;
                if (i13 >= i14) {
                    break;
                }
                this.f13126l += this.f13116b[i13] / i14;
                i13++;
            }
        }
        if (this.f13122h) {
            return;
        }
        m(nanoTime, g11);
        o(nanoTime);
    }

    private void o(long j11) {
        Method method;
        if (!this.f13131q || (method = this.f13128n) == null || j11 - this.f13132r < 500000) {
            return;
        }
        try {
            long intValue = (((Integer) k0.j((Integer) method.invoke(ak.a.e(this.f13117c), new Object[0]))).intValue() * 1000) - this.f13123i;
            this.f13129o = intValue;
            long max = Math.max(intValue, 0L);
            this.f13129o = max;
            if (max > 5000000) {
                this.f13115a.c(max);
                this.f13129o = 0L;
            }
        } catch (Exception unused) {
            this.f13128n = null;
        }
        this.f13132r = j11;
    }

    private static boolean p(int i11) {
        return k0.f477a < 23 && (i11 == 5 || i11 == 6);
    }

    private void s() {
        this.f13126l = 0L;
        this.f13137w = 0;
        this.f13136v = 0;
        this.f13127m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f13125k = false;
    }

    public int c(long j11) {
        return this.f13119e - ((int) (j11 - (f() * this.f13118d)));
    }

    public long d(boolean z11) {
        long j11;
        if (((AudioTrack) ak.a.e(this.f13117c)).getPlayState() == 3) {
            n();
        }
        long nanoTime = System.nanoTime() / 1000;
        b bVar = (b) ak.a.e(this.f13120f);
        boolean d11 = bVar.d();
        if (d11) {
            j11 = b(bVar.b()) + k0.W(nanoTime - bVar.c(), this.f13124j);
        } else {
            if (this.f13137w == 0) {
                j11 = g();
            } else {
                j11 = this.f13126l + nanoTime;
            }
            if (!z11) {
                j11 = Math.max(0L, j11 - this.f13129o);
            }
        }
        if (this.D != d11) {
            this.F = this.C;
            this.E = this.B;
        }
        long j12 = nanoTime - this.F;
        if (j12 < 1000000) {
            long j13 = (j12 * 1000) / 1000000;
            j11 = ((j11 * j13) + ((1000 - j13) * (this.E + k0.W(j12, this.f13124j)))) / 1000;
        }
        if (!this.f13125k) {
            long j14 = this.B;
            if (j11 > j14) {
                this.f13125k = true;
                this.f13115a.b(System.currentTimeMillis() - ci.b.d(k0.d0(ci.b.d(j11 - j14), this.f13124j)));
            }
        }
        this.C = nanoTime;
        this.B = j11;
        this.D = d11;
        return j11;
    }

    public long e(long j11) {
        return ci.b.d(b(j11 - f()));
    }

    public void h(long j11) {
        this.f13140z = f();
        this.f13138x = SystemClock.elapsedRealtime() * 1000;
        this.A = j11;
    }

    public boolean i(long j11) {
        return j11 > f() || a();
    }

    public boolean j() {
        return ((AudioTrack) ak.a.e(this.f13117c)).getPlayState() == 3;
    }

    public boolean k(long j11) {
        return this.f13139y != -9223372036854775807L && j11 > 0 && SystemClock.elapsedRealtime() - this.f13139y >= 200;
    }

    public boolean l(long j11) {
        int playState = ((AudioTrack) ak.a.e(this.f13117c)).getPlayState();
        if (this.f13122h) {
            if (playState == 2) {
                this.f13130p = false;
                return false;
            } else if (playState == 1 && f() == 0) {
                return false;
            }
        }
        boolean z11 = this.f13130p;
        boolean i11 = i(j11);
        this.f13130p = i11;
        if (z11 && !i11 && playState != 1) {
            this.f13115a.a(this.f13119e, ci.b.d(this.f13123i));
        }
        return true;
    }

    public boolean q() {
        s();
        if (this.f13138x == -9223372036854775807L) {
            ((b) ak.a.e(this.f13120f)).g();
            return true;
        }
        return false;
    }

    public void r() {
        s();
        this.f13117c = null;
        this.f13120f = null;
    }

    public void t(AudioTrack audioTrack, boolean z11, int i11, int i12, int i13) {
        this.f13117c = audioTrack;
        this.f13118d = i12;
        this.f13119e = i13;
        this.f13120f = new b(audioTrack);
        this.f13121g = audioTrack.getSampleRate();
        this.f13122h = z11 && p(i11);
        boolean p02 = k0.p0(i11);
        this.f13131q = p02;
        this.f13123i = p02 ? b(i13 / i12) : -9223372036854775807L;
        this.f13133s = 0L;
        this.f13134t = 0L;
        this.f13135u = 0L;
        this.f13130p = false;
        this.f13138x = -9223372036854775807L;
        this.f13139y = -9223372036854775807L;
        this.f13132r = 0L;
        this.f13129o = 0L;
        this.f13124j = 1.0f;
    }

    public void u(float f11) {
        this.f13124j = f11;
        b bVar = this.f13120f;
        if (bVar != null) {
            bVar.g();
        }
    }

    public void v() {
        ((b) ak.a.e(this.f13120f)).g();
    }
}