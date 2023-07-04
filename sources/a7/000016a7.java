package com.facebook.imagepipeline.memory;

import md.k;
import qf.n;
import qf.o;

/* loaded from: classes3.dex */
public class MemoryPooledByteBufferOutputStream extends pd.i {

    /* renamed from: a  reason: collision with root package name */
    private final g f11269a;

    /* renamed from: b  reason: collision with root package name */
    private qd.a<n> f11270b;

    /* renamed from: c  reason: collision with root package name */
    private int f11271c;

    /* loaded from: classes3.dex */
    public static class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    public MemoryPooledByteBufferOutputStream(g gVar) {
        this(gVar, gVar.E());
    }

    private void g() {
        if (!qd.a.n0(this.f11270b)) {
            throw new InvalidStreamException();
        }
    }

    @Override // pd.i, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        qd.a.C(this.f11270b);
        this.f11270b = null;
        this.f11271c = -1;
        super.close();
    }

    void j(int i11) {
        g();
        k.g(this.f11270b);
        if (i11 <= this.f11270b.J().a()) {
            return;
        }
        n nVar = this.f11269a.get(i11);
        k.g(this.f11270b);
        this.f11270b.J().j(0, nVar, 0, this.f11271c);
        this.f11270b.close();
        this.f11270b = qd.a.u0(nVar, this.f11269a);
    }

    @Override // pd.i
    /* renamed from: l */
    public o a() {
        g();
        return new o((qd.a) k.g(this.f11270b), this.f11271c);
    }

    @Override // pd.i
    public int size() {
        return this.f11271c;
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        write(new byte[]{(byte) i11});
    }

    public MemoryPooledByteBufferOutputStream(g gVar, int i11) {
        k.b(Boolean.valueOf(i11 > 0));
        g gVar2 = (g) k.g(gVar);
        this.f11269a = gVar2;
        this.f11271c = 0;
        this.f11270b = qd.a.u0(gVar2.get(i11), gVar2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        if (i11 >= 0 && i12 >= 0 && i11 + i12 <= bArr.length) {
            g();
            j(this.f11271c + i12);
            ((n) ((qd.a) k.g(this.f11270b)).J()).l(this.f11271c, bArr, i11, i12);
            this.f11271c += i12;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("length=" + bArr.length + "; regionStart=" + i11 + "; regionLength=" + i12);
    }
}