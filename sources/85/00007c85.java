package k0;

import ch.qos.logback.core.CoreConstants;
import l0.c0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final o1.a f34092a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<x2.o, x2.o> f34093b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<x2.o> f34094c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f34095d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(o1.a alignment, h00.l<? super x2.o, x2.o> size, c0<x2.o> animationSpec, boolean z11) {
        kotlin.jvm.internal.s.g(alignment, "alignment");
        kotlin.jvm.internal.s.g(size, "size");
        kotlin.jvm.internal.s.g(animationSpec, "animationSpec");
        this.f34092a = alignment;
        this.f34093b = size;
        this.f34094c = animationSpec;
        this.f34095d = z11;
    }

    public final o1.a a() {
        return this.f34092a;
    }

    public final c0<x2.o> b() {
        return this.f34094c;
    }

    public final boolean c() {
        return this.f34095d;
    }

    public final h00.l<x2.o, x2.o> d() {
        return this.f34093b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return kotlin.jvm.internal.s.c(this.f34092a, fVar.f34092a) && kotlin.jvm.internal.s.c(this.f34093b, fVar.f34093b) && kotlin.jvm.internal.s.c(this.f34094c, fVar.f34094c) && this.f34095d == fVar.f34095d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f34092a.hashCode() * 31) + this.f34093b.hashCode()) * 31) + this.f34094c.hashCode()) * 31;
        boolean z11 = this.f34095d;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public String toString() {
        return "ChangeSize(alignment=" + this.f34092a + ", size=" + this.f34093b + ", animationSpec=" + this.f34094c + ", clip=" + this.f34095d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}