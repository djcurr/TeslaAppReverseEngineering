package r1;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import o1.f;
import r1.t;

/* loaded from: classes.dex */
public final class u extends z0 implements t {

    /* renamed from: b  reason: collision with root package name */
    private final s f49019b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(s focusRequester, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(focusRequester, "focusRequester");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f49019b = focusRequester;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) t.a.b(this, r11, pVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) t.a.c(this, r11, pVar);
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return t.a.d(this, fVar);
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return t.a.a(this, lVar);
    }

    @Override // r1.t
    public s v() {
        return this.f49019b;
    }
}