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
public final class m extends z0 implements f2.v {

    /* renamed from: b  reason: collision with root package name */
    private final l f45361b;

    /* renamed from: c  reason: collision with root package name */
    private final float f45362c;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f45363a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m0 m0Var) {
            super(1);
            this.f45363a = m0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            m0.a.n(layout, this.f45363a, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(l direction, float f11, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(direction, "direction");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f45361b = direction;
        this.f45362c = f11;
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
        int p11;
        int n11;
        int m11;
        int i11;
        int c11;
        int c12;
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        if (x2.b.j(j11) && this.f45361b != l.Vertical) {
            c12 = j00.c.c(x2.b.n(j11) * this.f45362c);
            p11 = m00.l.m(c12, x2.b.p(j11), x2.b.n(j11));
            n11 = p11;
        } else {
            p11 = x2.b.p(j11);
            n11 = x2.b.n(j11);
        }
        if (x2.b.i(j11) && this.f45361b != l.Horizontal) {
            c11 = j00.c.c(x2.b.m(j11) * this.f45362c);
            i11 = m00.l.m(c11, x2.b.o(j11), x2.b.m(j11));
            m11 = i11;
        } else {
            int o11 = x2.b.o(j11);
            m11 = x2.b.m(j11);
            i11 = o11;
        }
        m0 X = measurable.X(x2.c.a(p11, n11, i11, m11));
        return b0.a.b(receiver, X.B0(), X.w0(), null, new a(X), 4, null);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f45361b == mVar.f45361b) {
                if (this.f45362c == mVar.f45362c) {
                    return true;
                }
            }
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
        return (this.f45361b.hashCode() * 31) + Float.hashCode(this.f45362c);
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