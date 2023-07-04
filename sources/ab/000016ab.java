package com.facebook.imagepipeline.memory;

import android.os.SharedMemory;
import android.system.ErrnoException;
import android.util.Log;
import java.io.Closeable;
import java.nio.ByteBuffer;
import md.k;
import qf.n;

/* loaded from: classes3.dex */
public class a implements n, Closeable {

    /* renamed from: a  reason: collision with root package name */
    private SharedMemory f11275a;

    /* renamed from: b  reason: collision with root package name */
    private ByteBuffer f11276b;

    /* renamed from: c  reason: collision with root package name */
    private final long f11277c;

    public a(int i11) {
        k.b(Boolean.valueOf(i11 > 0));
        try {
            SharedMemory create = SharedMemory.create("AshmemMemoryChunk", i11);
            this.f11275a = create;
            this.f11276b = create.mapReadWrite();
            this.f11277c = System.identityHashCode(this);
        } catch (ErrnoException e11) {
            throw new RuntimeException("Fail to create AshmemMemory", e11);
        }
    }

    private void m(int i11, n nVar, int i12, int i13) {
        if (nVar instanceof a) {
            k.i(!isClosed());
            k.i(!nVar.isClosed());
            h.b(i11, nVar.a(), i12, i13, a());
            this.f11276b.position(i11);
            nVar.i().position(i12);
            byte[] bArr = new byte[i13];
            this.f11276b.get(bArr, 0, i13);
            nVar.i().put(bArr, 0, i13);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    @Override // qf.n
    public int a() {
        k.i(!isClosed());
        return this.f11275a.getSize();
    }

    @Override // qf.n, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        if (!isClosed()) {
            SharedMemory.unmap(this.f11276b);
            this.f11275a.close();
            this.f11276b = null;
            this.f11275a = null;
        }
    }

    @Override // qf.n
    public long g() {
        return this.f11277c;
    }

    @Override // qf.n
    public long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of an  AshmemMemoryChunk");
    }

    @Override // qf.n
    public synchronized int h(int i11, byte[] bArr, int i12, int i13) {
        int a11;
        k.g(bArr);
        k.i(!isClosed());
        a11 = h.a(i11, i13, a());
        h.b(i11, bArr.length, i12, a11, a());
        this.f11276b.position(i11);
        this.f11276b.get(bArr, i12, a11);
        return a11;
    }

    @Override // qf.n
    public ByteBuffer i() {
        return this.f11276b;
    }

    @Override // qf.n
    public synchronized boolean isClosed() {
        boolean z11;
        if (this.f11276b != null) {
            z11 = this.f11275a == null;
        }
        return z11;
    }

    @Override // qf.n
    public void j(int i11, n nVar, int i12, int i13) {
        k.g(nVar);
        if (nVar.g() == g()) {
            Log.w("AshmemMemoryChunk", "Copying from AshmemMemoryChunk " + Long.toHexString(g()) + " to AshmemMemoryChunk " + Long.toHexString(nVar.g()) + " which are the same ");
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
        a11 = h.a(i11, i13, a());
        h.b(i11, bArr.length, i12, a11, a());
        this.f11276b.position(i11);
        this.f11276b.put(bArr, i12, a11);
        return a11;
    }

    @Override // qf.n
    public synchronized byte n(int i11) {
        boolean z11 = true;
        k.i(!isClosed());
        k.b(Boolean.valueOf(i11 >= 0));
        if (i11 >= a()) {
            z11 = false;
        }
        k.b(Boolean.valueOf(z11));
        return this.f11276b.get(i11);
    }
}