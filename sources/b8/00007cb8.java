package k0;

import ch.qos.logback.core.CoreConstants;
import l0.c0;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final h00.l<x2.o, x2.k> f34186a;

    /* renamed from: b  reason: collision with root package name */
    private final c0<x2.k> f34187b;

    public final c0<x2.k> a() {
        return this.f34187b;
    }

    public final h00.l<x2.o, x2.k> b() {
        return this.f34186a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            return kotlin.jvm.internal.s.c(this.f34186a, vVar.f34186a) && kotlin.jvm.internal.s.c(this.f34187b, vVar.f34187b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f34186a.hashCode() * 31) + this.f34187b.hashCode();
    }

    public String toString() {
        return "Slide(slideOffset=" + this.f34186a + ", animationSpec=" + this.f34187b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}