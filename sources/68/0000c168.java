package y10;

import ch.qos.logback.core.CoreConstants;
import k20.d0;
import k20.k0;

/* loaded from: classes5.dex */
public final class j extends g<vz.p<? extends u10.b, ? extends u10.f>> {

    /* renamed from: b  reason: collision with root package name */
    private final u10.b f58972b;

    /* renamed from: c  reason: collision with root package name */
    private final u10.f f58973c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(u10.b enumClassId, u10.f enumEntryName) {
        super(vz.v.a(enumClassId, enumEntryName));
        kotlin.jvm.internal.s.g(enumClassId, "enumClassId");
        kotlin.jvm.internal.s.g(enumEntryName, "enumEntryName");
        this.f58972b = enumClassId;
        this.f58973c = enumEntryName;
    }

    @Override // y10.g
    public d0 a(w00.x module) {
        kotlin.jvm.internal.s.g(module, "module");
        w00.c a11 = w00.s.a(module, this.f58972b);
        k0 k0Var = null;
        if (a11 != null) {
            if (!w10.d.A(a11)) {
                a11 = null;
            }
            if (a11 != null) {
                k0Var = a11.n();
            }
        }
        if (k0Var == null) {
            k0 j11 = k20.v.j("Containing class for error-class based enum entry " + this.f58972b + CoreConstants.DOT + this.f58973c);
            kotlin.jvm.internal.s.f(j11, "createErrorType(\"Contain…mClassId.$enumEntryName\")");
            return j11;
        }
        return k0Var;
    }

    public final u10.f c() {
        return this.f58973c;
    }

    @Override // y10.g
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f58972b.j());
        sb2.append(CoreConstants.DOT);
        sb2.append(this.f58973c);
        return sb2.toString();
    }
}