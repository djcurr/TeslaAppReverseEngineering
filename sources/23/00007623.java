package io.grpc.internal;

import io.grpc.internal.k;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class e0 implements k {

    /* renamed from: a  reason: collision with root package name */
    private Random f30772a = new Random();

    /* renamed from: b  reason: collision with root package name */
    private long f30773b = TimeUnit.SECONDS.toNanos(1);

    /* renamed from: c  reason: collision with root package name */
    private long f30774c = TimeUnit.MINUTES.toNanos(2);

    /* renamed from: d  reason: collision with root package name */
    private double f30775d = 1.6d;

    /* renamed from: e  reason: collision with root package name */
    private double f30776e = 0.2d;

    /* renamed from: f  reason: collision with root package name */
    private long f30777f = this.f30773b;

    /* loaded from: classes5.dex */
    public static final class a implements k.a {
        @Override // io.grpc.internal.k.a
        public k get() {
            return new e0();
        }
    }

    private long b(double d11, double d12) {
        com.google.common.base.u.d(d12 >= d11);
        return (long) ((this.f30772a.nextDouble() * (d12 - d11)) + d11);
    }

    @Override // io.grpc.internal.k
    public long a() {
        long j11 = this.f30777f;
        double d11 = j11;
        this.f30777f = Math.min((long) (this.f30775d * d11), this.f30774c);
        double d12 = this.f30776e;
        return j11 + b((-d12) * d11, d12 * d11);
    }
}