package io.grpc.internal;

import io.grpc.f1;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class z1 {

    /* renamed from: a  reason: collision with root package name */
    final int f31472a;

    /* renamed from: b  reason: collision with root package name */
    final long f31473b;

    /* renamed from: c  reason: collision with root package name */
    final long f31474c;

    /* renamed from: d  reason: collision with root package name */
    final double f31475d;

    /* renamed from: e  reason: collision with root package name */
    final Long f31476e;

    /* renamed from: f  reason: collision with root package name */
    final Set<f1.b> f31477f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(int i11, long j11, long j12, double d11, Long l11, Set<f1.b> set) {
        this.f31472a = i11;
        this.f31473b = j11;
        this.f31474c = j12;
        this.f31475d = d11;
        this.f31476e = l11;
        this.f31477f = com.google.common.collect.v.m(set);
    }

    public boolean equals(Object obj) {
        if (obj instanceof z1) {
            z1 z1Var = (z1) obj;
            return this.f31472a == z1Var.f31472a && this.f31473b == z1Var.f31473b && this.f31474c == z1Var.f31474c && Double.compare(this.f31475d, z1Var.f31475d) == 0 && com.google.common.base.q.a(this.f31476e, z1Var.f31476e) && com.google.common.base.q.a(this.f31477f, z1Var.f31477f);
        }
        return false;
    }

    public int hashCode() {
        return com.google.common.base.q.b(Integer.valueOf(this.f31472a), Long.valueOf(this.f31473b), Long.valueOf(this.f31474c), Double.valueOf(this.f31475d), this.f31476e, this.f31477f);
    }

    public String toString() {
        return com.google.common.base.o.c(this).b("maxAttempts", this.f31472a).c("initialBackoffNanos", this.f31473b).c("maxBackoffNanos", this.f31474c).a("backoffMultiplier", this.f31475d).d("perAttemptRecvTimeoutNanos", this.f31476e).d("retryableStatusCodes", this.f31477f).toString();
    }
}