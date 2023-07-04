package com.google.android.exoplayer2.extractor.flv;

import ak.v;
import androidx.recyclerview.widget.l;
import com.google.android.exoplayer2.extractor.flv.b;
import ji.h;
import ji.i;
import ji.j;
import ji.l;
import ji.u;
import ji.v;

/* loaded from: classes3.dex */
public final class b implements h {

    /* renamed from: f */
    private j f13389f;

    /* renamed from: h */
    private boolean f13391h;

    /* renamed from: i */
    private long f13392i;

    /* renamed from: j */
    private int f13393j;

    /* renamed from: k */
    private int f13394k;

    /* renamed from: l */
    private int f13395l;

    /* renamed from: m */
    private long f13396m;

    /* renamed from: n */
    private boolean f13397n;

    /* renamed from: o */
    private a f13398o;

    /* renamed from: p */
    private d f13399p;

    /* renamed from: a */
    private final v f13384a = new v(4);

    /* renamed from: b */
    private final v f13385b = new v(9);

    /* renamed from: c */
    private final v f13386c = new v(11);

    /* renamed from: d */
    private final v f13387d = new v();

    /* renamed from: e */
    private final c f13388e = new c();

    /* renamed from: g */
    private int f13390g = 1;

    static {
        mi.a aVar = new l() { // from class: mi.a
            @Override // ji.l
            public final h[] b() {
                return b.c();
            }
        };
    }

    public static /* synthetic */ h[] c() {
        return h();
    }

    private void f() {
        if (this.f13397n) {
            return;
        }
        this.f13389f.p(new v.b(-9223372036854775807L));
        this.f13397n = true;
    }

    private long g() {
        if (this.f13391h) {
            return this.f13392i + this.f13396m;
        }
        if (this.f13388e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f13396m;
    }

    public static /* synthetic */ h[] h() {
        return new h[]{new b()};
    }

    private ak.v i(i iVar) {
        if (this.f13395l > this.f13387d.b()) {
            ak.v vVar = this.f13387d;
            vVar.M(new byte[Math.max(vVar.b() * 2, this.f13395l)], 0);
        } else {
            this.f13387d.O(0);
        }
        this.f13387d.N(this.f13395l);
        iVar.readFully(this.f13387d.d(), 0, this.f13395l);
        return this.f13387d;
    }

    private boolean j(i iVar) {
        if (iVar.e(this.f13385b.d(), 0, 9, true)) {
            this.f13385b.O(0);
            this.f13385b.P(4);
            int C = this.f13385b.C();
            boolean z11 = (C & 4) != 0;
            boolean z12 = (C & 1) != 0;
            if (z11 && this.f13398o == null) {
                this.f13398o = new a(this.f13389f.f(8, 1));
            }
            if (z12 && this.f13399p == null) {
                this.f13399p = new d(this.f13389f.f(9, 2));
            }
            this.f13389f.s();
            this.f13393j = (this.f13385b.m() - 9) + 4;
            this.f13390g = 2;
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean k(ji.i r10) {
        /*
            r9 = this;
            long r0 = r9.g()
            int r2 = r9.f13394k
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            r6 = 1
            r7 = 8
            if (r2 != r7) goto L24
            com.google.android.exoplayer2.extractor.flv.a r7 = r9.f13398o
            if (r7 == 0) goto L24
            r9.f()
            com.google.android.exoplayer2.extractor.flv.a r2 = r9.f13398o
            ak.v r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
        L22:
            r10 = r6
            goto L75
        L24:
            r7 = 9
            if (r2 != r7) goto L3a
            com.google.android.exoplayer2.extractor.flv.d r7 = r9.f13399p
            if (r7 == 0) goto L3a
            r9.f()
            com.google.android.exoplayer2.extractor.flv.d r2 = r9.f13399p
            ak.v r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
            goto L22
        L3a:
            r7 = 18
            if (r2 != r7) goto L6f
            boolean r2 = r9.f13397n
            if (r2 != 0) goto L6f
            com.google.android.exoplayer2.extractor.flv.c r2 = r9.f13388e
            ak.v r10 = r9.i(r10)
            boolean r5 = r2.a(r10, r0)
            com.google.android.exoplayer2.extractor.flv.c r10 = r9.f13388e
            long r0 = r10.d()
            int r10 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r10 == 0) goto L22
            ji.j r10 = r9.f13389f
            ji.t r2 = new ji.t
            com.google.android.exoplayer2.extractor.flv.c r7 = r9.f13388e
            long[] r7 = r7.e()
            com.google.android.exoplayer2.extractor.flv.c r8 = r9.f13388e
            long[] r8 = r8.f()
            r2.<init>(r7, r8, r0)
            r10.p(r2)
            r9.f13397n = r6
            goto L22
        L6f:
            int r0 = r9.f13395l
            r10.k(r0)
            r10 = r5
        L75:
            boolean r0 = r9.f13391h
            if (r0 != 0) goto L8f
            if (r5 == 0) goto L8f
            r9.f13391h = r6
            com.google.android.exoplayer2.extractor.flv.c r0 = r9.f13388e
            long r0 = r0.d()
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L8b
            long r0 = r9.f13396m
            long r0 = -r0
            goto L8d
        L8b:
            r0 = 0
        L8d:
            r9.f13392i = r0
        L8f:
            r0 = 4
            r9.f13393j = r0
            r0 = 2
            r9.f13390g = r0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.flv.b.k(ji.i):boolean");
    }

    private boolean l(i iVar) {
        if (iVar.e(this.f13386c.d(), 0, 11, true)) {
            this.f13386c.O(0);
            this.f13394k = this.f13386c.C();
            this.f13395l = this.f13386c.F();
            this.f13396m = this.f13386c.F();
            this.f13396m = ((this.f13386c.C() << 24) | this.f13396m) * 1000;
            this.f13386c.P(3);
            this.f13390g = 4;
            return true;
        }
        return false;
    }

    private void m(i iVar) {
        iVar.k(this.f13393j);
        this.f13393j = 0;
        this.f13390g = 3;
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        if (j11 == 0) {
            this.f13390g = 1;
            this.f13391h = false;
        } else {
            this.f13390g = 3;
        }
        this.f13393j = 0;
    }

    @Override // ji.h
    public void b(j jVar) {
        this.f13389f = jVar;
    }

    @Override // ji.h
    public boolean d(i iVar) {
        iVar.n(this.f13384a.d(), 0, 3);
        this.f13384a.O(0);
        if (this.f13384a.F() != 4607062) {
            return false;
        }
        iVar.n(this.f13384a.d(), 0, 2);
        this.f13384a.O(0);
        if ((this.f13384a.I() & l.f.DEFAULT_SWIPE_ANIMATION_DURATION) != 0) {
            return false;
        }
        iVar.n(this.f13384a.d(), 0, 4);
        this.f13384a.O(0);
        int m11 = this.f13384a.m();
        iVar.d();
        iVar.g(m11);
        iVar.n(this.f13384a.d(), 0, 4);
        this.f13384a.O(0);
        return this.f13384a.m() == 0;
    }

    @Override // ji.h
    public int e(i iVar, u uVar) {
        ak.a.h(this.f13389f);
        while (true) {
            int i11 = this.f13390g;
            if (i11 != 1) {
                if (i11 == 2) {
                    m(iVar);
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (k(iVar)) {
                            return 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (!l(iVar)) {
                    return -1;
                }
            } else if (!j(iVar)) {
                return -1;
            }
        }
    }

    @Override // ji.h
    public void release() {
    }
}