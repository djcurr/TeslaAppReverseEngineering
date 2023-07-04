package qf;

import com.facebook.common.memory.PooledByteBuffer;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public class o implements PooledByteBuffer {

    /* renamed from: a  reason: collision with root package name */
    private final int f48099a;

    /* renamed from: b  reason: collision with root package name */
    qd.a<n> f48100b;

    public o(qd.a<n> aVar, int i11) {
        md.k.g(aVar);
        md.k.b(Boolean.valueOf(i11 >= 0 && i11 <= aVar.J().a()));
        this.f48100b = aVar.clone();
        this.f48099a = i11;
    }

    synchronized void a() {
        if (isClosed()) {
            throw new PooledByteBuffer.ClosedException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        qd.a.C(this.f48100b);
        this.f48100b = null;
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized long getNativePtr() {
        a();
        return this.f48100b.J().getNativePtr();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int h(int i11, byte[] bArr, int i12, int i13) {
        a();
        md.k.b(Boolean.valueOf(i11 + i13 <= this.f48099a));
        return this.f48100b.J().h(i11, bArr, i12, i13);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized ByteBuffer i() {
        return this.f48100b.J().i();
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized boolean isClosed() {
        return !qd.a.n0(this.f48100b);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized byte n(int i11) {
        a();
        boolean z11 = true;
        md.k.b(Boolean.valueOf(i11 >= 0));
        if (i11 >= this.f48099a) {
            z11 = false;
        }
        md.k.b(Boolean.valueOf(z11));
        return this.f48100b.J().n(i11);
    }

    @Override // com.facebook.common.memory.PooledByteBuffer
    public synchronized int size() {
        a();
        return this.f48099a;
    }
}