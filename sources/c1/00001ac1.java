package com.facebook.soloader;

import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes3.dex */
public class g implements f {

    /* renamed from: a  reason: collision with root package name */
    private File f12898a;

    /* renamed from: b  reason: collision with root package name */
    private FileInputStream f12899b;

    /* renamed from: c  reason: collision with root package name */
    private FileChannel f12900c;

    public g(File file) {
        this.f12898a = file;
        a();
    }

    @Override // com.facebook.soloader.f
    public int M(ByteBuffer byteBuffer, long j11) {
        return this.f12900c.read(byteBuffer, j11);
    }

    public void a() {
        FileInputStream fileInputStream = new FileInputStream(this.f12898a);
        this.f12899b = fileInputStream;
        this.f12900c = fileInputStream.getChannel();
    }

    @Override // java.nio.channels.Channel, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f12899b.close();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return this.f12900c.isOpen();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        return this.f12900c.read(byteBuffer);
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        return this.f12900c.write(byteBuffer);
    }
}