package t1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.v;
import o1.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r extends androidx.compose.ui.platform.z0 implements f2.v {

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<g0, vz.b0> f51500b;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f2.m0 f51501a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ r f51502b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f2.m0 m0Var, r rVar) {
            super(1);
            this.f51501a = m0Var;
            this.f51502b = rVar;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            m0.a.v(layout, this.f51501a, 0, 0, BitmapDescriptorFactory.HUE_RED, this.f51502b.f51500b, 4, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public r(h00.l<? super g0, vz.b0> layerBlock, h00.l<? super androidx.compose.ui.platform.y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(layerBlock, "layerBlock");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f51500b = layerBlock;
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
        return b0.a.b(receiver, X.B0(), X.w0(), null, new a(X, this), 4, null);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        if (obj instanceof r) {
            return kotlin.jvm.internal.s.c(this.f51500b, ((r) obj).f51500b);
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
        return this.f51500b.hashCode();
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
        return "BlockGraphicsLayerModifier(block=" + this.f51500b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}