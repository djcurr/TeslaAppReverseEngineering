package p0;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.l0;
import o1.f;

/* loaded from: classes.dex */
public final class q extends z0 implements l0 {

    /* renamed from: b  reason: collision with root package name */
    private final float f45398b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f45399c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(float f11, boolean z11, h00.l<? super y0, vz.b0> inspectorInfo) {
        super(inspectorInfo);
        kotlin.jvm.internal.s.g(inspectorInfo, "inspectorInfo");
        this.f45398b = f11;
        this.f45399c = z11;
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) l0.a.b(this, r11, pVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) l0.a.c(this, r11, pVar);
    }

    public final boolean b() {
        return this.f45399c;
    }

    public final float c() {
        return this.f45398b;
    }

    @Override // f2.l0
    /* renamed from: d */
    public a0 J(x2.d dVar, Object obj) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        a0 a0Var = obj instanceof a0 ? (a0) obj : null;
        if (a0Var == null) {
            a0Var = new a0(BitmapDescriptorFactory.HUE_RED, false, null, 7, null);
        }
        a0Var.f(c());
        a0Var.e(b());
        return a0Var;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        q qVar = obj instanceof q ? (q) obj : null;
        if (qVar == null) {
            return false;
        }
        return (((this.f45398b > qVar.f45398b ? 1 : (this.f45398b == qVar.f45398b ? 0 : -1)) == 0) || this.f45399c == qVar.f45399c) ? false : true;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return l0.a.d(this, fVar);
    }

    public int hashCode() {
        return (Float.hashCode(this.f45398b) * 31) + Boolean.hashCode(this.f45399c);
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return l0.a.a(this, lVar);
    }

    public String toString() {
        return "LayoutWeightImpl(weight=" + this.f45398b + ", fill=" + this.f45399c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}