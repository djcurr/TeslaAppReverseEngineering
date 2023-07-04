package bb;

import java.io.FilterInputStream;
import java.io.InputStream;

/* loaded from: classes.dex */
public class h extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f7582a;

    public h(InputStream inputStream) {
        super(inputStream);
        this.f7582a = Integer.MIN_VALUE;
    }

    private long a(long j11) {
        int i11 = this.f7582a;
        if (i11 == 0) {
            return -1L;
        }
        return (i11 == Integer.MIN_VALUE || j11 <= ((long) i11)) ? j11 : i11;
    }

    private void g(long j11) {
        int i11 = this.f7582a;
        if (i11 == Integer.MIN_VALUE || j11 == -1) {
            return;
        }
        this.f7582a = (int) (i11 - j11);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i11 = this.f7582a;
        if (i11 == Integer.MIN_VALUE) {
            return super.available();
        }
        return Math.min(i11, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i11) {
        super.mark(i11);
        this.f7582a = i11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (a(1L) == -1) {
            return -1;
        }
        int read = super.read();
        g(1L);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        this.f7582a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) {
        long a11 = a(j11);
        if (a11 == -1) {
            return 0L;
        }
        long skip = super.skip(a11);
        g(skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        int a11 = (int) a(i12);
        if (a11 == -1) {
            return -1;
        }
        int read = super.read(bArr, i11, a11);
        g(read);
        return read;
    }
}