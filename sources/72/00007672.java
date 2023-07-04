package io.grpc.internal;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class h2 {

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.g1[] f30983a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f30984b = new AtomicBoolean(false);

    static {
        new h2(new io.grpc.g1[0]);
    }

    h2(io.grpc.g1[] g1VarArr) {
        this.f30983a = g1VarArr;
    }

    public static h2 h(io.grpc.k[] kVarArr, io.grpc.a aVar, io.grpc.r0 r0Var) {
        h2 h2Var = new h2(kVarArr);
        for (io.grpc.k kVar : kVarArr) {
            kVar.m(aVar, r0Var);
        }
        return h2Var;
    }

    public void a() {
        for (io.grpc.g1 g1Var : this.f30983a) {
            ((io.grpc.k) g1Var).j();
        }
    }

    public void b(io.grpc.r0 r0Var) {
        for (io.grpc.g1 g1Var : this.f30983a) {
            ((io.grpc.k) g1Var).k(r0Var);
        }
    }

    public void c() {
        for (io.grpc.g1 g1Var : this.f30983a) {
            ((io.grpc.k) g1Var).l();
        }
    }

    public void d(int i11) {
        for (io.grpc.g1 g1Var : this.f30983a) {
            g1Var.a(i11);
        }
    }

    public void e(int i11, long j11, long j12) {
        for (io.grpc.g1 g1Var : this.f30983a) {
            g1Var.b(i11, j11, j12);
        }
    }

    public void f(long j11) {
        for (io.grpc.g1 g1Var : this.f30983a) {
            g1Var.c(j11);
        }
    }

    public void g(long j11) {
        for (io.grpc.g1 g1Var : this.f30983a) {
            g1Var.d(j11);
        }
    }

    public void i(int i11) {
        for (io.grpc.g1 g1Var : this.f30983a) {
            g1Var.e(i11);
        }
    }

    public void j(int i11, long j11, long j12) {
        for (io.grpc.g1 g1Var : this.f30983a) {
            g1Var.f(i11, j11, j12);
        }
    }

    public void k(long j11) {
        for (io.grpc.g1 g1Var : this.f30983a) {
            g1Var.g(j11);
        }
    }

    public void l(long j11) {
        for (io.grpc.g1 g1Var : this.f30983a) {
            g1Var.h(j11);
        }
    }

    public void m(io.grpc.f1 f1Var) {
        if (this.f30984b.compareAndSet(false, true)) {
            for (io.grpc.g1 g1Var : this.f30983a) {
                g1Var.i(f1Var);
            }
        }
    }
}