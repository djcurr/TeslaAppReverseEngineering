package p0;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.v;
import o1.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s extends z0 implements f2.v {

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<x2.d, x2.k> f45401b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f45402c;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f2.b0 f45404b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ m0 f45405c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f2.b0 b0Var, m0 m0Var) {
            super(1);
            this.f45404b = b0Var;
            this.f45405c = m0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            long l11 = s.this.b().invoke(this.f45404b).l();
            if (s.this.c()) {
                m0.a.r(layout, this.f45405c, x2.k.h(l11), x2.k.i(l11), BitmapDescriptorFactory.HUE_RED, null, 12, null);
            } else {
                m0.a.v(layout, this.f45405c, x2.k.h(l11), x2.k.i(l11), BitmapDescriptorFactory.HUE_RED, null, 12, null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s(h00.l<? super x2.d, x2.k> offset, boolean z11, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(offset, "offset");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f45401b = offset;
        this.f45402c = z11;
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
        m0 X = measurable.X(j11);
        return b0.a.b(receiver, X.B0(), X.w0(), null, new a(receiver, X), 4, null);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public final h00.l<x2.d, x2.k> b() {
        return this.f45401b;
    }

    public final boolean c() {
        return this.f45402c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar == null) {
            return false;
        }
        return kotlin.jvm.internal.s.c(this.f45401b, sVar.f45401b) && this.f45402c == sVar.f45402c;
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
        return (this.f45401b.hashCode() * 31) + Boolean.hashCode(this.f45402c);
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return v.a.a(this, lVar);
    }

    @Override // f2.v
    public int t(f2.k kVar, f2.j jVar, int i11) {
        return v.a.g(this, kVar, jVar, i11);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.f45401b + ", rtlAware=" + this.f45402c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}