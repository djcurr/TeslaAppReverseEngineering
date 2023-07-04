package io.grpc.internal;

import io.grpc.internal.j2;
import io.grpc.internal.k1;
import java.io.Closeable;

/* loaded from: classes5.dex */
final class g2 extends k0 {

    /* renamed from: a  reason: collision with root package name */
    private final k1.b f30965a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f30966b;

    public g2(k1.b bVar) {
        this.f30965a = bVar;
    }

    @Override // io.grpc.internal.k0, io.grpc.internal.k1.b
    public void a(j2.a aVar) {
        if (this.f30966b) {
            if (aVar instanceof Closeable) {
                q0.e((Closeable) aVar);
                return;
            }
            return;
        }
        super.a(aVar);
    }

    @Override // io.grpc.internal.k0, io.grpc.internal.k1.b
    public void c(Throwable th2) {
        this.f30966b = true;
        super.c(th2);
    }

    @Override // io.grpc.internal.k0, io.grpc.internal.k1.b
    public void d(boolean z11) {
        this.f30966b = true;
        super.d(z11);
    }

    @Override // io.grpc.internal.k0
    protected k1.b e() {
        return this.f30965a;
    }
}