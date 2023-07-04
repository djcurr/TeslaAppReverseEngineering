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
public final class i0 extends z0 implements f2.v {

    /* renamed from: b  reason: collision with root package name */
    private final float f45338b;

    /* renamed from: c  reason: collision with root package name */
    private final float f45339c;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f45340a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f45340a = m0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            m0.a.n(layout, this.f45340a, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    private i0(float f11, float f12, h00.l<? super y0, vz.b0> lVar) {
        super(lVar);
        this.f45338b = f11;
        this.f45339c = f12;
    }

    public /* synthetic */ i0(float f11, float f12, h00.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f11, f12, lVar);
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) v.a.b(this, r11, pVar);
    }

    @Override // f2.v
    public int L(f2.k kVar, f2.j measurable, int i11) {
        int d11;
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        d11 = m00.l.d(measurable.a(i11), !x2.g.h(b(), x2.g.f56937b.b()) ? kVar.G(b()) : 0);
        return d11;
    }

    @Override // f2.v
    public int S(f2.k kVar, f2.j measurable, int i11) {
        int d11;
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        d11 = m00.l.d(measurable.u(i11), !x2.g.h(b(), x2.g.f56937b.b()) ? kVar.G(b()) : 0);
        return d11;
    }

    @Override // f2.v
    public f2.a0 Z(f2.b0 receiver, f2.y measurable, long j11) {
        int p11;
        int o11;
        int i11;
        int i12;
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        float c11 = c();
        g.a aVar = x2.g.f56937b;
        if (!x2.g.h(c11, aVar.b()) && x2.b.p(j11) == 0) {
            i12 = m00.l.i(receiver.G(c()), x2.b.n(j11));
            p11 = m00.l.d(i12, 0);
        } else {
            p11 = x2.b.p(j11);
        }
        int n11 = x2.b.n(j11);
        if (!x2.g.h(b(), aVar.b()) && x2.b.o(j11) == 0) {
            i11 = m00.l.i(receiver.G(b()), x2.b.m(j11));
            o11 = m00.l.d(i11, 0);
        } else {
            o11 = x2.b.o(j11);
        }
        m0 X = measurable.X(x2.c.a(p11, n11, o11, x2.b.m(j11)));
        return b0.a.b(receiver, X.B0(), X.w0(), null, new a(X), 4, null);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public final float b() {
        return this.f45339c;
    }

    public final float c() {
        return this.f45338b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            return x2.g.h(c(), i0Var.c()) && x2.g.h(b(), i0Var.b());
        }
        return false;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return v.a.h(this, fVar);
    }

    @Override // f2.v
    public int h0(f2.k kVar, f2.j measurable, int i11) {
        int d11;
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        d11 = m00.l.d(measurable.T(i11), !x2.g.h(c(), x2.g.f56937b.b()) ? kVar.G(c()) : 0);
        return d11;
    }

    public int hashCode() {
        return (x2.g.i(c()) * 31) + x2.g.i(b());
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return v.a.a(this, lVar);
    }

    @Override // f2.v
    public int t(f2.k kVar, f2.j measurable, int i11) {
        int d11;
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        d11 = m00.l.d(measurable.S(i11), !x2.g.h(c(), x2.g.f56937b.b()) ? kVar.G(c()) : 0);
        return d11;
    }
}