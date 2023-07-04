package q1;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.a0;
import f2.b0;
import f2.m0;
import f2.s0;
import f2.v;
import f2.y;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import t1.b0;

/* loaded from: classes.dex */
final class m extends z0 implements v, h {

    /* renamed from: b  reason: collision with root package name */
    private final w1.b f47309b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f47310c;

    /* renamed from: d  reason: collision with root package name */
    private final o1.a f47311d;

    /* renamed from: e  reason: collision with root package name */
    private final f2.d f47312e;

    /* renamed from: f  reason: collision with root package name */
    private final float f47313f;

    /* renamed from: g  reason: collision with root package name */
    private final b0 f47314g;

    /* loaded from: classes.dex */
    static final class a extends u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f47315a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f47315a = m0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            s.g(layout, "$this$layout");
            m0.a.n(layout, this.f47315a, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(w1.b painter, boolean z11, o1.a alignment, f2.d contentScale, float f11, b0 b0Var, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        s.g(painter, "painter");
        s.g(alignment, "alignment");
        s.g(contentScale, "contentScale");
        s.g(inspectorInfo, "inspectorInfo");
        this.f47309b = painter;
        this.f47310c = z11;
        this.f47311d = alignment;
        this.f47312e = contentScale;
        this.f47313f = f11;
        this.f47314g = b0Var;
    }

    private final long b(long j11) {
        float i11;
        float g11;
        if (f()) {
            if (!i(this.f47309b.h())) {
                i11 = s1.l.i(j11);
            } else {
                i11 = s1.l.i(this.f47309b.h());
            }
            if (!g(this.f47309b.h())) {
                g11 = s1.l.g(j11);
            } else {
                g11 = s1.l.g(this.f47309b.h());
            }
            long a11 = s1.m.a(i11, g11);
            if (!(s1.l.i(j11) == BitmapDescriptorFactory.HUE_RED)) {
                if (!(s1.l.g(j11) == BitmapDescriptorFactory.HUE_RED)) {
                    return s0.b(a11, this.f47312e.a(a11, j11));
                }
            }
            return s1.l.f49969b.b();
        }
        return j11;
    }

    private final boolean f() {
        if (this.f47310c) {
            if (this.f47309b.h() != s1.l.f49969b.a()) {
                return true;
            }
        }
        return false;
    }

    private final boolean g(long j11) {
        if (!s1.l.f(j11, s1.l.f49969b.a())) {
            float g11 = s1.l.g(j11);
            if ((Float.isInfinite(g11) || Float.isNaN(g11)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private final boolean i(long j11) {
        if (!s1.l.f(j11, s1.l.f49969b.a())) {
            float i11 = s1.l.i(j11);
            if ((Float.isInfinite(i11) || Float.isNaN(i11)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    private final long j(long j11) {
        int p11;
        int o11;
        int c11;
        int c12;
        boolean z11 = true;
        boolean z12 = x2.b.j(j11) && x2.b.i(j11);
        if (!x2.b.l(j11) || !x2.b.k(j11)) {
            z11 = false;
        }
        if ((!f() && z12) || z11) {
            return x2.b.e(j11, x2.b.n(j11), 0, x2.b.m(j11), 0, 10, null);
        }
        long h11 = this.f47309b.h();
        if (i(h11)) {
            p11 = j00.c.c(s1.l.i(h11));
        } else {
            p11 = x2.b.p(j11);
        }
        if (g(h11)) {
            o11 = j00.c.c(s1.l.g(h11));
        } else {
            o11 = x2.b.o(j11);
        }
        long b11 = b(s1.m.a(x2.c.g(j11, p11), x2.c.f(j11, o11)));
        c11 = j00.c.c(s1.l.i(b11));
        int g11 = x2.c.g(j11, c11);
        c12 = j00.c.c(s1.l.g(b11));
        return x2.b.e(j11, g11, 0, x2.c.f(j11, c12), 0, 10, null);
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) v.a.b(this, r11, pVar);
    }

    @Override // f2.v
    public int L(f2.k kVar, f2.j measurable, int i11) {
        int c11;
        s.g(kVar, "<this>");
        s.g(measurable, "measurable");
        if (f()) {
            int a11 = measurable.a(x2.b.n(j(x2.c.b(0, i11, 0, 0, 13, null))));
            c11 = j00.c.c(s1.l.g(b(s1.m.a(i11, a11))));
            return Math.max(c11, a11);
        }
        return measurable.a(i11);
    }

    @Override // f2.v
    public int S(f2.k kVar, f2.j measurable, int i11) {
        int c11;
        s.g(kVar, "<this>");
        s.g(measurable, "measurable");
        if (f()) {
            int u11 = measurable.u(x2.b.n(j(x2.c.b(0, i11, 0, 0, 13, null))));
            c11 = j00.c.c(s1.l.g(b(s1.m.a(i11, u11))));
            return Math.max(c11, u11);
        }
        return measurable.u(i11);
    }

    @Override // q1.h
    public void X(v1.c cVar) {
        float i11;
        float g11;
        long b11;
        int c11;
        int c12;
        int c13;
        int c14;
        s.g(cVar, "<this>");
        long h11 = this.f47309b.h();
        if (i(h11)) {
            i11 = s1.l.i(h11);
        } else {
            i11 = s1.l.i(cVar.c());
        }
        if (g(h11)) {
            g11 = s1.l.g(h11);
        } else {
            g11 = s1.l.g(cVar.c());
        }
        long a11 = s1.m.a(i11, g11);
        if (!(s1.l.i(cVar.c()) == BitmapDescriptorFactory.HUE_RED)) {
            if (!(s1.l.g(cVar.c()) == BitmapDescriptorFactory.HUE_RED)) {
                b11 = s0.b(a11, this.f47312e.a(a11, cVar.c()));
                long j11 = b11;
                o1.a aVar = this.f47311d;
                c11 = j00.c.c(s1.l.i(j11));
                c12 = j00.c.c(s1.l.g(j11));
                long a12 = x2.p.a(c11, c12);
                c13 = j00.c.c(s1.l.i(cVar.c()));
                c14 = j00.c.c(s1.l.g(cVar.c()));
                long a13 = aVar.a(a12, x2.p.a(c13, c14), cVar.getLayoutDirection());
                float h12 = x2.k.h(a13);
                float i12 = x2.k.i(a13);
                cVar.j0().a().b(h12, i12);
                e().g(cVar, j11, c(), d());
                cVar.j0().a().b(-h12, -i12);
                cVar.s0();
            }
        }
        b11 = s1.l.f49969b.b();
        long j112 = b11;
        o1.a aVar2 = this.f47311d;
        c11 = j00.c.c(s1.l.i(j112));
        c12 = j00.c.c(s1.l.g(j112));
        long a122 = x2.p.a(c11, c12);
        c13 = j00.c.c(s1.l.i(cVar.c()));
        c14 = j00.c.c(s1.l.g(cVar.c()));
        long a132 = aVar2.a(a122, x2.p.a(c13, c14), cVar.getLayoutDirection());
        float h122 = x2.k.h(a132);
        float i122 = x2.k.i(a132);
        cVar.j0().a().b(h122, i122);
        e().g(cVar, j112, c(), d());
        cVar.j0().a().b(-h122, -i122);
        cVar.s0();
    }

    @Override // f2.v
    public a0 Z(f2.b0 receiver, y measurable, long j11) {
        s.g(receiver, "$receiver");
        s.g(measurable, "measurable");
        m0 X = measurable.X(j(j11));
        return b0.a.b(receiver, X.B0(), X.w0(), null, new a(X), 4, null);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public final float c() {
        return this.f47313f;
    }

    public final t1.b0 d() {
        return this.f47314g;
    }

    public final w1.b e() {
        return this.f47309b;
    }

    public boolean equals(Object obj) {
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar != null && s.c(this.f47309b, mVar.f47309b) && this.f47310c == mVar.f47310c && s.c(this.f47311d, mVar.f47311d) && s.c(this.f47312e, mVar.f47312e)) {
            return ((this.f47313f > mVar.f47313f ? 1 : (this.f47313f == mVar.f47313f ? 0 : -1)) == 0) && s.c(this.f47314g, mVar.f47314g);
        }
        return false;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return v.a.h(this, fVar);
    }

    @Override // f2.v
    public int h0(f2.k kVar, f2.j measurable, int i11) {
        int c11;
        s.g(kVar, "<this>");
        s.g(measurable, "measurable");
        if (f()) {
            int T = measurable.T(x2.b.m(j(x2.c.b(0, 0, 0, i11, 7, null))));
            c11 = j00.c.c(s1.l.i(b(s1.m.a(T, i11))));
            return Math.max(c11, T);
        }
        return measurable.T(i11);
    }

    public int hashCode() {
        int hashCode = ((((((((this.f47309b.hashCode() * 31) + Boolean.hashCode(this.f47310c)) * 31) + this.f47311d.hashCode()) * 31) + this.f47312e.hashCode()) * 31) + Float.hashCode(this.f47313f)) * 31;
        t1.b0 b0Var = this.f47314g;
        return hashCode + (b0Var == null ? 0 : b0Var.hashCode());
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return v.a.a(this, lVar);
    }

    @Override // f2.v
    public int t(f2.k kVar, f2.j measurable, int i11) {
        int c11;
        s.g(kVar, "<this>");
        s.g(measurable, "measurable");
        if (f()) {
            int S = measurable.S(x2.b.m(j(x2.c.b(0, 0, 0, i11, 7, null))));
            c11 = j00.c.c(s1.l.i(b(s1.m.a(S, i11))));
            return Math.max(c11, S);
        }
        return measurable.S(i11);
    }

    public String toString() {
        return "PainterModifier(painter=" + this.f47309b + ", sizeToIntrinsics=" + this.f47310c + ", alignment=" + this.f47311d + ", alpha=" + this.f47313f + ", colorFilter=" + this.f47314g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}