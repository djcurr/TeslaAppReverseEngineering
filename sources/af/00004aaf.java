package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
final class n extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final InputStream f20722a;

    /* renamed from: b  reason: collision with root package name */
    private long f20723b;

    /* renamed from: c  reason: collision with root package name */
    private long f20724c;

    /* renamed from: d  reason: collision with root package name */
    private long f20725d;

    /* renamed from: e  reason: collision with root package name */
    private long f20726e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f20727f;

    /* renamed from: g  reason: collision with root package name */
    private int f20728g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void l(long j11) {
        try {
            long j12 = this.f20724c;
            long j13 = this.f20723b;
            if (j12 < j13 && j13 <= this.f20725d) {
                this.f20722a.reset();
                this.f20722a.mark((int) (j11 - this.f20724c));
                m(this.f20724c, this.f20723b);
            } else {
                this.f20724c = j13;
                this.f20722a.mark((int) (j11 - j13));
            }
            this.f20725d = j11;
        } catch (IOException e11) {
            throw new IllegalStateException("Unable to mark: " + e11);
        }
    }

    private void m(long j11, long j12) {
        while (j11 < j12) {
            long skip = this.f20722a.skip(j12 - j11);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                }
                skip = 1;
            }
            j11 += skip;
        }
    }

    public void a(boolean z11) {
        this.f20727f = z11;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f20722a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f20722a.close();
    }

    public void g(long j11) {
        if (this.f20723b <= this.f20725d && j11 >= this.f20724c) {
            this.f20722a.reset();
            m(this.f20724c, j11);
            this.f20723b = j11;
            return;
        }
        throw new IOException("Cannot reset");
    }

    public long j(int i11) {
        long j11 = this.f20723b + i11;
        if (this.f20725d < j11) {
            l(j11);
        }
        return this.f20723b;
    }

    @Override // java.io.InputStream
    public void mark(int i11) {
        this.f20726e = j(i11);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f20722a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        if (!this.f20727f) {
            long j11 = this.f20725d;
            if (this.f20723b + 1 > j11) {
                l(j11 + this.f20728g);
            }
        }
        int read = this.f20722a.read();
        if (read != -1) {
            this.f20723b++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public void reset() {
        g(this.f20726e);
    }

    @Override // java.io.InputStream
    public long skip(long j11) {
        if (!this.f20727f) {
            long j12 = this.f20723b;
            if (j12 + j11 > this.f20725d) {
                l(j12 + j11 + this.f20728g);
            }
        }
        long skip = this.f20722a.skip(j11);
        this.f20723b += skip;
        return skip;
    }

    n(InputStream inputStream, int i11) {
        this(inputStream, i11, 1024);
    }

    private n(InputStream inputStream, int i11, int i12) {
        this.f20726e = -1L;
        this.f20727f = true;
        this.f20728g = -1;
        this.f20722a = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i11);
        this.f20728g = i12;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        if (!this.f20727f) {
            long j11 = this.f20723b;
            if (bArr.length + j11 > this.f20725d) {
                l(j11 + bArr.length + this.f20728g);
            }
        }
        int read = this.f20722a.read(bArr);
        if (read != -1) {
            this.f20723b += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        if (!this.f20727f) {
            long j11 = this.f20723b;
            long j12 = i12;
            if (j11 + j12 > this.f20725d) {
                l(j11 + j12 + this.f20728g);
            }
        }
        int read = this.f20722a.read(bArr, i11, i12);
        if (read != -1) {
            this.f20723b += read;
        }
        return read;
    }
}