package o20;

import k20.d0;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.types.checker.f;
import w00.s0;

/* loaded from: classes5.dex */
final class c {

    /* renamed from: a  reason: collision with root package name */
    private final s0 f42187a;

    /* renamed from: b  reason: collision with root package name */
    private final d0 f42188b;

    /* renamed from: c  reason: collision with root package name */
    private final d0 f42189c;

    public c(s0 typeParameter, d0 inProjection, d0 outProjection) {
        s.g(typeParameter, "typeParameter");
        s.g(inProjection, "inProjection");
        s.g(outProjection, "outProjection");
        this.f42187a = typeParameter;
        this.f42188b = inProjection;
        this.f42189c = outProjection;
    }

    public final d0 a() {
        return this.f42188b;
    }

    public final d0 b() {
        return this.f42189c;
    }

    public final s0 c() {
        return this.f42187a;
    }

    public final boolean d() {
        return f.f35149a.c(this.f42188b, this.f42189c);
    }
}