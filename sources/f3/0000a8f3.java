package p0;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.v;
import o1.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class k0 extends z0 implements f2.v {

    /* renamed from: b  reason: collision with root package name */
    private final l f45352b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f45353c;

    /* renamed from: d  reason: collision with root package name */
    private final h00.p<x2.o, x2.q, x2.k> f45354d;

    /* renamed from: e  reason: collision with root package name */
    private final Object f45355e;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f45357b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m0 f45358c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f45359d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f2.b0 f45360e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11, m0 m0Var, int i12, f2.b0 b0Var) {
            super(1);
            this.f45357b = i11;
            this.f45358c = m0Var;
            this.f45359d = i12;
            this.f45360e = b0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            m0.a.l(layout, this.f45358c, ((x2.k) k0.this.f45354d.invoke(x2.o.b(x2.p.a(this.f45357b - this.f45358c.B0(), this.f45359d - this.f45358c.w0())), this.f45360e.getLayoutDirection())).l(), BitmapDescriptorFactory.HUE_RED, 2, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k0(l direction, boolean z11, h00.p<? super x2.o, ? super x2.q, x2.k> alignmentCallback, Object align, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(direction, "direction");
        kotlin.jvm.internal.s.g(alignmentCallback, "alignmentCallback");
        kotlin.jvm.internal.s.g(align, "align");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f45352b = direction;
        this.f45353c = z11;
        this.f45354d = alignmentCallback;
        this.f45355e = align;
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
        int m11;
        int m12;
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        l lVar = this.f45352b;
        l lVar2 = l.Vertical;
        int p11 = lVar != lVar2 ? 0 : x2.b.p(j11);
        l lVar3 = this.f45352b;
        l lVar4 = l.Horizontal;
        int o11 = lVar3 == lVar4 ? x2.b.o(j11) : 0;
        int i11 = Integer.MAX_VALUE;
        int n11 = (this.f45352b == lVar2 || !this.f45353c) ? x2.b.n(j11) : Integer.MAX_VALUE;
        if (this.f45352b == lVar4 || !this.f45353c) {
            i11 = x2.b.m(j11);
        }
        m0 X = measurable.X(x2.c.a(p11, n11, o11, i11));
        m11 = m00.l.m(X.B0(), x2.b.p(j11), x2.b.n(j11));
        m12 = m00.l.m(X.w0(), x2.b.o(j11), x2.b.m(j11));
        return b0.a.b(receiver, m11, m12, null, new a(m11, X, m12, receiver), 4, null);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof k0) {
            k0 k0Var = (k0) obj;
            return this.f45352b == k0Var.f45352b && this.f45353c == k0Var.f45353c && kotlin.jvm.internal.s.c(this.f45355e, k0Var.f45355e);
        }
        return false;
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
        return (((this.f45352b.hashCode() * 31) + Boolean.hashCode(this.f45353c)) * 31) + this.f45355e.hashCode();
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