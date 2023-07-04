package y0;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class x0 {

    /* renamed from: a  reason: collision with root package name */
    private final v0.a f58714a;

    /* renamed from: b  reason: collision with root package name */
    private final v0.a f58715b;

    /* renamed from: c  reason: collision with root package name */
    private final v0.a f58716c;

    public x0() {
        this(null, null, null, 7, null);
    }

    public x0(v0.a small, v0.a medium, v0.a large) {
        kotlin.jvm.internal.s.g(small, "small");
        kotlin.jvm.internal.s.g(medium, "medium");
        kotlin.jvm.internal.s.g(large, "large");
        this.f58714a = small;
        this.f58715b = medium;
        this.f58716c = large;
    }

    public static /* synthetic */ x0 b(x0 x0Var, v0.a aVar, v0.a aVar2, v0.a aVar3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            aVar = x0Var.f58714a;
        }
        if ((i11 & 2) != 0) {
            aVar2 = x0Var.f58715b;
        }
        if ((i11 & 4) != 0) {
            aVar3 = x0Var.f58716c;
        }
        return x0Var.a(aVar, aVar2, aVar3);
    }

    public final x0 a(v0.a small, v0.a medium, v0.a large) {
        kotlin.jvm.internal.s.g(small, "small");
        kotlin.jvm.internal.s.g(medium, "medium");
        kotlin.jvm.internal.s.g(large, "large");
        return new x0(small, medium, large);
    }

    public final v0.a c() {
        return this.f58716c;
    }

    public final v0.a d() {
        return this.f58715b;
    }

    public final v0.a e() {
        return this.f58714a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            x0 x0Var = (x0) obj;
            return kotlin.jvm.internal.s.c(this.f58714a, x0Var.f58714a) && kotlin.jvm.internal.s.c(this.f58715b, x0Var.f58715b) && kotlin.jvm.internal.s.c(this.f58716c, x0Var.f58716c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f58714a.hashCode() * 31) + this.f58715b.hashCode()) * 31) + this.f58716c.hashCode();
    }

    public String toString() {
        return "Shapes(small=" + this.f58714a + ", medium=" + this.f58715b + ", large=" + this.f58716c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ x0(v0.a aVar, v0.a aVar2, v0.a aVar3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? v0.g.c(x2.g.f(4)) : aVar, (i11 & 2) != 0 ? v0.g.c(x2.g.f(4)) : aVar2, (i11 & 4) != 0 ? v0.g.c(x2.g.f(0)) : aVar3);
    }
}