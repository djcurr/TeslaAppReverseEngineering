package t70;

import java.io.OutputStream;

/* loaded from: classes5.dex */
public class b extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private OutputStream f51756a;

    /* renamed from: b  reason: collision with root package name */
    private OutputStream f51757b;

    public b(OutputStream outputStream, OutputStream outputStream2) {
        this.f51756a = outputStream;
        this.f51757b = outputStream2;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51756a.close();
        this.f51757b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f51756a.flush();
        this.f51757b.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i11) {
        this.f51756a.write(i11);
        this.f51757b.write(i11);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f51756a.write(bArr);
        this.f51757b.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i11, int i12) {
        this.f51756a.write(bArr, i11, i12);
        this.f51757b.write(bArr, i11, i12);
    }
}