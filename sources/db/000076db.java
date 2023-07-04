package io.grpc.internal;

import io.grpc.m0;

/* loaded from: classes5.dex */
public final class s1 extends m0.f {

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.c f31208a;

    /* renamed from: b  reason: collision with root package name */
    private final io.grpc.r0 f31209b;

    /* renamed from: c  reason: collision with root package name */
    private final io.grpc.s0<?, ?> f31210c;

    public s1(io.grpc.s0<?, ?> s0Var, io.grpc.r0 r0Var, io.grpc.c cVar) {
        this.f31210c = (io.grpc.s0) com.google.common.base.u.p(s0Var, "method");
        this.f31209b = (io.grpc.r0) com.google.common.base.u.p(r0Var, "headers");
        this.f31208a = (io.grpc.c) com.google.common.base.u.p(cVar, "callOptions");
    }

    @Override // io.grpc.m0.f
    public io.grpc.c a() {
        return this.f31208a;
    }

    @Override // io.grpc.m0.f
    public io.grpc.r0 b() {
        return this.f31209b;
    }

    @Override // io.grpc.m0.f
    public io.grpc.s0<?, ?> c() {
        return this.f31210c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1.class != obj.getClass()) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return com.google.common.base.q.a(this.f31208a, s1Var.f31208a) && com.google.common.base.q.a(this.f31209b, s1Var.f31209b) && com.google.common.base.q.a(this.f31210c, s1Var.f31210c);
    }

    public int hashCode() {
        return com.google.common.base.q.b(this.f31208a, this.f31209b, this.f31210c);
    }

    public final String toString() {
        return "[method=" + this.f31210c + " headers=" + this.f31209b + " callOptions=" + this.f31208a + "]";
    }
}