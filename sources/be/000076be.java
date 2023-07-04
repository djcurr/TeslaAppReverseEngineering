package io.grpc.internal;

import io.grpc.internal.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
final class p1 extends io.grpc.p0 implements io.grpc.f0<Object> {

    /* renamed from: a  reason: collision with root package name */
    private x0 f31150a;

    /* renamed from: b  reason: collision with root package name */
    private final io.grpc.g0 f31151b;

    /* renamed from: c  reason: collision with root package name */
    private final String f31152c;

    /* renamed from: d  reason: collision with root package name */
    private final a0 f31153d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f31154e;

    /* renamed from: f  reason: collision with root package name */
    private final ScheduledExecutorService f31155f;

    /* renamed from: g  reason: collision with root package name */
    private final m f31156g;

    /* renamed from: h  reason: collision with root package name */
    private final p.e f31157h;

    static {
        Logger.getLogger(p1.class.getName());
    }

    @Override // io.grpc.d
    public String a() {
        return this.f31152c;
    }

    @Override // io.grpc.k0
    public io.grpc.g0 c() {
        return this.f31151b;
    }

    @Override // io.grpc.d
    public <RequestT, ResponseT> io.grpc.g<RequestT, ResponseT> h(io.grpc.s0<RequestT, ResponseT> s0Var, io.grpc.c cVar) {
        return new p(s0Var, cVar.e() == null ? this.f31154e : cVar.e(), cVar, this.f31157h, this.f31155f, this.f31156g, null);
    }

    @Override // io.grpc.p0
    public io.grpc.p0 i() {
        this.f31153d.f(io.grpc.f1.f30571o.r("OobChannel.shutdown() called"));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public x0 j() {
        return this.f31150a;
    }

    public String toString() {
        return com.google.common.base.o.c(this).c("logId", this.f31151b.d()).d("authority", this.f31152c).toString();
    }
}