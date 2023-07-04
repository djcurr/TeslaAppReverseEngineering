package f2;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import f2.e0;
import o1.f;

/* loaded from: classes.dex */
final class f0 extends z0 implements e0 {

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<o, vz.b0> f25576b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public f0(h00.l<? super o, vz.b0> callback, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(callback, "callback");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f25576b = callback;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) e0.a.b(this, r11, pVar);
    }

    @Override // f2.e0
    public void T(o coordinates) {
        kotlin.jvm.internal.s.g(coordinates, "coordinates");
        this.f25576b.invoke(coordinates);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) e0.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f0) {
            return kotlin.jvm.internal.s.c(this.f25576b, ((f0) obj).f25576b);
        }
        return false;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return e0.a.d(this, fVar);
    }

    public int hashCode() {
        return this.f25576b.hashCode();
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return e0.a.a(this, lVar);
    }
}