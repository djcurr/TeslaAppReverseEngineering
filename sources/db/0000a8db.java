package p0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
final class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private final x2.d f45323a;

    /* renamed from: b  reason: collision with root package name */
    private final long f45324b;

    private g(x2.d dVar, long j11) {
        this.f45323a = dVar;
        this.f45324b = j11;
        d dVar2 = d.f45270a;
    }

    public /* synthetic */ g(x2.d dVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j11);
    }

    @Override // p0.f
    public float a() {
        return this.f45323a.b0(x2.b.n(b()));
    }

    @Override // p0.f
    public long b() {
        return this.f45324b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return kotlin.jvm.internal.s.c(this.f45323a, gVar.f45323a) && x2.b.g(b(), gVar.b());
        }
        return false;
    }

    public int hashCode() {
        return (this.f45323a.hashCode() * 31) + x2.b.q(b());
    }

    public String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.f45323a + ", constraints=" + ((Object) x2.b.r(b())) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}