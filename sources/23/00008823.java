package mx;

import io.grpc.internal.o2;

/* loaded from: classes5.dex */
class n implements o2 {

    /* renamed from: a  reason: collision with root package name */
    private final okio.f f39625a;

    /* renamed from: b  reason: collision with root package name */
    private int f39626b;

    /* renamed from: c  reason: collision with root package name */
    private int f39627c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(okio.f fVar, int i11) {
        this.f39625a = fVar;
        this.f39626b = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public okio.f a() {
        return this.f39625a;
    }

    @Override // io.grpc.internal.o2
    public int f() {
        return this.f39627c;
    }

    @Override // io.grpc.internal.o2
    public void o(byte[] bArr, int i11, int i12) {
        this.f39625a.o(bArr, i11, i12);
        this.f39626b -= i12;
        this.f39627c += i12;
    }

    @Override // io.grpc.internal.o2
    public int p() {
        return this.f39626b;
    }

    @Override // io.grpc.internal.o2
    public void q(byte b11) {
        this.f39625a.O0(b11);
        this.f39626b--;
        this.f39627c++;
    }

    @Override // io.grpc.internal.o2
    public void release() {
    }
}