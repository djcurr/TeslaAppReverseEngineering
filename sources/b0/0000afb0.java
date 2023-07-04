package r1;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import o1.f;
import r1.d;

/* loaded from: classes.dex */
public final class e extends z0 implements d, g2.d<Boolean> {

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<w, vz.b0> f48986b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(h00.l<? super w, vz.b0> onFocusEvent, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(onFocusEvent, "onFocusEvent");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f48986b = onFocusEvent;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) d.a.b(this, r11, pVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) d.a.c(this, r11, pVar);
    }

    @Override // g2.d
    /* renamed from: b */
    public Boolean getValue() {
        return Boolean.TRUE;
    }

    @Override // r1.d
    public void e0(w focusState) {
        kotlin.jvm.internal.s.g(focusState, "focusState");
        this.f48986b.invoke(focusState);
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return d.a.d(this, fVar);
    }

    @Override // g2.d
    public g2.f<Boolean> getKey() {
        return k.c();
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return d.a.a(this, lVar);
    }
}