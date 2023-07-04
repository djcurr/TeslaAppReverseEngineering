package sd;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public class a extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    private int f50388a;

    /* renamed from: b  reason: collision with root package name */
    private int f50389b;

    public a(InputStream inputStream, int i11) {
        super(inputStream);
        Objects.requireNonNull(inputStream);
        if (i11 >= 0) {
            this.f50388a = i11;
            this.f50389b = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.f50388a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i11) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i11);
            this.f50389b = this.f50388a;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() {
        if (this.f50388a == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.f50388a--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.f50389b != -1) {
                ((FilterInputStream) this).in.reset();
                this.f50388a = this.f50389b;
                return;
            }
            throw new IOException("mark not set");
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j11) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j11, this.f50388a));
        this.f50388a = (int) (this.f50388a - skip);
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i11, int i12) {
        int i13 = this.f50388a;
        if (i13 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i11, Math.min(i12, i13));
        if (read > 0) {
            this.f50388a -= read;
        }
        return read;
    }
}