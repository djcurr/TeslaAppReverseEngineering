package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f57958a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static final float f57959b;

    /* renamed from: c  reason: collision with root package name */
    private static final float f57960c;

    /* renamed from: d  reason: collision with root package name */
    private static final p0.w f57961d;

    /* renamed from: e  reason: collision with root package name */
    private static final float f57962e;

    /* renamed from: f  reason: collision with root package name */
    private static final float f57963f;

    /* renamed from: g  reason: collision with root package name */
    private static final float f57964g;

    /* renamed from: h  reason: collision with root package name */
    private static final p0.w f57965h;

    static {
        float f11 = x2.g.f(16);
        f57959b = f11;
        float f12 = 8;
        float f13 = x2.g.f(f12);
        f57960c = f13;
        p0.w d11 = p0.u.d(f11, f13, f11, f13);
        f57961d = d11;
        f57962e = x2.g.f(64);
        f57963f = x2.g.f(36);
        x2.g.f(18);
        x2.g.f(f12);
        x2.g.f(1);
        float f14 = x2.g.f(f12);
        f57964g = f14;
        f57965h = p0.u.d(f14, d11.d(), f14, d11.a());
    }

    private d() {
    }

    public final c a(long j11, long j12, long j13, long j14, c1.i iVar, int i11, int i12) {
        long j15;
        iVar.x(2063545420);
        long j16 = (i12 & 1) != 0 ? h0.f58131a.a(iVar, 6).j() : j11;
        long b11 = (i12 & 2) != 0 ? m.b(j16, iVar, i11 & 14) : j12;
        if ((i12 & 4) != 0) {
            h0 h0Var = h0.f58131a;
            j15 = t1.c0.e(t1.a0.l(h0Var.a(iVar, 6).i(), 0.12f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null), h0Var.a(iVar, 6).n());
        } else {
            j15 = j13;
        }
        q qVar = new q(j16, b11, j15, (i12 & 8) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), n.f58482a.b(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j14, null);
        iVar.N();
        return qVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
        if (r3 == c1.i.f8486a.a()) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final y0.e b(float r14, float r15, float r16, float r17, float r18, c1.i r19, int r20, int r21) {
        /*
            r13 = this;
            r0 = r19
            r1 = 399130879(0x17ca40ff, float:1.3070351E-24)
            r0.x(r1)
            r1 = r21 & 1
            r2 = 2
            if (r1 == 0) goto L14
            float r1 = (float) r2
            float r1 = x2.g.f(r1)
            r4 = r1
            goto L15
        L14:
            r4 = r14
        L15:
            r1 = r21 & 2
            if (r1 == 0) goto L22
            r1 = 8
            float r1 = (float) r1
            float r1 = x2.g.f(r1)
            r5 = r1
            goto L23
        L22:
            r5 = r15
        L23:
            r1 = r21 & 4
            r3 = 0
            if (r1 == 0) goto L2f
            float r1 = (float) r3
            float r1 = x2.g.f(r1)
            r6 = r1
            goto L31
        L2f:
            r6 = r16
        L31:
            r1 = r21 & 8
            r7 = 4
            if (r1 == 0) goto L3c
            float r1 = (float) r7
            float r1 = x2.g.f(r1)
            goto L3e
        L3c:
            r1 = r17
        L3e:
            r8 = r21 & 16
            if (r8 == 0) goto L48
            float r8 = (float) r7
            float r8 = x2.g.f(r8)
            goto L4a
        L48:
            r8 = r18
        L4a:
            r9 = 5
            java.lang.Object[] r10 = new java.lang.Object[r9]
            x2.g r11 = x2.g.c(r4)
            r10[r3] = r11
            x2.g r11 = x2.g.c(r5)
            r12 = 1
            r10[r12] = r11
            x2.g r11 = x2.g.c(r6)
            r10[r2] = r11
            r2 = 3
            x2.g r11 = x2.g.c(r1)
            r10[r2] = r11
            x2.g r2 = x2.g.c(r8)
            r10[r7] = r2
            r2 = -3685570(0xffffffffffc7c33e, float:NaN)
            r0.x(r2)
            r2 = r3
        L74:
            if (r3 >= r9) goto L80
            r7 = r10[r3]
            int r3 = r3 + 1
            boolean r7 = r0.O(r7)
            r2 = r2 | r7
            goto L74
        L80:
            java.lang.Object r3 = r19.y()
            if (r2 != 0) goto L8e
            c1.i$a r2 = c1.i.f8486a
            java.lang.Object r2 = r2.a()
            if (r3 != r2) goto L99
        L8e:
            y0.r r2 = new y0.r
            r9 = 0
            r3 = r2
            r7 = r1
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0.p(r2)
        L99:
            r19.N()
            y0.r r3 = (y0.r) r3
            r19.N()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.d.b(float, float, float, float, float, c1.i, int, int):y0.e");
    }

    public final p0.w c() {
        return f57961d;
    }

    public final float d() {
        return f57963f;
    }

    public final float e() {
        return f57962e;
    }

    public final p0.w f() {
        return f57965h;
    }

    public final c g(long j11, long j12, long j13, c1.i iVar, int i11, int i12) {
        iVar.x(1409305054);
        long e11 = (i12 & 1) != 0 ? t1.a0.f51365b.e() : j11;
        q qVar = new q(e11, (i12 & 2) != 0 ? h0.f58131a.a(iVar, 6).j() : j12, e11, (i12 & 4) != 0 ? t1.a0.l(h0.f58131a.a(iVar, 6).i(), n.f58482a.b(iVar, 6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 14, null) : j13, null);
        iVar.N();
        return qVar;
    }
}