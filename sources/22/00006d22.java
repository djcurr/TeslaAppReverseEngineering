package f2;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.CoreConstants;
import f2.v;
import o1.f;

/* loaded from: classes.dex */
final class w extends z0 implements v {

    /* renamed from: b  reason: collision with root package name */
    private final h00.q<b0, y, x2.b, a0> f25656b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w(h00.q<? super b0, ? super y, ? super x2.b, ? extends a0> measureBlock, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(measureBlock, "measureBlock");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f25656b = measureBlock;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) v.a.b(this, r11, pVar);
    }

    @Override // f2.v
    public int L(k kVar, j jVar, int i11) {
        return v.a.d(this, kVar, jVar, i11);
    }

    @Override // f2.v
    public int S(k kVar, j jVar, int i11) {
        return v.a.f(this, kVar, jVar, i11);
    }

    @Override // f2.v
    public a0 Z(b0 receiver, y measurable, long j11) {
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurable, "measurable");
        return this.f25656b.invoke(receiver, measurable, x2.b.b(j11));
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) v.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        w wVar = obj instanceof w ? (w) obj : null;
        if (wVar == null) {
            return false;
        }
        return kotlin.jvm.internal.s.c(this.f25656b, wVar.f25656b);
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return v.a.h(this, fVar);
    }

    @Override // f2.v
    public int h0(k kVar, j jVar, int i11) {
        return v.a.e(this, kVar, jVar, i11);
    }

    public int hashCode() {
        return this.f25656b.hashCode();
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return v.a.a(this, lVar);
    }

    @Override // f2.v
    public int t(k kVar, j jVar, int i11) {
        return v.a.g(this, kVar, jVar, i11);
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f25656b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}