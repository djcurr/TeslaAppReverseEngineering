package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.k1;

/* loaded from: classes5.dex */
abstract class k0 implements k1.b {
    @Override // io.grpc.internal.k1.b
    public void a(j2.a aVar) {
        e().a(aVar);
    }

    @Override // io.grpc.internal.k1.b
    public void b(int i11) {
        e().b(i11);
    }

    @Override // io.grpc.internal.k1.b
    public void c(Throwable th2) {
        e().c(th2);
    }

    @Override // io.grpc.internal.k1.b
    public void d(boolean z11) {
        e().d(z11);
    }

    protected abstract k1.b e();
}