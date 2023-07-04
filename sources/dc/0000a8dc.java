package p0;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.f;
import x2.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class g0 extends z0 implements f2.v {

    /* renamed from: b  reason: collision with root package name */
    private final float f45325b;

    /* renamed from: c  reason: collision with root package name */
    private final float f45326c;

    /* renamed from: d  reason: collision with root package name */
    private final float f45327d;

    /* renamed from: e  reason: collision with root package name */
    private final float f45328e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f45329f;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f45330a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f45330a = m0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            m0.a.n(layout, this.f45330a, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    public /* synthetic */ g0(float f11, float f12, float f13, float f14, boolean z11, h00.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? x2.g.f56937b.b() : f11, (i11 & 2) != 0 ? x2.g.f56937b.b() : f12, (i11 & 4) != 0 ? x2.g.f56937b.b() : f13, (i11 & 8) != 0 ? x2.g.f56937b.b() : f14, z11, lVar, null);
    }

    public /* synthetic */ g0(float f11, float f12, float f13, float f14, boolean z11, h00.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, f13, f14, z11, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r5 != Integer.MAX_VALUE) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final long b(x2.d r8) {
        /*
            r7 = this;
            float r0 = r7.f45327d
            x2.g$a r1 = x2.g.f56937b
            float r2 = r1.b()
            boolean r0 = x2.g.h(r0, r2)
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r0 != 0) goto L30
            float r0 = r7.f45327d
            x2.g r0 = x2.g.c(r0)
            float r4 = (float) r3
            float r4 = x2.g.f(r4)
            x2.g r4 = x2.g.c(r4)
            java.lang.Comparable r0 = m00.j.f(r0, r4)
            x2.g r0 = (x2.g) r0
            float r0 = r0.l()
            int r0 = r8.G(r0)
            goto L31
        L30:
            r0 = r2
        L31:
            float r4 = r7.f45328e
            float r5 = r1.b()
            boolean r4 = x2.g.h(r4, r5)
            if (r4 != 0) goto L5b
            float r4 = r7.f45328e
            x2.g r4 = x2.g.c(r4)
            float r5 = (float) r3
            float r5 = x2.g.f(r5)
            x2.g r5 = x2.g.c(r5)
            java.lang.Comparable r4 = m00.j.f(r4, r5)
            x2.g r4 = (x2.g) r4
            float r4 = r4.l()
            int r4 = r8.G(r4)
            goto L5c
        L5b:
            r4 = r2
        L5c:
            float r5 = r7.f45325b
            float r6 = r1.b()
            boolean r5 = x2.g.h(r5, r6)
            if (r5 != 0) goto L79
            float r5 = r7.f45325b
            int r5 = r8.G(r5)
            int r5 = m00.j.i(r5, r0)
            int r5 = m00.j.d(r5, r3)
            if (r5 == r2) goto L79
            goto L7a
        L79:
            r5 = r3
        L7a:
            float r6 = r7.f45326c
            float r1 = r1.b()
            boolean r1 = x2.g.h(r6, r1)
            if (r1 != 0) goto L97
            float r1 = r7.f45326c
            int r8 = r8.G(r1)
            int r8 = m00.j.i(r8, r4)
            int r8 = m00.j.d(r8, r3)
            if (r8 == r2) goto L97
            r3 = r8
        L97:
            long r0 = x2.c.a(r5, r0, r3, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p0.g0.b(x2.d):long");
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) v.a.b(this, r11, pVar);
    }

    @Override // f2.v
    public int L(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        long b11 = b(kVar);
        if (x2.b.k(b11)) {
            return x2.b.m(b11);
        }
        return x2.c.f(b11, measurable.a(i11));
    }

    @Override // f2.v
    public int S(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        long b11 = b(kVar);
        if (x2.b.k(b11)) {
            return x2.b.m(b11);
        }
        return x2.c.f(b11, measurable.u(i11));
    }

    @Override // f2.v
    public f2.a0 Z(f2.b0 receiver, f2.y measurable, long j11) {
        int i11;
        int d11;
        int i12;
        int d12;
        long a11;
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        long b11 = b(receiver);
        if (this.f45329f) {
            a11 = x2.c.e(j11, b11);
        } else {
            float f11 = this.f45325b;
            g.a aVar = x2.g.f56937b;
            if (!x2.g.h(f11, aVar.b())) {
                i11 = x2.b.p(b11);
            } else {
                i11 = m00.l.i(x2.b.p(j11), x2.b.n(b11));
            }
            if (!x2.g.h(this.f45327d, aVar.b())) {
                d11 = x2.b.n(b11);
            } else {
                d11 = m00.l.d(x2.b.n(j11), x2.b.p(b11));
            }
            if (!x2.g.h(this.f45326c, aVar.b())) {
                i12 = x2.b.o(b11);
            } else {
                i12 = m00.l.i(x2.b.o(j11), x2.b.m(b11));
            }
            if (!x2.g.h(this.f45328e, aVar.b())) {
                d12 = x2.b.m(b11);
            } else {
                d12 = m00.l.d(x2.b.m(j11), x2.b.o(b11));
            }
            a11 = x2.c.a(i11, d11, i12, d12);
        }
        m0 X = measurable.X(a11);
        return b0.a.b(receiver, X.B0(), X.w0(), null, new a(X), 4, null);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            return x2.g.h(this.f45325b, g0Var.f45325b) && x2.g.h(this.f45326c, g0Var.f45326c) && x2.g.h(this.f45327d, g0Var.f45327d) && x2.g.h(this.f45328e, g0Var.f45328e) && this.f45329f == g0Var.f45329f;
        }
        return false;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return v.a.h(this, fVar);
    }

    @Override // f2.v
    public int h0(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        long b11 = b(kVar);
        if (x2.b.l(b11)) {
            return x2.b.n(b11);
        }
        return x2.c.g(b11, measurable.T(i11));
    }

    public int hashCode() {
        return ((((((x2.g.i(this.f45325b) * 31) + x2.g.i(this.f45326c)) * 31) + x2.g.i(this.f45327d)) * 31) + x2.g.i(this.f45328e)) * 31;
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return v.a.a(this, lVar);
    }

    @Override // f2.v
    public int t(f2.k kVar, f2.j measurable, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        long b11 = b(kVar);
        if (x2.b.l(b11)) {
            return x2.b.n(b11);
        }
        return x2.c.g(b11, measurable.S(i11));
    }

    private g0(float f11, float f12, float f13, float f14, boolean z11, h00.l<? super y0, vz.b0> lVar) {
        super(lVar);
        this.f45325b = f11;
        this.f45326c = f12;
        this.f45327d = f13;
        this.f45328e = f14;
        this.f45329f = z11;
    }
}