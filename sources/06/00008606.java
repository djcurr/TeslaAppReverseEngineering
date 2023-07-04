package m10;

import ch.qos.logback.core.CoreConstants;
import k20.d0;
import w00.s0;

/* loaded from: classes5.dex */
final class o {

    /* renamed from: a  reason: collision with root package name */
    private final d0 f38352a;

    /* renamed from: b  reason: collision with root package name */
    private final e10.q f38353b;

    /* renamed from: c  reason: collision with root package name */
    private final s0 f38354c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f38355d;

    public o(d0 type, e10.q qVar, s0 s0Var, boolean z11) {
        kotlin.jvm.internal.s.g(type, "type");
        this.f38352a = type;
        this.f38353b = qVar;
        this.f38354c = s0Var;
        this.f38355d = z11;
    }

    public final d0 a() {
        return this.f38352a;
    }

    public final e10.q b() {
        return this.f38353b;
    }

    public final s0 c() {
        return this.f38354c;
    }

    public final boolean d() {
        return this.f38355d;
    }

    public final d0 e() {
        return this.f38352a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            return kotlin.jvm.internal.s.c(this.f38352a, oVar.f38352a) && kotlin.jvm.internal.s.c(this.f38353b, oVar.f38353b) && kotlin.jvm.internal.s.c(this.f38354c, oVar.f38354c) && this.f38355d == oVar.f38355d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f38352a.hashCode() * 31;
        e10.q qVar = this.f38353b;
        int hashCode2 = (hashCode + (qVar == null ? 0 : qVar.hashCode())) * 31;
        s0 s0Var = this.f38354c;
        int hashCode3 = (hashCode2 + (s0Var != null ? s0Var.hashCode() : 0)) * 31;
        boolean z11 = this.f38355d;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode3 + i11;
    }

    public String toString() {
        return "TypeAndDefaultQualifiers(type=" + this.f38352a + ", defaultQualifiers=" + this.f38353b + ", typeParameterForArgument=" + this.f38354c + ", isFromStarProjection=" + this.f38355d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}