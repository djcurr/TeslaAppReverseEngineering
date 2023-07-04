package w0;

import r2.d;

/* loaded from: classes.dex */
final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private x2.q f55195a;

    /* renamed from: b  reason: collision with root package name */
    private x2.d f55196b;

    /* renamed from: c  reason: collision with root package name */
    private d.a f55197c;

    /* renamed from: d  reason: collision with root package name */
    private n2.a0 f55198d;

    /* renamed from: e  reason: collision with root package name */
    private long f55199e;

    public r0(x2.q layoutDirection, x2.d density, d.a resourceLoader, n2.a0 style) {
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        kotlin.jvm.internal.s.g(style, "style");
        this.f55195a = layoutDirection;
        this.f55196b = density;
        this.f55197c = resourceLoader;
        this.f55198d = style;
        this.f55199e = a();
    }

    private final long a() {
        return h0.b(n2.b0.b(this.f55198d, this.f55195a), this.f55196b, this.f55197c, null, 0, 24, null);
    }

    public final long b() {
        return this.f55199e;
    }

    public final void c(x2.q layoutDirection, x2.d density, d.a resourceLoader, n2.a0 style) {
        kotlin.jvm.internal.s.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        kotlin.jvm.internal.s.g(style, "style");
        if (layoutDirection == this.f55195a && kotlin.jvm.internal.s.c(density, this.f55196b) && kotlin.jvm.internal.s.c(resourceLoader, this.f55197c) && kotlin.jvm.internal.s.c(style, this.f55198d)) {
            return;
        }
        this.f55195a = layoutDirection;
        this.f55196b = density;
        this.f55197c = resourceLoader;
        this.f55198d = style;
        this.f55199e = a();
    }
}