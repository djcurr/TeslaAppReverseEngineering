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
public final class y extends z0 implements f2.v {

    /* renamed from: b  reason: collision with root package name */
    private final w f45430b;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f45431a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f2.b0 f45432b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ y f45433c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var, f2.b0 b0Var, y yVar) {
            super(1);
            this.f45431a = m0Var;
            this.f45432b = b0Var;
            this.f45433c = yVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            m0.a.j(layout, this.f45431a, this.f45432b.G(this.f45433c.b().c(this.f45432b.getLayoutDirection())), this.f45432b.G(this.f45433c.b().d()), BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w paddingValues, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(paddingValues, "paddingValues");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f45430b = paddingValues;
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
        boolean z11 = false;
        float f11 = 0;
        if (x2.g.e(this.f45430b.c(receiver.getLayoutDirection()), x2.g.f(f11)) >= 0 && x2.g.e(this.f45430b.d(), x2.g.f(f11)) >= 0 && x2.g.e(this.f45430b.b(receiver.getLayoutDirection()), x2.g.f(f11)) >= 0 && x2.g.e(this.f45430b.a(), x2.g.f(f11)) >= 0) {
            z11 = true;
        }
        if (z11) {
            int G = receiver.G(this.f45430b.c(receiver.getLayoutDirection())) + receiver.G(this.f45430b.b(receiver.getLayoutDirection()));
            int G2 = receiver.G(this.f45430b.d()) + receiver.G(this.f45430b.a());
            m0 X = measurable.X(x2.c.h(j11, -G, -G2));
            return b0.a.b(receiver, x2.c.g(j11, X.B0() + G), x2.c.f(j11, X.w0() + G2), null, new a(X, receiver, this), 4, null);
        }
        throw new IllegalArgumentException("Padding must be non-negative".toString());
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public final w b() {
        return this.f45430b;
    }

    public boolean equals(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar == null) {
            return false;
        }
        return kotlin.jvm.internal.s.c(this.f45430b, yVar.f45430b);
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
        return this.f45430b.hashCode();
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