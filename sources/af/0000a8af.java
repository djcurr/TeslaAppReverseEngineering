package p0;

import androidx.compose.ui.platform.z0;
import ch.qos.logback.core.CoreConstants;
import f2.l0;
import o1.f;

/* loaded from: classes.dex */
final class b extends z0 implements l0 {

    /* renamed from: b  reason: collision with root package name */
    private o1.a f45244b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f45245c;

    @Override // o1.f
    public <R> R C(R r11, h00.p<? super R, ? super f.c, ? extends R> pVar) {
        return (R) l0.a.b(this, r11, pVar);
    }

    @Override // o1.f
    public <R> R a0(R r11, h00.p<? super f.c, ? super R, ? extends R> pVar) {
        return (R) l0.a.c(this, r11, pVar);
    }

    public final o1.a b() {
        return this.f45244b;
    }

    public final boolean c() {
        return this.f45245c;
    }

    @Override // f2.l0
    /* renamed from: d */
    public b J(x2.d dVar, Object obj) {
        kotlin.jvm.internal.s.g(dVar, "<this>");
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        if (bVar == null) {
            return false;
        }
        return kotlin.jvm.internal.s.c(this.f45244b, bVar.f45244b) && this.f45245c == bVar.f45245c;
    }

    @Override // o1.f
    public o1.f g0(o1.f fVar) {
        return l0.a.d(this, fVar);
    }

    public int hashCode() {
        return (this.f45244b.hashCode() * 31) + Boolean.hashCode(this.f45245c);
    }

    @Override // o1.f
    public boolean p(h00.l<? super f.c, Boolean> lVar) {
        return l0.a.a(this, lVar);
    }

    public String toString() {
        return "BoxChildData(alignment=" + this.f45244b + ", matchParentSize=" + this.f45245c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}