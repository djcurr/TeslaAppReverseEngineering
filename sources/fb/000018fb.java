package com.facebook.react.modules.network;

import java.io.FilterOutputStream;
import java.io.OutputStream;

/* loaded from: classes3.dex */
public class b extends FilterOutputStream {

    /* renamed from: a  reason: collision with root package name */
    private long f12046a;

    public b(OutputStream outputStream) {
        super(outputStream);
        this.f12046a = 0L;
    }

    public long a() {
        return this.f12046a;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ((FilterOutputStream) this).out.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        ((FilterOutputStream) this).out.write(bArr, i11, i12);
        this.f12046a += i12;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i11) {
        ((FilterOutputStream) this).out.write(i11);
        this.f12046a++;
    }
}