package io.grpc;

/* loaded from: classes5.dex */
abstract class w0<ReqT, RespT> extends g<ReqT, RespT> {
    @Override // io.grpc.g
    public void b() {
        f().b();
    }

    @Override // io.grpc.g
    public void c(int i11) {
        f().c(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract g<?, ?> f();

    public String toString() {
        return com.google.common.base.o.c(this).d("delegate", f()).toString();
    }
}