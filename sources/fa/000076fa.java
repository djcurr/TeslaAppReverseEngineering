package io.grpc.internal;

/* loaded from: classes5.dex */
abstract class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final io.grpc.r f31265a;

    /* JADX INFO: Access modifiers changed from: protected */
    public x(io.grpc.r rVar) {
        this.f31265a = rVar;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        io.grpc.r b11 = this.f31265a.b();
        try {
            a();
        } finally {
            this.f31265a.f(b11);
        }
    }
}