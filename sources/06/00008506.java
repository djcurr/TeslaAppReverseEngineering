package m0;

import androidx.compose.ui.platform.y0;
import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.f;
import q1.h;
import t1.c1;
import t1.m0;
import t1.n0;
import t1.w0;
import v1.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends z0 implements q1.h {

    /* renamed from: b  reason: collision with root package name */
    private final t1.a0 f37821b;

    /* renamed from: c  reason: collision with root package name */
    private final t1.s f37822c;

    /* renamed from: d  reason: collision with root package name */
    private final float f37823d;

    /* renamed from: e  reason: collision with root package name */
    private final c1 f37824e;

    /* renamed from: f  reason: collision with root package name */
    private s1.l f37825f;

    /* renamed from: g  reason: collision with root package name */
    private x2.q f37826g;

    /* renamed from: h  reason: collision with root package name */
    private m0 f37827h;

    public /* synthetic */ a(t1.a0 a0Var, t1.s sVar, float f11, c1 c1Var, h00.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : a0Var, (i11 & 2) != 0 ? null : sVar, (i11 & 4) != 0 ? 1.0f : f11, c1Var, lVar, null);
    }

    public /* synthetic */ a(t1.a0 a0Var, t1.s sVar, float f11, c1 c1Var, h00.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(a0Var, sVar, f11, c1Var, lVar);
    }

    private final void b(v1.c cVar) {
        m0 a11;
        if (s1.l.e(cVar.c(), this.f37825f) && cVar.getLayoutDirection() == this.f37826g) {
            a11 = this.f37827h;
            kotlin.jvm.internal.s.e(a11);
        } else {
            a11 = this.f37824e.a(cVar.c(), cVar.getLayoutDirection(), cVar);
        }
        t1.a0 a0Var = this.f37821b;
        if (a0Var != null) {
            a0Var.v();
            n0.d(cVar, a11, this.f37821b.v(), (r17 & 4) != 0 ? 1.0f : BitmapDescriptorFactory.HUE_RED, (r17 & 8) != 0 ? v1.i.f53871a : null, (r17 & 16) != 0 ? null : null, (r17 & 32) != 0 ? v1.e.f53867k1.a() : 0);
        }
        t1.s sVar = this.f37822c;
        if (sVar != null) {
            n0.c(cVar, a11, sVar, this.f37823d, null, null, 0, 56, null);
        }
        this.f37827h = a11;
        this.f37825f = s1.l.c(cVar.c());
    }

    private final void c(v1.c cVar) {
        t1.a0 a0Var = this.f37821b;
        if (a0Var != null) {
            e.b.j(cVar, a0Var.v(), 0L, 0L, BitmapDescriptorFactory.HUE_RED, null, null, 0, 126, null);
        }
        t1.s sVar = this.f37822c;
        if (sVar == null) {
            return;
        }
        e.b.i(cVar, sVar, 0L, 0L, this.f37823d, null, null, 0, 118, null);
    }

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) h.a.b(this, r11, pVar);
    }

    @Override // q1.h
    public void X(v1.c cVar) {
        kotlin.jvm.internal.s.g(cVar, "<this>");
        if (this.f37824e == w0.a()) {
            c(cVar);
        } else {
            b(cVar);
        }
        cVar.s0();
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) h.a.c(this, r11, pVar);
    }

    public boolean equals(Object obj) {
        a aVar = obj instanceof a ? (a) obj : null;
        if (aVar != null && kotlin.jvm.internal.s.c(this.f37821b, aVar.f37821b) && kotlin.jvm.internal.s.c(this.f37822c, aVar.f37822c)) {
            return ((this.f37823d > aVar.f37823d ? 1 : (this.f37823d == aVar.f37823d ? 0 : -1)) == 0) && kotlin.jvm.internal.s.c(this.f37824e, aVar.f37824e);
        }
        return false;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return h.a.d(this, fVar);
    }

    public int hashCode() {
        t1.a0 a0Var = this.f37821b;
        int t11 = (a0Var == null ? 0 : t1.a0.t(a0Var.v())) * 31;
        t1.s sVar = this.f37822c;
        return ((((t11 + (sVar != null ? sVar.hashCode() : 0)) * 31) + Float.hashCode(this.f37823d)) * 31) + this.f37824e.hashCode();
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return h.a.a(this, lVar);
    }

    public String toString() {
        return "Background(color=" + this.f37821b + ", brush=" + this.f37822c + ", alpha = " + this.f37823d + ", shape=" + this.f37824e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    private a(t1.a0 a0Var, t1.s sVar, float f11, c1 c1Var, h00.l<? super y0, vz.b0> lVar) {
        super(lVar);
        this.f37821b = a0Var;
        this.f37822c = sVar;
        this.f37823d = f11;
        this.f37824e = c1Var;
    }
}