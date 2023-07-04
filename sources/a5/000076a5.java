package io.grpc.internal;

import java.io.OutputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public abstract class n0 implements u1 {

    /* renamed from: a  reason: collision with root package name */
    private final u1 f31084a;

    /* JADX INFO: Access modifiers changed from: protected */
    public n0(u1 u1Var) {
        this.f31084a = (u1) com.google.common.base.u.p(u1Var, "buf");
    }

    @Override // io.grpc.internal.u1
    public void A1(OutputStream outputStream, int i11) {
        this.f31084a.A1(outputStream, i11);
    }

    @Override // io.grpc.internal.u1
    public void d1(byte[] bArr, int i11, int i12) {
        this.f31084a.d1(bArr, i11, i12);
    }

    @Override // io.grpc.internal.u1
    public int f() {
        return this.f31084a.f();
    }

    @Override // io.grpc.internal.u1
    public void k1() {
        this.f31084a.k1();
    }

    @Override // io.grpc.internal.u1
    public boolean markSupported() {
        return this.f31084a.markSupported();
    }

    @Override // io.grpc.internal.u1
    public void o0(ByteBuffer byteBuffer) {
        this.f31084a.o0(byteBuffer);
    }

    @Override // io.grpc.internal.u1
    public int readUnsignedByte() {
        return this.f31084a.readUnsignedByte();
    }

    @Override // io.grpc.internal.u1
    public void reset() {
        this.f31084a.reset();
    }

    @Override // io.grpc.internal.u1
    public void skipBytes(int i11) {
        this.f31084a.skipBytes(i11);
    }

    public String toString() {
        return com.google.common.base.o.c(this).d("delegate", this.f31084a).toString();
    }

    @Override // io.grpc.internal.u1
    public u1 y(int i11) {
        return this.f31084a.y(i11);
    }
}