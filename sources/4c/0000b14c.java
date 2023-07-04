package s0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class f implements q0.d {

    /* renamed from: a  reason: collision with root package name */
    private final x2.d f49777a;

    /* renamed from: b  reason: collision with root package name */
    private final long f49778b;

    private f(x2.d dVar, long j11) {
        this.f49777a = dVar;
        this.f49778b = j11;
        dVar.b0(x2.b.n(a()));
        dVar.b0(x2.b.m(a()));
    }

    public /* synthetic */ f(x2.d dVar, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, j11);
    }

    public final long a() {
        return this.f49778b;
    }

    public final x2.d b() {
        return this.f49777a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return kotlin.jvm.internal.s.c(this.f49777a, fVar.f49777a) && x2.b.g(this.f49778b, fVar.f49778b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f49777a.hashCode() * 31) + x2.b.q(this.f49778b);
    }

    public String toString() {
        return "LazyItemScopeImpl(density=" + this.f49777a + ", constraints=" + ((Object) x2.b.r(this.f49778b)) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}