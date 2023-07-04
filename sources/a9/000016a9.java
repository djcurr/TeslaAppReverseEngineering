package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import md.k;
import qf.n;

@md.d
/* loaded from: classes3.dex */
public class NativeMemoryChunk implements n, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final long f11272a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11273b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f11274c;

    static {
        yg.a.d("imagepipeline");
    }

    public NativeMemoryChunk(int i11) {
        k.b(Boolean.valueOf(i11 > 0));
        this.f11273b = i11;
        this.f11272a = nativeAllocate(i11);
        this.f11274c = false;
    }

    private void m(int i11, n nVar, int i12, int i13) {
        if (nVar instanceof NativeMemoryChunk) {
            k.i(!isClosed());
            k.i(!nVar.isClosed());
            h.b(i11, nVar.a(), i12, i13, this.f11273b);
            nativeMemcpy(nVar.getNativePtr() + i12, this.f11272a + i11, i13);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @md.d
    private static native long nativeAllocate(int i11);

    @md.d
    private static native void nativeCopyFromByteArray(long j11, byte[] bArr, int i11, int i12);

    @md.d
    private static native void nativeCopyToByteArray(long j11, byte[] bArr, int i11, int i12);

    @md.d
    private static native void nativeFree(long j11);

    @md.d
    private static native void nativeMemcpy(long j11, long j12, int i11);

    @md.d
    private static native byte nativeReadByte(long j11);

    @Override // qf.n
    public int a() {
        return this.f11273b;
    }

    @Override // qf.n, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!this.f11274c) {
            this.f11274c = true;
            nativeFree(this.f11272a);
        }
    }

    protected void finalize() {
        if (isClosed()) {
            return;
        }
        Log.w("NativeMemoryChunk", "finalize: Chunk " + Integer.toHexString(System.identityHashCode(this)) + " still active. ");
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // qf.n
    public long g() {
        return this.f11272a;
    }

    @Override // qf.n
    public long getNativePtr() {
        return this.f11272a;
    }

    @Override // qf.n
    public synchronized int h(int i11, byte[] bArr, int i12, int i13) {
        int a11;
        k.g(bArr);
        k.i(!isClosed());
        a11 = h.a(i11, i13, this.f11273b);
        h.b(i11, bArr.length, i12, a11, this.f11273b);
        nativeCopyToByteArray(this.f11272a + i11, bArr, i12, a11);
        return a11;
    }

    @Override // qf.n
    public ByteBuffer i() {
        return null;
    }

    @Override // qf.n
    public synchronized boolean isClosed() {
        return this.f11274c;
    }

    @Override // qf.n
    public void j(int i11, n nVar, int i12, int i13) {
        k.g(nVar);
        if (nVar.g() == g()) {
            Log.w("NativeMemoryChunk", "Copying from NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(this)) + " to NativeMemoryChunk " + Integer.toHexString(System.identityHashCode(nVar)) + " which share the same address " + Long.toHexString(this.f11272a));
            k.b(Boolean.FALSE);
        }
        if (nVar.g() < g()) {
            synchronized (nVar) {
                synchronized (this) {
                    m(i11, nVar, i12, i13);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (nVar) {
                m(i11, nVar, i12, i13);
            }
        }
    }

    @Override // qf.n
    public synchronized int l(int i11, byte[] bArr, int i12, int i13) {
        int a11;
        k.g(bArr);
        k.i(!isClosed());
        a11 = h.a(i11, i13, this.f11273b);
        h.b(i11, bArr.length, i12, a11, this.f11273b);
        nativeCopyFromByteArray(this.f11272a + i11, bArr, i12, a11);
        return a11;
    }

    @Override // qf.n
    public synchronized byte n(int i11) {
        boolean z11 = true;
        k.i(!isClosed());
        k.b(Boolean.valueOf(i11 >= 0));
        if (i11 >= this.f11273b) {
            z11 = false;
        }
        k.b(Boolean.valueOf(z11));
        return nativeReadByte(this.f11272a + i11);
    }

    public NativeMemoryChunk() {
        this.f11273b = 0;
        this.f11272a = 0L;
        this.f11274c = true;
    }
}