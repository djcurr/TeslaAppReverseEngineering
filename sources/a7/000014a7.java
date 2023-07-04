package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;

/* loaded from: classes.dex */
public class o extends ByteArrayOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final d f10353a;

    public o(d dVar, int i11) {
        this.f10353a = dVar;
        ((ByteArrayOutputStream) this).buf = dVar.a(Math.max(i11, 256));
    }

    private void a(int i11) {
        int i12 = ((ByteArrayOutputStream) this).count;
        if (i12 + i11 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] a11 = this.f10353a.a((i12 + i11) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a11, 0, ((ByteArrayOutputStream) this).count);
        this.f10353a.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = a11;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f10353a.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f10353a.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i11, int i12) {
        a(i12);
        super.write(bArr, i11, i12);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i11) {
        a(1);
        super.write(i11);
    }
}