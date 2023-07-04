package n10;

import ch.qos.logback.core.CoreConstants;
import w00.o0;

/* loaded from: classes5.dex */
public final class q implements i20.f {

    /* renamed from: b  reason: collision with root package name */
    private final o f40224b;

    public q(o binaryClass, g20.s<t10.e> sVar, boolean z11, i20.e abiStability) {
        kotlin.jvm.internal.s.g(binaryClass, "binaryClass");
        kotlin.jvm.internal.s.g(abiStability, "abiStability");
        this.f40224b = binaryClass;
    }

    @Override // i20.f
    public String a() {
        return "Class '" + this.f40224b.j().b().b() + CoreConstants.SINGLE_QUOTE_CHAR;
    }

    @Override // w00.n0
    public o0 b() {
        o0 NO_SOURCE_FILE = o0.f55304a;
        kotlin.jvm.internal.s.f(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    public final o d() {
        return this.f40224b;
    }

    public String toString() {
        return ((Object) q.class.getSimpleName()) + ": " + this.f40224b;
    }
}