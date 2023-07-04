package com.facebook.imagepipeline.memory;

import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import md.k;
import qf.n;

/* loaded from: classes3.dex */
public class d implements n, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private ByteBuffer f11283a;

    /* renamed from: b  reason: collision with root package name */
    private final int f11284b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11285c = System.identityHashCode(this);

    public d(int i11) {
        this.f11283a = ByteBuffer.allocateDirect(i11);
        this.f11284b = i11;
    }

    private void m(int i11, n nVar, int i12, int i13) {
        if (nVar instanceof d) {
            k.i(!isClosed());
            k.i(!nVar.isClosed());
            h.b(i11, nVar.a(), i12, i13, this.f11284b);
            this.f11283a.position(i11);
            nVar.i().position(i12);
            byte[] bArr = new byte[i13];
            this.f11283a.get(bArr, 0, i13);
            nVar.i().put(bArr, 0, i13);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // qf.n
    public int a() {
        return this.f11284b;
    }

    @Override // qf.n, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f11283a = null;
    }

    @Override // qf.n
    public long g() {
        return this.f11285c;
    }

    @Override // qf.n
    public long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    @Override // qf.n
    public synchronized int h(int i11, byte[] bArr, int i12, int i13) {
        int a11;
        k.g(bArr);
        k.i(!isClosed());
        a11 = h.a(i11, i13, this.f11284b);
        h.b(i11, bArr.length, i12, a11, this.f11284b);
        this.f11283a.position(i11);
        this.f11283a.get(bArr, i12, a11);
        return a11;
    }

    @Override // qf.n
    public synchronized ByteBuffer i() {
        return this.f11283a;
    }

    @Override // qf.n
    public synchronized boolean isClosed() {
        return this.f11283a == null;
    }

    @Override // qf.n
    public void j(int i11, n nVar, int i12, int i13) {
        k.g(nVar);
        if (nVar.g() == g()) {
            Log.w("BufferMemoryChunk", "Copying from BufferMemoryChunk " + Long.toHexString(g()) + " to BufferMemoryChunk " + Long.toHexString(nVar.g()) + " which are the same ");
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
        a11 = h.a(i11, i13, this.f11284b);
        h.b(i11, bArr.length, i12, a11, this.f11284b);
        this.f11283a.position(i11);
        this.f11283a.put(bArr, i12, a11);
        return a11;
    }

    @Override // qf.n
    public synchronized byte n(int i11) {
        boolean z11 = true;
        k.i(!isClosed());
        k.b(Boolean.valueOf(i11 >= 0));
        if (i11 >= this.f11284b) {
            z11 = false;
        }
        k.b(Boolean.valueOf(z11));
        return this.f11283a.get(i11);
    }
}