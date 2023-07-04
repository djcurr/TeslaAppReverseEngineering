package q1;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import kotlin.jvm.internal.s;
import o1.f;
import q1.h;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e extends z0 implements h {

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<v1.e, b0> f47296b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public e(h00.l<? super v1.e, b0> onDraw, h00.l<? super y0, b0> inspectorInfo) {
        super(inspectorInfo);
        s.g(onDraw, "onDraw");
        s.g(inspectorInfo, "inspectorInfo");
        this.f47296b = onDraw;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) h.a.b(this, r11, pVar);
    }

    @Override // q1.h
    public void X(v1.c cVar) {
        s.g(cVar, "<this>");
        this.f47296b.invoke(cVar);
        cVar.s0();
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) h.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return s.c(this.f47296b, ((e) obj).f47296b);
        }
        return false;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return h.a.d(this, fVar);
    }

    public int hashCode() {
        return this.f47296b.hashCode();
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return h.a.a(this, lVar);
    }
}