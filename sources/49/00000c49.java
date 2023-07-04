package bb;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private final long f7569a;

    /* renamed from: b  reason: collision with root package name */
    private int f7570b;

    private c(InputStream inputStream, long j11) {
        super(inputStream);
        this.f7569a = j11;
    }

    private int a(int i11) {
        if (i11 >= 0) {
            this.f7570b += i11;
        } else if (this.f7569a - this.f7570b > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f7569a + ", but read: " + this.f7570b);
        }
        return i11;
    }

    public static InputStream g(InputStream inputStream, long j11) {
        return new c(inputStream, j11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f7569a - this.f7570b, ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i11, int i12) {
        return a(super.read(bArr, i11, i12));
    }
}