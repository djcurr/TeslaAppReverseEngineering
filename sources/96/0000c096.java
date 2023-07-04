package y0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.f;

/* loaded from: classes.dex */
final class k0 implements f2.v {

    /* renamed from: a  reason: collision with root package name */
    private final long f58272a;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f58273a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58274b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58275c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, f2.m0 m0Var, int i12) {
            super(1);
            this.f58273a = i11;
            this.f58274b = m0Var;
            this.f58275c = i12;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            int c11;
            int c12;
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            c11 = j00.c.c((this.f58273a - this.f58274b.B0()) / 2.0f);
            c12 = j00.c.c((this.f58275c - this.f58274b.w0()) / 2.0f);
            m0.a.j(layout, this.f58274b, c11, c12, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    private k0(long j11) {
        this.f58272a = j11;
    }

    public /* synthetic */ k0(long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11);
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) v.a.b(this, r11, pVar);
    }

    @Override // f2.v
    public int L(f2.k kVar, f2.j jVar, int i11) {
        return v.a.d(this, kVar, jVar, i11);
    }

    @Override // f2.v
    public int S(f2.k kVar, f2.j jVar, int i11) {
        return v.a.f(this, kVar, jVar, i11);
    }

    @Override // f2.v
    public f2.a0 Z(f2.b0 receiver, f2.y measurable, long j11) {
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        f2.m0 X = measurable.X(j11);
        int max = Math.max(X.B0(), receiver.G(x2.j.f(a())));
        int max2 = Math.max(X.w0(), receiver.G(x2.j.e(a())));
        return b0.a.b(receiver, max, max2, null, new a(max, X, max2), 4, null);
    }

    public final long a() {
        return this.f58272a;
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        k0 k0Var = obj instanceof k0 ? (k0) obj : null;
        if (k0Var == null) {
            return false;
        }
        return x2.j.d(a(), k0Var.a());
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return v.a.h(this, fVar);
    }

    @Override // f2.v
    public int h0(f2.k kVar, f2.j jVar, int i11) {
        return v.a.e(this, kVar, jVar, i11);
    }

    public int hashCode() {
        return x2.j.g(a());
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return v.a.a(this, lVar);
    }

    @Override // f2.v
    public int t(f2.k kVar, f2.j jVar, int i11) {
        return v.a.g(this, kVar, jVar, i11);
    }
}