package f2;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.CoreConstants;
import f2.l0;
import o1.f;

/* loaded from: classes.dex */
final class q extends z0 implements l0, s {

    /* renamed from: b  reason: collision with root package name */
    private final Object f25594b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Object layoutId, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(layoutId, "layoutId");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f25594b = layoutId;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) l0.a.b(this, r11, pVar);
    }

    @Override // f2.l0
    public Object J(x2.d dVar, Object obj) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        return this;
    }

    @Override // f2.s
    public Object a() {
        return this.f25594b;
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) l0.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        q qVar = obj instanceof q ? (q) obj : null;
        if (qVar == null) {
            return false;
        }
        return kotlin.jvm.internal.s.c(a(), qVar.a());
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return l0.a.d(this, fVar);
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return l0.a.a(this, lVar);
    }

    public String toString() {
        return "LayoutId(id=" + a() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}