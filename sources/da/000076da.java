package io.grpc.internal;

import io.grpc.f1;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class s0 {

    /* renamed from: a  reason: collision with root package name */
    final int f31205a;

    /* renamed from: b  reason: collision with root package name */
    final long f31206b;

    /* renamed from: c  reason: collision with root package name */
    final Set<f1.b> f31207c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(int i11, long j11, Set<f1.b> set) {
        this.f31205a = i11;
        this.f31206b = j11;
        this.f31207c = com.google.common.collect.v.m(set);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s0.class != obj.getClass()) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f31205a == s0Var.f31205a && this.f31206b == s0Var.f31206b && com.google.common.base.q.a(this.f31207c, s0Var.f31207c);
    }

    public int hashCode() {
        return com.google.common.base.q.b(Integer.valueOf(this.f31205a), Long.valueOf(this.f31206b), this.f31207c);
    }

    public String toString() {
        return com.google.common.base.o.c(this).b("maxAttempts", this.f31205a).c("hedgingDelayNanos", this.f31206b).d("nonFatalStatusCodes", this.f31207c).toString();
    }
}