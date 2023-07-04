package p0;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.l0;
import o1.a;
import o1.f;

/* loaded from: classes.dex */
public final class n extends z0 implements l0 {

    /* renamed from: b  reason: collision with root package name */
    private final a.b f45364b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a.b horizontal, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(horizontal, "horizontal");
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f45364b = horizontal;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) l0.a.b(this, r11, pVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) l0.a.c(this, r11, pVar);
    }

    public final a.b b() {
        return this.f45364b;
    }

    @Override // f2.l0
    /* renamed from: c */
    public a0 J(x2.d dVar, Object obj) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        a0 a0Var = obj instanceof a0 ? (a0) obj : null;
        if (a0Var == null) {
            a0Var = new a0(BitmapDescriptorFactory.HUE_RED, false, null, 7, null);
        }
        a0Var.d(k.f45346a.a(b()));
        return a0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        n nVar = obj instanceof n ? (n) obj : null;
        if (nVar == null) {
            return false;
        }
        return kotlin.jvm.internal.s.c(this.f45364b, nVar.f45364b);
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return l0.a.d(this, fVar);
    }

    public int hashCode() {
        return this.f45364b.hashCode();
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return l0.a.a(this, lVar);
    }

    public String toString() {
        return "HorizontalAlignModifier(horizontal=" + this.f45364b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}