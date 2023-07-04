package com.google.android.exoplayer2.source;

import ak.k0;
import android.os.Looper;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.f;
import ji.x;

/* loaded from: classes3.dex */
public class t implements x {
    private boolean A;
    private ci.i B;
    private ci.i C;
    private ci.i D;
    private int E;
    private boolean F;
    private boolean G;
    private long H;
    private boolean I;

    /* renamed from: a  reason: collision with root package name */
    private final s f14331a;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.g f14333c;

    /* renamed from: d  reason: collision with root package name */
    private final f.a f14334d;

    /* renamed from: e  reason: collision with root package name */
    private final Looper f14335e;

    /* renamed from: f  reason: collision with root package name */
    private b f14336f;

    /* renamed from: g  reason: collision with root package name */
    private ci.i f14337g;

    /* renamed from: h  reason: collision with root package name */
    private DrmSession f14338h;

    /* renamed from: q  reason: collision with root package name */
    private int f14347q;

    /* renamed from: r  reason: collision with root package name */
    private int f14348r;

    /* renamed from: s  reason: collision with root package name */
    private int f14349s;

    /* renamed from: t  reason: collision with root package name */
    private int f14350t;

    /* renamed from: x  reason: collision with root package name */
    private boolean f14354x;

    /* renamed from: b  reason: collision with root package name */
    private final a f14332b = new a();

    /* renamed from: i  reason: collision with root package name */
    private int f14339i = 1000;

    /* renamed from: j  reason: collision with root package name */
    private int[] f14340j = new int[1000];

    /* renamed from: k  reason: collision with root package name */
    private long[] f14341k = new long[1000];

    /* renamed from: n  reason: collision with root package name */
    private long[] f14344n = new long[1000];

    /* renamed from: m  reason: collision with root package name */
    private int[] f14343m = new int[1000];

    /* renamed from: l  reason: collision with root package name */
    private int[] f14342l = new int[1000];

    /* renamed from: o  reason: collision with root package name */
    private x.a[] f14345o = new x.a[1000];

    /* renamed from: p  reason: collision with root package name */
    private ci.i[] f14346p = new ci.i[1000];

    /* renamed from: u  reason: collision with root package name */
    private long f14351u = Long.MIN_VALUE;

    /* renamed from: v  reason: collision with root package name */
    private long f14352v = Long.MIN_VALUE;

    /* renamed from: w  reason: collision with root package name */
    private long f14353w = Long.MIN_VALUE;

    /* renamed from: z  reason: collision with root package name */
    private boolean f14356z = true;

    /* renamed from: y  reason: collision with root package name */
    private boolean f14355y = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f14357a;

        /* renamed from: b  reason: collision with root package name */
        public long f14358b;

        /* renamed from: c  reason: collision with root package name */
        public x.a f14359c;

        a() {
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(ci.i iVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public t(zj.b bVar, Looper looper, com.google.android.exoplayer2.drm.g gVar, f.a aVar) {
        this.f14335e = looper;
        this.f14333c = gVar;
        this.f14334d = aVar;
        this.f14331a = new s(bVar);
    }

    private long A(int i11) {
        long j11 = Long.MIN_VALUE;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int C = C(i11 - 1);
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = Math.max(j11, this.f14344n[C]);
            if ((this.f14343m[C] & 1) != 0) {
                break;
            }
            C--;
            if (C == -1) {
                C = this.f14339i - 1;
            }
        }
        return j11;
    }

    private int C(int i11) {
        int i12 = this.f14349s + i11;
        int i13 = this.f14339i;
        return i12 < i13 ? i12 : i12 - i13;
    }

    private boolean G() {
        return this.f14350t != this.f14347q;
    }

    private boolean K(int i11) {
        DrmSession drmSession = this.f14338h;
        return drmSession == null || drmSession.getState() == 4 || ((this.f14343m[i11] & 1073741824) == 0 && this.f14338h.d());
    }

    private void M(ci.i iVar, ci.j jVar) {
        ci.i iVar2 = this.f14337g;
        boolean z11 = iVar2 == null;
        com.google.android.exoplayer2.drm.e eVar = z11 ? null : iVar2.f9208o;
        this.f14337g = iVar;
        com.google.android.exoplayer2.drm.e eVar2 = iVar.f9208o;
        com.google.android.exoplayer2.drm.g gVar = this.f14333c;
        jVar.f9243b = gVar != null ? iVar.b(gVar.c(iVar)) : iVar;
        jVar.f9242a = this.f14338h;
        if (this.f14333c == null) {
            return;
        }
        if (z11 || !k0.c(eVar, eVar2)) {
            DrmSession drmSession = this.f14338h;
            DrmSession b11 = this.f14333c.b((Looper) ak.a.e(this.f14335e), this.f14334d, iVar);
            this.f14338h = b11;
            jVar.f9242a = b11;
            if (drmSession != null) {
                drmSession.b(this.f14334d);
            }
        }
    }

    private synchronized int N(ci.j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11, boolean z12, a aVar) {
        decoderInputBuffer.f13265d = false;
        if (!G()) {
            if (!z12 && !this.f14354x) {
                ci.i iVar = this.C;
                if (iVar == null || (!z11 && iVar == this.f14337g)) {
                    return -3;
                }
                M((ci.i) ak.a.e(iVar), jVar);
                return -5;
            }
            decoderInputBuffer.o(4);
            return -4;
        }
        int C = C(this.f14350t);
        if (!z11 && this.f14346p[C] == this.f14337g) {
            if (!K(C)) {
                decoderInputBuffer.f13265d = true;
                return -3;
            }
            decoderInputBuffer.o(this.f14343m[C]);
            long j11 = this.f14344n[C];
            decoderInputBuffer.f13266e = j11;
            if (j11 < this.f14351u) {
                decoderInputBuffer.e(Integer.MIN_VALUE);
            }
            aVar.f14357a = this.f14342l[C];
            aVar.f14358b = this.f14341k[C];
            aVar.f14359c = this.f14345o[C];
            return -4;
        }
        M(this.f14346p[C], jVar);
        return -5;
    }

    private void S() {
        DrmSession drmSession = this.f14338h;
        if (drmSession != null) {
            drmSession.b(this.f14334d);
            this.f14338h = null;
            this.f14337g = null;
        }
    }

    private synchronized void V() {
        this.f14350t = 0;
        this.f14331a.n();
    }

    private synchronized boolean a0(ci.i iVar) {
        this.f14356z = false;
        if (k0.c(iVar, this.C)) {
            return false;
        }
        if (k0.c(iVar, this.D)) {
            this.C = this.D;
        } else {
            this.C = iVar;
        }
        ci.i iVar2 = this.C;
        this.F = ak.r.a(iVar2.f9205l, iVar2.f9202i);
        this.G = false;
        return true;
    }

    private synchronized boolean g(long j11) {
        if (this.f14347q == 0) {
            return j11 > this.f14352v;
        } else if (z() >= j11) {
            return false;
        } else {
            s(this.f14348r + i(j11));
            return true;
        }
    }

    private synchronized void h(long j11, int i11, long j12, int i12, x.a aVar) {
        int i13 = this.f14347q;
        if (i13 > 0) {
            int C = C(i13 - 1);
            ak.a.a(this.f14341k[C] + ((long) this.f14342l[C]) <= j12);
        }
        this.f14354x = (536870912 & i11) != 0;
        this.f14353w = Math.max(this.f14353w, j11);
        int C2 = C(this.f14347q);
        this.f14344n[C2] = j11;
        long[] jArr = this.f14341k;
        jArr[C2] = j12;
        this.f14342l[C2] = i12;
        this.f14343m[C2] = i11;
        this.f14345o[C2] = aVar;
        ci.i[] iVarArr = this.f14346p;
        ci.i iVar = this.C;
        iVarArr[C2] = iVar;
        this.f14340j[C2] = this.E;
        this.D = iVar;
        int i14 = this.f14347q + 1;
        this.f14347q = i14;
        int i15 = this.f14339i;
        if (i14 == i15) {
            int i16 = i15 + 1000;
            int[] iArr = new int[i16];
            long[] jArr2 = new long[i16];
            long[] jArr3 = new long[i16];
            int[] iArr2 = new int[i16];
            int[] iArr3 = new int[i16];
            x.a[] aVarArr = new x.a[i16];
            ci.i[] iVarArr2 = new ci.i[i16];
            int i17 = this.f14349s;
            int i18 = i15 - i17;
            System.arraycopy(jArr, i17, jArr2, 0, i18);
            System.arraycopy(this.f14344n, this.f14349s, jArr3, 0, i18);
            System.arraycopy(this.f14343m, this.f14349s, iArr2, 0, i18);
            System.arraycopy(this.f14342l, this.f14349s, iArr3, 0, i18);
            System.arraycopy(this.f14345o, this.f14349s, aVarArr, 0, i18);
            System.arraycopy(this.f14346p, this.f14349s, iVarArr2, 0, i18);
            System.arraycopy(this.f14340j, this.f14349s, iArr, 0, i18);
            int i19 = this.f14349s;
            System.arraycopy(this.f14341k, 0, jArr2, i18, i19);
            System.arraycopy(this.f14344n, 0, jArr3, i18, i19);
            System.arraycopy(this.f14343m, 0, iArr2, i18, i19);
            System.arraycopy(this.f14342l, 0, iArr3, i18, i19);
            System.arraycopy(this.f14345o, 0, aVarArr, i18, i19);
            System.arraycopy(this.f14346p, 0, iVarArr2, i18, i19);
            System.arraycopy(this.f14340j, 0, iArr, i18, i19);
            this.f14341k = jArr2;
            this.f14344n = jArr3;
            this.f14343m = iArr2;
            this.f14342l = iArr3;
            this.f14345o = aVarArr;
            this.f14346p = iVarArr2;
            this.f14340j = iArr;
            this.f14349s = 0;
            this.f14339i = i16;
        }
    }

    private int i(long j11) {
        int i11 = this.f14347q;
        int C = C(i11 - 1);
        while (i11 > this.f14350t && this.f14344n[C] >= j11) {
            i11--;
            C--;
            if (C == -1) {
                C = this.f14339i - 1;
            }
        }
        return i11;
    }

    public static t j(zj.b bVar, Looper looper, com.google.android.exoplayer2.drm.g gVar, f.a aVar) {
        return new t(bVar, (Looper) ak.a.e(looper), (com.google.android.exoplayer2.drm.g) ak.a.e(gVar), (f.a) ak.a.e(aVar));
    }

    public static t k(zj.b bVar) {
        return new t(bVar, null, null, null);
    }

    private synchronized long l(long j11, boolean z11, boolean z12) {
        int i11;
        int i12 = this.f14347q;
        if (i12 != 0) {
            long[] jArr = this.f14344n;
            int i13 = this.f14349s;
            if (j11 >= jArr[i13]) {
                if (z12 && (i11 = this.f14350t) != i12) {
                    i12 = i11 + 1;
                }
                int u11 = u(i13, i12, j11, z11);
                if (u11 == -1) {
                    return -1L;
                }
                return o(u11);
            }
        }
        return -1L;
    }

    private synchronized long m() {
        int i11 = this.f14347q;
        if (i11 == 0) {
            return -1L;
        }
        return o(i11);
    }

    private long o(int i11) {
        int i12;
        this.f14352v = Math.max(this.f14352v, A(i11));
        int i13 = this.f14347q - i11;
        this.f14347q = i13;
        this.f14348r += i11;
        int i14 = this.f14349s + i11;
        this.f14349s = i14;
        int i15 = this.f14339i;
        if (i14 >= i15) {
            this.f14349s = i14 - i15;
        }
        int i16 = this.f14350t - i11;
        this.f14350t = i16;
        if (i16 < 0) {
            this.f14350t = 0;
        }
        if (i13 == 0) {
            int i17 = this.f14349s;
            if (i17 != 0) {
                i15 = i17;
            }
            return this.f14341k[i15 - 1] + this.f14342l[i12];
        }
        return this.f14341k[this.f14349s];
    }

    private long s(int i11) {
        int C;
        int F = F() - i11;
        boolean z11 = false;
        ak.a.a(F >= 0 && F <= this.f14347q - this.f14350t);
        int i12 = this.f14347q - F;
        this.f14347q = i12;
        this.f14353w = Math.max(this.f14352v, A(i12));
        if (F == 0 && this.f14354x) {
            z11 = true;
        }
        this.f14354x = z11;
        int i13 = this.f14347q;
        if (i13 != 0) {
            return this.f14341k[C(i13 - 1)] + this.f14342l[C];
        }
        return 0L;
    }

    private int u(int i11, int i12, long j11, boolean z11) {
        int i13 = -1;
        for (int i14 = 0; i14 < i12; i14++) {
            long[] jArr = this.f14344n;
            if (jArr[i11] > j11) {
                return i13;
            }
            if (!z11 || (this.f14343m[i11] & 1) != 0) {
                if (jArr[i11] == j11) {
                    return i14;
                }
                i13 = i14;
            }
            i11++;
            if (i11 == this.f14339i) {
                i11 = 0;
            }
        }
        return i13;
    }

    public final int B() {
        return this.f14348r + this.f14350t;
    }

    public final synchronized int D(long j11, boolean z11) {
        int C = C(this.f14350t);
        if (G() && j11 >= this.f14344n[C]) {
            if (j11 > this.f14353w && z11) {
                return this.f14347q - this.f14350t;
            }
            int u11 = u(C, this.f14347q - this.f14350t, j11, true);
            if (u11 == -1) {
                return 0;
            }
            return u11;
        }
        return 0;
    }

    public final synchronized ci.i E() {
        return this.f14356z ? null : this.C;
    }

    public final int F() {
        return this.f14348r + this.f14347q;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void H() {
        this.A = true;
    }

    public final synchronized boolean I() {
        return this.f14354x;
    }

    public synchronized boolean J(boolean z11) {
        ci.i iVar;
        boolean z12 = true;
        if (!G()) {
            if (!z11 && !this.f14354x && ((iVar = this.C) == null || iVar == this.f14337g)) {
                z12 = false;
            }
            return z12;
        }
        int C = C(this.f14350t);
        if (this.f14346p[C] != this.f14337g) {
            return true;
        }
        return K(C);
    }

    public void L() {
        DrmSession drmSession = this.f14338h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) ak.a.e(this.f14338h.getError()));
        }
    }

    public final synchronized int O() {
        return G() ? this.f14340j[C(this.f14350t)] : this.E;
    }

    public void P() {
        q();
        S();
    }

    public int Q(ci.j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11, boolean z12) {
        int N = N(jVar, decoderInputBuffer, z11, z12, this.f14332b);
        if (N == -4 && !decoderInputBuffer.l() && !decoderInputBuffer.u()) {
            this.f14331a.l(decoderInputBuffer, this.f14332b);
            this.f14350t++;
        }
        return N;
    }

    public void R() {
        U(true);
        S();
    }

    public final void T() {
        U(false);
    }

    public void U(boolean z11) {
        this.f14331a.m();
        this.f14347q = 0;
        this.f14348r = 0;
        this.f14349s = 0;
        this.f14350t = 0;
        this.f14355y = true;
        this.f14351u = Long.MIN_VALUE;
        this.f14352v = Long.MIN_VALUE;
        this.f14353w = Long.MIN_VALUE;
        this.f14354x = false;
        this.D = null;
        if (z11) {
            this.B = null;
            this.C = null;
            this.f14356z = true;
        }
    }

    public final synchronized boolean W(int i11) {
        V();
        int i12 = this.f14348r;
        if (i11 >= i12 && i11 <= this.f14347q + i12) {
            this.f14351u = Long.MIN_VALUE;
            this.f14350t = i11 - i12;
            return true;
        }
        return false;
    }

    public final synchronized boolean X(long j11, boolean z11) {
        V();
        int C = C(this.f14350t);
        if (G() && j11 >= this.f14344n[C] && (j11 <= this.f14353w || z11)) {
            int u11 = u(C, this.f14347q - this.f14350t, j11, true);
            if (u11 == -1) {
                return false;
            }
            this.f14351u = j11;
            this.f14350t += u11;
            return true;
        }
        return false;
    }

    public final void Y(long j11) {
        if (this.H != j11) {
            this.H = j11;
            H();
        }
    }

    public final void Z(long j11) {
        this.f14351u = j11;
    }

    @Override // ji.x
    public final int b(zj.f fVar, int i11, boolean z11, int i12) {
        return this.f14331a.o(fVar, i11, z11);
    }

    public final void b0(b bVar) {
        this.f14336f = bVar;
    }

    @Override // ji.x
    public final void c(ak.v vVar, int i11, int i12) {
        this.f14331a.p(vVar, i11);
    }

    public final synchronized void c0(int i11) {
        boolean z11;
        if (i11 >= 0) {
            try {
                if (this.f14350t + i11 <= this.f14347q) {
                    z11 = true;
                    ak.a.a(z11);
                    this.f14350t += i11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z11 = false;
        ak.a.a(z11);
        this.f14350t += i11;
    }

    @Override // ji.x
    public final void d(ci.i iVar) {
        ci.i v11 = v(iVar);
        this.A = false;
        this.B = iVar;
        boolean a02 = a0(v11);
        b bVar = this.f14336f;
        if (bVar == null || !a02) {
            return;
        }
        bVar.a(v11);
    }

    public final void d0(int i11) {
        this.E = i11;
    }

    public final void e0() {
        this.I = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0063  */
    @Override // ji.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void f(long r12, int r14, int r15, int r16, ji.x.a r17) {
        /*
            r11 = this;
            r8 = r11
            boolean r0 = r8.A
            if (r0 == 0) goto L10
            ci.i r0 = r8.B
            java.lang.Object r0 = ak.a.h(r0)
            ci.i r0 = (ci.i) r0
            r11.d(r0)
        L10:
            r0 = r14 & 1
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            r3 = r2
            goto L19
        L18:
            r3 = r1
        L19:
            boolean r4 = r8.f14355y
            if (r4 == 0) goto L22
            if (r3 != 0) goto L20
            return
        L20:
            r8.f14355y = r1
        L22:
            long r4 = r8.H
            long r4 = r4 + r12
            boolean r6 = r8.F
            if (r6 == 0) goto L5e
            long r6 = r8.f14351u
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 >= 0) goto L30
            return
        L30:
            if (r0 != 0) goto L5e
            boolean r0 = r8.G
            if (r0 != 0) goto L5a
            ci.i r0 = r8.C
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r6 = r0.length()
            int r6 = r6 + 50
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r6)
            java.lang.String r6 = "Overriding unexpected non-sync sample for format: "
            r7.append(r6)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            java.lang.String r6 = "SampleQueue"
            android.util.Log.w(r6, r0)
            r8.G = r2
        L5a:
            r0 = r14 | 1
            r6 = r0
            goto L5f
        L5e:
            r6 = r14
        L5f:
            boolean r0 = r8.I
            if (r0 == 0) goto L70
            if (r3 == 0) goto L6f
            boolean r0 = r11.g(r4)
            if (r0 != 0) goto L6c
            goto L6f
        L6c:
            r8.I = r1
            goto L70
        L6f:
            return
        L70:
            com.google.android.exoplayer2.source.s r0 = r8.f14331a
            long r0 = r0.e()
            r7 = r15
            long r2 = (long) r7
            long r0 = r0 - r2
            r2 = r16
            long r2 = (long) r2
            long r9 = r0 - r2
            r0 = r11
            r1 = r4
            r3 = r6
            r4 = r9
            r6 = r15
            r7 = r17
            r0.h(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.t.f(long, int, int, int, ji.x$a):void");
    }

    public synchronized long n() {
        int i11 = this.f14350t;
        if (i11 == 0) {
            return -1L;
        }
        return o(i11);
    }

    public final void p(long j11, boolean z11, boolean z12) {
        this.f14331a.b(l(j11, z11, z12));
    }

    public final void q() {
        this.f14331a.b(m());
    }

    public final void r() {
        this.f14331a.b(n());
    }

    public final void t(int i11) {
        this.f14331a.c(s(i11));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ci.i v(ci.i iVar) {
        return (this.H == 0 || iVar.f9209p == Long.MAX_VALUE) ? iVar : iVar.a().i0(iVar.f9209p + this.H).E();
    }

    public final int w() {
        return this.f14348r;
    }

    public final synchronized long x() {
        return this.f14347q == 0 ? Long.MIN_VALUE : this.f14344n[this.f14349s];
    }

    public final synchronized long y() {
        return this.f14353w;
    }

    public final synchronized long z() {
        return Math.max(this.f14352v, A(this.f14350t));
    }
}