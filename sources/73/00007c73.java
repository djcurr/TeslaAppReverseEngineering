package k0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final p f34050a;

    /* renamed from: b  reason: collision with root package name */
    private final v f34051b;

    /* renamed from: c  reason: collision with root package name */
    private final f f34052c;

    /* renamed from: d  reason: collision with root package name */
    private final t f34053d;

    public a0() {
        this(null, null, null, null, 15, null);
    }

    public a0(p pVar, v vVar, f fVar, t tVar) {
        this.f34050a = pVar;
        this.f34051b = vVar;
        this.f34052c = fVar;
    }

    public final f a() {
        return this.f34052c;
    }

    public final p b() {
        return this.f34050a;
    }

    public final t c() {
        return this.f34053d;
    }

    public final v d() {
        return this.f34051b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            return kotlin.jvm.internal.s.c(this.f34050a, a0Var.f34050a) && kotlin.jvm.internal.s.c(this.f34051b, a0Var.f34051b) && kotlin.jvm.internal.s.c(this.f34052c, a0Var.f34052c) && kotlin.jvm.internal.s.c(this.f34053d, a0Var.f34053d);
        }
        return false;
    }

    public int hashCode() {
        p pVar = this.f34050a;
        int hashCode = (pVar == null ? 0 : pVar.hashCode()) * 31;
        v vVar = this.f34051b;
        int hashCode2 = (hashCode + (vVar == null ? 0 : vVar.hashCode())) * 31;
        f fVar = this.f34052c;
        return ((hashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31) + 0;
    }

    public String toString() {
        return "TransitionData(fade=" + this.f34050a + ", slide=" + this.f34051b + ", changeSize=" + this.f34052c + ", scale=" + this.f34053d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ a0(p pVar, v vVar, f fVar, t tVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : pVar, (i11 & 2) != 0 ? null : vVar, (i11 & 4) != 0 ? null : fVar, (i11 & 8) != 0 ? null : tVar);
    }
}