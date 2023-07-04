package com.bumptech.glide.load.data;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final OutputStream f10508a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f10509b;

    /* renamed from: c  reason: collision with root package name */
    private ka.b f10510c;

    /* renamed from: d  reason: collision with root package name */
    private int f10511d;

    public c(OutputStream outputStream, ka.b bVar) {
        this(outputStream, bVar, 65536);
    }

    private void a() {
        int i11 = this.f10511d;
        if (i11 > 0) {
            this.f10508a.write(this.f10509b, 0, i11);
            this.f10511d = 0;
        }
    }

    private void g() {
        if (this.f10511d == this.f10509b.length) {
            a();
        }
    }

    private void release() {
        byte[] bArr = this.f10509b;
        if (bArr != null) {
            this.f10510c.e(bArr);
            this.f10509b = null;
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            flush();
            this.f10508a.close();
            release();
        } catch (Throwable th2) {
            this.f10508a.close();
            throw th2;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        a();
        this.f10508a.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        byte[] bArr = this.f10509b;
        int i12 = this.f10511d;
        this.f10511d = i12 + 1;
        bArr[i12] = (byte) i11;
        g();
    }

    c(OutputStream outputStream, ka.b bVar, int i11) {
        this.f10508a = outputStream;
        this.f10510c = bVar;
        this.f10509b = (byte[]) bVar.f(i11, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        int i13 = 0;
        do {
            int i14 = i12 - i13;
            int i15 = i11 + i13;
            int i16 = this.f10511d;
            if (i16 == 0 && i14 >= this.f10509b.length) {
                this.f10508a.write(bArr, i15, i14);
                return;
            }
            int min = Math.min(i14, this.f10509b.length - i16);
            System.arraycopy(bArr, i15, this.f10509b, this.f10511d, min);
            this.f10511d += min;
            i13 += min;
            g();
        } while (i13 < i12);
    }
}